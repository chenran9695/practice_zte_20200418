package practice12;

import java.util.*;

/**
 * @author ：cr
 * @date ：Created in 2020/4/19 19:36
 * @description：每次考试后，教师都要统计考试成绩，一般包括：平均分，对所有人按成绩从高到低排队，谁成绩最好，谁成绩最差
 * 。为了简化，以字典（map）的形式表示考试成绩记录，例如：{"zhangsan":90,"lisi":78，"wangermazi":39}
 * @modified By：
 * @version: 0.0.1
 */
public class Practice12 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        //构造无序的成绩单
        Map<String,Integer> scoreMap = new HashMap<>();
        scoreMap.put("lisi", 78);
        scoreMap.put("wangermazi", 39);
        scoreMap.put("zhangsan", 90);

        System.out.println("排序后的成绩单如下：");
        //以字典（map）的形打印输出排序后的成绩记录
        printSortedScoreMap(scoreMap);
    }

    /**
     * 排序成绩单，并以字典（map）的形打印输出
     * @param scoreMap
     */
    private static void printSortedScoreMap(Map<String,Integer> scoreMap){
        if(scoreMap == null) return;
        //用scoreMap的Entry对象构造列表
        List<Map.Entry<String, Integer>> scoreList = new ArrayList<>(scoreMap.entrySet());
        //排序
        scoreList.sort((o1, o2) -> o2.getValue()-o1.getValue());
        //以map形式打印成绩单
        printSortedScoreMap(scoreList);
    }

    /**
     * 以map形式打印成绩单
     * @param scoreList
     */
    private static void printSortedScoreMap(List<Map.Entry<String, Integer>> scoreList) {
        StringBuffer stringBuffer = new StringBuffer("{");
        for (Map.Entry<String, Integer> sc:scoreList
             ) {
            stringBuffer.append("\""+sc.getKey()+"\":"+sc.getValue()+",");
        }
        //去除最后一个","
        stringBuffer.deleteCharAt(stringBuffer.lastIndexOf(","));
        stringBuffer.append("}");
        System.out.println(stringBuffer.toString());
    }
}
