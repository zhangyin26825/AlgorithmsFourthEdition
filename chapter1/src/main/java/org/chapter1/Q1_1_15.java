package org.chapter1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 编写一个静态方法histogram() ,接受一个整形数组a[] 和一个整数M为参数并返回一个大小为M的数组，其中第i个元素的值为整数i在参数组中出现的次数
 * 如果a[]中的值均在0至M-1之间，返回数组中所有元素之和应该与a.length相等
 * @author yin
 * 这个好像就是计数排序的第一个步骤
 *
 */
public class Q1_1_15 {

	public static void main(String[] args) {
		int m=10;
		Random r=new Random();
		int [] a=new int[20];
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt(10);
		}
		
		int[] histogram = histogram(a, m);
		int sum = IntStream.of(histogram).sum();
		System.out.println(sum==20);
	}
	
	public static int[] histogram(int[] a,int m){
		int [] result=new int[m];
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			if(j>=0&&j<m){
				result[j]++;
			}
		}
		return result;
	}

}
