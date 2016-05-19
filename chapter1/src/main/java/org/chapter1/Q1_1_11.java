package org.chapter1;

import java.util.Random;

/**
 * 编写一段代码，打印出一个二维布尔数组的内容。其中用*表示真， 表示假 ,打印出行号跟列号
 * @author yin
 *
 */
public class Q1_1_11 {

	public static void main(String[] args) {
		int a=5,b=8;
		boolean [][] c=new boolean[a][b];
		Random r=new Random();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j]=r.nextBoolean();			
			}
			
		}
		print(c);
	}
	
	public static void print(boolean [][] a)
	{	
		for (int i = 0; i < a.length; i++) {
			if(i==0){
				System.out.print(0);
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(j+1);
				}
				System.out.println();
			}
			System.out.print(i+1);
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
	}

}
