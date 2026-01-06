package baekjoon.problem.step.operation;

import java.util.Scanner;

public class MultiInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] A = sc.nextLine().split(" ");
        Long sum = 0l;
        for(int i = 0; i< A.length ; i++){
            sum += Integer.parseInt(A[i]);
        }
        System.out.println(sum);
    }

}
