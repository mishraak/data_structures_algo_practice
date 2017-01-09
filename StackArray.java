import java.lang.*; 
import java.util.*;

public class StackArray
{
  
  public static int[] a = new int[10];
  public static int top1=-1, top2=a.length;
  public static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    while(true) {
      System.out.println("1.push1 2.push2 3.display 4.pop1 5.pop2");
      int id = sc.nextInt();
      switch(id) {
        case 1 : push1();break;
        case 2 : push2();break;
        case 3 : display();break;
        case 4 : pop1();break;
        case 5 : pop2();break;
      }
    }
  }
  
  static void push1() {
    System.out.println("Enter number to push to stack1...");
    int p1 = sc.nextInt();
    if (top1 == top2-1) {
      System.out.println("Stack 1 is full.");
    }
    else {
      top1++;
      a[top1] = p1;  
    }
  }
  
  static void push2() {
    System.out.println("Enter number to push to stack2...");
    int p2 = sc.nextInt();
    if (top2 == top1+1) {
      System.out.println("Stack 2 is full.");
    }
    else {
      top2--;
      a[top2] = p2;
    }
  }
  
  static void display() {
    int t1 = top1;
    if (top1 == -1) {
      System.out.println("Stack 1 is empty...");
    }
    else {
      while( t1 > -1) {
        System.out.println(a[t1]); 
        t1--;
      }
    }

    System.out.println("---------");

    int t2 = top2;
    if (top2 == a.length) {
      System.out.println("Stack 2 is empty...");
    }
    else {
      while( t2 < a.length) {
        System.out.println(a[t2]);
        t2++;
      } 
    }
  }
  
  static void pop1() {
    if (top1 != -1) {
      while(top1 > -1) {
        System.out.println(a[top1]);
        top1--;
      }
    }
    else {
      System.out.println("Stack 1 empty...");
    }
  }
  
    static void pop2() {
    if (top2 != a.length)  {
      while(top2 < a.length)  {
        System.out.println(a[top2]);
        top2++;
      }
    }
    else {
      System.out.println("Stack 2 empty...");
    }
  }
  
}

