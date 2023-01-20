package com.study.s2;

import java.util.Scanner;

public class Study10 {

	public static void main(String[] args) {
		//a-z중 입력한 후, 입력된 수 만큼 건너띄기 (단, 범위는 a-z)
		//z+1=123 =>97
		//y+2=123 =>97
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 소문자만 입력하세요(a-z): ");
		char ch = sc.next().charAt(0); //.charAt()은 내가 입력한 문자열(혹은 문자)중 한개만 입력
		//z
		
		System.out.print("숫자를 입력하세요: ");
		int key = sc.nextInt();//2
		
		int num =(int)ch+key;
		
		//합계가 z를 넘었는가?
		num = num>122?num-'z'-1+'a':num; //자동형변환 (int가 char보다 크다)
		
		char result=(char)num;
		
		System.out.println(result);
		
		
//		char result =(char)num;//d
//		int newresult = (int)num>122?(num-122+96):num;
//		char newrsesult1 = (char)(num>'z'?(num-'z'+'a'-1):num);
//		System.out.println((char)newresult);
//		System.out.println(newrsesult1);
		
	}

}
