package easy;

/**
 * implement atoi to convert a string to an integer.
 * 
 * @author Chi
 * 
 *         1. 字串为空或者全是空格，返回0； 2. 字串的前缀空格需要忽略掉； 3.
 *         忽略掉前缀空格后，遇到的第一个字符，如果是‘+’或‘－’号，继续往后读；如果是数字，则开始处理数字；如果不是前面的2种，返回0； 4.
 *         处理数字的过程中，如果之后的字符非数字，就停止转换，返回当前值； 5.
 *         在上述处理过程中，如果转换出的值超出了int型的范围，就返回int的最大值或最小值。
 * 
 *         方法：在解决一个问题之前，先弄清楚问题及其背景。如空值如何处理等。 技巧：对边界情况的处理。
 *
 */
public class String2Int {
	private static final int maxDiv10 = Integer.MAX_VALUE / 10;

	public static int myAtoi(String str) {
	        int i = 0, n = str.length();
	        while(i<n && Character.isWhitespace(str.charAt(i))){
	            i++;
	        }
	        int sign = 1;
	        if(i<n && str.charAt(i)== '+'){
	            i++;
	        }else if(i < n && str.charAt(i) == '-'){
	            sign = -1;
	            i++;
	        }
	        int num = 0;
	        while(i<n && Character.isDigit(str.charAt(i))){
	            int digit = Character.getNumericValue(str.charAt(i));
	            if(num > maxDiv10 || num == maxDiv10 && digit>=8){
	                return sign == 1? Integer.MAX_VALUE:Integer.MIN_VALUE;
	            }
	            num = num * 10 + digit;
	            i++;
	        }
	        return sign * num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teString = "2147483648";
		System.out.println(myAtoi(teString));

	}

}
