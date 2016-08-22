package ArrayAndString;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * Examples:
 * 
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * 
 * Given "bbbbb", the answer is "b", with the length of 1.
 * 
 * Given "pwwkew", the answer is "wke", with the length of 3. 
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * @author Chi
 *
 *
 *问题背景：substring必须是连续的。
 *	subsequence不一定是连续的。
 *	字符串为空时，最长无重复子串长度为0？
 *	是否可以使用辅助数据结构？
 *
 *问题分析：
 *
 *1、找到所有无重复子串，存储对应的开始和结束下标，找到最长的子串。
 *假设子串si...sj为当前的一个无重复字符串，那么sj+1是否可以添加进去？
 *遍历i...j，若sj+1没有在子串中，则j=j+1
 *			若在子串中， 找到其下标n，i= n+1,j=j+1
 *
 *	需要解决的问题：这里的字符代表什么？字符？数字？其他字符？
 *				如何判断字符是否重复？  1、对于有固定数量的元素，采用固定长度数组存储当前子串的内容。
 *				如何保持子串长度最大？maxlen与j-i+1比较。
 *双指针技术：一个指向子串开始位置，一个指向子串结束位置。
 */

public class LengthOfLongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
		if (s.isEmpty()||"".equals(s)) {
			return 0;
		}
		boolean[] exist = new boolean[256];
		int[] index = new int[256];  //记录每个字符最后一次出现的位置
		Arrays.fill(index, -1);
		int start = 0;
//		exist[s.charAt(start)] = true;
		int maxLen = 0;
		for(int end = 0; end < s.length(); end++ ){
			//当end已经在子串中时，把start和end出现位置之间的值设为false，表示新的子串中不包含这些元素。
			//此步骤可以优化，i直接跳到重复下标的下一个位置。
//			while(exist[s.charAt(end)]){
//				exist[s.charAt(start)] = false;   
//				start++;
//			}
			if (index[s.charAt(end)] >= start) {
				start = index[s.charAt(end)] + 1;
			}
			index[s.charAt(end)] = end;
			maxLen = Math.max(end-start+1, maxLen);
		}
		
		
		return maxLen;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String test = scanner.nextLine();
			System.out.println(lengthOfLongestSubstring(test));
		}

	}

}
