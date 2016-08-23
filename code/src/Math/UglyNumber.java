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
 * ���ⱳ����
 * 1��������Լ��ֻ��2��3��5
 * 2��1�ǳ���
 * 3������������
 * 
 * ������
 * ��������
 * 		����=2^m + 3^n + 5^o
 * 		ѭ����ֹ������ sum == ����  ���� true
 * 					����sum > ����  ����false
 * 		ʱ�临�Ӷȣ�O(n^3)
 * 		�ռ临�Ӷȣ�O(1)
 * ���������ֽⷽ����
 * 		����=2^m + 3^n + 5^o
 * 		�� num /= 2 num%2 != 0 ʱ�������Ѿ�����m��2
 * 		num/=3	num%3 != 0�� 
 * 		num/=5	num%5 != 0.
 * 		������num==1��Ϊ�����������ǳ�����
 *     		
 * expand question��
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
