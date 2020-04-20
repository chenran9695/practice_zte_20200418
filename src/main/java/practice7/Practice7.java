package practice7;

import java.util.*;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 17:36
 * @description：有1，2，3，4 这4个数字，能组成多少个互不相同且不重复数字的三位数
 * @modified By：
 * @version: 0.0.1
 */
public class Practice7 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        printUnduplicatedThreeDigitNums(1,2,3,4);
    }

    /**
     * 由小到大打印全部互不相同的三位数(不重复数字)
     * @param nums
     */
    private static void printUnduplicatedThreeDigitNums(int... nums) {
        List<Integer> numList = getUnduplicatedThreeDigitNums(nums);

        //排序
        numList.sort(Comparator.comparingInt(o -> o));
        //输出
        for (Integer num :numList){
            System.out.println(num);
        }
    }

    /**
     * 输入一串不重复数字，输出全部互不相同的三位数(不重复数字)
     * @param nums
     */
    private static List<Integer> getUnduplicatedThreeDigitNums(int... nums){
        int length = nums.length;
        List<Integer> numList = new ArrayList<>();
        //输入数组的长度小于3则
        if (length<3){
            return null;
        }
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                for (int k=j+1;k<length;k++){
                    numList.add((nums[i]*100+nums[j]*10+nums[k]));
                    numList.add((nums[i]*100+nums[k]*10+nums[j]));
                    numList.add((nums[j]*100+nums[i]*10+nums[k]));
                    numList.add((nums[j]*100+nums[k]*10+nums[i]));
                    numList.add((nums[k]*100+nums[i]*10+nums[j]));
                    numList.add((nums[k]*100+nums[j]*10+nums[i]));
                }
            }
        }
        return numList;
    }
}
