package hello.hello_spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // /는 뭐냐? 그냥 우리 도메인 첫번째 localhost8080으로 딱 들어오면 이게 호출됨
    public String home(){
        return "home";
    }


}
