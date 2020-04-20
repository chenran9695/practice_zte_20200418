package practice15;

import java.util.regex.Pattern;

/**
 * @author ：cr
 * @date ：Created in 2020/4/19 22:52
 * @description：从电子邮件地址中提取登录名和域名
 * @modified By：
 * @version: 0.0.1
 */
public class Pracitce15 {
    public static void main(String[] args){
        //构造一个电子邮件
        String email1 = "969532470@qq.com";
        String email2 = "chenran9695@git.com";
        String email3 = "@git.com";
        String email4 = "ss@11.@git.com";

        //打印输出email1的登录名和域名
        printEmailInfo(email1);
        //打印输出email2的登录名和域名
        printEmailInfo(email2);

        printEmailInfo(email3);
        printEmailInfo(email4);


    }

    /**
     * 判断是否为有效邮件地址
     * @param email
     * @return
     */
    private static boolean isLegalEmailAddress(String email){
        //网上找的正则表达式
        String emailPattern = "^\\s*\\w+(?:\\.?[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
        return Pattern.matches(emailPattern, email);
    }
    /**
     * 打印输出电子邮件email对应的登录名和域名
     * @param email
     */
    private static void printEmailInfo(String email){
        if(isLegalEmailAddress(email)){
            String loginName = getLoginName(email);
            String domainName = getDomainName(email);
            System.out.println("电子邮件地址("+email+")的登录名为"+loginName+",域名为"+domainName+"。");
        }else {
            System.out.println(email+"不是合法的邮箱地址！");
        }

    }
    /**
     * 从电子邮件地址中提取登录名
     * @param email
     * @return
     */
    private static String getLoginName(String email){
        return email.substring(0, email.lastIndexOf("@"));
    }

    /**
     * 从电子邮件中提取域名
     * @param email
     * @return
     */
    private static String getDomainName(String email){
        return email.substring(email.lastIndexOf("@")+1);
    }
}
