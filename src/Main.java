public class Main {
    public static void main(String[] args) {
        Shop[] shops = new Shop[]{
            new Shop(
                "福勝亭",
                new Product[]{
                    new Product("經典豬排定食套餐", 292),
                    new Product("開運豬排定食", 247),
                    new Product("香酥炸腰內肉定食", 247),
                    new Product("和風咖哩豬排定食", 272)
                }
            ),
            new Shop(
                "雙月",
                new Product[]{
                    new Product("雞汁拌飯", 35),
                    new Product("香拌意麵", 40),
                    new Product("雙月乾蚵", 150)
                }
            ),
            new Shop(
                "阜杭豆漿",
                new Product[]{
                    new Product("厚燒餅", 40),
                    new Product("厚餅夾蛋", 55),
                    new Product("豆漿", 45),
                    new Product("糙米漿", 45),
                    new Product("鹹豆漿", 60)
                }
            ),
            new Shop(
                "定食8",
                new Product[]{
                    new Product("極上海膽鰻牛飯", 280),
                    new Product("蒜香牛排", 260)
                }
            )
        };

        System.out.println("歡迎使用NTUB訂餐系統，以下為可點餐的店家：");
        System.out.println();
        for (Shop shop : shops) {
            System.out.println(shop.name + "：");
            for (Product product : shop.products) {
                System.out.println("\t" + product.name + "\t-\t$" + String.format("%,d", product.price) + "元");
            }
        }
    }
}

class Shop {
    public final String name;
    public Product[] products;

    public Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
}

class Product {
    public final String name;
    public final int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
