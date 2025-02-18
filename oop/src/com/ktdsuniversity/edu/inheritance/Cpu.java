package com.ktdsuniversity.edu.inheritance;

public class Cpu {
	
	private String menufactor;
	private String seriesNumber;
	
	public Cpu(String menufactor, String seriesNumber) {
		this.menufactor = menufactor;
		this.seriesNumber = seriesNumber;
	}
	
	public void calculate() {
		StringBuffer sb = new StringBuffer();
		sb.append("제조사: " + this.menufactor + "\n");
		sb.append("시리즈 번호: " + this.seriesNumber + "\n");
		sb.append("2진수 연산 중입니다..........");
		
		System.out.println(sb.toString());
	}
}
