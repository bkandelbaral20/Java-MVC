package model;

//this class access to our DAos

public class DaoFactory {
    private static Products productsDao;

    public static Products getProductsDao(){
        if(productsDao == null){
//            create an instance of listProducts
            productsDao = new ListProducts();
        }
        return productsDao;
    }


}
