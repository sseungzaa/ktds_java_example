package com.ktdsuniversity.edu.generic;

/**
학생 한 명의 성적을 구하는 클래스 (제네릭 활용하면서)
방법1. 추상 클래스로 제작
방법2. 합계, 평균 안 구해줌 -> 인스턴스를 사용하는 Main 클래스에서 직접 구함 ---------- 이걸로 해보자!
방법3. 인터페이스 활용
	- 합계, 평균 구하기를 할 수 있는 인터페이스를 제작
	- ScoreArray 클래스에서 인터페이스를 통해 합계를 구하고 평균을 구함
*/

// <> 안에는 마음대로 정해서 쓰면 됨
public class ScoreArray<T> {
	/**
	학생의 이름
	*/
	private String name;
	
	/**
	과목별 성적
	*/
	private Object[] scoreArray;
	
	/**
	등록된 성적의 개수
	 */
	private int size;
	
	private T add;
	
	public ScoreArray(String name) {
		this.name = name;
		this.scoreArray = new Object[4]; // [100, 80, 70, 90] <- 배열에 + 95 + 85 + 75 를 하고 싶음
	}
	
	public Object[] getScoreArray() {
		return this.scoreArray;
	}
	
	public int getSize() {
		return this.size;
	}
	
	/**
	성적 배열에 성적을 추가
	@param score
	*/
	public void addition(T score) {
		if (this.size >= this.scoreArray.length) {
		//	this.scoreArray = new int[8]; // [0, 0, 0, 0, 0, 0, 0, 0]
			Object[] tempScoreArray = new Object[this.scoreArray.length + 4];
			// tempScoreArray에 this.scoreArray의 값을 일일이 할당
		//	for (int i = 0; i < this.size; i++) {
		//		tempScoreArray[i] = this.scoreArray[i];
		//	}
			System.arraycopy(this.scoreArray, 0, tempScoreArray, 0, this.size);
			/*
			this.scoreArray = [100, 80, 70, 90]
			tempScoreArray = [100, 80, 70, 90, 0, 0, 0, 0]
			*/
			this.scoreArray = tempScoreArray; // 메모리 교체
		}
		this.scoreArray[size++] = score;
		// this.add += score; // T에서의 타입이 뭐가 될지 알 수 없기 때문에 쓸 수 없는 코드가 됨
		// ↑ 91번 라인에서 올바른 평균이 나오는 이유가 되는 코드
	}
	
	/**
	scoreArray에 들어있는 점수들의 합계를 반환
	@return
	*/
//	public T add() {
//		for (int i = 0; i < this.size; i++) {
//			this.add += this.scoreArray[i];
//		}
//		return this.add;
//	}
	
//	public double average() {
//		T add = this.add > 0 ? this.add : this.add();
//		return add / (double) this.size;
//	}
	
	// 점수 등록(addition) ......
	// → 합계 구하기(add)
	// → 평균 구하기(average)
	// → 점수 등록(addition) -> 점수 배열 변화 생김
	// → 합계 구하기(add) -> 올바른 합계가 나올까? 나옴
	// → 평균 구하기(average) -> 올바른 평균이 나올까? 나옴
	// → 점수 등록(addition) -> 점수 배열 변화 생김
	// → 평균 구하기(average) -> 올바른 평균이 나올까? 나옴
}

//		if (this.size >= this.scoreArray.length) {
//		//	this.scoreArray = new int[8]; // [0, 0, 0, 0, 0, 0, 0, 0]
//			int[] tempScoreArray = new int[this.scoreArray.length + 4];
//			// tempScoreArray에 this.scoreArray의 값을 일일이 할당
//			for (int i = 0; i < this.size; i++) {
//				tempScoreArray[i] = this.scoreArray[i];
//			}
//			/*
//			this.scoreArray = [100, 80, 70, 90]
//			tempScoreArray = [100, 80, 70, 90, 0, 0, 0, 0]
//			*/
//			this.scoreArray = tempScoreArray; // 메모리 교체
//		}
