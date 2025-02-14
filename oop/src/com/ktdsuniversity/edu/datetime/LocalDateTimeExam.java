package com.ktdsuniversity.edu.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExam {
	public static void main(String[] args) {
		LocalDateTime nowDateTime1 = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strNowDateTime1 = dateTimeFormatter1.format(nowDateTime1);
		System.out.print("현재 날짜와 시간 (변환 전): ");
		System.out.println(nowDateTime1);
		System.out.print("현재 날짜와 시간 (변환 후): ");
		System.out.println(strNowDateTime1);
		
		System.out.println();
		
		LocalDateTime nowDateTime2 = LocalDateTime.of(2025, 2, 14, 13, 0, 0);
		nowDateTime2 = nowDateTime2.plusYears(3);
		nowDateTime2 = nowDateTime2.plusMonths(3);
		nowDateTime2 = nowDateTime2.plusDays(3);
		nowDateTime2 = nowDateTime2.plusHours(4);
		nowDateTime2 = nowDateTime2.plusMinutes(4);
		nowDateTime2 = nowDateTime2.plusSeconds(4);
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strNowDateTime2 = dateTimeFormatter2.format(nowDateTime2);
		System.out.print("계산된 날짜와 시간 (변환 전): ");
		System.out.println(nowDateTime2);
		System.out.print("계산된 날짜와 시간 (변환 후): ");
		System.out.println(strNowDateTime2);
	}
}
