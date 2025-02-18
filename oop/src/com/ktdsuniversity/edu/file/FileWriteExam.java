package com.ktdsuniversity.edu.file;

import com.ktdsuniversity.edu.file.data.Product;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileWriteExam {
	
	public static void fileWriteUseNewIO(String directoryPath, String fileName, List<String> data) {
		
		// 새로 작성할 파일 인스턴스를 만듦
		File writeFile = new File(directoryPath, fileName);
		
		// 파일을 만들 위치가 존재하는지 확인
		if (!writeFile.getParentFile().exists()) {
			// 없다면 폴더를 새롭게 만듦
			writeFile.getParentFile().mkdirs();
		}
		
		// 같은 이름의 파일이 이미 존재하는지 확인
		int index = 2;
		while (writeFile.exists()) {
			// 다른 이름의 파일이 나올 때까지 파일 이름에 순번을 붙임
			// storeProduct.txt -> storeProduct
			String newFileName = fileName.substring(0, fileName.lastIndexOf("."));
			// storeProduct.txt -> storeProduct (2)
			newFileName += " (" + (index++) + ").";
			// storeProduct (2).txt
			newFileName += fileName.substring(fileName.lastIndexOf(".") + 1);
			
			writeFile = new File(directoryPath, newFileName);
		}
		
		// 파일 쓰기
		try {
			Files.write(writeFile.toPath(), data);
			// 쓴 파일의 위치를 출력
			System.out.println(writeFile.getAbsolutePath());
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		List<String> data = new ArrayList<>();
		data.add(new Product("스마트폰1", 20, 100).toFileFormat());
		data.add(new Product("스마트폰2", 30, 90).toFileFormat());
		data.add(new Product("스마트폰3", 40, 80).toFileFormat());
		data.add(new Product("스마트폰4", 50, 70).toFileFormat());
		data.add(new Product("스마트폰5", 60, 60).toFileFormat());
		data.add(new Product("스마트폰6", 70, 50).toFileFormat());
		
		fileWriteUseNewIO("/Users/211-11/Desktop/FileIOExam/Store", "storeProduct.txt", data);
	}
}
