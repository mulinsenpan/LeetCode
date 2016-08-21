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
 * �������⣺�����Һʹ��ҵ�����Ƿ�һ����
 * ���ⱳ�������Ա����š��ո�ȣ�ֻ������ĸ�����֣�
 * 			���Դ�Сд��
 * 			�ַ���Ϊ��ʱ��δ���
 * ���Է��������Ҷ�Ӧ���±꣺
 * 	������ʽ����
 *   if i=length-1-i
 *   true
 *   else  false.
 *   0  length-1
 *   1  length-2
 *   3  length-3
 *   
 * ��ˣ�����˫ָ�뼼����һ��ָ��ʼ��һ��ָ�����������������ʱ��������
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
