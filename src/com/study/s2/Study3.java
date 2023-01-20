package com.study.s2;

import java.util.Scanner;

public class Study3 {
	public static void main(String[] args) {
		//산술연산자
		//+, -, *, /(몫), %(나머지 연산자)
		// 5/3=1
		// 5%3=2
		//국어, 수학, 영어 점수 입력 받아서 총점과 평균 출력
		Scanner sc = new Scanner(System.in);
		//국어
		int kor=0;
		//영어
		int eng=0;
		//수학
		int math=0;
		//총점
		int sum =0;
		//평균
		int average=0;

		System.out.print("국어점수를 입력하시오: ");
		kor = sc.nextInt();
		
		System.out.print("수학점수를 입력하세요: ");
		eng = sc.nextInt();
		
		System.out.print("영어점수를 입력하세요: ");
		math = sc.nextInt();
		
		sum = kor+eng+math;
		average = sum/3;
		
		System.out.println("총점:"+sum);
		System.out.println("평균:"+average);
	}
}
