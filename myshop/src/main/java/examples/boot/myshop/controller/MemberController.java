package examples.boot.myshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {

    //org.springframework.boot:spring-boot-starter-thymeleaf 이게 스프링부트에서 사용할 수 있는
    //서드 파티 라이브러리인데, 추가하면 엔진이 resources/templates 아래에서 members.html을 찾는다.

    @GetMapping
    public String member(ModelMap modelMap){
        //modelMap -> 모델멥에 값을 담아주면 view까지 전달해준다.
        modelMap.addAttribute("count", 500);


        return "members"; // view name을 리턴한다.
    }
}
