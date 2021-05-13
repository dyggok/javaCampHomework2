package com.company;

public class Main {

    public static void main(String[] args) {
	//amaç book shop simulasyonu yapmak
        Products product1 = new Products("İnce Memed",
                "Türk Edebiyatı","Yaşar Kemal",22.80);
        Products product2 = new Products("Uçurtma Avcısı", "Roman",
                "Khaled Hosseini",27.72);
        Customer customer1 = new Customer("Duygu","Gök","5557778522",
                "xxx@gmail.com");
        ShopManager shopManager = new ShopManager();
        shopManager.createCustomer(customer1);
        shopManager.addToProduct(product1);
        shopManager.addToProduct(product2);
    }
}
