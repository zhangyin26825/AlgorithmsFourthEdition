package org.chapter1;

import java.util.function.LongSupplier;
import java.util.stream.LongStream;

/**
 在计算机运行以下程序：
  public class Fibonacci{
  
   public static long F(int N){
   	if(N==0) return 0;
   	if(n==1) return 1;
   	return F(N-1)+F(N-2);
   }
   
   public static void main(String [] args){
   	for(int N=0;N<100;N++){
   		System.out.println(N+"  "+F(N));
   	}
   	
   }
 
 * @author yin
 *
 */
public class Q1_1_19 {
	
	
	   public static long F(int N){
		   	if(N==0) return 0;
		   	if(N==1) return 1;
		   	return F(N-1)+F(N-2);    //计算F(N-1)的时候，又需要重新计算F(N-2)  这里属于重复做功，一般会从低往高算，保存每个的值，利用这个值取计算高位的值
		}
	
	public static void main(String[] args) {
//		for(int N=0;N<100;N++){
//	   		System.out.println(N+"  "+F(N));
//	   	}
		
		LongStream.generate(new LongSupplier() {
			Long f=null,g=null;
			@Override
			public long getAsLong() {
				if(f==null){
					f=0l;
					return 0;
				}
				if(g==null){
					g=1l;
					return 1;
				}
				
				g=f+g;
				f=g-f;	
				return g;
			}
		}).limit(100).forEach(l->System.out.println(l));
	}

}
