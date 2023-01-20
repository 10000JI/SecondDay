package com.study.s2;

public class Study8 {
	public static void main(String[] args) {
		int count = 1;
		System.out.println("Count: "+count);//1
		
		count = count+1;		
		System.out.println("Count: "+count);//2
		
		count ++; // count=count+1;
		System.out.println("Count: "+count);//3
		
		int result = count++; //후행은 대입 연산자보다 우선순위가 낮음
		System.out.println("Result :"+result); //3
		System.out.println("Count: "+count); //4
		
		result = ++count; //선행은 대입 연산자보다 우선순위가 높음
		System.out.println("Result :"+result); //5
		System.out.println("Count: "+count); //5
		
		System.out.println(count++); //5
		System.out.println(count); //6
		
		count--; //count=count-1;		
		//증감연산자는 헷갈리기에 단독으로 주로 쓰임
		
		count+=1; //count=count+1;
		System.out.println("Count: "+count);
		count*=3; //count=count*3;
		System.out.println("Count: "+count);
		count/=2; //count=count/2;
		System.out.println("Count: "+count);
		//확장된 대입 연산자
		
	}
}
