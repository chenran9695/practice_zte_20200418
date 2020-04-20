package practice4;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 16:01
 * @description：打印出所有的水仙花数
 * @modified By：
 * @version: 0.0.1
 */
public class Practice4 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        printNarcissusNumber();
    }

    /**
     * 打印水仙花数
     */
    private static void printNarcissusNumber(){
        for(int num=100;num<1000;num++){
            if(isNarcissusNumber(num)){
                System.out.println(num);
            }
        }
    }
    /**
     * 判断是否是水仙花数
     * @param num 一个三位数
     * @return
     */
    private static boolean isNarcissusNumber(int num) {
        int tmp = num;
        //记录余数
        int r;
        //记录各数字的立方和
        int sum = 0;
        while (tmp>0){
            r = tmp%10;
            tmp /= 10;
            sum += r*r*r;
        }
        return (sum-num == 0)?true:false;
    }

}
