package Math;

import java.util.List;

/**
 * Write a program to check whether a given number is an ugly number.
 * 
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another
 * prime factor 7.
 * 
 * Note that 1 is typically treated as an ugly number.
 * 
 * @author Chi
 * 
 * 问题背景：
 * 1、丑数的约数只有2或3或5
 * 2、1是丑数
 * 3、必须是正数
 * 
 * 方法：
 * 蛮力法：
 * 		丑数=2^m + 3^n + 5^o
 * 		循环终止条件： sum == 丑数  返回 true
 * 					或者sum > 丑数  返回false
 * 		时间复杂度：O(n^3)
 * 		空间复杂度：O(1)
 * 方法二：分解方法。
 * 		丑数=2^m + 3^n + 5^o
 * 		当 num /= 2 num%2 != 0 时，表明已经除了m个2
 * 		num/=3	num%3 != 0， 
 * 		num/=5	num%5 != 0.
 * 		若最终num==1，为丑数，否则不是丑数。
 *     		
 * expand question：
 * out put the first n ugly numbers.
 *
 */
public class UglyNumber {
	
	public static boolean uglyNumber(int num) {
		if (num <= 0){
            return false;
        }
        int[] factors = {2,3,5};
        for(int factor : factors){
            while (num % factor == 0){
                num /= factor;   
            }
        }
        return num == 1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
