package practice2;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 15:17
 * @description：输出小于100的斐波那契数列
 * @modified By：
 * @version: 0.0.1
 */
public class Practice2 {
    /**
     * 测试：输出小于100的斐波那契数列
     * @param args
     */
    public static void main(String[] args){
        printFibonacciNumbersInN(100);
    }

    /**
     * 输出n以内的斐波那契数列
     * @param n
     */
    private static void printFibonacciNumbersInN(int n){
        int x1 = 0;
        int x2 = 1;
        int tmp;
        while (x2 < n){
            System.out.println(x2);
            tmp = x1;
            x1 = x2;
            x2 += tmp;
        }
    }
}
