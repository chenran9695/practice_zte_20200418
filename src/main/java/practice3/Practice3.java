package practice3;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 15:26
 * @description：输入某年某月某日，判断这一天是这一年的第几天
 * @modified By：
 * @version: 0.0.1
 */
public class Practice3 {

    //平年每月对应的天数
    private final static int[] DAYS_OF_COMMON_YEAR={31,28,31,30,31,30,31,31,30,31,30,31};
    //闰年每月对应的天数
    private final static int[] DAYS_OF_LEAP_YEAR={31,29,31,30,31,30,31,31,30,31,30,31};

    /**
     * 测试
     * demo1:输入2020年4月18日，得到：2020年4月18日是2020年的第109天！
     * demo2:输入2020年1月12日，得到：2020年1月12日是2020年的第12天！
     * demo3:输入2019年4月18日，得到：2019年4月18日是2019年的第108天！
     * demo4:输入2019年1月12日，得到：2019年1月12日是2019年的第12天！
     * demo5:输入2020年12月31日，得到：2020年12月31日是2020年的第366天！
     * @param args
     */
    public static void main(String[] args){
        printDaysOfTheYear(2020, 4, 18);
        printDaysOfTheYear(2020, 1, 12);
        printDaysOfTheYear(2019, 4, 18);
        printDaysOfTheYear(2019, 1, 12);
        printDaysOfTheYear(2020, 12, 31);
    }

    /**
     * 打印输出天数信息
     * @param year
     * @param month
     * @param day
     */
    private static void printDaysOfTheYear(int year, int month, int day){
        int dayNum = getDaysOfTheYear(year, month, day);
        System.out.println(year+"年"+month+"月"+day+"日是"+year+"年的第"+dayNum+"天！");
    }

    /**
     * 输入某年某月某日，计算这一天是这一年的第几天
     * @param year 年
     * @param month 月
     * @param day 日
     * @return
     */
    private static int getDaysOfTheYear(int year, int month, int day){
        int days[];
        //用于记录天数
        int dayNum = 0;
        //判断是否是闰年
        if(( year%4 == 0 && year%100 != 0)|(year%400 == 0)){
            //是闰年
            days = DAYS_OF_LEAP_YEAR;
        }else {
            //是平年
            days = DAYS_OF_COMMON_YEAR;
        }
        //计算天数
        for(int i=0;i<month-1;i++){
            dayNum += days[i];
        }
        dayNum += day;

        return dayNum;
    }
}
