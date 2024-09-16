// 新規Java ファイル「ComprehensiveIntermediate01_01.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// 整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成してください。

import java.util.Scanner;

class ComprehensiveIntermediate01_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("整数値を入力して下さい");
        int num = new java.util.Scanner(System.in).nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else if (num % 2 == 1) {
            System.out.println("odd");
        }
    }
}