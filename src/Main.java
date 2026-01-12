public class Main {
    public static void main(String[] args) {
        Shop[] shops = new Shop[]{
            new Shop(
                "福勝亭",
                new Product[]{
                    new Product("經典豬排定食套餐", 292, 0.9),
                    new Product("開運豬排定食", 247, 0.75),
                    new Product("香酥炸腰內肉定食", 247, 0.95)
                }
            ),
            new Shop(
                "雙月",
                new Product[]{
                    new Product("雞汁拌飯", 35),
                    new Product("香拌意麵", 40)
                }
            ),
            new Shop(
                "阜杭豆漿",
                new Product[]{
                    new Product("厚燒餅", 40, 0.8),
                    new Product("厚餅夾蛋", 55, 0.8),
                    new Product("豆漿", 45, 0.5),
                    new Product("糙米漿", 45, 0.5),
                    new Product("鹹豆漿", 60, 0.8)
                }
            )
        };

        System.out.println("歡迎使用NTUB訂餐系統，以下為可點餐的店家：");
        System.out.println();
        for (Shop shop : shops) {
            System.out.println(shop.name + "：");
            for (Product product : shop.products) {
                System.out.println("\t" + product.name + "\t-\t$" + String.format("%,.0f", product.calculateDiscountPrice()) + "元");
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
    public final double discount;

    public Product(String name, int price) {
        this(name, price, 1);
    }

    public Product(String name, int price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double calculateDiscountPrice() {
        return price * discount;
    }
}
