package com.ktdsuniversity.edu.interfaceexam;

/**
 * 리모콘 표준을 잘 지킨 리모콘
 */

public class StandardTvRemoteControl implements RemoteControl {
	
	@Override
	public void powerOn() {
		System.out.println("TV의 전원을 켭니다");
	}
	
	@Override
	public void powerOff() {
		System.out.println("TV의 전원을 끕니다");
	}

}
