package org.chapter1;
/**
 * 编写一段程序，如果double类型的变量x和y都严格位于0和1之间则打印true,否则打印false
 * @author yin
 *
 */
public class Q1_1_5 {

	public static void main(String[] args) {
		double a=0.35,b=0.95;
		Between0and1(a, b);
		a=2.1;
		Between0and1(a, b);
	
	}
	
	public static void Between0and1(double a,double b){
		if(a>0&&a<1&&b>0&&b<1){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
	}
}
