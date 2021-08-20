package com.Exam_aug20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainReverserString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub  System.out.println();
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Some Sentence");
		
		String stri = bfr.readLine();
		String[] strarr = stri.split(" ");
		String Result="";
		for (int i=strarr.length-1;i>=0;i--) {
			Result+=strarr[i]+" ";
		}
		Result.trim();
		System.out.println("Output is: "+ Result);
	}

}
