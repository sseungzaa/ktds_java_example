package com.ktdsuniversity.edu.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExam {
	public static void main(String[] args) {
		LocalTime nowTime1 = LocalTime.now();
		DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String strNowTime1 = timeFormatter1.format(nowTime1);
		System.out.print("현재 시간 (변환 전): ");
		System.out.println(nowTime1);
		System.out.print("현재 시간 (변환 후): ");
		System.out.println(strNowTime1);
		
		System.out.println();
		
		LocalTime nowTime2 = LocalTime.of(13, 0, 0);
		nowTime2 = nowTime2.plusHours(4);
		nowTime2 = nowTime2.plusMinutes(4);
		nowTime2 = nowTime2.plusSeconds(4);
		DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String strNowTime2 = timeFormatter2.format(nowTime2);
		System.out.print("계산된 시간 (변환 전): ");
		System.out.println(nowTime2);
		System.out.print("계산된 시간 (변환 후): ");
		System.out.println(strNowTime2);
	}
}
