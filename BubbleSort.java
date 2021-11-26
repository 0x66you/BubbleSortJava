/*
 *Copyright (c) 2021 Chun-Chen,Yeh - All Rights Reserved 
*/
package lab01;
import org.junit.jupiter.api.*;
/**
 *  @author   ChunChenYeh
 *  開發日期:  Nov 26, 2021
*/
public class BubbleSort {
	@Test
	public void bubblesort() {
		int[] data = {8,7,6,5,4,3,2,1}; 
		int temp,k=0;
		for(int i = data.length-1;i>0;i--) {
			for(int j = i;j>0;j--) {
				if(data[k]>data[k+1]) {
					temp = data[k];
					data[k] = data[k+1];
					data[k+1] = temp;
				}
				k++;	
			}
			k=0;
			for(int n:data) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}
