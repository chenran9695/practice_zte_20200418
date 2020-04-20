package practice9;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 19:19
 * @description：输入一行字符，分别统计出其中英文字符、空格、数字和其他字符的个数
 * @modified By：
 * @version: 0.0.1
 */
public class Practice9 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        printStatisticalInfo("cccccccccccsad,.l;';'.ccccc    ccc111as2234245,/,;'l.");
    }

    /**
     * 打印中英文字符、空格、数字和其他字符的个数统计信息
     * @param string 一串字符串
     */
    private static void printStatisticalInfo(String string){
        //首先获取中英文字符、空格、数字和其他字符的个数统计信息
        int[] list = getStatisticalInfo(string);
        //打印list信息
        printList(list);
    }

    /**
     * 获得中英文字符、空格、数字和其他字符的个数统计信息
     * @param string
     * @return
     */
    private static int[] getStatisticalInfo(String string){
        //如果String为空，则不输出
        if(string == null || string.length() == 0) return null;
        //字符串长度
        int length = string.length();
        //list[0]存放英文字符数，list[1]存放空格数，list[2]存放数字，list[3]存放其他字符数
        int[] list = new int[4];
        //初始化
        for (int i=0;i<4;i++){
            list[i] = 0;
        }
        char c;

        for(int i=0;i<length;i++){
            c = string.charAt(i);
            if ((c-'A'>=0 && c-'Z'<=0) || (c-'a'>=0 && c-'z'<=0)){
                list[0]++;
            }else if (c-' '==0){
                list[1]++;
            }else if (c-'0'>=0 && c-'9'<=0){
                list[2]++;
            }else {
                list[3]++;
            }
        }
        return list;
    }

    /**
     * 自定义打印
     * @param list
     */
    private static void printList(int[] list){
        System.out.println("英文字符、空格、数字和其他字符的个数结果：");
        System.out.println("英文字符数："+list[0]);
        System.out.println("空格字符数："+list[1]);
        System.out.println("数字字符数："+list[2]);
        System.out.println("其他字符数："+list[3]);
    }
}
