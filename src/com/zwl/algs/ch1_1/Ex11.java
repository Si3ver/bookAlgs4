package com.zwl.algs.ch1_1;

import org.omg.CORBA.FloatSeqHelper;

import edu.princeton.cs.algs4.StdOut;
import sun.font.TrueTypeFont;

public class Ex11 {

	public static void printBoolMatrix(Boolean[][] matrix) {
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				StdOut.print(matrix[i][j] == false ? " * " : "   ");
			}
			StdOut.println();
		}
		
	}
	
	//Ex13
	public static void printTMatrix(Boolean[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++){
			for (int j = 0; j < matrix.length; j++){
				StdOut.print(matrix[j][i] == false ? " # " : "   ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Boolean[][] m = {{true , false, false, true }, 
				         {false, false, false, false},
				         {false, true , true , false}};
		
		printBoolMatrix(m);
		printTMatrix(m);
	}

}
