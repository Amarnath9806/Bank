package com.bank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.bank.model.User;

public class Details {
 static int count=1;
	public static void main(String[] args) {
		ArrayList<User> d =new ArrayList<User>();
		d.add(getInfo());
		d.add(getInfo());
		d.add(getInfo());
		d.add(getInfo());
		d.add(getInfo());
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\\\Programs\\\\object.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(d);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static User getInfo() {
		Scanner sc = new Scanner(System.in);
		//FileInputStream fileInputStream;
	
			System.out.println("enter details of the coustmer" + count);
			User user =new User();
			user.setFirstname(sc.next());
			user.setLastname(sc.next());
			user.setAdharCardNo(sc.nextLong());
			user.setAccountNo(sc.nextLong());
			user.setAccountType(sc.next());
			user.setPanCardNo(sc.next());
			user.setPhoneNo(sc.nextLong());
			user.setAddress(sc.next());
			count++;
					return user;
	
/*System.out.println("enter details of the coustmer");
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
	}*/

}
}
