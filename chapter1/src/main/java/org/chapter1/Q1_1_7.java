package org.chapter1;
/**
 * 分别给出以下代码段中打印出的值
 * 
 	double t=9.0;
 	while(Math.abs(t-9.0/t)<0.001){
 		t=(9.0/t+t)/2.0;
 	}
 	System.out.format("%.5f\n", t);
 
 
 	int sum=0;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}
	System.out.println(sum);
	
		sum=0;
		for (int i =1; i < 1000; i*=2) {
			for (int j = 0; j < 1000; j++) {
				sum++;
			}	
		}
		System.out.println(sum);
 
 * 
 * @author yin
 *
 */
public class Q1_1_7 {

	public static void main(String[] args) {
		
		double sqrt = sqrt(9.0, 0.001);
		System.out.println(sqrt);
		
		
		int sum=0;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}  // 这两个循环 相当于计算 1+2+3+....+999
		System.out.println(sum);
		
		sum=0;
		for (int i =1; i < 1000; i*=2) {
			for (int j = 0; j < 1000; j++) {
				sum++;
			}	
		}  //第一个循环，能循环10次，相当于 10*1000
		System.out.println(sum);
		
		
		
	}
	/**
	 *  这个是 利用递归求平方根的算法，
	 *  接触的关于这个书的名字叫做  计算机程序的构造与解释   如果有机会学习一门函数式语言的话，
	 *  也希望像学习这本书一样，做一遍   计算机程序的构造与解释  这本书的习题
	 *  总觉得自己学的理论很多，但是实践的比较少，希望明白知易行难
	 * @param value
	 * @param accuracy
	 * @return
	 */
	public static double sqrt(double value,double accuracy){
		double t=value;
	 	while(Math.abs(t-value/t)>accuracy){
	 		t=(value/t+t)/2.0;
	 	}
	 //	System.out.format("%.5f\n", t);
	 	return t;
	}

}
