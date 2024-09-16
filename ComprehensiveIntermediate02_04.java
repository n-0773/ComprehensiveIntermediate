// 新規Java ファイル「ComprehensiveIntermediate02_04.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// ジャンケンプログラムを作成してください。
// 1."ジャンケン"と表示させる
// 2."0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
//   それ以外の数字が入力された場合、エラーとして説明した後に 1. に戻るようにする
// 3.今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する

import java.util.Scanner;
import java.util.Random;

class ComprehensiveIntermediate02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("ジャンケン");
        
            System.out.println("0:グー 1:チョキ 2: パー ＞数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();

            if (num < 0 || num > 2) {
                continue;
            }
            Random rand = new Random(); 
            int battle = rand.nextInt(3);
            System.out.println("相手の手は" +battle);
            

            if (num == battle) {
                System.out.println("あいこです");
            } else if (num == 0) {
                if (battle == 1) {
                    System.out.println("あなたの勝ちです");
                } else if (battle == 2) {
                    System.out.println("あなたの負けです");
                }
            } else if (num == 1) {
                if (battle == 2) {
                    System.out.println("あなたの勝ちです");
                } else if (battle == 0) {
                    System.out.println("あなたの負けです");
                }
            } else if (num == 2) {
                if (battle == 0) {
                    System.out.println("あなたの勝ちです");
                } else if (battle == 1) {
                    System.out.println("あなたの負けです");
                }
            }
            break;
        }
    }
}