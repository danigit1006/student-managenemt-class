package com.practise.student.management;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Userinput.Student;

public class StudentManagementClass {
	static Scanner scanner=new Scanner(System.in);
	static HashMap<Integer,Student> map=new HashMap<Integer,Student>();
	public static void main(String[] args) {
		
		while(true) {
		System.out.println("Welcome to student management portal");
		System.out.println("************");
		System.out.println("choose any operation from below:");
		System.out.println("1.create new student");
		System.out.println("2.update one student");
		System.out.println("3.read all student");
		System.out.println("4.delete a student");
		System.out.println("5.log out");
		int var=scanner.nextInt();
		
		switch(var) {
		
		case 1:
			createNewStudent();
			break;
		case 2:
			updateStudentRecord();
			break;
		case 3:
			readAllReacord();
			break;
		case 4:
			deleteRecord();
			break;
		case 5:
			System.exit(0);
			break;		
}
		
		
		}
	}
	 static void deleteRecord() {
		 System.out.println("Enter id to delete:");
		 int id=scanner.nextInt();
		 if(map.containsKey(id))
			 map.remove(id);
		 if(!map.containsKey(id))System.out.println("delete success");
		 else System.out.println("somethign went happened");
	}
	public static void readAllReacord() {

		for(Map.Entry temp:map.entrySet()) {
			
			Student s=(Student)temp.getValue();
			System.out.println("ID="+s.getId());
			System.out.println("NAME="+s.getName());
			System.out.println("AGE="+s.getAge());
			System.out.println("CLASS NO="+s.getClssnum());
			System.out.println("****");
			
			
		}
		
	}
	public static void updateStudentRecord() {
		System.out.println("Enter student id to update:");
		int id=scanner.nextInt();
		if(map.containsKey(id)) {
			System.out.println("choose what to update:");
			System.out.println("1.Name");
			System.out.println("2.Age");
			System.out.println("3.BACK");
			int option=scanner.nextInt();
			switch(option) {
			case 1:
				Student s=(Student)map.get(id);
				System.out.println("Enter the new name:");
				s.setName(scanner.next());
				break;
			case 2:
				Student s1=(Student)map.get(id);
				System.out.println("Enter the new Age:");
				s1.setAge(scanner.nextInt());
				break;
			
			}
			
		}
	}
	public static void createNewStudent() {
		System.out.println("Enter student id:");
		 int id=scanner.nextInt();
		 System.out.println("Enter student Name:");
		 String name=scanner.next();
		 System.out.println("Enter student Age:");
		 int age=scanner.nextInt();
		 System.out.println("Enter student Class No:");
		 int clssnum=scanner.nextInt();
		 Student s=new Student(id,name,age,clssnum);
		 map.put(id, s);
	}

}
