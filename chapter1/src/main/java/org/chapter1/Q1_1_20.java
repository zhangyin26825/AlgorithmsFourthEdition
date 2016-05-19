package org.chapter1;
/**
 * 编写一个递归的静态方法计算Ln(N!)的值
 * 
 * @author yin
 *
 */
public class Q1_1_20 {

	public static void main(String[] args) {
		System.out.println(Ln(6));
		System.out.println(Math.log(6*5*4*3*2));
	}
	
	public static double Ln(int N){
		return Math.log(ln(N, 1));
	}
	private static int ln(int N,int product){
		if(N==1){
			return product;
		}
		return ln(N-1,N*product);
	}
}
