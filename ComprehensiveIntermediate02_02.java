// 新規Java ファイル「ComprehensiveIntermediate02_02.java」というファイルを作成し、
// メインメソッドを書き、
// 次の仕様に基づきプログラムを作成してください。

// MenuManagerクラスはファストフード店のメニューを管理するクラスです。
// MenuManagerはファストフードのメニューを次のように管理します。
// キー	値 ※[ArrayList で実装する]
// sandwitch	ハンバーガー, チーズバーガー, フィレオフィッシュ
// drink	コーラ, オレンジジュース, コーヒー
// sidemenu	フライドポテト, チキンナゲット, アップルパイ
// ・図のようにメニューの種別をマップのキーとして持ち、その種別に該当するリストを値として持ちます。
// ・提供コードのMenuManager.javaに次のフィールド、コンストラクタ、メソッドを作成します。
// 1.フィールドを作成する
//  メニューを種別ごとに情報として持つmapをjava.util.Map型で宣言する。
//  キーはString型、値はArrayList型で宣言する。
//  宣言と同時にHashMapインスタンスを生成し、代入しておく。
// 2.searchMenuメソッドを作成する
//  引数 : menu::String型
//  戻り値 : なし
//  処理内容 : 各種別のメニューから引数menuを検索し、
//  見つかった場合は「xxxxはyyyyに含まれています。」と表示します(xxxxは引数menuの値、yyyyは種別を表示します)。
//  また、いずれにも含まれない場合は「該当するメニューはありません。」と表示します。
// 3.setMenuメソッドを作成する
//  引数 : category::String型, menu::String型
//  戻り値 : なし
//  処理内容 : 引数menuの値をcategoryをキーにして取り出せるリストに追加します。
// 4.showMenuメソッドを作成する 引数 : category::String型
//  戻り値 : なし
//  処理内容 : 引数 category が示す種別のメニューをすべて表示します。
//  ArrayList インスタンスを System.out.println で表示するだけです。

class ComprehensiveIntermediate02_02 {
    public static void main(String[] args) {
        MenuManager manager = new MenuManager();
    // サンドイッチメニューの表示
    manager.showMenu("sandwitch");
    // サンドイッチメニューにビッグバーガーを追加
    manager.setMenu("sandwitch","ビッグバーガー");
    // サンドイッチメニューの表示
    manager.showMenu("sandwitch");
    // 「ホットミルク」をメニューから検索
    manager.searchMenu("ホットミルク");
    // 「オレンジジュース」をメニューから検索
    manager.searchMenu("オレンジジュース");
    }
}