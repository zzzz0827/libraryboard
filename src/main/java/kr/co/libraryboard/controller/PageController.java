package kr.co.libraryboard.controller;

import kr.co.libraryboard.service.MainService;
import kr.co.libraryboard.vo.UsrVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.Locale;

@Controller
public class PageController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @Resource(name="mainservice")
    MainService mainService;

    @GetMapping("/")
    public String main(Locale locale, Model model){

        UsrVO usrVO = mainService.getUsr();
        System.out.println("id=" + usrVO.getUsrId());
        model.addAttribute("usr", usrVO);

        return "index";
    }
}
