package com.ktdsuniversity.edu.interfaceexam;

public class SamsungTv {
	
	public void welcome(RemoteControl signal) {
		signal.powerOn();
		System.out.println("SAMSUNG");
		if (signal instanceof DanawaTvSignal drc) {
			drc.openDanawaPage();
		}	
	}
	
	public void goodbye(RemoteControl signal) {
		signal.powerOff();
	}

}
