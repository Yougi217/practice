package com.company;
import java.io.*;

import java.math.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Integer n;
	Long x= Long.valueOf(0);
	Scanner in = new Scanner(System.in);
	System.out.print("n=");
	n = in.nextInt();
	if(n<0 || n>5){
	 return;
    }
	Long ar[] = new Long[10];
	for (int i = 1; i<=n; i++){
	    System.out.print("ar"+i+"=");
	 ar[i] = in.nextLong();
	  x = x + ar[i];
    }
    System.out.println("Result="+x);
    }
}
