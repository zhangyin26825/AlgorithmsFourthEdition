package org.chapter1;
/**
 * 下面这段代码有什么问题
   int [] a;
   for(int i=0; i<10;i++)	
   		a[i]=i*i;
   	
 	
 * @author yin
 *
 */
public class Q1_1_10 {

	public static void main(String[] args) {
		   int [] a=null;
		   for(int i=0; i<10;i++)	
		   		a[i]=i*i;   //没有初始化
		   
	}

}
