package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;

import nLayeredDemo.core.JloggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {

        ProductService productService=new ProductManager(new HibernateProductDao(), new JloggerManagerAdapter());
        Product product=new Product(1,2,"elma",12,50);
        productService.add(product);
    }
}