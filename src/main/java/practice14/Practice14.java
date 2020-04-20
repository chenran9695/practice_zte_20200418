package practice14;
/**
 * @description:
 * @author: cr
 * @time: 2020/4/20 15:35
 */
public class Practice14 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        String date = "2020年04月18日";
        System.out.println("转换前："+date);
        System.out.println("转换后："+dateFormat(date));
    }

    /**
     * 将xxxx年xx月xx日格式日期转换为xx日xx月xxxx年
     * @param date
     * @return
     */
    private static String dateFormat(String date){
        //日期匹配
        String regex = "([0-9]{4}年)([0-9]{1,2}月)([0-9]{1,2}日)";
        return date.replaceAll(regex, "$3$2$1");
    }
}
