package java_study.model.dao;

import java_study.model.dao.impl.entities.Department;
import java_study.model.dao.impl.entities.Seller;

import java.util.List;

public interface SellerDAO {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
