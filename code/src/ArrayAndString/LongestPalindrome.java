package ArrayAndString;

import java.util.Scanner;

/**
 * Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, 
 * and there exists one unique longest palindromic substring.
 * @author Chi
 * 
 * 第一个字符等于最后一个字符。
 *
 */

public class LongestPalindrome {
	public static String longestPalindrome(String s) {
        int maxLen = 1;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length()-1; i++){
            for (int j = i + 1; j < s.length(); j++){
                if (isPalindrome(s, i, j)){
                    if (j - i + 1 > maxLen){
                        maxLen = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        
        StringBuilder  sb = new StringBuilder ();
        for (int i = start ; i < end + 1; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
    
    private static boolean isPalindrome(String s, int start, int end){
        while (start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }
    
    public static String longestPalindromeDP(String s) {
		int length = s.length();
		boolean[][] matrix = new boolean[length][length];
		matrix[length-1][length-1] = true;
		int maxLen = 1;
		int begin = 0;
		int end = 0;
		for(int i = 0; i < length; i++){
			matrix[i][i] = true;
		}
		for(int i = 0; i < length - 1; i++){
			if (s.charAt(i) == s.charAt(i + 1)) {
				matrix[i][i+1] = true;
				begin = i;
				maxLen = 2;
			}
		}
		for(int len = 3; len <= length; len++) {
			for(int i = 0; i < length-len+1; i++){
				int j = i+len-1;
				if (s.charAt(i) == s.charAt(j) && matrix[i+1][j-1]) {
					matrix[i][j] = true;
					begin = i;
					maxLen = len;
				}
			}
		}
		return s.substring(begin, begin+maxLen);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String test = scanner.nextLine();
			System.out.println(longestPalindromeDP(test));
		}

	}

}
