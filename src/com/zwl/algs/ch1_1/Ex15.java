package com.zwl.algs.ch1_1;

public class Ex15 {

	public static int[] histogram(int[] a, int M) {
		int[] cnt = new int[M];
		for (int i = 0; i < a.length; i++){
			cnt[a[i]]++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 5, 1, 3};
		int[] cnt = histogram(a, 6);
		
		for(int i = 0; i < cnt.length; i++){
			System.out.println(cnt[i]);
		}
//		int[] c1 = {4, 5, 6, 7};
//		int[] d1 = c1;
//		System.out.println(c1);
//		System.out.println(d1);
	}

}
