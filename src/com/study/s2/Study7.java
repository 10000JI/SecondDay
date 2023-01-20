package com.study.s2;

import java.util.Scanner;

public class Study7 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean check1 = num1 == num2;
		System.out.println(check1);
		
		long num3 = 10L;
		check1 = num1 == num3; // 연산은 같은 타입끼리만 연산가능, but 여기선 타입변환 가능(자동형변환)
		System.out.println(check1);
		num1 = 1;
		check1 = num1 == '1'; // 연산은 같은 타입기리만 연산가능, but 여기선 타입변환 가능(자동형변환)
		System.out.println(check1);
		//'1'은 문자 1이기 때문에 false
		
		String str1 = "abc";
		String str2 = "abc";
		check1 = str1 == str2;
		System.out.println(check1);
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요: ");
		String str3 = sc.next(); //abc입력
		check1 = str1 == str3;
		System.out.println(check1);
		//문자열끼리 같은지 물어볼 때, "==" 사용하면 안된다.
		//주소가 다르기 때문이다. 따라서 주소의 위치가 같은지 물어보는 "=="보다는 ".equals" 메소드를 사용
		//primitive type끼리는 == 표시 사용해도 문제 없음
	}

}
