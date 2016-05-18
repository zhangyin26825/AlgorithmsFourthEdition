package org.chapter1;
/**
 * 将一个正整数用二进制表示并转换为一个String类型的s
 * @author yin
 *
 */
public class Q1_1_9 {

	public static void main(String[] args) {
		
		System.out.println(toBinaryString(5));
		System.out.println(toBinaryString(6));
		System.out.println(toBinaryString(7));
		
		
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(6));
		System.out.println(Integer.toBinaryString(7));
	}
	
	
	public static String toBinaryString(int a){
			assert a>0;
			String s="";
			int n=a;
			while(n>0){
				s= (n%2)+s;   //每次产生的余数都放置到s的前面，就不用堆栈去实现逆序
				n=n/2;
			}
			return s;
		
	}
}
