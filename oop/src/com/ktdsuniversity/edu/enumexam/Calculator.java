package com.ktdsuniversity.edu.enumexam;

public class Calculator {
	
	public static int calc(OperType operator, int n1, int n2) {
		return switch(operator) {
		case OperType.ADD -> n1 + n2;
		case OperType.SUB -> n1 - n2;
		case OperType.MUL -> n1 * n2;
		case OperType.DIV -> n1 / n2;
		default -> 0;
		};
	}
	
	public static void main(String[] args) {
		int result = calc(OperType.ADD, 1, 2);
		System.out.println(result);
		
		result = calc(OperType.SUB, 1, 2);
		System.out.println(result);
		
		result = calc(OperType.MUL, 1, 2);
		System.out.println(result);
		
		result = calc(OperType.DIV, 1, 2);
		System.out.println(result);
	}
}
