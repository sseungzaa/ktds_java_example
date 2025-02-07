package com.ktdsuniversity.edu.interfaceexam;

public class RemoteControlMain {
	
	public static void main(String[] args) {
		
		/*
		 * RemoteControl (interface)
		 * 	-> (extends) DanawaTvSignal (interface)
		 * 
		 * StandardTvRemoteControl (class)
		 * 	-> (implements) RemoteControl (interface)
		 * 
		 * DanawaRemoteControl (class)
		 * 	-> (implements) RemoteControl (interface)
		 * 		-> (extends) DanawaTvSignal (interface)
		 * 
		 * DanawaTvSignal (interface) is a RemoteControl (interface)
		 * StandardTvRemoteControl (class) is a RemoteControl (interface)
		 * DanawaRemoteControl (class) is a DanawaTvSignal (interface)
		 * DanawaRemoteControl (class) is a RemoteControl (interface)
		 * 			because DanawaRemoteControl is a RemoteControl
		 */
		
		
		LgTvRemoteControl lgRemoteControl = new LgTvRemoteControl();
		RemoteControl godRemoteControl = new StandardTvRemoteControl();
		RemoteControl danawaRemoteControl = new DanawaRemoteControl();
		
		SamsungTv uhdTV = new SamsungTv();
		uhdTV.welcome(danawaRemoteControl);
		uhdTV.goodbye(danawaRemoteControl);
		
		LgTv oledTV = new LgTv();
		oledTV.on(godRemoteControl);
		oledTV.off(godRemoteControl);
	}

}
