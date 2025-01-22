package movie;

public class DownTown {
	
	/*public static void addNumber(int number) {
		number += 10;
		System.out.println(number); // a2. ? -> 20
	}
	
	public static void appendName(String lastName) {
		lastName += "민창";
		System.out.println(lastName); // b2. ? -> 장민창
	}
	
	public static void setMovieTitle(Movie movie) {
		movie.title = "파묘";
		System.out.println(movie.title); // c2. ? -> 파묘
	}*/
	
	public static void main(String[] args) {
		
		/*int number = 10;
		System.out.println(number); // a1. ? -> 10
		addNumber(number);
		System.out.println(number); // `a3. ? -> '10'`
		
		String name = "장";
		System.out.println(name); // b1. ? -> 장
		appendName(name);
		System.out.println(name); // `b3. ? -> '장'`
		
		Movie 파묘 = new Movie();
		System.out.println(파묘.title); // c1. ? -> null
		setMovieTitle(파묘);
		System.out.println(파묘.title); // `c3. ? -> '파묘'`*/
		
		
		
		Theater cgv = new Theater();
		System.out.println(cgv);
		
		Movie 하얼빈 = new Movie();
		하얼빈.title = "하얼빈";
		하얼빈.runningTime = 120;
		
		Seat h6 = new Seat();
		h6.seatNumber = "h6";
		h6.isFold = true;
		
		Speaker harman = new Speaker();
		harman.volume = 50;
		harman.isOn = false;
		
		Light sony = new Light();
		sony.color = "대충 노란색";
		sony.isOn = true;
		
		AirConditioner carrier = new AirConditioner();
		// carrier.isOn = false; // 꺼져 있으니 할당할 필요 X
		// 꺼져 있기 때문에 나머지도 다 할당할 필요 X
		
		Projector miniBeam = new Projector();
		miniBeam.isOn = true;
		// miniBeam.isPlay = false; // 꺼져 있으니 할당할 필요 x
		
		cgv.movie = 하얼빈;
		cgv.seat = h6;
		cgv.speaker = harman;
		cgv.light = sony;
		cgv.airConditioner = carrier;
		cgv.projector = miniBeam;
		
		
		cgv.playMovie();
		cgv.playMovie();
		
		cgv.turnOnAirConditioner();
		cgv.turnOnAirConditioner();
		
		cgv.turnOnLight();
		cgv.turnOnLight();
		
		//cgv.speakerVolume();
		//cgv.speakerVolume();
		
		cgv.changeSeatState();
		cgv.changeSeatState();
	
	}

}
