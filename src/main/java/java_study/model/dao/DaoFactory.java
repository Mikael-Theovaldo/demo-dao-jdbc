package java_study.model.dao;

public class DaoFactory {
    public static SellerDAO createSellerDao() {
        return new SellerDAOimplJDBC();
    }
}
