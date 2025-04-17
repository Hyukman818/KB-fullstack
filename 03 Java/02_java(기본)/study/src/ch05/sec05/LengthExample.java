package ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123"; // 13자리
        // String ssn = "95062412301234";  // 14자리
        boolean available = true;

        if(ssn.length()!=13) available=false;

        if(available==true){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        }
        else System.out.println("주민등록번호 자릿수가 틀립니다.");
    }
}
