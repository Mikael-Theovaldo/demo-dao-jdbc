package java_study.db;

public class DbIntegratyException extends  RuntimeException{
    private static final long serialVersionUID = 1L;

    public DbIntegratyException(String msg) {
        super(msg);
    }
}