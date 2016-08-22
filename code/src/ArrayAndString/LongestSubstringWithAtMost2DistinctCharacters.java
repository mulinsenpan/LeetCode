package ArrayAndString;

import java.util.Scanner;

/**
 * given a string s, find the lenght of the longest substring T
 * that contains at most two distinct characters.
 * @author Chi
 * 
 * 1、明确问题：什么是“最多包含两个不一样的子串”？
 * 			acbd：包含四个不一样的字符，包含最多两个不一样字符的子串长度为2
 * 			acad:aca包含两个字符串，长度为3， cad包含三个子串传。
 * 			aaaabc： aaaab  
 * 2、问题分析：
 * 		如何从一个已知的子串生成另外一个子串？
 * 		当有一个子串，开始位置i，结束位置j，长度为maxlen=j-i+1，并且满足题目要求。当把一个新字符添加到子串中时，依然满足要求，
 * 		则j向后移动一位，长度maxlen = max(j-i+1,maxlen)
 * 		当不满足条件时，怎么移动i和j的位置？aabba，添加字符c。
 * 			从j向前推,直到前一位和最后一位不同。（while循环）。
 * 
 * 使用一个指针记录i需要移动到的位置：
 */
public class LongestSubstringWithAtMost2DistinctCharacters {

	public static int lswam2dc(String s) {
		int i = 0;
		int j = -1;
		int distinct = 0;
		int maxLen = 0;
		
		// aabaac
		// 01234
		for(int k = 1; k < s.length(); k++){
			//从开始到k均为同一个字符。
			if (s.charAt(k) == s.charAt(k-1)) {
				continue;
			}
			if (j>=0 && s.charAt(k)!=s.charAt(k-1)) {
				maxLen = Math.max(k-1-i+1, maxLen);
				i = j + 1;
			}
			j = k - 1;   // 与s[k]不同的最后一个位置。
			
		}
		return Math.max(s.length()-i, maxLen);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String test = scanner.nextLine();
			System.out.println(lswam2dc(test));
		}

	}

}
