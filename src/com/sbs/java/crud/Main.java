package com.sbs.java.crud;




import java.util.Scanner; //ctrl + shift + o

public class Main {
	public static void main (String[] args) {
		System.out.println("==프로그램 시작==");
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("명령어)");
		String command = sc.nextLine().trim();
		System.out.printf("입력된 명령어 : %s\n",command);
		sc.close();
		System.out.println("==프로그램 끝==");
		
		
		
		
	}
		
	
}
