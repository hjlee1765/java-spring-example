package examples.boot.myshop.security;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberInfo {
    private long id;
    private String email;
}
