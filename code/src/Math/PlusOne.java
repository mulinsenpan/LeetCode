package Math;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
        int length = digits.length;
        int carry = 1;
        for (int i = length - 1; i >= 0; i--){
            int digit = digits[i];
            if (digit < 9 ){
                digits[i] = digit + carry;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] result = new int[length+1];
        result[0] = 1;
        for (int i = 1; i < length + 1; i++){
            result[i] = digits[i-1];
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,9,9,9};
		System.out.println(plusOne(digits).toString());

	}

}
