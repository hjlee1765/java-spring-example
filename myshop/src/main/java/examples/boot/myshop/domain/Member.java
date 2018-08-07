package examples.boot.myshop.domain;

//lombok은 컴파일 타임에서, 애노테이션이 붙어있으면
//사용자의 편의를 위한 코드를 삽입해준다.
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
    //필드 선언
    private Long id;
    private String name;
    private String email;
    private String password;
}
