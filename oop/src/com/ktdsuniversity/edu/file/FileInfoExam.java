package com.ktdsuniversity.edu.file;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileInfoExam {
	
	public static void printFileInfo(String directoryPath, String fileName) {
		File file = null;
		
		if ( fileName == null) {
			file = new File(directoryPath);
		}
		else {
			file = new File(directoryPath, fileName);
		}
		
		// 파일이 존재하는가?
		boolean exists = file.exists();
		System.out.println(fileName + " exists: " + exists);
		
		// 파일인가?
		boolean isFile = file.isFile();
		System.out.println(fileName + " isFile: " + isFile);
		
		// 폴더인가?
		boolean isDirectory = file.isDirectory();
		System.out.println(fileName + " isDirectory: " + isDirectory);
		
		// 전체경로는?
		String absolutePath = file.getAbsolutePath();
		System.out.println(fileName + " absolutePath: " + absolutePath);
		
		// 파일의 이름은?
		String name = file.getName();
		System.out.println(fileName + " name: " + name);
		
		// 파일의 크기는?
		/* 파일의 크기는 long으로 주는 이유
		 * 1byte = 8bit, 1000bytes = 1KiB, 1000KiB = 1MiB,
		 * 1000MiB = 1GiB, 1000GiB = 1TiB, 1000TiB = 1PiB
		 * -> 1GiB = ?bytes (int의 범위를 벗어남) */
		long length = file.length();
		System.out.println(fileName + " length: " + length + "bytes");
		
		// 파일이 마지막으로 수정된 시간은?
		/* 날짜와 시간을 long으로 주는 이유
		 * 컴퓨터가 날짜와 시간을 처리하는 방법 -> 기준(1970-01-01 00:00:00.000)으로부터 몇 밀리초가 지났는지 계산
		*/
		long lastModified = file.lastModified();
		System.out.println(fileName + " lastModified: " + lastModified);
		// 밀리초를 날짜 형식으로 변경
		Date lastModifiedDate = new Date(lastModified); // java.util.Date
		System.out.println(fileName + " lastModifiedDate: " + lastModifiedDate);
		
		// 파일의 부모 폴더는?
		// 파일의 위치는?
		String parentDirectoryPath = file.getParent();
		System.out.println(fileName + " parent: " + parentDirectoryPath);
		
		// file 객체가 폴더였을 때, 폴더 내부에 있는 항목은?
		File[] listFiles = file.listFiles();
		System.out.println(fileName + " listFiles: " + Arrays.toString(listFiles));
		
		
		System.out.println("=".repeat(40));
	}
	
	/* 탐색을 시작하고 싶은 폴더를 주면
	 * 하위에 존재하는 모든 폴더와 파일의 목록을 출력 */
	public static void traversingAndPrintFileInfo(String startDirectoryPath) {
		// startDirectoryPath 경로에 File 인스턴스(file)를 생성
		File file = new File(startDirectoryPath);
		// file이 존재한다면
			// file이 파일이라면
				// file의 전체 경로(파읠의 크기)를 출력
			// file이 폴더라면
				// file의 자식 요소(폴더+파일)들을 얻어옴, 그것들을 반복
					// traversingAndPrintFileInfo(자식 요소의 전체 경로);
		if (file.exists()) {
			System.out.println(file.getAbsolutePath() + "(" + file.length() + ")");
		
			if (file.isDirectory()) {
				File[] listFiles = file.listFiles();
				for (File child : listFiles) {
				traversingAndPrintFileInfo(child.getAbsolutePath());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		traversingAndPrintFileInfo("/Users/211-11/Desktop/fileexam");
		
//		printFileInfo("/Users/211-11/Desktop/fileexam", "company.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam", "example.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam", "sample.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam/subfolder1", "sub_company.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam/subfolder1", "sub_example.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam/subfolder1", "sub_sample.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam/subfolder1/subfolder1-1", "sub1-1_company.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam/subfolder1/subfolder1-1", "sub1-1_example.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam/subfolder1/subfolder1-1", "sub1-1_sample.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam/subfolder2", "sub_company.txt");
//		printFileInfo("/Users/211-11/Desktop/fileexam", null);
		
	}
}
