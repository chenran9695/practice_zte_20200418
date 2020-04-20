package practice13;


import java.util.regex.Pattern;

/**
 * @description:正则表达式识别后面的字符:bat, bit, but, hat, hit, hut
 * @author: cr
 * @time: 2020/4/20 15:18
 */
public class Practice13 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        //以下可以被识别
        System.out.println("以下可以被识别,应该返回true");
        System.out.println(recognize("bat"));
        System.out.println(recognize("bit"));
        System.out.println(recognize("but"));
        System.out.println(recognize("hat"));
        System.out.println(recognize("hit"));
        System.out.println(recognize("hut"));
        //以下不能被识别
        System.out.println("以下不可被识别,应该返回false");
        System.out.println(recognize("cat"));
        System.out.println(recognize("bct"));
        System.out.println(recognize("bac"));
        System.out.println(recognize("ccc"));
    }

    /**
     *识别后面的字符:bat, bit, but, hat, hit, hut
     * 识别规则：三个字母组成，第一个字母为b或h；第二个字母为a或i或u；第三个字母为t
     * @param string
     * @return
     */
    private static boolean recognize(String string){
        String regex = "^[bh][aiu]t$";
        return Pattern.matches(regex, string);
    }
}
