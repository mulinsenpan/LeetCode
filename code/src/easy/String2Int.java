package easy;

/**
 * implement atoi to convert a string to an integer.
 * 
 * @author Chi
 * 
 *         1. �ִ�Ϊ�ջ���ȫ�ǿո񣬷���0�� 2. �ִ���ǰ׺�ո���Ҫ���Ե��� 3.
 *         ���Ե�ǰ׺�ո�������ĵ�һ���ַ�������ǡ�+���򡮣����ţ��������������������֣���ʼ�������֣��������ǰ���2�֣�����0�� 4.
 *         �������ֵĹ����У����֮����ַ������֣���ֹͣת�������ص�ǰֵ�� 5.
 *         ��������������У����ת������ֵ������int�͵ķ�Χ���ͷ���int�����ֵ����Сֵ��
 * 
 *         �������ڽ��һ������֮ǰ����Ū������⼰�䱳�������ֵ��δ���ȡ� ���ɣ��Ա߽�����Ĵ���
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
