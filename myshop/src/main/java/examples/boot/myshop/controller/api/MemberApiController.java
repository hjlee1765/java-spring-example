package examples.boot.myshop.controller.api;

import examples.boot.myshop.security.MemberInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
public class MemberApiController {
    @GetMapping
    public String members(MemberInfo memberInfo){
        //memberInfo에 id = 1, email = 이메일주소를 셋팅에서 넣어주도록 한다.
        System.out.println("member :" + memberInfo);
        return "members";
    }
}
