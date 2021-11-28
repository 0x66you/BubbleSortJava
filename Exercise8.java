/*
 *Copyright (c) 2021 Chun-Chen,Yeh - All Rights Reserved 
*/
package chap7;
/**
 *  @author   ChunChenYeh
 *  開發日期:  Nov 28, 2021
*/
public class Exercise8 {
	public static void main(String[] argv) {
		int[] numbers = new int[argv.length];
		for(int i=0;i<argv.length;i++) {
			numbers[i]=Integer.parseInt(argv[i]);
		}
		
		// 氣泡排序法
		int temp,r;
		for(int i=numbers.length-1;i>0;i--) {
			r = 0;
			for(int j=i;j>0;j--) {
				if(numbers[r]>numbers[r+1]) {
					temp = numbers[r];
					numbers[r]=numbers[r+1];
					numbers[r+1]=temp;
				}
				r++;
			}
			for(int num:numbers) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
