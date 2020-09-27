package model;

import java.util.List;

public interface Products {
//get all the product records
   List<Product> all ();

//   insert new product into the database
   void insert(Product product);
}
