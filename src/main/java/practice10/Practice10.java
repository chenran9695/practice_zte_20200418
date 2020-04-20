package practice10;

/**
 * @author ：cr
 * @date ：Created in 2020/4/18 20:21
 * @description：
 * @modified By：
 * @version: 0.0.1
 */
public class Practice10 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        printGameMatch();
    }

    /**
     * 输出甲乙队对阵信息
     */
    private static void printGameMatch() {
        //创建一个长度为3的数组array代表甲队
        //arrayA[0]代表甲队队员a,其值代表a匹配的乙队队员
        //arrayA[1]代表甲队队员b,其值代表b匹配的乙队队员
        //arrayA[2]代表甲队队员c,其值代表c匹配的乙队队员
        int[] arrayA = new int[3];
        //创建一个长度为3的数组arrayB代表乙队
        //arrayB[0]代表乙队队员x,-1代表该队员未匹配对手，0代表该队员已经匹配对手
        //arrayB[1]代表乙队队员y,-1代表该队员未匹配对手，0代表该队员已经匹配对手
        //arrayB[2]代表乙队队员z,-1代表该队员未匹配对手，0代表该队员已经匹配对手
        int[] arrayB = new int[3];
        //初始化，-1代表甲队队员未匹配对手
        for (int i=0;i<3;i++) {
            arrayA[i] = -1;
            arrayB[i] = -1;
        }
        //进行匹配并打印
        match(arrayA, arrayB,0);
    }

    /**
     * 定制打印匹配信息
     * @param array
     */
    private static void printGameMatch(int[] array){
        System.out.println("甲乙队对阵信息如下：");
        //甲队队员
        char playerA;
        //乙队队员
        char playerB;
        for(int i=0;i<3;i++){
            playerA = (char)('a'+i);
            playerB = (char)('x'+array[i]);
            System.out.println("甲队队员"+playerA+" VS 乙队队员"+playerB);
        }
    }

    /**
     * 判断能否把B队的队员playerOfTeamB安排和A队队员playerOfTeamA进行比赛
     * @param arrayB
     * @param playerOfTeamA
     * @param playerOfTeamB
     * @return
     */
    private static boolean isLegal(int[] arrayB, int playerOfTeamA, int playerOfTeamB){
        boolean flag = true;
        //以下三种情况下，不能安排B队的队员playerOfTeamB安排和A队队员playerOfTeamA进行比赛：
        // 1.B队队员playerOfTeamB已经分配了对手
        // 2.A队队员playerOfTeamA为a,B队队员playerOfTeamB为x
        // 3.A队队员playerOfTeamA为c,B队队员playerOfTeamB为x或z
        if(arrayB[playerOfTeamB] == 0
                || (playerOfTeamA == 0 && playerOfTeamB == 0)
                || (playerOfTeamA == 2 && playerOfTeamB != 1)){
            flag = false;
        }
        return flag;
    }

    /**
     * 对甲乙队队员进行匹配
     * @param arrayA
     * @param playerOfTeamA
     */
    private static void match(int[] arrayA, int[] arrayB, int playerOfTeamA){
        //所有队员都已经分配好对手,打印
        if(arrayA[2] != -1){
            //匹配完成，开始打印
            printGameMatch(arrayA);
            return;
        }
        //从乙队第一名队员开始，对甲队队员playerOfTeamA进行对手匹配
        for(int playerOfTeamB=0;playerOfTeamB<3;playerOfTeamB++){
            //判断乙队该成员是否可以与甲对队员playerOfTeamA匹配
            if(isLegal(arrayB, playerOfTeamA, playerOfTeamB)){
                arrayA[playerOfTeamA] = playerOfTeamB;
                arrayB[playerOfTeamB] = 0;//匹配，将playerOfTeamB写入数组array
                match(arrayA, arrayB, playerOfTeamA+1);//对甲队下一名队员进行匹配
                arrayA[playerOfTeamA] = -1;//取消当前匹配，进入下一轮for循环
                arrayB[playerOfTeamB] = -1;
            }
        }
    }
}
