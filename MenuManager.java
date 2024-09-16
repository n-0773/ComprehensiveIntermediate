import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class MenuManager{
    // ここにフィールドを追加します。
    Map<String, List> map = new HashMap<>();

    // コンストラクタ
    MenuManager(){
        // サンドイッチメニューの登録
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch",list);
        //ドリンクメニューの登録
        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        map.put("drink",list);
        //サイドメニューの登録
        list = new ArrayList<>();
        list.add("フライドポテト");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        map.put("sidemenu",list);
    }

    // ここにsearchMenuを作成します。
    void searchMenu(String menu) {
        if (map.get("sandwitch").contains(menu)) {
            System.out.println(menu + "はsandwitchに含まれています。");
        } else if (map.get("drink").contains(menu)) {
            System.out.println(menu + "はdrinkに含まれています。");
        } else if (map.get("sidemenu").contains(menu)) {
            System.out.println(menu + "はsidemenuに含まれています。");
        } else {
            System.out.println("該当するメニューはありません。");
        }
    }
    // ここにsetMenuを作成します。
    void setMenu(String category, String menu) {
        List<String> list = new ArrayList<>();
        map.get(category);
        list.add(menu);
    }
    // ここにshowMenuを作成します。
    void showMenu(String category) {
        System.out.println(map.get(category));
    }
}