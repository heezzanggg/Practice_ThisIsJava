package ch08.test.exam07;

public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        // DataAccessObject dao = new OracleDao();
        dbWork(new MySqlDao());
        // DataAccessObject dao = new MySqlDao();
    }
}
