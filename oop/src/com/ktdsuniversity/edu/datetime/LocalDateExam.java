package com.ktdsuniversity.edu.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateExam {
	public static long getPeriodDays(LocalDate start, LocalDate end) {
		return start.datesUntil(end).count();
	}
	
	public static void main(String[] args) {
		LocalDate nowDate1 = LocalDate.now();
		DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String strNowDate1 = dateFormatter1.format(nowDate1);
		System.out.print("현재 날짜 (변환 전): ");
		System.out.println(nowDate1);
		System.out.print("현재 날짜 (변환 후): ");
		System.out.println(strNowDate1);
		
		System.out.println();
		
		LocalDate nowDate2 = LocalDate.of(2025, 2, 14);
		nowDate2 = nowDate2.plusYears(3);
		nowDate2 = nowDate2.plusMonths(3);
		nowDate2 = nowDate2.plusDays(3);
		DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String strNowDate2 = dateFormatter2.format(nowDate2);
		System.out.print("계산된 날짜 (변환 전): ");
		System.out.println(nowDate2);
		System.out.print("계산된 날짜 (변환 후): ");
		System.out.println(strNowDate2);
		
		System.out.println();
		
//		LocalDate startDate = LocalDate.of(2025, 2, 14);
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.of(2026, 6, 11);
		Period between = Period.between(startDate, endDate); // 현재 ~ 260611까지 날짜 계산
		String periodFormatter = String.format("%d년 %d개월 %d일", between.getYears(),
											   between.getMonths(), between.getDays());
		System.out.println("2026 월드컵 개막일까지 남은 날짜: " + periodFormatter);
		
		long dDay = LocalDateExam.getPeriodDays(LocalDate.now(), LocalDate.of(2026, 6, 11));
		System.out.println("2026 월드컵 개막일까지 D-" + dDay);
		
		long dDayChrono = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("2026 월드컵 개막일까지 D-" + dDayChrono);
	}
}
