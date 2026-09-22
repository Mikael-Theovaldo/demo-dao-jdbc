package java_study.aplication;

import java_study.model.dao.DaoFactory;
import java_study.model.dao.SellerDAO;
import java_study.model.dao.impl.entities.Department;
import java_study.model.dao.impl.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        System.out.println("\n === TEST 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@email.com", new Date(), 4000.0, department);
        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id: " + newSeller.getId());

        System.out.println("\n === TEST 5: seller update ===");
        seller = sellerDAO.findById(1);
        seller.setName("Martha Waine");
        sellerDAO.update(seller);
        System.out.println("Update completed");

        System.out.println("\n === TEST 6: seller delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDAO.deleteById(id);
        System.out.println("Delete completed");

    }
}