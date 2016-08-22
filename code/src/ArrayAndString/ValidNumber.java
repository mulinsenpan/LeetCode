package ArrayAndString;

import java.util.Scanner;

/**
 * Validate if a given string is numeric.
 * 
 * Some examples: "0" => true "0.1 " => true "abc" => false "1 a" => false
 * "2e10" => true Note: It is intended for the problem statement to be
 * ambiguous. You should gather all requirements up front before implementing
 * one.
 * 
 * 题目设计两个数据类型string和numeric。 1、关于字符串：字符串为空、字符串包含前缀和后缀空白字符、在数字之前有+-号，
 * 2、关于数字：整数、小数。进制：其他进制表示的是否为数字、科学计数法是否为true。
 * 3、关于小数：整数部分、点号、小数部分。整数部分和小数部分必有其一。1. true .1true.
 * 
 *from left to right， translate requirement into code。
 * 
 * @author Chi
 */
public class ValidNumber {
	public static boolean isNumber(String s) {
		int i = 0;
        int n = s.length();
        while(i < s.length() && Character.isWhitespace(s.charAt(i))){
            i++;
        }
        
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            i ++;
        }
        boolean isNumber = false;
        if (i<n && s.charAt(i)=='e') {
			return false;
		}
        while(i < n && Character.isDigit(s.charAt(i))){
            i++;
            isNumber = true;
        }
        if(i < n && (s.charAt(i) == '.')){
            i ++;
            while(i<n && Character.isDigit(s.charAt(i))){
                i++;
                isNumber = true;
            }
            
        }
        if (isNumber && i < n && s.charAt(i)=='e') {
			i++;
			isNumber= false;
			if(i<n && (s.charAt(i)=='+'||s.charAt(i)=='-')){
				i++;
			}
			while(i<n && Character.isDigit(s.charAt(i))){
				i++;
				isNumber = true;
			}
		}
        while(i<n && Character.isWhitespace(s.charAt(i))){
                i++;
        }
        return isNumber && i == n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String test = scanner.nextLine();
			System.out.println(isNumber(test));
		}
		
	}

}
