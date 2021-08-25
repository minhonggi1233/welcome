package practice;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		System.out.println("INPUT NUMBER:");
		
		Scanner scanner = new Scanner(System.in);
		
		int inputNum = scanner.nextInt();
		
		for(int i=1; i<10; i++) {
			
			System.out.printf("%d*%d=%d\n",inputNum,i,(inputNum*i));
			
			
			
		}
	
	}
}
