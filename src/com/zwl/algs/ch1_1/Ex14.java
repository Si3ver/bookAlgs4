package com.zwl.algs.ch1_1;

public class Ex14 {

	public static int lg(int N){
		int i = 0, x = 1;
		for (; x <= N; i++){  //x = 2^i
			x *= 2;
		}
		return i - 1;
	}
	public static void main(String[] args) {
		System.out.println(lg(255));	//lg(255) = 7.x
		System.out.println(lg(256));	//lg(256) = 8
		System.out.println(lg(257));	//lg(257) = 8.x
	}

}
