package ArrayAndString;

import java.util.Scanner;

/**
 * given a string s, find the lenght of the longest substring T
 * that contains at most two distinct characters.
 * @author Chi
 * 
 * 1����ȷ���⣺ʲô�ǡ�������������һ�����Ӵ�����
 * 			acbd�������ĸ���һ�����ַ����������������һ���ַ����Ӵ�����Ϊ2
 * 			acad:aca���������ַ���������Ϊ3�� cad���������Ӵ�����
 * 			aaaabc�� aaaab  
 * 2�����������
 * 		��δ�һ����֪���Ӵ���������һ���Ӵ���
 * 		����һ���Ӵ�����ʼλ��i������λ��j������Ϊmaxlen=j-i+1������������ĿҪ�󡣵���һ�����ַ���ӵ��Ӵ���ʱ����Ȼ����Ҫ��
 * 		��j����ƶ�һλ������maxlen = max(j-i+1,maxlen)
 * 		������������ʱ����ô�ƶ�i��j��λ�ã�aabba������ַ�c��
 * 			��j��ǰ��,ֱ��ǰһλ�����һλ��ͬ����whileѭ������
 * 
 * ʹ��һ��ָ���¼i��Ҫ�ƶ�����λ�ã�
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
			//�ӿ�ʼ��k��Ϊͬһ���ַ���
			if (s.charAt(k) == s.charAt(k-1)) {
				continue;
			}
			if (j>=0 && s.charAt(k)!=s.charAt(k-1)) {
				maxLen = Math.max(k-1-i+1, maxLen);
				i = j + 1;
			}
			j = k - 1;   // ��s[k]��ͬ�����һ��λ�á�
			
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
