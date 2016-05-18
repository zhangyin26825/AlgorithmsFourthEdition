package org.chapter1;
/**
 * 
 * 给出以下表达式的类型和值
 * (1+2.236)/2       浮点型
 * 1+2+3+4.0		 浮点型	
 * 4.1>=4			布尔
 * 1+2+"3"			String
 * 
 * @author yin
 * 
 * 
1.618
10.0
true
33
java.lang.Double
java.lang.Double
java.lang.Boolean
java.lang.String
 *
 */
public class Q1_1_2 {

	public static void main(String[] args) {
		/**
		 *   符号扩展   零扩展
		 *   byte  shrot   int  float double long  有符号位
		 *   char  无符号位
		 *   <<   左移操作时将运算数的二进制码整体左移指定位数，左移之后的空位用0补充
		 *   >>   右移操作是将运算数的二进制码整体右移指定位数，右移之后的空位用符号位补充，如果是正数用0补充，负数用1补充。
		 *   >>>  按二进制形式把所有的数字向右移动对应位数，低位移出（舍弃），高位的空位补零。对于正数来说和带符号右移相同，对于负数来说不同。
		 */
		System.out.println((1+2.236)/2);
		System.out.println(1+2+3+4.0);
		System.out.println(4.1>=4);
		System.out.println(1+2+"3");   //我感觉的答案应该是 字符串  123
		
		Object a=(1+2.236)/2;
		Object b=1+2+3+4.0;
		Object c=4.1>=4;
		Object d=1+2+"3";
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
		System.out.println(d.getClass().getName());
		
		
		
		System.out.println(0xcafebabe);

	}

}
