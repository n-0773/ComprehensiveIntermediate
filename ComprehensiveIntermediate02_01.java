// 新規Java ファイル「ComprehensiveIntermediate02_01.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// HashMapを使って科目とその得点を管理します。

// HashMapのキーを「科目名」(String型)、値を「得点」(Integer型)として扱います。

// 各科目と得点は次のとおりです。

// 国語：90点
// 数学：80点
// 英語：70点
// 上記のプログラムを作成し、下記の実行結果となるよう出力してください。

// 実行結果

// 国語:90
// 数学:80
// 英語:70

import java.util.HashMap;
import java.util.Map;

class ComprehensiveIntermediate02_01 {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        map.put("国語", 90);
        map.put("数学", 80);
        map.put("英語", 70);

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key) + "点");
        }
    }
}