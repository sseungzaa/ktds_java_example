package com.ktdsuniversity.edu.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderExam {
	public static void main(String[] args) {
		Calendar nowCal1 = Calendar.getInstance();
		System.out.println("----------현재----------");
		System.out.print("연: ");
		System.out.println(nowCal1.get(Calendar.YEAR));
		System.out.print("월: ");
		// Calender에서 MONTH는 가져올 때 1월->0월, 3월->2월 이렇게 한 달을 뺀 채로 가져옴
		System.out.println(nowCal1.get(Calendar.MONTH) + 1); 
		System.out.print("일: ");
		System.out.println(nowCal1.get(Calendar.DAY_OF_MONTH));
		System.out.print("시: ");
		System.out.println(nowCal1.get(Calendar.HOUR));
		System.out.print("분: ");
		System.out.println(nowCal1.get(Calendar.MINUTE));
		System.out.print("초: ");
		System.out.println(nowCal1.get(Calendar.SECOND));
		
		if (nowCal1.get(Calendar.DAY_OF_WEEK) == 1) {
			System.out.println("요일: 일요일");
		}
		else if (nowCal1.get(Calendar.DAY_OF_WEEK) == 2) {
			System.out.println("요일: 월요일");
		}
		else if (nowCal1.get(Calendar.DAY_OF_WEEK) == 3) {
			System.out.println("요일: 화요일");
		}
		else if (nowCal1.get(Calendar.DAY_OF_WEEK) == 4) {
			System.out.println("요일: 수요일");
		}
		else if (nowCal1.get(Calendar.DAY_OF_WEEK) == 5) {
			System.out.println("요일: 목요일");
		}
		else if (nowCal1.get(Calendar.DAY_OF_WEEK) == 6) {
			System.out.println("요일: 금요일");
		}
		else if (nowCal1.get(Calendar.DAY_OF_WEEK) == 7) {
			System.out.println("요일: 토요일");
		}
		
//		System.out.print("일월화수목금토 중 몇 번째 요일인지: ");
//		System.out.println(nowCal1.get(Calendar.DAY_OF_WEEK));
		
		System.out.println();
		
		Date now = Calendar.getInstance().getTime();		
		System.out.print("현재 날짜와 시간 (변환 전): ");
		System.out.println(now);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String formatDate = format.format(now);
		System.out.print("현재 날짜와 시간 (변환 후): ");
		System.out.println(formatDate);
		
		System.out.println();
		
		Calendar nowCal2 = Calendar.getInstance();
		nowCal2.set(2025, 2, 14);
		System.out.println("계산 전 월: " + nowCal2.get(Calendar.MONTH));
		System.out.println("계산 전 일: " + nowCal2.get(Calendar.DAY_OF_MONTH));
		nowCal2.add(Calendar.MONTH, 3);
		nowCal2.add(Calendar.DAY_OF_MONTH, -3);
		System.out.println("계산 후 월: " + nowCal2.get(Calendar.MONTH));
		System.out.println("계산 후 일: " + nowCal2.get(Calendar.DAY_OF_MONTH));
	}
}
