package com.bank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class Retrivedata {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
FileInputStream fileInputStream;
try {
	fileInputStream = new FileInputStream("D:\\Programs\\object.txt");
	ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
	ArrayList<User> a1 =(ArrayList<User>)objectInputStream.readObject();
	User u = getInfo();
	int c=0;
	for (int i = 0; i < a1.size(); i++) {
		User s=a1.get(i);
		if(s.getAdharCardNo()==u.getAdharCardNo()) {
			c++;
			System.out.println("yes");
			break;
		
		}
		
	}
	if(c==0) {
		System.out.println("not present");
		a1.add(u);
		System.out.println("cvbnm");
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
	private static User getInfo() {
		Scanner sc = new Scanner(System.in);
		//FileInputStream fileInputStream;
	
			System.out.println("enter details of the coustmer" );
			User user =new User();
			user.setFirstname(sc.next());
			user.setLastname(sc.next());
			user.setAdharCardNo(sc.nextLong());
			user.setAccountNo(sc.nextLong());
			user.setAccountType(sc.next());
			user.setPanCardNo(sc.next());
			user.setPhoneNo(sc.nextLong());
			user.setAddress(sc.next());
			
					return user;
	

}
}
