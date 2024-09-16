// 新規Java ファイル「ComprehensiveIntermediate02_03.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// スロットマシーンプログラムを作成してください。
// 1."ゾロ目で大当たり！チャンスは30回"と表示させる
// 2."begin と入力してください> " と出力し、begin と入力すると、開始するようにする
// 3.ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
// 4.大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
// 5.30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる
import java.util.Scanner;
import java.util.Random;

class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        
        System.out.println("ゾロ目で大当たり！チャンスは30回");
        System.out.println("begin と入力してください> ");
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        String a = "begin";

        if (a.equals(start)) {
            for (int i = 1; i <= 30; i++) {
                int num1 = new Random().nextInt(10)+1;
                int num2 = new Random().nextInt(10)+1;
                int num3 = new Random().nextInt(10)+1;
                
                System.out.printf("%d 回目: %d, %d, %d",i, num1, num2, num3);
                System.out.println();

                if (num1 == num2 && num2 == num3) {
                    System.out.println(i + "回目で大当たりです。おめでとうございます！");
                    break;
                }
                if (i == 30) {
                    System.out.println("残念でした。終わります。");
                }
            }
            
        }
    }
}