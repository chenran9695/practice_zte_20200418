package practice6;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 16:50
 * @description：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个，第二天早上又将剩下的桃子
 * 吃掉一般，又多吃一个。以后每天早上都吃前一天剩下的一半零一个。到第10天早上想吃的时候，就只剩下一个桃子了。求第一天共摘了多少
 * 桃子
 * @modified By：
 * @version: 0.0.1
 */
public class Practice6 {
    /**
     * 到第10天早上想吃的时候，就只剩下一个桃子了。求第一天共摘了多少
     *  * 桃子
     * @param args
     */
    public static void main(String[] args){
        printOriginalPeachNum(10,1);
    }

    /**
     * 打印猴子第一天摘了多少桃
     */
    private static void printOriginalPeachNum(int day, int peachNum){
        System.out.println("第一天一共摘了"+getOriginalPeachNum(day, peachNum)+"个桃子！");
    }

    /**
     * 第day天早上想吃的时候，就只剩下peachNum个桃子了,求第一天摘了多少桃子
     * 思路：设第i天桃子的数量为X(i),则X(i) = (X(i+1) +1)*2
     * @param day
     * @param peachNum
     * @return
     */
    private static int getOriginalPeachNum(int day, int peachNum) {
        if(day>1){
            return getOriginalPeachNum(day-1, (peachNum+1)*2);
        }else {
            return peachNum;
        }
    }
}
