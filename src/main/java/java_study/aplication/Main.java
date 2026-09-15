package java_study.aplication;

import java_study.model.dao.DaoFactory;
import java_study.model.dao.SellerDAO;
import java_study.model.dao.impl.entities.Department;
import java_study.model.dao.impl.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println(seller);

    }
}