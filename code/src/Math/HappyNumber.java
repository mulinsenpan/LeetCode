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
 * ���ⱳ����ʲô��Happy Number��
 * 		��λ�ϵ�����ƽ�����ԭ�������֣��������ɴ����֮���Ϊ1�����������ֳ�ΪHappyNumber��
 * ��ԭʼ���ֲ�Ϊ1����������Ϊ1-->��һ������Ϊ10�Ĵη���
 * ѭ������������sum==1����������һ��ѭ��������ѭ��������1���ڡ�
 * 
 * ���ģ������λ����ƽ����
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
