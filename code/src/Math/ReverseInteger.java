package Math;

import java.util.Scanner;

/**
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

问题背景：	数字有正有负，逆转的数字有符号。
		Integer：有范围，Integer.MAX_VALUE MIN_VALUE。超出范围时返回0.
		当数字以0结尾时，返回非0的数字。

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
