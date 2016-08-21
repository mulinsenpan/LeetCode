package easy;

/**
 * Given an input string, reverse the string word by word.
 * For example, Given s = "the sky is blue", return "blue is sky the".
 * 
 * @author Chi
 * 
 * 问题：从后往前，找到一个word的开始和结束为止。
 * 问题背景：java中string是不可变的
 * 		  以空白字符为标志分割单词。
 * 问题分析：一个很自然的思路，对句子进行分词操作，逆向输出单词。
 * 同时java中string类型不可变，若使用string存储新的值，对string类型进行复制等操作的时间复杂度是
 * O(n^2)，若使用stringbuil则可在O(n)时间内完成操作。
 * 
 */

public class ReverseWords {
	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		int j = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				j = i;
			} else if (i == 0 || s.charAt(i - 1) == ' ') {
				if (sb.length() != 0) {
					sb.append(' ');
				}
				sb.append(s.substring(i, j));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "the sky is blue";
		System.out.println(reverseWords(string));
	}

}
