package java_study.aplication;

import java_study.model.dao.DaoFactory;
import java_study.model.dao.SellerDAO;
import java_study.model.dao.impl.entities.Department;
import java_study.model.dao.impl.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

    }
}