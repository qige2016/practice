import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/30.
 * # 题 4
 # 给定一个英文句子（一个只有字母的字符串），将句中所有单词变为有且只有首字母大写的形式
 */
public class cap_string {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入只包含字母的字符串:");
        String str = input.nextLine();
        char[] chs = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        chs[0] =(char) (chs[0] - 32);
        sb.append(chs[0]);
        for (int i = 1;i < chs.length;i++){
            if (chs[i-1] == ' ' && chs[i] >= 'a' && chs[i]<= 'z' ){
                 chs[i] =(char) (chs[i] - 32);
            }
            sb.append(chs[i]);
        }
        System.out.print(sb);
    }
}
