package ArrayAndString;

import java.util.Scanner;

/**
 * 判断两个字符串S、T是否相差一个编辑距离
 * 
 * 明确问题：什么是编辑距离？
 * 		一个字符串经过若干次修改、插入、添加之后变为另外一个字符串，总次数记为编辑距离。
 * 编辑距离==1：表明另个字符串最多相差1个长度。
 * 两个字符串为空时，怎么判断编辑距离？
 * 两个字符串相同时
 * 
 * 给定两个字符串s，长度为m，字符串t，长度为n，假设m<n. edis 为两者的编辑距离
 * 一个编辑距离只有三种可能：字符长度相同时修改一个字符，不同时：插入或者在最后追加。
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
		// s和t 的长度差大于1，说明肯定不是一个编辑距离。
		if (n - m > 1){
			return false;
		}
		int i = 0;
		int shift = n - m;
		
		while(i < m && s.charAt(i) == t.charAt(i)){
			i ++;
		}
		
		// i == m 时，s已经遍历完，shift大于0，shift==1，说明t的前m位和s相同，s只需在最后append一位即可。
		if (i == m) {
			return shift > 0;
		}
		
		// 长度相同。跳过不同的字符，继续对比下下一位字符。
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
