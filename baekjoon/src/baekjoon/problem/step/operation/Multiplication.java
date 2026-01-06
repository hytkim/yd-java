package baekjoon.problem.step.operation;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.nextLine());
		int B = Integer.parseInt(sc.nextLine());

		System.out.println(A * (B % 10));
		System.out.println(A * ((B % 100) / 10));
		System.out.println(A * (B / 100));
		System.out.println(A * B);
	}
}