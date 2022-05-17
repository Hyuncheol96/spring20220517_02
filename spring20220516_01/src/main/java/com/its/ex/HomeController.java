package com.its.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    /*
        / 주소 요청이 오면 index.jsp 출력
     */
    @GetMapping("/")
    public  String index() {
        return "index";
    }
    // /save 주소 요청에 대해 처리하는 메서드 정의
    // /save 주소 요청이 오면 save.jsp를 출력
    @GetMapping("/save")
    public String save() {
        System.out.println("HomeController.save");
        // 컨트롤러에서의 String 리턴은 뒤에 .jsp가 붙는다고 보면 됩니다.
        return "save";
    }
}
