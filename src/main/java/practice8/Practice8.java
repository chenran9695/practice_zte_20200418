package practice8;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 17:08
 * @description：打印输出9*9乘法表
 * @modified By：
 * @version: 0.0.1
 */
public class Practice8 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        printMultiplicationTable();
    }

    /**
     * 打印输出9*9乘法表
     */
    private static void printMultiplicationTable() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            //StringBuilder用于存储字符串
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 1; j < i + 1; j++) {
                sum = i * j;
                //String.format用于对齐
                String equationString = j + " × " + i + " = " + String.format("%2d",sum)+"   ";
                stringBuilder.append(equationString);
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
