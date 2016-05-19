package org.chapter1;
/**
 * 以下代码会打印出什么结果
 * @author yin
 *
 */
public class Q1_1_12 {

	public static void main(String[] args) {
		int [] a=new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i]=9-i;   // 9 8 7 6 5 4 3 2 1 0
		}
		for (int i = 0; i < a.length; i++) {
			a[i]=a[a[i]];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);	
		}
		/**
		 *  数组的索引    数组的值
		 *  索引进行逆序的排列
		 *  0 1 2 3 4 5 6 7 8 9
		 *  9 8 7 6 5 4 3 2 1 0
		 *  0 1 2 3 4     这个时候 a[6]=4  a[4]的值已经不是上面的5 了，而是已经修改的 a[4]=4了，其余类推
		 *  		  4 3 2 1 0 
		 */

	}

}
