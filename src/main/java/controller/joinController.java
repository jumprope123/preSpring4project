package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class joinController {

    @GetMapping("/join/agree")
    public String index(){

        // 타일즈 템플릿 기반 뷰 호출
        // template.jsp <- join/agree.jsp
        return "join/agree.tiles";
    }

    @GetMapping("/join/checkme")
    public String checkme(){
        return "join/checkme.tiles";
    }

    @GetMapping("/join/joinme")
    public String joinme(){
        return "join/joinme.tiles";
    }

    @GetMapping("/join/joinok")
    public String joinok(){
        return "join/joinok.tiles";
    }

}
