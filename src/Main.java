public class Main {
    public static void main(String[] args) {
        Shop[] shops = new Shop[]{
            new Shop("福勝亭"),
            new Shop("雙月"),
            new Shop("阜杭豆漿")
        };

        System.out.println("歡迎使用NTUB訂餐系統，以下為可點餐的店家：");
        for (Shop shop : shops) {
            System.out.println(shop.name);
        }
    }
}

class Shop {
    public final String name;

    public Shop(String name) {
        this.name = name;
    }
}
