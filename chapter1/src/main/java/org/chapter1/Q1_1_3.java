package org.chapter1;
/**
 * 编写一个程序，从命令行得到三个整数参数，如果他们都相等，打印equal,否则打印 not equal
 * @author yin
 *
 */
public class Q1_1_3 {

	public static void main(String[] args) {
		
		int a=3,b=3,c=3;
		equal(a, b, c);
		a=4;
		equal(a, b, c);
	}
	
	
	public static void equal(int a,int b,int c){
		if(a==b&&b==c){
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
		
	}

}
