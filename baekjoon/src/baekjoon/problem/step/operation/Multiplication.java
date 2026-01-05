package baekjoon.problem.step.operation;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.nextLine());
	    int B = Integer.parseInt(sc.nextLine());
	    int b1 = 0;
	    int b2 = 0;
	    int b3 = 0;
	    b1 = B/100;
	    b2 = B%100/10;
	    b3 = B%10;
	    
	    System.out.println(A*b3);
	    System.out.println(A*b2*10);
	    System.out.println(A*b1*100);
	    System.out.println(A*B);
	}

}
// Math.pow(a,2)