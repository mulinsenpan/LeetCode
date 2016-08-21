package easy;

import java.awt.RenderingHints;

/**
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car"
 * is not a palindrome.
 * 
 * @author Chi
 * 
 * 核心问题：从左到右和从右到左读是否一样。
 * 问题背景：忽略标点符号、空格等，只考虑字母、数字；
 * 			忽略大小写、
 * 			字符串为空时如何处理
 * 策略分析：左右对应的下标：
 * 	问题形式化：
 *   if i=length-1-i
 *   true
 *   else  false.
 *   0  length-1
 *   1  length-2
 *   3  length-3
 *   
 * 因此，采用双指针技术，一个指向开始，一个指向结束，当两者相遇时，结束。
 */
public class Palindrome {
	public static boolean isPalindrome(String s) {
		int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
            	j--;
            }
            if (Character.toLowerCase(s.charAt(i))
            		!= Character.toLowerCase(s.charAt(j))) {
				return false;
			}
            i++;
            j--;
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "";
		System.out.println(isPalindrome(a));
	}

}
