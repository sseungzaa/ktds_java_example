package com.ktdsuniversity.edu.file.assignment;

import java.util.ArrayList;
import java.util.List;

public class ContactMain {

	public static void run() {
		ContactAppsInterface app1 = new ContactApp("C:\\Users\\211-11\\Desktop\\FileIOExam","contacts.txt");
		
		List<String> data1 = new ArrayList<>();
		
		data1.add(new Contact(5, "유재석", "010-5555-5555").toFileFormat());
		data1.add(new Contact(4, "박명수", "010-4444-4444").toFileFormat());
		data1.add(new Contact(6, "정준하", "010-6666-6666").toFileFormat());
		
		app1.writeData("C:\\Users\\211-11\\Desktop\\FileIOExam","contactsWriteOne.txt", data1);
		
		ContactAppsInterface app2 = new InterfacesContactApp("C:\\Users\\211-11\\Desktop\\FileIOExam","contacts.txt");
		
		List<String> data2 = new ArrayList<>();
		
		data2.add(new AdditionalContact(7, "정형돈", "010-7777-7777", "1978-03-15" , "무한상사", "대리").toFileFormat());
		data2.add(new AdditionalContact(3, "노홍철", "010-3333-3333", "1979-03-31" , "무한상사", "사원").toFileFormat());
		data2.add(new AdditionalContact(8, "정형돈", "010-8888-8888", "1979-08-20" , "무한상사", "대리").toFileFormat());
		
		app2.writeData("C:\\Users\\211-11\\Desktop\\FileIOExam","contactsWriteTwo.txt", data2);
	}

	public static void main(String[] args) {
		run();
	}
		
}
