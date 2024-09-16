// 新規Java ファイル「ComprehensiveIntermediate02_05.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// 以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
// buyDrink() メソッドを持つ、Coffee クラスを使用する
// buyDrink() メソッドを持つ、Juice クラスを使用する

class Coffee {
    String Drink;
    String sweet;
    String sweet2;
    int cost;
    
    public void buyDrink(int cost) {
        System.out.println(Drink + " の甘さは " + sweet + "、 ミルク " + sweet2 + "です。" + cost + " 円になります。");
    }
}

class Juice {
    String drink;
    String taste;

    public void buyDrink(int cost) {
        System.out.println(drink + " の " + taste + " 味です。 " + cost + "円になります。");
    }
}

class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
        Juice juice = new Juice();
        juice.drink = "バヤリース";
        juice.taste = "オレンジ";
        juice.buyDrink(130);

        juice.drink = "午後の紅茶";
        juice.taste = "レモンティー";
        juice.buyDrink(150);

        Coffee coffee = new Coffee();
        coffee.drink = "ボス";
        coffee.sweet = "控え目";
        coffee.sweet2 = "無し";
        coffee.buyDrink(110);

        coffee.drink = "ジョージア";
        coffee.sweet = "甘め";
        coffee.sweet2 = "入り";
        coffee.buyDrink(120);
    }

}