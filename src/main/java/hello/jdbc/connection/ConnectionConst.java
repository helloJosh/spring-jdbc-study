package hello.jdbc.connection;

public abstract class ConnectionConst {
    // abstract class 객체 생성 못하게 막을때도 사용
    public static final String URL = "jdbc:h2:tcp://localhost/~/test1";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "";
}
