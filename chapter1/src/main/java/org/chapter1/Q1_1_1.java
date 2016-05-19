package org.chapter1;

import java.math.BigDecimal;

/**
 * 
 * 计算下列表达式的值
 *  (0+15)/2
 *  2.0e-6*100000000.1
 *  true&&false||true&&true
 * @author yin
 * 
	7
	200.0000002
	true
 *
 */
public class Q1_1_1 {
	
	public static void main(String[] args) {
		
		System.out.println((0+15)/2);  //这里是取整的问题 答案是个整数，要取整
		System.out.println(2.0e-6*100000000.1);  //这里是科学计数法的表示
		System.out.println(true&&false||true&&true);  //这里需要注意的是 &&的优先级比||高
		
		
		Double d = 2.0e-6;
		System.out.println(d);  						 //2.0E-6   这个输出有点出乎我的意料   按我的想法应该 输出   0.0000020
		BigDecimal db = new BigDecimal(d.toString());
		System.out.println(db.toPlainString()); 		 //0.0000020
		BigDecimal df = new BigDecimal(d);
		System.out.println(df.toPlainString());			//0.00000199999999999999990949622365177251737122787744738161563873291015625
		
		//这里构造 BigDecimal一个用的是String  一个用的是 Double  但是输出的结果不一致，具体原因不清楚，只能说，构造BigDecimal 尽量用String吧
		//后面的值不对，应该与double的表示，误差有关系，用二进制表示浮点数，是有一定误差的，具体不阐述了
		
		int abs = Math.abs(Integer.MIN_VALUE);
		System.out.println(abs);
		
	}

}
