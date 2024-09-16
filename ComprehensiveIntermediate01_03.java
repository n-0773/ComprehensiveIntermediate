// 新規Java ファイル「ComprehensiveIntermediate01_03.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// 2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
// 2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。

import  java.util.Scanner;

class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("判別式のaを入力して下さい");
        int a = new java.util.Scanner(System.in).nextInt();

        System.out.println("判別式のbを入力して下さい");
        int b = new java.util.Scanner(System.in).nextInt();

        System.out.println("判別式のcを入力して下さい");
        int c = new java.util.Scanner(System.in).nextInt();

        
        int D = b * b - 4 * a * c;
        if(D > 0) {
            System.out.println("2つの実数解");
        } else if(D == 0) {
            System.out.println("重解");
        } else if (D < 0) {
            System.out.println("虚数解");
        }
    }
}