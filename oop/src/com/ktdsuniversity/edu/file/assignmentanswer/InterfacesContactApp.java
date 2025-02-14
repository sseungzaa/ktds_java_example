package com.ktdsuniversity.edu.file.assignmentanswer;

import com.ktdsuniversity.edu.file.assignmentanswer.exceptions.ContactNotFoundException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class InterfacesContactApp implements ContactAppsInterface {
	
	// 연락처를 관리해줄 배열
	private List<Contact> contacts;

	public InterfacesContactApp(String fileDirectoryPath, String fileName) {
		this.contacts = new ArrayList<>();
		this.loadData(fileDirectoryPath, fileName);
	}

	@Override
	public void loadData(String fileDirectoryPath, String fileName) {
		// 파일을 읽어서 this.contacts에 연락처 목록을 할당한다.
		List<Contact> tempContactList = new ArrayList<>();
		
		File readFile = new File("C:\\Users\\211-11\\Desktop\\FileIOExam", "contacts.txt");
		
		List<String> contactLines = null;
		try {
			contactLines = Files.readAllLines(readFile.toPath());
		}
		catch(IOException ioe) {
			System.out.println("파일을 읽는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
		}
		
		if (contactLines != null) {
			for (String line : contactLines) {
				String[] splitedLine = line.split(",");
				if (splitedLine.length <= 3) {
					tempContactList.add(new Contact(splitedLine));
				}
				else if (splitedLine.length <= 6) {
					tempContactList.add(new AdditionalContact(splitedLine));
				}
			}
		}
		this.contacts.addAll(tempContactList);
	}

	@Override
	public void writeData(String fileDirectoryPath, String fileName) {
		// this.contact에 있는 연락처 정보를 파일에 쓴다.
		List<String> data = new ArrayList<>();
		
		for (Contact eachContact : this.contacts) {
			data.add(eachContact.toFileFormat());
		}
		
		File writeFile = new File(fileDirectoryPath, fileName);
		
		if (!writeFile.getParentFile().exists()) {
			writeFile.getParentFile().mkdirs();
		}
		
		int index = 2;
		while (writeFile.exists()) {
			String newFileName = fileName.substring(0, fileName.lastIndexOf("."));
			newFileName += " (%d).".formatted(index++);
			newFileName += fileName.substring(fileName.lastIndexOf(".") + 1);
			
			writeFile = new File(writeFile.getParent(), newFileName);
		}
		
		try {
			Files.write(writeFile.toPath(), data);
			System.out.println(writeFile.getAbsolutePath());
		}
		catch(IOException ioe) {
			System.out.println("파일을 읽는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
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
		if (contactIndex >= this.contacts.size()) {
			throw new ContactNotFoundException(contactIndex + " 연락처가 아직 채워지지 않은 인덱스입니다.");
		}
		return this.contacts.get(contactIndex);
	}
	
	@Override
	public void sort() {
		// Bubble Sort
		for (int i = 0; i < this.contacts.size(); i++) {
			for (int j = 0; j < this.contacts.size() - 1 - i; j++) {
				if (this.contacts.get(j-1).getProfileNumber() < this.contacts.get(j).getProfileNumber()) {
					Contact temp = this.contacts.get(j);
					this.contacts.set(j, this.contacts.get(j+1));
					this.contacts.set(j+1, temp);
				}
			}
		}
	}
}
