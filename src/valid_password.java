import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.regex.Pattern;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/5/29.
 * # 题 1
 # 检查密码规则合法性
 # 考察基本编码能力和字符串处理
 # 参考 python 文档的字符串库
 # 给定一个字符串，用以下规则检查合法性
 # 完全符合返回 True，否则返回 False
 # 1，第一位是字母
 # 2，只能包含字母、数字、下划线
 # 3，只能字母或数字结尾
 # 4，最小长度2
 # 5，最大长度10
 */
public class valid_password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入密码:");
        String password = input.nextLine();
        if(Pattern.matches("[a-zA-Z][a-zA-Z0-9_]{1,9}[a-zA-Z0-9]",password)){
            System.out.println("合法密码");
        }
        else {
            System.out.println("非法密码");
        }
    }
}
