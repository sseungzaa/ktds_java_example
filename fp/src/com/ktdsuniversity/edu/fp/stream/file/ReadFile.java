package com.ktdsuniversity.edu.fp.stream.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * 파일의 내용을 읽어서 스트림 처리를 진행
*/

public class ReadFile {
	
	private final String FILE_PATH = "C:\\Users\\211-11\\Desktop\\streamexam";
	private final String FILE_NAME = "text.txt";
	
	public void printFileDescription() {
		
		Stream<String> fileStream = null;
		
		try {
			fileStream = Files.lines(new File(this.FILE_PATH, this.FILE_NAME).toPath());
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		if (fileStream != null) {
			fileStream.filter(line -> line.length() > 0) // 줄 바꿈 제거
					  .map(line -> line.replace("\t", "§§")) // tap된 부분을 §§로 변경
					  .map(line -> line.replaceAll("KBS|SBS|JTBC|FM4U|저장위성|넷플릭스", "")) // KBS ~ 넷플릭스 제거
					  .map(line -> line.trim()) // 공백 제거
					  .filter(line -> line.contains(" MC")) // " MC" 포함된 줄만 가져옴
					  .filter(line -> !line.endsWith("MC상")) // "MC상" 포함된 줄은 제외
					  .filter(line -> line.length() < 50) // 50자 이상 줄은 제외
					  .forEach(line -> System.out.println(line));
		}
	}
	
	public static void main(String[] args) {
		ReadFile rf = new ReadFile();
		rf.printFileDescription();
	}
}
