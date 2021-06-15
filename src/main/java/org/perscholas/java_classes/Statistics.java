package org.perscholas.java_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<List<Integer>> arr = new ArrayList<List<Integer>>(n);
        for (int i = 0; i < n; i++){
            String lineStr = scan.nextLine();
            String[] arrayStr = lineStr.split(" ");
            for (int j=0; j < arrayStr.length; j++)
            	arr.get(i).set(j, Integer.parseInt(arrayStr[j]));
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
        	
        }

	}

}
