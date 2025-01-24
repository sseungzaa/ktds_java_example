// Member 클래스가 존재하는 폴더 경로 ↓
package com.ktdsuniversity.edu.member.management;

public class Member {
	
	String id; // <- default(누락) 접근제어지시자
	public String name; // <- public 접근제어지시자
	
	public Member(String id,String name) {
		this.id = id;
		this.name = name;
	}
	public void hello() {
		System.out.println("Hello, " + this.name);
	}
 }
