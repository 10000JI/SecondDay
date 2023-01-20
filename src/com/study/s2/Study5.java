package com.study.s2;

import java.util.Scanner;

public class Study5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//+, -, *, /,%
		
		//0 -> 0
		//1 -> 1
		//2 -> 2
		//3 -> 3
		
		//4 -> 10
		//5 -> 11
		//8 -> 12
		//7 -> 13
		
		//12 -> 30
		
		int input = 0;
		
		int output = 0;
		
		//코드 작성
		System.out.print("숫자를 입력하세요: ");
		input = sc.nextInt();
		output = input % 4 + input / 4 * 10;
		
		System.out.println("입력값: "+input);
		System.out.println("출력값: "+output);
//		System.out.print("입력값:");
//		System.out.println(input);
//		System.out.print("출력값");
//		System.out.println(output);
	}
	
}
