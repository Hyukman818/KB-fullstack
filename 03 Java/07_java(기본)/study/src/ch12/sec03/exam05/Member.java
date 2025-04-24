package ch12.sec03.exam05;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {
    private String id;
    @NonNull // @RequiredArgsConstructor에 의해 생성자 추가
    // 이 코드에서는 @NonNull이 꼭 필요하지는 않다고 함

    // GPT 왈
    // @AllArgsConstructor, @NoArgsConstructor를 명시적으로 사용하는 시점에서는
    // @RequiredArgsConstructor가 자동 생성되지 않으므로, @NonNull도 무의미해요.

    private String name;
    private int age;

}
