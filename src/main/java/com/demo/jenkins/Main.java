package com.demo.jenkins;

public class Main {

	public static void main(String[] args) 
	{
	
		System.out.println(checkIfInputIsAnEvenNumber(122));

	}

	static boolean checkIfInputIsAnEvenNumber(int number) {
		
		return number % 2 == 0;
		
	}

}
