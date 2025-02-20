package com.ktdsuniversity.edu.fp.stream.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReadCSV {
	
	private final String CSV_PATH = "C:\\Users\\211-11\\Desktop\\streamexam";
	
	/**
	 * 파일을 알아서 읽어 리스트로 변환
	 * @param <R> 리스트의 제네릭 (로컬 제네릭: 메소드 내부에서만 사용할 수 있는 제네릭)
	 * @param fileName
	 * @param function
	 * @return
	*/
	
	public <R> List<R> loadData (FileName fileName, Function<String[], R> function, Predicate<R> condition) {
		try {
			return Files.lines(new File(this.CSV_PATH, fileName.fileName).toPath()) // Stream<String>
						.skip(1) // Stream<String>
						.map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]>
						.map(array -> function.apply(array)) // Stream<R>
//						.filter(inst -> condition.test(inst)) // Stream<R> // Asia만
						.filter(inst -> condition != null ? condition.test(inst) : true) // Stream<R> // 전부
						.toList() // List<R>
						;
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		return null;
		
	}
	
	public void printAllCities() {
		this.loadData(FileName.CITIES, array -> new City(array), null)
			.forEach(city -> {
				System.out.println("City ID: " + city.getId());
				System.out.println("City Name: " + city.getName());
			});
	}
	
	public void printAllCitiesOfSouthKorea() {
		this.loadData(FileName.CITIES, array -> new City(array), city -> city.getCountryCode().equals("KR"))
//		this.loadData(FileName.CITIES, array -> new City(array), city -> city.getCountryName().equals("\"South Korea\""))
			.forEach(city -> {
				System.out.println("City ID: " + city.getId());
				System.out.println("City Name: " + city.getName());
		});
	}
	
	public void printAllCountries() {
		this.loadData(FileName.COUNTRIES, array -> new Country(array), null)
			.forEach(country -> {
				System.out.println("Country ID: " + country.getId());
				System.out.println("Country Name: " + country.getName());
		});
	}
	
	public void printAllRegions() {
		this.loadData(FileName.REGIONS, array -> new Region(array), null)
			.forEach(region -> {
				System.out.println("Region ID: " + region.getId());
				System.out.println("Region Name: " + region.getName());
			});
	}
	
	public void printAllStates() {
		this.loadData(FileName.STATES, array -> new State(array), null)
			.forEach(state -> {
				System.out.println("States ID: " + state.getId());
				System.out.println("States Name: " + state.getName());
		});
	}
	
	public void printAllStatesOfSouthKorea() {
		this.loadData(FileName.STATES, array -> new State(array), state -> state.getCountryCode().equals("KR"))
			.forEach(state -> {
				System.out.println("State ID: " + state.getId());
				System.out.println("State Name: " + state.getName());
		});
	}
	
	public void printAllSubRegions() {
		this.loadData(FileName.SUB_REGIONS, array -> new SubRegion(array), null)
			.forEach(subRegion -> {
				System.out.println("SubRegion ID: " + subRegion.getId());
				System.out.println("SubRegion Name: " + subRegion.getName());
		});
	}
	
	/**
	 * state의 id에 속한 모든 도시들을 출력
	 * @param stateId - state의 id (3849: Seoul)
	*/
	public void printAllCitiesOfState(int stateId) {
		// stateId로 State 정보를 찾음
		this.loadData(FileName.STATES,
					  stateArray -> new State(stateArray),
					  state -> state.getId() == stateId) // List(State>
			// 해당 state를 찾음
			.stream() // Stream<State>
			// 찾은 state의 id로 속한 모든 도시들을 가져옴
			.flatMap(state -> this.loadData(FileName.CITIES,
											cityArray -> new City(cityArray),
											city -> city.getStateId() == state.getId()) // List<City>
								  .stream() // Stream<City>
										   ) // Stream<City>
			// city를 출력
			.forEach(city -> System.out.println(city.getName())
					);
	}
	
	/**
	 * country의 id에 속한 모든 도시들을 출력
	 * @param countryId - country의 id (116: South Korea)
	*/
	public void printAllCitiesOfCountry(int countryId) {
		// countryId로 Country 정보를 찾음
		this.loadData(FileName.COUNTRIES,
					  countryArray -> new Country(countryArray),
					  country -> country.getId() == countryId) // List<Country>
			.stream() // Stream<Country>
			// 찾은 country의 id로 state를 찾음 (flatMap)
			.flatMap(country -> this.loadData(FileName.STATES,
											  stateArray -> new State(stateArray),
											  state -> state.getCountryId() == country.getId()) // List<State>
									.stream() // Stream<State>
											 ) // Stream<State>
			// 찾은 state의 id로 city를 찾음 (flatMap)
			.flatMap(state -> this.loadData(FileName.CITIES,
											cityArray -> new City(cityArray),
											city -> city.getStateId() == state.getId()) // List<City>
								  .stream() // Stream<City>
										   ) // Stream<City>
			// city를 출력
			.forEach(city -> System.out.println(city.getName() + " / "
										   		+ city.getStateName() + " / "
										   		+ city.getCountryName()
										   		)
					);
	}
	
	/**
	 * subregion의 id에 속한 모든 도시들을 출력
	 * @param subRegionId - subregion의 id (12: Eastern Asia)
	*/
	public void printAllCitiesOfSubRegion(int subRegionId) {
		// subRegionId로 SubRegion 정보를 찾음
		this.loadData(FileName.SUB_REGIONS,
					  subRegionArray -> new SubRegion(subRegionArray),
					  subRegion -> subRegion.getId() == subRegionId) // List<SubRegion>
			.stream() // Stream<SubRegion>
			// 찾은 subRegion의 id로 country를 찾음 (flatMap)
			.flatMap(subRegion -> this.loadData(FileName.COUNTRIES,
												countryArray -> new Country(countryArray),
												country -> country.getSubRegionId() == subRegion.getId()) // List<Country>
									  .stream() // Stream<Country>
					) // Stream<Country>
			// 찾은 country의 id로 state를 찾음 (flatMap)
			.flatMap(country -> this.loadData(FileName.STATES,
											  stateArray -> new State(stateArray),
											  state -> state.getCountryId() == country.getId()) // List<State>
									.stream() // Stream<State>
					) // Stream<State>
			// 찾은 state의 id로 city를 찾음 (flatMap)
			.flatMap(state -> this.loadData(FileName.CITIES,
											cityArray -> new City(cityArray),
											city -> city.getStateId() == state.getId()) // List<City>
								  .stream() // Stream<City>
					) // Stream<City>
			// city를 출력
			.forEach(city -> System.out.println(city.getName() + " / "
										   		+ city.getStateName() + " / "
										   		+ city.getCountryName()
										   		)
					);
	}
	
	/**
	 * region의 id에 속한 모든 도시들을 출력
	 * @param regionId - region의 id (3: Asia)
	*/
	public void printAllCitiesOfRegion(int regionId) {
		// regionId로 Region 정보를 찾음
		this.loadData(FileName.REGIONS,
					  regionArray -> new Region(regionArray),
					  region -> region.getId() == regionId) // List<Region>
			.stream() // Stream<Region>
			// 찾은 region의 id로 subRegion을 찾음 (flatMap)
			.flatMap(region -> this.loadData(FileName.SUB_REGIONS,
								   			 subRegionArray -> new SubRegion(subRegionArray),
								   			 subRegion -> subRegion.getRegionId() == region.getId()) // List<SubRegion>
								   .stream() // Stream<SubRegion>
					) // Stream<SubRegion>
			// 찾은 subRegion의 id로 country를 찾음 (flatMap)
			.flatMap(subRegion -> this.loadData(FileName.COUNTRIES,
												countryArray -> new Country(countryArray),
												country -> country.getSubRegionId() == subRegion.getId()) // List<Country>
									  .stream() // Stream<Country>
					) // Stream<Country>
			// 찾은 country의 id로 state를 찾음 (flatMap)
			.flatMap(country -> this.loadData(FileName.STATES,
											  stateArray -> new State(stateArray),
											  state -> state.getCountryId() == country.getId()) // List<State>
									.stream() // Stream<State>
					) // Stream<State>
			// 찾은 state의 id로 city를 찾음 (flatMap)
			.flatMap(state -> this.loadData(FileName.CITIES,
											cityArray -> new City(cityArray),
											city -> city.getStateId() == state.getId()) // List<City>
								  .stream() // Stream<City>
					) // Stream<City>
			// city를 출력
			.forEach(city -> System.out.println(city.getName() + " / "
										   		+ city.getStateName() + " / "
										   		+ city.getCountryName()
										   		)
					);
	}
	
	public void printAllCitiesOfRegionFast(int regionId) {
		// 매번 반복할 때마다 파일을 읽고 가져오는 것보다
		// 데이터를 미리 조회 해놓으면 조회 속도가 더 빠르다. 대신 메모리는 많이 쓸 수 밖에 없다. 
		// 메모리를 덜 쓰면 속도가 느리고 메모리를 많이 쓰면 속도가 빠르다.
		List<SubRegion> subRegions = this.loadData(FileName.SUB_REGIONS, SubRegion::new, null);
		List<Country> countries = this.loadData(FileName.COUNTRIES, Country::new, null);
		List<State> states = this.loadData(FileName.STATES, State::new, null);
		List<City> cities = this.loadData(FileName.CITIES, City::new, null);
		
		this.loadData(FileName.REGIONS, Region::new, region -> region.getId() == regionId)
			.stream()
			.flatMap(region -> subRegions.stream()
										 .filter(subRegion -> subRegion.getRegionId() == region.getId()))
			.flatMap(subRegion -> countries.stream()
										   .filter(country -> country.getSubRegionId() == subRegion.getId()))
			.flatMap(country -> states.stream()
									  .filter(state -> state.getCountryId() == country.getId()))
			.flatMap(state -> cities.stream()
									.filter(city -> city.getStateId() == state.getId()))
			.forEach(city -> System.out.println(city.getName()));
		;
	}
	
	public void printAllCitiesOfSubRegionFast(int subRegionId) {
		// 매번 반복할 때마다 파일을 읽고 가져오는 것보다
		// 데이터를 미리 조회 해놓으면 조회 속도가 더 빠르다. 대신 메모리는 많이 쓸 수 밖에 없다. 
		// 메모리를 덜 쓰면 속도가 느리고 메모리를 많이 쓰면 속도가 빠르다.
		List<Country> countries = this.loadData(FileName.COUNTRIES, Country::new, null);
		List<State> states = this.loadData(FileName.STATES, State::new, null);
		List<City> cities = this.loadData(FileName.CITIES, City::new, null);
		
		this.loadData(FileName.SUB_REGIONS, SubRegion::new, subRegion -> subRegion.getId() == subRegionId)
			.stream()
			.flatMap(subRegion -> countries.stream()
										   .filter(country -> country.getSubRegionId() == subRegion.getId()))
			.flatMap(country -> states.stream()
									  .filter(state -> state.getCountryId() == country.getId()))
			.flatMap(state -> cities.stream()
									.filter(city -> city.getStateId() == state.getId()))
			.forEach(city -> System.out.println(city.getName()));
		;
	}
	
	public void printAllCitiesOfCountryFast(int countryId) {
		// 매번 반복할 때마다 파일을 읽고 가져오는 것보다
		// 데이터를 미리 조회 해놓으면 조회 속도가 더 빠르다. 대신 메모리는 많이 쓸 수 밖에 없다. 
		// 메모리를 덜 쓰면 속도가 느리고 메모리를 많이 쓰면 속도가 빠르다.
		List<State> states = this.loadData(FileName.STATES, State::new, null);
		List<City> cities = this.loadData(FileName.CITIES, City::new, null);
		
		this.loadData(FileName.COUNTRIES, Country::new, country -> country.getId() == countryId)
			.stream()
			.flatMap(country -> states.stream()
									  .filter(state -> state.getCountryId() == country.getId()))
			.flatMap(state -> cities.stream()
									.filter(city -> city.getStateId() == state.getId()))
			.forEach(city -> System.out.println(city.getName()));
		;
	}
	
	public void printAllCitiesOfStateFast(int stateId) {
		// 매번 반복할 때마다 파일을 읽고 가져오는 것보다
		// 데이터를 미리 조회 해놓으면 조회 속도가 더 빠르다. 대신 메모리는 많이 쓸 수 밖에 없다. 
		// 메모리를 덜 쓰면 속도가 느리고 메모리를 많이 쓰면 속도가 빠르다.
		List<City> cities = this.loadData(FileName.CITIES, City::new, null);
		
		this.loadData(FileName.STATES, State::new, state -> state.getId() == stateId)
			.stream()
			.flatMap(state -> cities.stream()
									.filter(city -> city.getStateId() == state.getId()))
			.forEach(city -> System.out.println(city.getName()));
		;
	}
	
	/**
	 * 한 도시의 정보와 해당 도시의 state 정보를 함께 조회
	 * @param cityName - 조회하고자 하는 city ("Seoul" Seoul의 정보와 state의 정보를 함께 조회)
	 * @return
	*/
	public City getOneCityWithState(String cityName) {
		return this.loadData(FileName.CITIES,
					  		 cityArray -> new City(cityArray),
					  		 city -> city.getName().equals(cityName)) // List<City>
				   .stream() // Stream<City>
				   .map(city -> {
			   			// city 인스턴스의 state에 해당 도시의 state 정보를 채움
			   			State stateOfCity = this.loadData(FileName.STATES,
					  					  				  stateArray -> new State(stateArray),
					  					  				  state -> state.getId() == city.getStateId())
			   									.stream()
			   									.findFirst()
			   									.orElse(null);
			   			city.setStateInfo(stateOfCity);
			   			return city;
					}
					   )
				   .findFirst()
				   .orElse(null)
				   ; // City
	}
	
	/**
	 * countryName에 해당하는 country 정보, country에 속한 모든 state의 정보, state에 속한 모든 도시들
	 * @param countryName - 조회하고자 하는 country ("South Korea" South Korea의 정보, state의 정보, state에 속한 모든 도시들의 정보를 함께 조회)
	 * @return
	*/
	public Country getOneCountryWithState(String countryName) {
		List<State> states = this.loadData(FileName.STATES, stateArray -> new State(stateArray), null);
		List<City> cities = this.loadData(FileName.CITIES, cityArray -> new City(cityArray), null);
		
		return this.loadData(FileName.COUNTRIES,
							 countryArray -> new Country(countryArray),
							 country -> country.getName().equals(countryName)) // List<Country>
				   .stream() // Stream<Country>
				   .map(country -> {
					   // 1. country의 state를 모두 찾음
					   List<State> stateOfCountry = states.stream() // Stream<State>
					   		 							  .filter(state -> state.getCountryId() == country.getId()) // Stream<State>
					   		 							  // 2. country의 모든 state에 속한 city를 모두 찾음
					   		 							  .map(state -> {
					   		 								  List<City> cityOfState = cities.stream() // Stream<City>
					   		 										  						 .filter(city -> city.getStateId() == state.getId()) // Stream<City>
					   		 										  						 .toList(); // List<City>
					   		 								  state.setCities(cityOfState);
					   		 								  return state;
					   		 							  }) // Stream<State>
					   		 							  .toList(); // List<State>
					   country.setStates(stateOfCountry);
					   return country;
				   }) // Stream<Country>
				   .findFirst() // Optional<Country>
				   .orElse(null); // Country
	}
	
	/**
	 * subRegionName에 해당하는 subregion 정보, subregion에 속한 모든 state의 정보, state에 속한 모든 도시들
	 * @param subRegionName - 조회하고자 하는 subregion ("South Korea" South Korea의 정보, state의 정보, state에 속한 모든 도시들의 정보를 함께 조회)
	 * @return
	*/
	/* 나중에 다시 해보기
	public SubRegion getOneSubRegionWithState(String subRegionName) {
		return this.loadData(FileName.SUB_REGIONS,
							 subRegionArray -> new SubRegion(subRegionArray),
							 subRegion -> subRegion.getName().equals(subRegionName)) // List<SubRegion>
				   .stream() // Stream<SubRegion>
				   .map(subRegion -> {
					   Country countryOfSubRegion = this.loadData(FileName.COUNTRIES,
							   									  countryArray -> new Country(countryArray),
							   									  country -> country.getId() == subRegion.getCountries())
				   })
				   ;
	}
	
	public SubRegion getOneSubRegion(String subRegionName) {
		List<Country> countries = this.loadData(FileName.COUNTRIES, Country::new, null);
		List<State> states = this.loadData(FileName.STATES, State::new, null);
		List<City> cities = this.loadData(FileName.CITIES, City::new, null);
		
		return this.loadData(FileName.SUB_REGIONS, SubRegion::new, subRegion -> subRegion.getName().equals(subRegionName))
				   .stream()
				   .map(subRegion -> {
					   subRegion.setCountries( countries.stream()
							   							.filter(country -> country.getSubRegionId() == subRegion.getId())
							   							.map(country -> {
							   								country.setStates( states.stream()
							   														 .filter(state -> state.getCountryId() == country.getId())
							   														 .map(state -> {
							   															 state.setCities( cities.stream()
							   																	 				.filter( city -> city.getStateId() == state.getId())
							   																	 				.toList());
							   															 return state;
							   														 })
							   														 .toList());
							   								return country;
							   							})
							   							.toList());
					   
					   return subRegion;
				   })
				   .findFirst()
				   .orElse(null);
	}
	*/
	public Region getOneRegionWithState(String regionName) {
		return null;
	}
	
	public static void main(String[] args) {
		ReadCSV rc = new ReadCSV();
		List<City> cities = rc.loadData(FileName.CITIES,
									   (array) -> new City(array),
									   null
									   );
		List<Country> countries = rc.loadData(FileName.COUNTRIES,
											 (array) -> new Country(array),
											 null
											 );
		List<Region> regions = rc.loadData(FileName.REGIONS,
										  (array) -> new Region(array),
//										  region -> region.getName().equals("Asia")); // [Asia]
										  null // [전부]
										  );
		List<State> states = rc.loadData(FileName.STATES,
										(array) -> new State(array),
										null
										);
//	=	List<State> states = rc.loadData(FileName.STATES, State::new, null);
		List<SubRegion> subregions = rc.loadData(FileName.SUB_REGIONS,
												(array) -> new SubRegion(array),
												null
												);
		cities.forEach(city -> System.out.println(city.getName()));
		System.out.println("=".repeat(100));
		countries.forEach(country -> System.out.println(country.getName()));
		System.out.println("=".repeat(100));
		regions.forEach(region -> System.out.println(region.getName()));
		System.out.println("=".repeat(100));
		states.forEach(state -> System.out.println(state.getName()));
		System.out.println("=".repeat(100));
		subregions.forEach(subregion -> System.out.println(subregion.getName()));
		
		System.out.println("=".repeat(100));
		rc.printAllCities();
		System.out.println("=".repeat(100));
		rc.printAllCitiesOfSouthKorea();
		System.out.println("=".repeat(100));
		rc.printAllCountries();
		System.out.println("=".repeat(100));
		rc.printAllRegions();
		System.out.println("=".repeat(100));
		rc.printAllStates();
		System.out.println("=".repeat(100));
		rc.printAllStatesOfSouthKorea();
		System.out.println("=".repeat(100));
		rc.printAllSubRegions();
		
//		System.out.println("=".repeat(100));
//		rc.printAllCitiesOfState(3849);
//		System.out.println("=".repeat(100));
//		rc.printAllCitiesOfCountry(116);
//		System.out.println("=".repeat(100));
//		rc.printAllCitiesOfSubRegion(12);
//		System.out.println("=".repeat(100));
//		rc.printAllCitiesOfRegion(3);
//		System.out.println("=".repeat(100));
//		rc.printAllCitiesOfRegionFast(3);
		System.out.println("=".repeat(100));
		rc.printAllCitiesOfSubRegionFast(12);
		System.out.println("=".repeat(100));
		rc.printAllCitiesOfCountryFast(116);
		System.out.println("=".repeat(100));
		rc.printAllCitiesOfStateFast(3849);
		
		System.out.println("=".repeat(100));
		City city = rc.getOneCityWithState("Seoul");
		System.out.println("City Name: " + city.getName());
		System.out.println("State of City ID: " + city.getStateId());
		System.out.println("State of City Name: " + city.getStateInfo().getName());
		System.out.println("State of City Type: " + city.getStateInfo().getType());
		System.out.println("=".repeat(100));
		Country country = rc.getOneCountryWithState("\"South Korea\"");
		System.out.println("Country Name: " + country.getName());
		country.getStates()
			   .forEach(state -> {
				   System.out.println("State of Country Nmae: " + state.getName());
				   state.getCities()
				   .forEach(eachCity -> System.out.println("City of Country Name: " + eachCity.getName()));
			   });
//		System.out.println("=".repeat(100));
//		SubRegion subRegion = rc.getOneSubRegionWithState(null);
//		System.out.println("=".repeat(100));
//		Region region = rc.getOneRegionWithState(null);
	}
}
