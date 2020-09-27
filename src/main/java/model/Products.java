package model;

import java.util.List;

//interface describes the operations that our application can perform with the products
public interface Products {
//get all the product records
   List<Product> all ();

//   insert new product into the database
   void insert(Product product);
}
