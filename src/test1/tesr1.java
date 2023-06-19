package test1;
import java.util.Scanner;

public class tesr1 {
    public static void main(String[] args){
        //生成一个随机数
        int random = (int)(Math.random() *100) + 1;
        //使用Scanner，从键盘获取一个数据
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个1-100的整数：");
        int guass = scan.nextInt();
        int consts = 1;

        //使用循环，进行多次比较和获取输入的数据来检测是否猜对随机数
        while(random != guass){
            if (guass > random){
                System.out.println("太大了");
            }else if (guass < random) {
                System.out.println("太小了");
            }
            System.out.println("错误,重新输入");
            guass = scan.nextInt();
            consts++;
        }
        System.out.println("恭喜你猜对了，总共猜了" + consts +"次");
    }
}
