package array;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
	String[] name = {"���ξ�","������","���ҹ�","����"};			
	 int[] score = new int[5];
	Scanner scanner =new Scanner(System.in);
	
	System.out.printf("%s�� ������ �Է��Ͻÿ�.:",name[0]);
	  score[0]=scanner.nextInt();
	  
	  System.out.printf("%s�� ������ �Է��Ͻÿ�.:",name[1]);
	 score[0]=scanner.nextInt();
	  
	  System.out.printf("%s�� ������ �Է��Ͻÿ�.:",name[2]);
	  score[0]=scanner.nextInt();
	  
	  System.out.printf("%s�� ������ �Է��Ͻÿ�.:",name[3]);
	  score[0]=scanner.nextInt();
	  
	  System.out.printf(name[0],(double)score[0]);
	  System.out.printf(name[1],(double)score[1]);
	  System.out.printf(name[2],(double)score[2]);
	  System.out.printf(name[3],(double)score[3]);
	 scanner.close();
	}

}
