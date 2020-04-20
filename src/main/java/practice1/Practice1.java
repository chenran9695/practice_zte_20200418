package practice1;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 15:09
 * @description：从大到小输出10以内的偶数
 * @modified By：
 * @version: 0.0.1
 */
public class Practice1 {
    /**
     * 从大到小输出10以内的偶数
     * @param args
     */
    public static void main(String[] args){
        printEvenNumInN(10);
    }

    /**
     * 从大到小输出N以内的偶数
     */
    private static void printEvenNumInN(int n){
        //如果N是奇数，先把N加1
        if(n%2 == 1){
            n += 1;
        }
        while (n>0){
            n -= 2;
            System.out.println(n);
        }
    }


}
