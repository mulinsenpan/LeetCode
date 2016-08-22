package ArrayAndString;

/**
 * Given an array of integers that is already sorted in ascending order, find
 * two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based. You may
 * assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * @author Chi
 *
 *
 * ���ⱳ����
 * (1)ֻ��һ��� 
 * (2)���鰴���������� :����Щ���ԣ����ֲ���O(logn)ʱ�临�Ӷȡ�
 * (3)��һ���±�С�ڵڶ����±�
 * 
 * ��twosum���������У�ʹ�����ַ�����
 * ���α�����ʱ�临�Ӷ�O(n^2)���ռ临�Ӷ�O(1)��û��ʹ�������������ݽṹ
 * HashTable:ʱ�临�Ӷ�O(n)���ռ临�Ӷ�O(n)
 * 
 * �ڱ����У�ʹ��Hashtable��������O(n)�Ŀռ临�Ӷȣ�ԭ����û�г���������������������
 * ����Hashtable��������Ҫ�ҵ�target-nums[i]�Ƿ��������У�������򷵻��±�+1�����ڷ���-1.
 * ����������Ĳ��ҷ����У����ֲ��ҵ�ʱ�临�Ӷ�ΪO(logn)��
 * �ܵ�ʱ�临�Ӷ�ΪO(nlogn)���ռ临�Ӷ�O(1)��
 * 
 * ����һ�ַ���������
 * ��nums����ѡ�����±�i��j����nums[i]+nums[j] ��tartget�Ĺ�ϵ���������֣�
 * nums[i]+nums[j] > target, ��Ϊnums���������еģ����j--��
 * nums[i]+nums[j] < target, i++��
 * nums[i]+nums[j] = target�� ����i��j��
 * 
 * ���⣺���ѡ���ʼ��i��j��
 * ��Ҫ��������nums�����i=0��j=nums.length-1,
 * ���⣺ֹͣ����
 * ��i=jʱ��˵��û���ҵ������±�����������
 */
public class TwoSumSorted {

	private static int bsearch(int[] nums, int key, int start) {
		int L = start;
		int R = nums.length-1;
		while(L<R){
			int M = (L+R)/2;
			if (nums[M] < key) {
				L = M + 1;
			}else{
				R = M;
			}
		}
		return (L == R && nums[L] == key)?L:-1;
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		for(int i = 0; i < numbers.length; i++){
			int j = bsearch(numbers, target-numbers[i], i+1);
			if (j!=-1) {
				result[0] = i+1;
				result[1] = j+1;
				return result;
			}
		}
		throw new IllegalArgumentException("no two sum");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,7,9,10,17};
		System.out.println(twoSum(nums, 21)[0]);
	}

}
