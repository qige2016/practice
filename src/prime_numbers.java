/**
 * Created by Administrator on 2017/5/30.
 * # 题 2
 # 返回 100 内的素数列表
 # 考察基本的循环和选择概念、列表的使用
 */
public class prime_numbers {
    public static void main(String[] args){
        for(int i = 2;i <= 100;i++) {
            boolean bool = true;
            for (int j = 2;j <= Math.sqrt(i);j++) {
                if (i%j == 0) {
                    bool = false;
                    break;
                }
            }
            if(bool)
                System.out.println(i);
        }
    }
}
