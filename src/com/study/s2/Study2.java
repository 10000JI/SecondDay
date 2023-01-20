package com.study.s2;

import java.util.Scanner;

public class Study2 {

	public static void main(String[] args) {
		System.out.println("Start");
		//키보드와 연결 준비
		Scanner sc = new Scanner(System.in);
		
		//변수 선언과 대입, 출력
		//이름,나이,좌/우 시력
		System.out.print("이름을 입력하세요:");
		String name = sc.next();
		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();
		System.out.print("왼쪽시력을 입력하세요:");
		double left = sc.nextDouble();
		System.out.print("오른쪽시력을 입력하세요:");
		double right = sc.nextDouble();
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("왼쪽시력:"+left);
		System.out.println("오른쪽시력:"+right);
		
		System.out.println("Finish");
	}

}
