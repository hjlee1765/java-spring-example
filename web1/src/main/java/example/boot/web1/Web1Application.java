package example.boot.web1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Web1Application {
    public static void main(String[] args) {
        SpringApplication.run(Web1Application.class, args);
        //web application context 가 SpringApplication에 내장되어있다.
        //이거 실행되면
        //Web1Application.class <- 이 설정파일을 읽어드린다.
    }
}
