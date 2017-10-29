package com.akshay.leetcode;
import java.util.Scanner;

class Fibonacci {
  static int older=0, old=0, sum=0;
  static Scanner sc = new Scanner(System.in);
  

  public static void main(String[] args) {
    System.out.println("Enter a number...");
    int count = sc.nextInt();  
    //printFibo(count);

    for (int i=0; i<count; i++) {
      //System.out.print(printFiboWithRec(i) + " ");
    }

    fibDynamic(count);
  }

  static void printFibo(int i) {
    System.out.println("Fibonacci without rec...");
    int k=0;
    while(k < i) {

      if (k==0) {
        sum+=0;
      }
      else if (k==1) {
        sum+=1;
        older=0; old=1; sum=1;
      }
      else {
        sum = older + old;
        older = old;
        old = sum;
      }
      System.out.print(sum + " ");
      k++;
    }
    System.out.println();
  }

  static void fibDynamic(int n) {
    int[] arr = new int[n];
    arr[0] = 0;
    arr[1] = 1;

    for (int i=2; i<n; i++) {
      arr[i]= arr[i-1] + arr[i-2];
    }
    for (int i=0; i<n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static int printFiboWithRec(int n) {
   if (n <=1 ) {
      return n;
   }
   else {
    return printFiboWithRec(n-1) + printFiboWithRec(n-2);
   }
  }
}