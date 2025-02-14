package com.ktdsuniversity.edu.file;

import com.ktdsuniversity.edu.file.data.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileReadExam {
	
	public static void loadProducts() {
//		File targetFile = new File("/Users/211-11/Desktop/FileIOExam", "products.txt");
		File targetFile = new File("/Users/USER/Downloads/ktds_java_example-master/FileIOExam", "products.txt");
		
		List<Product> productList = new ArrayList<>();
		
		try {
			List<String> fileLines = Files.readAllLines(targetFile.toPath()); // 파이프 자동으로 닫음
			for (String line : fileLines) {
//				System.out.println(line);
				
				productList.add(new Product(line.split(",")));
			}
		}
		catch(IOException ioe) {
			System.out.println("파일을 읽는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
		}
		
		for (Product eachProduct : productList) {
			System.out.println(eachProduct);
		}
	}
	
	public static void fileReadUseNewIO(String directoryPath, String fileName) {
		File targetFile = new File(directoryPath, fileName);
		
		try {
			List<String> fileLines = Files.readAllLines(targetFile.toPath()); // 파이프 자동으로 닫음
			for (String line : fileLines) {
				System.out.println(line);
			}
		}
		catch(IOException ioe) {
			System.out.println("파일을 읽는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
		}
	}
	
	public static void fileReadUseOldIO(String directoryPath, String fileName) {
		// 읽어오려는 파일의 객체를 만듦(tagetFile)
		File targetFile = new File(directoryPath, fileName);
		
		if (!targetFile.exists() || !targetFile.isFile()) {
			return;
		}
		
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			// 파일을 읽기 위한 FileReader 객체를 만듦(fileReader)
				// - 파일의 내용을 바이트 단위로 읽음
				// 영어, 숫자, 특수문자 - 한 글자에 1byte
				// 그 외 나머지 외국어들 - 한 글자에 3byte
				// abc = 3byte, 일이삼 = 9byte
			fileReader = new FileReader(targetFile);
			// 파일을 한 줄씩 읽기 위한 BufferedReader 객체를 만듦(bufferedReader)
				// 내부에서 FileReader를 통해 한 줄 자체를 통째로 읽음
				// 캐리지리턴(\ㅜn)이 나올 때까지 바이트를 계속 읽음
			bufferedReader = new BufferedReader(fileReader);
			// bufferedReader를 통해 EOF까지 한 줄씩 읽음
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				// 한 줄씩 출력
				System.out.println(line);
			}
		}
		catch(FileNotFoundException fnfe) {
			System.out.println(targetFile.getName() + " 파일이 존재하지 않습니다.");
//			return; // 메소드 종료
		}
		catch(IOException ioe) {
			System.out.println("파일을 읽는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
//			return; // 메소드 종료
		}
		finally {
		// 파이프를 닫음 (역순)
			// bufferedReader를 닫음
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				}
				catch(IOException ioe) {}
			}
			// fileReader를 닫음
			if (fileReader != null) {
				try {
					
					fileReader.close();
				}
				catch(IOException ioe) {}
			}
		}
	}
	
	public static void main(String[] args) {
//		fileReadUseNewIO("abcde", "fghij");
//		fileReadUseNewIO("/Users/211-11/Desktop/FileIOExam", "readSample.txt");
		
//		fileReadUseOldIO("abcde", "fghij");
//		fileReadUseOldIO("/Users/211-11/Desktop/FileIOExam", "readSample.txt");
		
		loadProducts();
	}
}
