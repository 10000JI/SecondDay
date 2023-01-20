package com.study.s2;

public class Study6 {
	public static void main(String[] args) {
		int num1 = 20;
		
		double f1 = 1.2F;
		
		//형변환(Cascading)-형태(DataType)의 변환
		//1. primitive type(원시타입)끼리만 형변환 가능
		//2. 단, boolean은 제외
		//3. 어떤 타입이 수를 표현하는 경우의 수가 더 많은가? ? ?
		
		
		
		//num1=f1; double(8)이 int(4)보다 바이트 크기가 크다
		f1 = num1; //자동형변환(묵시적형변환)
		System.out.println(f1);
		f1 = 1.123456;
		num1 = (int)f1; //강제형변환 (명시적형변환)
		
		//자동형변환은 값의 변화가 없음
		//강제형변환은 값의 변화가 있을 수도 있음
		System.out.println(num1);
		
		//String str ="1";
		//f1 =str; 참조타입은 불가능
		
		//byte -> short (char)  -> int -> long -> float -> double (자동)
		//double -> float -> long -> int -> short (char)  -> byte (강제)
		
		char ch = 'a';
		num1 = ch;
		num1='e';
		System.out.println(num1);
		ch = (char)92;
		System.out.println(ch);
		
		//---------------------------------------
		int total = 151;
		double avg = (double)total/3; //3도 double형으로 따라 들어감
		//double avg = total/3.0; //3을 실수로 바뀜(가능)
		//double avg = total/3; int 나누기 int는 int형으로 출력된다.(불가능)
		//double avg = (double)(total/3); ()안에부터 계산되면서 int형으로 나누게 된다.(불가능)
		System.out.println(avg);
		
	}
}
