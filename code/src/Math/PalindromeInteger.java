package Math;
/**
 * ���ⱳ����
1. ������������������
2. ����ʹ��extra space����ζ�Ų��ܰ�����ת����string��
3. ֱ�Ӷ����ֽ���������Ҫ��������������[Reverse Integer](https://leetcode.com/problems/reverse-integer/) ��
4. �жϻ��ģ����м������˿�ʼ��չ�����ߴ��������м�ۼ���

��ȡ���λ�ķ�����
```
int div = 1;
while (x / div >= 10){
     div *= 10;
}
```

��ȡ���λ�ķ�����
```
int r = x % 10;
```

ȥ�����λ�����λ��
```
 x = (x % div) /10; 
```


 * @author Chi
 *
 */
public class PalindromeInteger {

public boolean isPalindrome(int x) {
        
        if (x < 0){
            return false;
        }
        
        int div = 1;
        while (x / div >= 10){
            div *= 10;
        }
        
        while (x != 0){
            int l = x / div;
            int r = x % 10;
            if (l != r){
                return false;
            }
            x = (x % div) /10; 
            div /= 100;
        }
        
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
