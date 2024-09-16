# Javaスクール_中級_総合問題
総合問題1-1
新規Java ファイル「ComprehensiveIntermediate01_01.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成してください。

総合問題1-2
新規Java ファイル「ComprehensiveIntermediate01_02.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。

総合問題1-3
新規Java ファイル「ComprehensiveIntermediate01_03.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。

総合問題1-4
新規Java ファイル「ComprehensiveIntermediate01_04.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
人数を入力し、入場料の合計を計算するプログラムを作成してください。

総合問題1-5
新規Java ファイル「ComprehensiveIntermediate01_05.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

九九の表を、2重の繰り返し(2重for文)を使って表示するプログラムを作成してください。
2重の繰り返しを使わず単に表示するのは NG

総合問題2-1
新規Java ファイル「ComprehensiveIntermediate02_01.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

HashMapを使って科目とその得点を管理します。

HashMapのキーを「科目名」(String型)、値を「得点」(Integer型)として扱います。

各科目と得点は次のとおりです。

国語：90点
数学：80点
英語：70点
上記のプログラムを作成し、下記の実行結果となるよう出力してください。

実行結果

国語:90
数学:80
英語:70

総合問題2-2
新規Java ファイル「ComprehensiveIntermediate02_02.java」というファイルを作成し、
メインメソッドを書き、
次の仕様に基づきプログラムを作成してください。

・MenuManagerクラスはファストフード店のメニューを管理するクラスです。
　MenuManagerはファストフードのメニューを次のように管理します。
キー	値 ※[ArrayList で実装する]
sandwitch	ハンバーガー, チーズバーガー, フィレオフィッシュ
drink	コーラ, オレンジジュース, コーヒー
sidemenu	フライドポテト, チキンナゲット, アップルパイ
・図のようにメニューの種別をマップのキーとして持ち、その種別に該当するリストを値として持ちます。
・提供コードのMenuManager.javaに次のフィールド、コンストラクタ、メソッドを作成します。
1.フィールドを作成する
 メニューを種別ごとに情報として持つmapをjava.util.Map型で宣言する。
 キーはString型、値はArrayList型で宣言する。
 宣言と同時にHashMapインスタンスを生成し、代入しておく。
2.searchMenuメソッドを作成する
 引数 : menu::String型
 戻り値 : なし
 処理内容 : 各種別のメニューから引数menuを検索し、
 見つかった場合は「xxxxはyyyyに含まれています。」と表示します(xxxxは引数menuの値、yyyyは種別を表示します)。
 また、いずれにも含まれない場合は「該当するメニューはありません。」と表示します。
3.setMenuメソッドを作成する
 引数 : category::String型, menu::String型
 戻り値 : なし
 処理内容 : 引数menuの値をcategoryをキーにして取り出せるリストに追加します。
4.showMenuメソッドを作成する 引数 : category::String型
 戻り値 : なし
 処理内容 : 引数 category が示す種別のメニューをすべて表示します。
 ArrayList インスタンスを System.out.println で表示するだけです。

 総合問題2-3
 新規Java ファイル「ComprehensiveIntermediate02_03.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

スロットマシーンプログラムを作成してください。
"ゾロ目で大当たり！チャンスは30回"と表示させる
"begin と入力してください> " と出力し、begin と入力すると、開始するようにする
ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる

総合問題2-4
新規Java ファイル「ComprehensiveIntermediate02_04.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

ジャンケンプログラムを作成してください。
"ジャンケン"と表示させる
"0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
それ以外の数字が入力された場合、エラーとして説明した後に 1. に戻るようにする
今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する

総合問題2-5
新規Java ファイル「ComprehensiveIntermediate02_05.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
buyDrink() メソッドを持つ、Coffee クラスを使用する
buyDrink() メソッドを持つ、Juice クラスを使用する
バヤリース の オレンジ 味です。130 円になります。
午後の紅茶 の レモンティー 味です。150 円になります。
ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
