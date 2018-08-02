package example.boot.web1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//class 위에 requestMapping 애노테이션이 있으면 localhost:8080/ 부터 시작하는 url임.
@RequestMapping("/api/boards")
public class BoardAPIController {
    //Get방식은 브라우저에서 실행 가능하다.
    @GetMapping
    public String boards(){
        return "boards";
    }

    //rest api 의 {} : path variable이라고 부른다. 매번 변하는 값임.
    @GetMapping("/{id}")    //그니까 /api/boards/{id} 임.
    public String boards(@PathVariable(name = "id") int id){
        return "board" + id;
    }
}
