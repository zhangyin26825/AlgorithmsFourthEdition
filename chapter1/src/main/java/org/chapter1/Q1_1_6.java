package org.chapter1;
/**
 * 下面这段程序会打印出什么？
  
 * @author yin
 *
 */
public class Q1_1_6 {

	public static void main(String[] args) {
		
		int f=0;    //代表两项中后面的一项
		int g=1;	//代表两项中前面的一项
		for(int i=0;i<=15;i++){
			System.out.println(f);
			f=f+g;   //  g的值未变  f的值已经变为 两数之和   最开始的f的值可以通过 f-g来得到
			g=f-g;	


		}
		/**
		 * 这个方法应该是打印 斐波那契的前第15项的值  根据i的值，确定打印多少项
		 *  
		 *  f=f+g;  
			g=f-g;	
		 *  这里不需要利用一个新的变量，直接在两个变量之间进行加法 以及转换操作
		 *  当前轮                           下一轮
		 *  f
		 *  g				f
		 *  f+g				g
		 *  
		 *    g=f+g;
		 *    f=g-f;  //这个时候  g的值已经变化，不能用 f=g，g已经是两数之和，f未变， g-f可以得到当前轮中的g的值
		 *  
		 *  我的写法应该是  
		 *    int c;
		 *    c=f+g;
		 *    f=g;
		 *    g=c;
		 *    
		 *    这里的方法有点像    不使用别的变量，交换两个变量的值
		 */
	
	}

}
