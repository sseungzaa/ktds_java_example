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
		this.loadData(FileName.SUBREGIONS, array -> new SubRegion(array), null)
			.forEach(subRegion -> {
				System.out.println("SubRegion ID: " + subRegion.getId());
				System.out.println("SubRegion Name: " + subRegion.getName());
		});
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
		List<SubRegion> subregions = rc.loadData(FileName.SUBREGIONS,
												(array) -> new SubRegion(array),
												null
												);
//		cities.forEach(city -> System.out.println(city.getName()));
//		System.out.println("=".repeat(100));
//		countries.forEach(country -> System.out.println(country.getName()));
//		System.out.println("=".repeat(100));
//		regions.forEach(region -> System.out.println(region.getName()));
//		System.out.println("=".repeat(100));
//		states.forEach(state -> System.out.println(state.getName()));
//		System.out.println("=".repeat(100));
//		subregions.forEach(subregion -> System.out.println(subregion.getName()));
//		
//		System.out.println("=".repeat(100));
//		rc.printAllCities();
//		System.out.println("=".repeat(100));
		rc.printAllCitiesOfSouthKorea();
//		System.out.println("=".repeat(100));
//		rc.printAllCountries();
//		System.out.println("=".repeat(100));
//		rc.printAllRegions();
//		System.out.println("=".repeat(100));
//		rc.printAllStates();
		System.out.println("=".repeat(100));
		rc.printAllStatesOfSouthKorea();
//		System.out.println("=".repeat(100));
//		rc.printAllSubRegions();
		
	}
}
