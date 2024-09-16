// 新規Java ファイル「ComprehensiveIntermediate01_02.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// 整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
// 小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。

import java.util.Scanner;

class ComprehensiveIntermediate01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("整数値aを入力して下さい");
        int a = new java.util.Scanner(System.in).nextInt();

        System.out.println("整数値bを入力して下さい");
        int b = new java.util.Scanner(System.in).nextInt();

        System.out.println("整数値cを入力して下さい");
        int c = new java.util.Scanner(System.in).nextInt();

        if (a <= b && b <= c) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}