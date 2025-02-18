package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class Lotto {
	
	public static void makeLottoNumbers() {
		
		// 로또 복권
		// 1 ~ 45 중 6개 찍기 (중복 불가) -> 한 게임에 1000원
		// 내가 찍은 6개의 번호와 당첨 번호 6개가 정확하게 일치하면 1등
		// 1등 당첨자가 적립금 전부를 획득
		
		/* 로또 번호 6개를 모아보기
		 시작: [0, 0, 0, 0, 0, 0]
		 1. 1 ~ 45 중 랜덤으로 한 개 뽑기 -> 결과 37
		 -> 배열에 37이 존재하는지 확인 -> 존재할 경우엔 아무 것도 하지 않음
		    -> 존재하지 않을 경우 첫 번째 인덱스에 37을 할당
		 -> [37, 0, 0, 0, 0, 0]
		    -> 인덱스 카운트가 7인지 확인 -> 7이면 반복을 종료
		       -> 반복을 종료
		 2. 1 ~ 45 중 랜덤으로 한 개 뽑기 -> 결과 15
		 -> 배열에 15가 존재하는지 확인 -> 존재할 경우엔 아무 것도 하지 않음
		    -> 존재하지 않을 경우 두 번째 인덱스에 15를 할당
		 -> [37, 15, 0, 0, 0, 0]
		 3. 1 ~ 45 중 랜덤으로 한 개 뽑기 -> 결과 3
		 -> 배열에 3이 존재하는지 확인 -> 존재할 경우엔 아무 것도 하지 않음
		    -> 존재하지 않을 경우 세 번째 인덱스에 3을 할당
		 -> [37, 15, 3, 0, 0, 0]
		 4. 1 ~ 45 중 랜덤으로 한 개 뽑기 -> 결과 37
		 -> 배열에 37이 존재하는지 확인 -> 존재할 경우엔 아무 것도 하지 않음
		    -> 존재하지 않을 경우 네 번째 인덱스에 37을 할당
		 -> [37, 15, 3, 0, 0, 0]
		 5. 1 ~ 45 중 랜덤으로 한 개 뽑기 -> 결과 33
		 -> 배열에 33이 존재하는지 확인 -> 존재할 경우엔 아무 것도 하지 않음
		    -> 존재하지 않을 경우 네 번째 인덱스에 33을 할당
		 -> [37, 15, 3, 33, 0, 0]
		 6. 1 ~ 45 중 랜덤으로 한 개 뽑기 -> 결과 15
		 -> 배열에 15가 존재하는지 확인 -> 존재할 경우엔 아무 것도 하지 않음
		    -> 존재하지 않을 경우 다섯 번째 인덱스에 15를 할당
		 -> [37, 15, 3, 33, 0, 0]
		 7. 1 ~ 45 중 랜덤으로 한 개 뽑기 -> 결과 22
		 -> 배열에 22가 존재하는지 확인 -> 존재할 경우엔 아무 것도 하지 않음
		    -> 존재하지 않을 경우 다섯 번째 인덱스에 22를 할당
		 -> [37, 15, 3, 33, 22, 0]
		 8. 1 ~ 45 중 랜덤으로 한 개 뽑기 -> 결과 45
		 -> 배열에 45가 존재하는지 확인 -> 존재할 경우엔 아무 것도 하지 않음
		    -> 존재하지 않을 경우 여섯 번째 인덱스에 45를 할당
		 -> [37, 15, 3, 33, 22, 45]
		 */
		
		int[] lottoNumbers = new int[6];
		
		int indexCount = 0;
		int randomNumber = 0;
		boolean isDuplicated = false;
		
		while (indexCount < 6) {
			
			// 매 반복마다 중복 여부 값을 초기화시킴
			isDuplicated = false;
			
			// 로또 번호 랜덤으로 뽑기
			randomNumber = (int)(Math.random() * 45 + 1);
			
			// lottoNumbers에 randomNumber가 존재하는지 확인
			for (int i = 0; i < indexCount; i++) {
				if (lottoNumbers[i] == randomNumber) {
					isDuplicated = true;
					break; // 중복 숫자 찾기 for 종료
				}
			}
			
			// 중복된 숫자가 아니라면
			if (!isDuplicated) {
				// lottoNumbers[indexCount]에 랜덤 값을 할당
				lottoNumbers[indexCount] = randomNumber;
				// indexCount를 1 증가시킴
				indexCount++;
				
			}
		}
		System.out.println(Arrays.toString(lottoNumbers));
		sortNumbers(lottoNumbers);
	}
	
	// 거의 대부분의 정렬 문제는 DB나 Collection Framework가 처리해줌 (코테 알고리즘 공부용)
	public static void sortNumbers(int[] lottoNumbers) {
		
		for (int i = 0; i < lottoNumbers.length; i++) {
			
			for (int j = 0; j < lottoNumbers.length - 1 - i; j++) {
				System.out.println(lottoNumbers[j] + " > " + lottoNumbers[j + 1]);
				if (lottoNumbers[j] > lottoNumbers[j + 1]) {
					int tmp = lottoNumbers[j];
					lottoNumbers[j] = lottoNumbers[j + 1];
					lottoNumbers[j + 1] = tmp;
				}
			}
			
			System.out.println(i + "번째 반복 -> " + Arrays.toString(lottoNumbers));
		}
		
		System.out.println(Arrays.toString(lottoNumbers));
	}
	
	public static void main(String[] args) {
		
		makeLottoNumbers();
		
	}

}
