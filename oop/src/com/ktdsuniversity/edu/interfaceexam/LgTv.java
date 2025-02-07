package com.ktdsuniversity.edu.interfaceexam;

public class LgTv {
	
	public void on(RemoteControl signal) {
		signal.powerOn();
		System.out.println("Life's Good");
		if (signal instanceof DanawaTvSignal drc) {
			drc.openDanawaPage();
		}
	}
	
	public void off(RemoteControl signal) {
		signal.powerOff();
	}

}
