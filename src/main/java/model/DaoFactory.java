package model;

//this class access to our DAos

public class DaoFactory {
    private static Products productsDao;
    private static Pizzas pizzasDao;

    public static Products getProductsDao(){
        if(productsDao == null){
//            create an instance of listProducts
            productsDao = new ListProducts();
        }
        return productsDao;
    }

    public static Pizzas getPizzasDao(){
        if(pizzasDao == null){
//            creating an instance of ListProducts
            pizzasDao = new ListPizza();
        }
        return pizzasDao;
    }

}
