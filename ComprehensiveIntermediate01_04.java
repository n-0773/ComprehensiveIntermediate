// 新規Java ファイル「ComprehensiveIntermediate01_04.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
// 人数を入力し、入場料の合計を計算するプログラムを作成してください。

import java.util.Scanner;

class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("入場者数を入力して下さい。");
            int num = new java.util.Scanner(System.in).nextInt();
        
            if (0 >= num) {
                continue;
            } else if (0 < num && 5 > num) {
                int yen1 = 600 * num;
                System.out.println("入場料は " + yen1 + "円です。");
            } else if (5 <= num && 20 > num) {
                int yen2 = 550 * num;
                System.out.println("入場料は " + yen2 + "円です。");
            } else if (num >= 20) {
                int yen3 = 500 * num;
                System.out.println("入場料は " + yen3 + "円です。");
            }
            break;
        }
    }
}