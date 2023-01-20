package com.study.s2;

import java.util.Scanner;

public class Study4 {
	
	public static void main(String[] args) {
		System.out.println("Start");
		
		//무인 편의점
		
		//물건값의 총합계
		int total = 25750;
		//손님이 낸 돈
		int money = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("지불할 돈을 입력하세요: ");
		money = sc.nextInt();
		//잔돈 계산
		int jandon = money - total;
		
		//코드 진행
		//만원짜리 갯수를 담을 변수
		int man = 0;
		man = jandon / 10000;
		
		//천원자리 갯수를 담을 변수
		int chon = 0;
		chon = jandon / 1000 % 10;
		//chon = jandon % 10000 / 1000;
		//chon = (jandon - man * 10000) / 1000;
		//chon = jandon/1000 - jandon/10000*10;
		
		//백원자리 갯수를 담을 백수
		int back = 0;
		back = jandon % 1000 / 100;
		//back = (janon-man*10000-chon*1000)/100;
		
		//십원자리 갯수를 담을 백수
		int sip = 0;
		sip = jandon % 100 / 10;
		
		//코드 진행
		System.out.println("잔돈은 "+jandon+"원 입니다.");
		System.out.print("만원짜리 : ");
		System.out.println(man);
		System.out.print("천원짜리 : ");
		System.out.println(chon);
		System.out.print("백원짜리 : ");
		System.out.println(back);
		System.out.print("십원짜리 : ");
		System.out.println(sip);
		
		System.out.println("Finish");
	}
	
}
