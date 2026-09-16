package java_study.model.dao;

import java_study.db.DB;

public class DaoFactory {
    public static SellerDAO createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
