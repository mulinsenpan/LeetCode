package easy;

/**
 * Given an input string, reverse the string word by word.
 * For example, Given s = "the sky is blue", return "blue is sky the".
 * 
 * @author Chi
 * 
 * ���⣺�Ӻ���ǰ���ҵ�һ��word�Ŀ�ʼ�ͽ���Ϊֹ��
 * ���ⱳ����java��string�ǲ��ɱ��
 * 		  �Կհ��ַ�Ϊ��־�ָ�ʡ�
 * ���������һ������Ȼ��˼·���Ծ��ӽ��зִʲ���������������ʡ�
 * ͬʱjava��string���Ͳ��ɱ䣬��ʹ��string�洢�µ�ֵ����string���ͽ��и��ƵȲ�����ʱ�临�Ӷ���
 * O(n^2)����ʹ��stringbuil�����O(n)ʱ������ɲ�����
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
