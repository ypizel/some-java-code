package service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getGoodsSum() { // сумма всех товаров
        double sum = 0;
        for (Food good : products) {
            sum += good.getTotalCost();
        }
        return sum;
    }

    public double getPriceWithDiscount() { //сумма со скидкой
        double sum = 0;
        for (Food good : products){
            sum += good.getTotalCostDiscounted();
        }
        return sum;
    }

    public double getTotalDiscount(){
        double sum = 0;
        for (Food good : products) {
            sum += good.getTotalDiscountAmount();
        }return sum;
    }

    public double getVegetarianGoodsSum(){ // сумма вегетерианских товаров
        double sum = 0;
        for (Food good : products){
            if(good.isVegetarian()){
                sum += good.getTotalCostDiscounted();
            }
        }
        return sum;
    }

}






    /* подумал что это тоже надо выводить, пусть будет как комментарий
    public void getCartValues(){  //значения корзины
        for (int i = 0; i < goods.length; i++) {
            System.out.println("Товар №" + (i+1));
            System.out.print("[ Количество товара(кг): " + goods[i].getAmount() + ", ");
            System.out.print("Цена за киллограмм: " + goods[i].getKgPrice()+ ", ");
            System.out.println("Вегатерианский: " + goods[i].getIsVegetarian() + " ]");
        }
    */