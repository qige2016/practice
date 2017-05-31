import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/30.
 * # 题 3
 # 给定一个只包含字母的字符串，返回单个字母出现的次数
 # 考察字典的概念和使用
 # 返回值为包含元组的列表，格式如下（对列表中元组的顺序不做要求）
 # 参数 "hello"
 # 返回值 [('h', 1), ('e', 1), ('l', 2), ('o', 1)]
 */
public class letter_count {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入只包含字母的字符串:");
        String str = input.nextLine();
        char[] chs = str.toCharArray();
        Map<Character,Integer>map = new HashMap<Character, Integer>();
        for(int i = 0;i < chs.length;i++){
            Integer value = map.get(chs[i]);
            if(value == null){
                map.put(chs[i],1);
            }else{
                map.put(chs[i],value + 1);
            }
        }
        StringBuffer sb = new StringBuffer();
        for(Map.Entry i : map.entrySet()){
            sb.append("("+"'"+i.getKey()+"'"+i.getValue()+")"+",");
        }
        System.out.print("["+sb.substring(0,sb.length()-1)+"]");
    }
}
