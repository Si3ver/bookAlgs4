package com.zwl.algs.ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex09 {

	public static String toBinaryString (int N) {
		String s = "";
		for (int n = N; n > 0; n /= 2){
			s = (n % 2) + s;
		}
		return s.length() > 0 ? s : "0";
	}
	
	public static void main(String[] args) {
		StdOut.println(toBinaryString(192));
		StdOut.println(toBinaryString(0));
	}

}
