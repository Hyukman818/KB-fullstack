package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF") // 문자열에 "DEF" 추가
                .insert(0, "ABC") // 문자열의 0번 index을 시작으로 "ABC" 추가
                .delete(3, 4) // 문자열의 3번 index부터 4번 index 전까지(즉, 3번 index까지) 삭제
                .toString(); // 문자열 return
        System.out.println(data);
    }
}
