package Math;

import java.util.Scanner;

/**
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

���ⱳ����	���������и�����ת�������з��š�
		Integer���з�Χ��Integer.MAX_VALUE MIN_VALUE��������Χʱ����0.
		��������0��βʱ�����ط�0�����֡�

 * @author Chi
 *
 */

public class ReverseInteger {

	public static int reverse(int x) {
        int res = 0;
        while (x != 0){
            if ( Math.abs(res) > Integer.MAX_VALUE){
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int x = scanner.nextInt();
			System.out.println(reverse(x));
		}

	}

}
