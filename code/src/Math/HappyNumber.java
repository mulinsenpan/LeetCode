package Math;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.security.auth.x500.X500Principal;

/**
 * Write an algorithm to determine if a number is "happy".
 * 
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 * 
 * 问题背景：什么是Happy Number？
 * 		各位上的数字平方替代原来的数字，经过若干次替代之后变为1，这样的数字成为HappyNumber。
 * （原始数字不为1）最终数字为1-->上一个数字为10的次方。
 * 循环结束条件：sum==1，或者陷入一个循环，并且循环不包括1在内。
 * 
 * 核心：计算各位数字平方和
 * 		squre = (x % 10) * (x % 10)
 * 		x = x/10
 * @author Chi
 *
 */
public class HappyNumber {
	public static boolean isHappy(int n) {
		if (n <= 0) {
			return false;
		}
		Set<Integer> nums = new HashSet<Integer>();
		while(true){
//			nums.add(n);
			n = getSum(n);
			if (n==1) {
				return true;
			}
			if (n==2||n==3||n==4) {
				System.out.println(n);
				return false;
			}
			
		}
		
	}
	
	private static int getSum(int n ) {
		int sum = 0;
		while(n>0){
			sum += (n%10) * (n%10);
			n /= 10;
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		while(scanner.hasNext()){
//			int x = scanner.nextInt();
//			System.out.println(isHappy(x));
//		}
		
		for(int i = 0; i<10000; i++){
			System.out.println(getSum(i));
		}

	}

}
