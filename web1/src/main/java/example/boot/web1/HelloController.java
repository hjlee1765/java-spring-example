package example.boot.web1;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    public HelloController(){ System.out.println("HelloController!"); }

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    //  /hello2?name=lee&age=27
    // 파라미터 값은 무조건 문자열인데 다른 형으로 변환도 가능함. int인데 문자로 클라이언트 요청하면 400에러발생.
    //참고로 500에러는 서버문제
    @GetMapping("/hello2")
    public String sayHello2(@RequestParam(name ="name", required = false)String name,
                            @RequestParam(name = "age", required = false, defaultValue = "0")int age){
        return "hello" + name + " , " + age;
    }

    //HttpServletRequest 이거 쓰는거보다 애노테이션 사용하는게 좋다.
    @GetMapping("/hello3")
    public String sayHello3(HttpServletRequest request){
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            return "hello" + name + " , " + age;
    }

    //HttpServletRequest 이거 쓰는거보다 애노테이션 사용하는게 좋다.
    @GetMapping("/hello4")
    public String sayHello4(@ModelAttribute HelloDTO helloDTO){
        return "hello" + helloDTO.getName() + " , " + helloDTO.getAge();
    }

    //Restlet client 활용해서 콜
    @PostMapping(path = "/hello5")
    public String sayHello5(){
        return "hello";
    }

    @PostMapping("/hello6")
    public String sayHello6(@RequestParam(name ="name", required = false)String name,
                            @RequestParam(name = "age", required = false, defaultValue = "0")int age){
        return "hello" + name + "   , " + age;
    }
    //body에 담아서 오는 값들을 받아주는게 @RequestBody
    //메세지 컨버터에 의해서 body의 값들을 DTO에 담아준다.
    @PostMapping("/hello7")
    public String sayHello7(@RequestBody HelloDTO helloDTO){
        return "hello" + helloDTO.getName() + " , " + helloDTO.getAge();
    }

    //body에 담아서 오는 값들을 받아주는게 @RequestBody
    //메세지 컨버터에 의해서 body의 값들을 DTO에 담아준다.
    @GetMapping("/hello8")
    public HelloDTO sayHello8(){
        HelloDTO helloDTO = new HelloDTO();
        helloDTO.setName("Lee");
        helloDTO.setAge(1); 
        return helloDTO;
    }
}