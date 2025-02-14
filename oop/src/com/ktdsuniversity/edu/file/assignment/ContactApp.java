package com.ktdsuniversity.edu.file.assignment;

import com.ktdsuniversity.edu.file.assignment.exceptions.ContactNotFoundException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ContactApp implements ContactAppsInterface {

	// 연락처를 관리해줄 배열
	private List<Contact> contacts;

	public ContactApp(String fileDirectoryPath, String fileName) {
		this.contacts = new ArrayList<>();
		this.loadData(fileDirectoryPath, fileName);
	}

	@Override
	public void loadData(String fileDirectoryPath, String fileName) {
		// 파일을 읽어서 this.contacts에 연락처 목록을 할당한다.
		
		File readFile = new File("C:\\Users\\211-11\\Desktop\\FileIOExam", "contacts.txt");
		
		List<Contact> contactList = new ArrayList<>();
		
		try {
			List<String> fileLines = Files.readAllLines(readFile.toPath());
			for (String line : fileLines) {
				
//				contactList.add(new Contact(line.split(",")));
//				contactList.add(new AdditionalContact(line.split(",")));
                this.contacts.addAll(contactList);
			}
		}
		catch(IOException ioe) {
			System.out.println("파일을 읽는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
		}
		
		for (Contact eachContact : contactList) {
			System.out.println(eachContact);
		}
	}

	@Override
	public void writeData(String fileDirectoryPath, String fileName, List<String> data) {
		// this.contact에 있는 연락처 정보를 파일에 쓴다.
		
		File writeFile = new File(fileDirectoryPath, fileName);
		
		if (!writeFile.getParentFile().exists()) {
			writeFile.getParentFile().mkdirs();
		}
		
		int index = 2;
		while (writeFile.exists()) {
			String newFileName = fileName.substring(0, fileName.lastIndexOf("."));
			newFileName += " (" + (index++) + ").";
			newFileName += fileName.substring(fileName.lastIndexOf(".") + 1);
			
			writeFile = new File(fileDirectoryPath, newFileName);
		}
		
		try {
			Files.write(writeFile.toPath(), data);
			System.out.println(writeFile.getAbsolutePath());
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	@Override
	public void clean() {
		this.contacts.clear();
	}

	@Override
	public void addNewContact(Contact newContact) {
		this.contacts.add(newContact);
	}

	@Override
	public void remove(int contactIndex) {
		if (contactIndex >= 0 && contactIndex < this.contacts.size()) {
			this.contacts.remove(contactIndex);
		}
	}

	@Override
	public Contact getContactAt(int contactIndex) {
		if (contactIndex < this.contacts.size() && contactIndex >= this.contacts.size()) {
			throw new ContactNotFoundException(contactIndex + " 연락처가 아직 채워지지 않은 인덱스입니다.");
		}
		return this.contacts.get(contactIndex);
	}
	
	@Override
	public void sort() {
		// Selection Sort
		int minIdx = 0;
		for (int i = 0; i < this.contacts.size(); i++) {
			minIdx = i;
			for (int j = i + 1; j < this.contacts.size(); j++) {
				if (this.contacts.get(minIdx) != null && this.contacts.get(j) != null) {
					if ( this.contacts.get(minIdx).getProfileNumber() > this.contacts.get(j).getProfileNumber() ) {
						minIdx = j;
					}
				}
			}
			
			if (minIdx != i) {
				Contact temp = this.contacts.get(minIdx);
				if (temp != null && this.contacts.get(i) != null) {
					this.contacts.set(minIdx, this.contacts.get(i));
					this.contacts.set(i, temp);
				}
			}
		}
	}
}
