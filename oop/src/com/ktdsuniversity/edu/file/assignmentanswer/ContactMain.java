package com.ktdsuniversity.edu.file.assignmentanswer;

import java.util.ArrayList;
import java.util.List;

public class ContactMain {

	public static void run() {
		ContactAppsInterface app1 = new ContactApp("C:\\Users\\211-11\\Desktop\\FileIOExam","contacts.txt");
		ContactAppsInterface app2 = new InterfacesContactApp("C:\\Users\\211-11\\Desktop\\FileIOExam","contacts.txt");
		
		System.out.println(app1.getContactAt(0));
		System.out.println(app2.getContactAt(1));
		System.out.println(app1.getContactAt(2));
		System.out.println(app2.getContactAt(3));
		System.out.println(app1.getContactAt(4));
		System.out.println(app2.getContactAt(5));
		System.out.println(app1.getContactAt(6));
		System.out.println(app2.getContactAt(7));
		
		app1.writeData("C:\\Users\\211-11\\Desktop\\FileIOExam","contactsWriteOne.txt");
		app2.writeData("C:\\Users\\211-11\\Desktop\\FileIOExam","contactsWriteTwo.txt");
	}

	public static void main(String[] args) {
		run();
	}
		
}
