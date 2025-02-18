package movie;

public class Theater {
	
	// 속성 - 상영관이 가지고 있는 것들
	
	// 영화 정보 - 영화 제목, 러닝 타임
	Movie movie;
	
	// 좌석 정보 - 번호, 상태
	Seat seat;
	
	// 스피커 정보 - 볼륨, 전원 여부
	Speaker speaker;
	
	// 조명 정보 - 색깔, 전원 여부
	Light light;
	
	// 에어컨 정보 - 전원 여부, 바람 세기, 현재 온도, 목표 온도, 냉난방 여부
	AirConditioner airConditioner;
	
	// 프로젝터 정보 - 전원 여부, 재생 여부
	Projector projector;
	
	
	// 기능(행동) - 상영관이 할 수 있는 것들
	// 기능(행동)에선 static을 특수한 경우에만 쓰고 그 외엔 쓰지 않음
	/* 1. 영화를 재생한다
	 	- projector 변수의 isOn 값이 false라면 isOn 값을 true로 변경한다
		  projector 변수의 isOn 값이 true일 때만 isPlay 값을 true로 변경한다
		  projector 변수의 isPlay 값이 true라면 "영화의 제목을 러닝타임 동안 재생합니다."라고 출력한다
		  projector 변수의 isPlay 값을 false로, isOn 값도 false로 변경한다
	*/
	public void playMovie() {
		if (! projector.isOn) {
			projector.isOn = true;
		}
		
		if (projector.isOn) {
			projector.isPlay = true;
		}
		
		if (projector.isPlay) {
			System.out.println(movie.title + "을 " + movie.runningTime + "분 동안 재생합니다.");
			projector.isPlay = false;
			projector.isOn = false;
		}
	}
	
	/* 2. 에어컨을 켠다
		- airConditioner의 isOn 값이 false라면 true로 바꿔준다
		  현재 온도, 목표 온도, 바람 세기, 냉난방 여부를 할당한다
	*/
	public void turnOnAirConditioner() {
		if (!airConditioner.isOn) {
			airConditioner.isOn = true;
			
			airConditioner.nowTemperature = (float) (Math.random() * 40);
			airConditioner.aimTemperature = (float) (Math.random() * 40);
			airConditioner.windSpeed = (int) (Math.random() * 4);
			
			boolean isNowWinter = airConditioner.nowTemperature < airConditioner.aimTemperature;
			airConditioner.isCooling = !isNowWinter;
		}
	}
	
	/* 3. 조명을 켜고 끈다
		- light의 isOn 값이 false라면 true로 바꿔주고, true라면 false로 바꾼다
		  light의 isOn 값이 false라면 light의 color를 null로 변경한다 예) color = null
		  light의 isOn 값이 true라면 light의 color를 지정해준다
		- color를 지정하는 방법
			0~2 중의 임의의 난수를 받아서 0이면 "RED", 1이면 "BLUE", 2이면 "GREEN"으로 지정해준다
	*/
	public void turnOnLight() {
		if (light.isOn) {
			light.isOn = false;
			light.color = null;
		}
		else {
			light.isOn = true;
			int colorNum = (int) (Math.random() * 3);
			
			if (colorNum==0) {
				light.color = "RED";
			}
			else if (colorNum==1) {
				light.color = "BLUE";
			}
			else {
				light.color = "GREEN";
			}
		}
	}
	
	/* public void turnOnLightHard() {
		light.isOn = !light.isOn; <- 토글일 때
		
		if(light.isOn) {
			int colorNum = (int) (Math.random() * 3);
			light.color = switch(colorNum) {
			case 0 -> "RED";
			case 1 -> "BLUE";
			case 2 -> "GREEN";
			}
		}
	} */
	
	/* 4. 볼륨을 조절한다
		- speaker의 isOn 값이 false라면 true로 변경한다
		  speaker의 isOn 값이 true일 때만 볼륨이 변경된다
		  	볼륨이 변경되는 방식:
		  		숫자(정수)를 파라미터로 받아와서 볼륨에 더해 할당하거나 뺸다
		  		증가하거나 감소할 때의 조건:
		  			증가된 볼륨의 값이 100 초과라면 100으로 변경한다
		  			증가된 볼륨의 값이 0 미만이라면 0으로 변경한다
	*/
	public void speakerVolume(int scale) {
		if (!speaker.isOn) {
			speaker.isOn = true;
		}
		
		if (speaker.isOn) {
			speaker.volume += scale;
			if (speaker.volume>100) {
				speaker.volume = 100;
				}
			else if (speaker.volume<0) {
				speaker.volume = 0;
			}	
		}
	}
	
	/* 5. 의자를 조정한다(접거나 편다)
		- seat의 isFold 값이 true라면 false로 바꿔주고, false라면 true로 바꾼다
		  변경된 seat의 isFold 값이 true라면 "좌석 번호가 접혔습니다."라고 출력하고,
		  false라면 "좌석 번호가 펼쳐졌습니다."라고 출력한다
	*/
	public void changeSeatState() {
		seat.isFold = !seat.isFold;
		
		if (seat.isFold) {
			System.out.println(seat.seatNumber + "가 접혔습니다.");
		}
		else {
			System.out.println(seat.seatNumber + "가 펼쳐졌습니다.");
		}
	}
	
}
