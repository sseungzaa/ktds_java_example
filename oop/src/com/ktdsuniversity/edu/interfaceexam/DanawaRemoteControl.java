package com.ktdsuniversity.edu.interfaceexam;

public class DanawaRemoteControl implements DanawaTvSignal {
	
	@Override
	public void powerOn() {
		System.out.println("켜져라!");
	}
	
	@Override
	public void powerOff() {
		System.out.println("꺼져라!");
	}
	
	/**
	 * 비표준 기능
	 * 다나와 홈페이지를 TV에 띄움
	 */
	public void openDanawaPage() {
		System.out.println("브라우저를 실행해 다나와 사이트에 접속합니다.");
	}

}
