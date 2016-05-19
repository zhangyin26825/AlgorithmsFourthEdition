package org.chapter1;
/**
 * 编写一个静态方法 lg(),接受一个整形参数N,返回不大于log2,N的最大整数，不要使用Math库
 * @author yin
 *
 */
public class Q1_1_14 {

	public static void main(String[] args) {
		System.out.println(lg(4));
		System.out.println(lg(6));
		System.out.println(lg(529));
	}
	
	public static int lg(int n)
	{
		int result=-1;;
		for (int i = 1; i <= n; i*=2) {
			result++;
		}
		return result;
	}

}
