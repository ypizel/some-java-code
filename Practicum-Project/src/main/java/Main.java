import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food beef = new Meat(5, 100);
        Food redApple = new Apple(10, 50, "red");
        Food greenApple = new Apple(8, 60, "green");

        Food[] foods = {beef, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров: " + shoppingCart.getGoodsSum());
        System.out.println("Скидка: " + shoppingCart.getTotalDiscount());
        System.out.println("Сумма вегетерианских товаров: " + shoppingCart.getVegetarianGoodsSum());
    }
}
