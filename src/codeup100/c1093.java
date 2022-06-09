package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1093 {
	public static void main(String[] args) throws IOException {
//	Memory 27364 Runtime 228		
//		Scanner scan = new Scanner(System.in);
//		int count = scan.nextInt();
//		int students[] = new int[23];
//		int num = 0;
//		
//		for (int i = 0 ; i < count ; i++) {
//			num = scan.nextInt();
//			students[num - 1] += 1;
//		}
//		for (int j = 0 ; j < students.length ; j++) {
//			System.out.print(students[j]+ " ");
//		}
//		
//		scan.close();
		
//	Memory 13680 Runtime 88
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());
		int students[] = new int[23];
		String num[] = reader.readLine().split(" ");
		int num_i = 0;
		
		for (int i = 0 ; i < count ; i++) {
			num_i = Integer.parseInt(num[i]);
			students[num_i - 1] += 1;
		}
		
		for (int j = 0 ; j < students.length ; j++) {
			System.out.print(students[j]+ " ");
		}
		
		reader.close();
	}
}
