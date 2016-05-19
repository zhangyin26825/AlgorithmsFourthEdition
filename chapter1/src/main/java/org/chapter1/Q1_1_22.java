package org.chapter1;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * 使用1.1.64节中的rank()递归方法重新实现BinarySearch并跟踪该方法的调用。每当该方法
 * 被调用时，打印出它的参数lo和hi并按照递归的深度缩进。
 * 
 * 
 * 
 * @author yin
 *
 */
public class Q1_1_22 {
	
	public static void main(String[] args) {
		Random  r=new Random();
		int [] a=new int[30];
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt(100);
		}
		Arrays.sort(a);
		int rank = rank(56, a);
	}
	
	public static int rank(int key,int [] a){
			return rank(key,a,0,a.length-1,0);
	}
	
	public static int rank(int key,int [] a,int lo,int hi,int depth){
		for (int i = 0; i < depth; i++) {
			System.out.print("	");
		}
		System.out.println("lo="+lo+"  hi="+hi);
		if(lo>hi) return -1;
		int mid=lo+(hi-lo)/2;
		if(key<a[mid]) return rank(key,a,lo,mid-1,depth+1);
		if(key>a[mid]) return rank(key,a,mid+1,hi,depth+1);
		else return mid;
	}

}
