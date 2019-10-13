import java.util.Scanner;

public class 分解质因数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int i = sc.nextInt();
        primeSpilt(i);
    }
    public static void primeSpilt(int x){
        int n = 2;
        if (x <= 1){
            System.out.println(x + "不可分解质因数");
        }
        else if (x == 2){
            System.out.println(x + "分解质因数:" + x + "*" + 1);
        }
        else {
            System.out.print(x + "分解质因数: 1");
            while (n <= x) {
                if (x % n == 0) {
                    System.out.print("*" + n);
                    x /= n;
                }else {
                    n++;
                }
            }
        }
    }
}
