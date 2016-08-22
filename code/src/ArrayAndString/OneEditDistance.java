package ArrayAndString;

import java.util.Scanner;

/**
 * �ж������ַ���S��T�Ƿ����һ���༭����
 * 
 * ��ȷ���⣺ʲô�Ǳ༭���룿
 * 		һ���ַ����������ɴ��޸ġ����롢���֮���Ϊ����һ���ַ������ܴ�����Ϊ�༭���롣
 * �༭����==1����������ַ���������1�����ȡ�
 * �����ַ���Ϊ��ʱ����ô�жϱ༭���룿
 * �����ַ�����ͬʱ
 * 
 * ���������ַ���s������Ϊm���ַ���t������Ϊn������m<n. edis Ϊ���ߵı༭����
 * һ���༭����ֻ�����ֿ��ܣ��ַ�������ͬʱ�޸�һ���ַ�����ͬʱ��������������׷�ӡ�
 * @author Chi
 *
 */
public class OneEditDistance {
	private static boolean oneEdit(String s, String t) {
		int m = s.length();
		int n = t.length();
		
		if (m>n) {
			String temp = s;
			s = t;
			t = temp;
		}
		// s��t �ĳ��Ȳ����1��˵���϶�����һ���༭���롣
		if (n - m > 1){
			return false;
		}
		int i = 0;
		int shift = n - m;
		
		while(i < m && s.charAt(i) == t.charAt(i)){
			i ++;
		}
		
		// i == m ʱ��s�Ѿ������꣬shift����0��shift==1��˵��t��ǰmλ��s��ͬ��sֻ�������appendһλ���ɡ�
		if (i == m) {
			return shift > 0;
		}
		
		// ������ͬ��������ͬ���ַ��������Ա�����һλ�ַ���
		if (shift == 0) {
			i++;
		}
		while(i < m && s.charAt(i) == t.charAt(i)){
			i++;
		}
		return i == m ;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String a = scanner.nextLine();
			String b = scanner.nextLine();
			System.out.println(oneEdit(a, b));
		}

	}

}
