package database;

public class DatabaseExample {
    public static void main(String[] args) {
        Database database = Database.getInstance();

        // database.connect();
        System.out.println("데이터베이스: " + database.connect());
        // 이 문제에서는 답지처럼 connection을 return해주는 메서드를 따로 만들지 않아도 되는듯
        database.close();
    }
}
