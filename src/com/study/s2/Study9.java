package com.study.s2;

import java.util.Scanner;

public class Study9 {
	
	public static void main(String[] args) {
		int age = 18;
		String result = age>=20? "성년" : "미성년";
		System.out.println(result);
		
		//1. 물건의 가격을 입력
		//2. 물건의 가격이 30000원 이상이면 5% 할인 아니면 3% 할인
		//3. 택배비 별도 2500원
		//4. 최종출력: 물건의 최종가격과 택배비가 포함된 최종가격 출력
		Scanner sc = new Scanner(System.in);
		//물건의 가격을 담을 변수
		int price=0;
		
		//최종가격을 담을 변수
		int total = 0;
		
		//할인율을 담을 변수
		double discount = 0.0;
		
		System.out.print("물건의 가격을 입력하시오: ");
		price = sc.nextInt();
		
//		discount = price>=30000?0.05:0.03;
//		price = (int)(price - price*discount);
		
//		discount = price >= 30000?0.95:0.97;
//		price = (int)(price*discount);
		
		price = price >= 30000?(int)(price*0.95):(int)(price*0.97);
		
		total = price + 2500;
		System.out.println("물건의 최종가격은 "+price+"원 입니다.");
		System.out.println("택배비가 포함된 최종가격은 "+total+"원 입니다.");
	}
	
}
