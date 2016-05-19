package org.chapter1;
/**
 * 给出使用欧几里得算法计算105和24的最大公约数的过程中得到一系列的p和q的值扩展该算法得到一个程序
 * Euclid,
 * @author yin
 *
 */
public class Q1_1_24 {
	/**
	 * 去搜索了欧几里得算法，原理也看懂了，但是好像都涉及到 扩展欧几里得算法，没怎么看懂，涉及 线性同余，乘法逆元，等等数论方面的内容
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(divisor(105, 24));
		System.out.println(divisor(24, 105));
		
		System.out.println(105%24);
		System.out.println(24%105);
	}
	
	public static int divisor(int m,int n)
	{
		System.out.println("m="+m+"  n="+n);
	    if (m % n == 0) {
	        return n;
	    }
	    else {
	        return divisor(n,m % n);
	    }
	}

}
