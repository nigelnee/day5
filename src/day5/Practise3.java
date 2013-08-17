package day5;

import java.util.Scanner;

public class Practise3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int max = 0;
		int min = 0;
		
		for (int i = 1; i > 0;) {
			System.out.println("请输入一个整数（输入0结束）");

			int b = a.nextInt();
			
			if (b == 0) {
				break;
			}
			min = b;
			
			if (b < min)
				min = b;

			if (b > max)
				max = b;
			
			
			}
		System.out.print("最大值"+max);
		System.out.println("最小值"+min);

		}
	
	
	
	}


