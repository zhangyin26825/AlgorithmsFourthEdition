package org.chapter1;
/**
 * 编写一段代码打印出一个M行N列的数组的转置
 * @author yin
 *
 */
public class Q1_1_13 {

	public static void main(String[] args) {
		int row=2,col=3;
		int [][] a=new int[row][col];
		int sum=1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=sum++;
			}
		}
		//正常输出
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.format("%d\t", a[i][j]);
			}
			System.out.println();
		}
		
		//转置输出
		for (int i = 0; i < col; i++) {
			for (int j = 0; j <row; j++) {
				System.out.format("%d\t", a[j][i]);
			}
			System.out.println();
		}
		
		
	}

}
