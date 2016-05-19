package org.chapter1;
/**
 * 
 给出exR1(6)的返回值
 
 public static String exR1(int n)
 {
 	if(n<=0)
 		return "";
 	return exR1(n-3)+n+exR1(n-2)+n;
 }
 * 
 * @author yin
 *
 */
public class Q1_1_16 {
	/**
	 * 关于递归  我能想到的一些问题   
	 *  退出递归的条件要写在方法的前面，先判断这个条件再进行递归，防止堆栈溢出，  Q1_1_17就是这个问题
	 *  递归有尾递归优化，
	 *  递归本身会产生一个方法栈，可以依靠这个来作为一个栈结构
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(exR1(6));
	}
	
	 public static String exR1(int n)
	 {
	 	if(n<=0)
	 		return "";
	 	return exR1(n-3)+n+exR1(n-2)+n;
	 }

}
