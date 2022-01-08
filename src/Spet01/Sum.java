package Spet01;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhập số a:" );
	int a = scanner.nextInt();
	System.out.print("Nhập b: ");
	int b= scanner.nextInt();
	
	int c = a+b;
	System.out.println("Tổng hai số là:" +c);
}
}
