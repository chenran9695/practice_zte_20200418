package practice5;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 16:27
 * @description：一球从100米处高度自由落下，每次落地后反跳回原来高度的一半；再落下，求它第10次落地时，一共经过多少米？
 * @modified By：
 * @version: 0.0.1
 */
public class Practice5 {
    /**
     * demo：一球从100米处高度自由落下，每次落地后反跳回原来高度的一半；再落下，求它第10次落地时，一共经过多少米？
     * @param args
     */
    public static void main(String[] args){
        printDistanceInfo(100,10);
    }

    /**
     * 打印信息
     * @param n
     * @return
     */
    private static void printDistanceInfo(float h, int n){
        float distance = getDistance(h,n);
        System.out.println("一球从"+h+"米处高度自由落下，第"+n+"次落地时，一共经过了"+distance+"米");
    }

    /**
     * 一球从h米处高度自由落下,计算第n次落地时经过的路程
     * @param h 初始高度
     * @param n
     * @return
     */
    private static float getDistance(float h, int n){
        if(n>0){
            return h*2+getDistance(h/2, n-1);
        }else {
            //减去初始位置高度
            return -100;
        }
    }
}
