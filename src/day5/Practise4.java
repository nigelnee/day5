package day5;

import java.util.Scanner;

public class Practise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true){
			
		Scanner a=new Scanner(System.in);
		System.out.print("请输入数字1-7（输入0结束）：");
		int day=a.nextInt();
		if(day==0){
			System.out.println("程序结束");break;
		}else if(day<=7&&day>=1){
			switch(day){
			case 1:System.out.println("今天是MON");break;
			case 2:System.out.println("今天是TUE");break;
			case 3:System.out.println("今天是WED");break;
			case 4:System.out.println("今天是THU");break;
			case 5:System.out.println("今天是FRT");break;
			case 6:System.out.println("今天是SAT");break;
			case 7:System.out.println("今天是SUN");break;
			}
		}
		}
	}

}

