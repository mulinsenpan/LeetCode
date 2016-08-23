package Math;
/**
 * 问题背景：
1. 整数：负数、正数？
2. 不能使用extra space，意味着不能把数字转换成string。
3. 直接对数字进行逆序，需要考虑溢出情况。（[Reverse Integer](https://leetcode.com/problems/reverse-integer/) ）
4. 判断回文：从中间向两端开始扩展，或者从两端向中间聚集。

获取最高位的方法：
```
int div = 1;
while (x / div >= 10){
     div *= 10;
}
```

获取最低位的方法：
```
int r = x % 10;
```

去掉最高位和最低位：
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
