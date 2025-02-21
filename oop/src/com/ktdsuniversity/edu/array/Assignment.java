package com.ktdsuniversity.edu.array;

public class Assignment {
	
	public static void changeValue(int[] array, int index1, int index2) {
		int tempValue = array[index1];
		array[index1] = array[index2];
		array[index2] = tempValue;
	}
	
	public static void printValue(int[] array) {
		StringBuffer textBuffer = new StringBuffer();
		textBuffer.append("[");
		for (int i = 0; i < array.length; i++) {
			textBuffer.append(array[i]);
			// 마지막 인덱스가 아니라면
			if (i < array.length - 1) {
				textBuffer.append(", ");
			}
		}
		textBuffer.append("]");
		
		System.out.println(textBuffer.toString());
	}
	
	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		
		System.out.println("========== 1번 ==========");
		
		int numberOne = 10;
		int numberTwo = 20;
		
		int num = numberOne; // num:10, numberOne:10
		
		numberOne = numberTwo; // numberOne:20, numberTwo:20
		
		numberTwo = num; // numberTwo:10, num:10
		
		System.out.println("numberOne: " + numberOne);
		System.out.println("numberTwo: " + numberTwo);
		
		System.out.println("========== 2번 ==========");
		
		/*
		int[] array = new int[4];
		
		array[0] = 10;
		array[1] = 5;
		array[2] = 20;
		array[3] = 4;
		*/
		int[] array = {10, 5, 20, 4};
		
		num = array[0];
		
		array[0] = array[1];
		
		array[1] = num;
		
		num = array[2];
		
		array[2] = array[3];
		
		array[3] = num;
		
		System.out.println("변경 전: ");
		printValue(array);
		
		changeValue(array, 0, 1);
		changeValue(array, 2, 3);
		
		System.out.println("\n변경 후: ");
		printValue(array);
		
		System.out.println("========== 3번 ==========");
		
//		int[] array2 = new int[10];
//		
//		for (int i = 0; i < array2.length; i++) {
//			array2[i] = i + 1;
//		}
//		
//		int length = array2.length;
//		System.out.print("변경 전: ");
//		printArray(array2);
//
//		for (int i = 0; i < length / 2; i++) {
//			changeValue(array2, i, length - i - 1);
//		}
//		System.out.print("\n변경 후: ");
//		printArray(array2);
		
//		/* 내가 한 부분
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < array2.length / 2; i++) {
			// 0,9 / 1,8 / 2,7 / 3,6 / 4,5
			// 1번째 array2.length-i-1 = 10-0-1 = 9
			// 2번째 array2.length-i-1 = 10-1-1 = 8
			
			int j = array2.length-i-1;
			
			num = array2[i]; // n,0 -> n,1 -> n,2 -> n,3 -> n,4
			
			array2[i] = array2[j]; // 0,9 -> 1,8 -> 2,7 -> 3,6 -> 4,5
			
			array2[j] = num; // 9,n -> 8,n -> 7,n -> 6,n -> 5,n
		}
		
		// 배열 순회하며 출력
		for (int i = 0; i < array2.length; i++) {
			System.out.println(i + " -> " + array2[i]);
//			System.out.println(array2);
		}
//		*/
	}
}
