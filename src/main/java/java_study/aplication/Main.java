package java_study.aplication;

import java_study.model.dao.DaoFactory;
import java_study.model.dao.SellerDAO;
import java_study.model.dao.impl.entities.Department;
import java_study.model.dao.impl.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        System.out.println("\n === TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n === TEST 3: seller findAll ===");
        list = sellerDAO.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

    }
}