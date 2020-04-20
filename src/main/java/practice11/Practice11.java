package practice11;

import java.io.*;

/**
 * @description:文本换行:仅换行一次
 * @author: cr
 * @time: 2020/4/20 17:27
 */
public class Practice11 {
    /**
     * 换行测试
     * @param args
     */
    public static void main(String[] args){
        lineBreak(new File("src/main/Resources/java.txt"));
    }

    /**
     * 实现文本换行：换行后的文本存放在"src/main/Resources/modified.txt"路径下
     * @param file
     */
    private static void lineBreak(File file){
        //存放读取的全部字符串
        StringBuffer sb = new StringBuffer();
        //存放当前行
        String str = null;
        //按行读取原文件，并将其中超过80字符的行进行断行
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            while ((str = br.readLine()) != null){
                //检查是否超过80字符
                if(isLegal(str)){
                    //没超过80字符
                    sb.append(str+"\r\n");
                }else {
                    //超过80字符
                    sb.append(handleStr(str)+"\r\n");
                }
            }
            //关闭输入流
            br.close();
            reader.close();

            //写入文件
            FileWriter writer = null;
            writer = new FileWriter("src/main/Resources/modified.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(sb.toString());
            //关闭输出流
            bw.close();
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 处理文本换行
     * @param str
     * @return
     */
    private static String handleStr(String str) {
        int index = 79;
        //找到前80字符中最后一个空格的位置
        while (' ' != str.charAt(index)){
            index--;
        }
        //在前80字符中最后一个空格的位置后换行，并返回该字符串
        return str.substring(0,index+1)+"\r\n"+str.substring(index+1);
    }

    /**
     * 判断字符串是否在80字符以内
     * @param str
     * @return false:超过80字符;true:80字符以内
     */
    private static boolean isLegal(String str) {
        return str.length()>80?false:true;
    }
}
