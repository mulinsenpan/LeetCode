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
 *���ⱳ����substring�����������ġ�
 *	subsequence��һ���������ġ�
 *	�ַ���Ϊ��ʱ������ظ��Ӵ�����Ϊ0��
 *	�Ƿ����ʹ�ø������ݽṹ��
 *
 *���������
 *
 *1���ҵ��������ظ��Ӵ����洢��Ӧ�Ŀ�ʼ�ͽ����±꣬�ҵ�����Ӵ���
 *�����Ӵ�si...sjΪ��ǰ��һ�����ظ��ַ�������ôsj+1�Ƿ������ӽ�ȥ��
 *����i...j����sj+1û�����Ӵ��У���j=j+1
 *			�����Ӵ��У� �ҵ����±�n��i= n+1,j=j+1
 *
 *	��Ҫ��������⣺������ַ�����ʲô���ַ������֣������ַ���
 *				����ж��ַ��Ƿ��ظ���  1�������й̶�������Ԫ�أ����ù̶���������洢��ǰ�Ӵ������ݡ�
 *				��α����Ӵ��������maxlen��j-i+1�Ƚϡ�
 *˫ָ�뼼����һ��ָ���Ӵ���ʼλ�ã�һ��ָ���Ӵ�����λ�á�
 */

public class LengthOfLongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
		if (s.isEmpty()||"".equals(s)) {
			return 0;
		}
		boolean[] exist = new boolean[256];
		int[] index = new int[256];  //��¼ÿ���ַ����һ�γ��ֵ�λ��
		Arrays.fill(index, -1);
		int start = 0;
//		exist[s.charAt(start)] = true;
		int maxLen = 0;
		for(int end = 0; end < s.length(); end++ ){
			//��end�Ѿ����Ӵ���ʱ����start��end����λ��֮���ֵ��Ϊfalse����ʾ�µ��Ӵ��в�������ЩԪ�ء�
			//�˲�������Ż���iֱ�������ظ��±����һ��λ�á�
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
