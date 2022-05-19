package com.its.member.controller;

import com.its.member.DTO.MemberDTO;
import com.its.member.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("save")
    public String saveForm() {
        return "save";
    }
    @PostMapping("save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        boolean saveResult = memberService.save(memberDTO);
        if (saveResult) {
            System.out.println("저장성공");
            return "login";
        } else {
            System.out.println("저장실패");
            return "saveFail";
        }
    }
    @GetMapping("login-form")
    public String loginForm() {
        return "login";
    }

    @PostMapping("login")
    public String login(@ModelAttribute MemberDTO memberDTO, Model model, HttpSession session) {
        MemberDTO loginMember = memberService.login(memberDTO);
        // 세션(session)
        if(loginMember != null) {
            model.addAttribute("loginMember", loginMember);
            session.setAttribute("loginMemberId", loginMember.getMemberId());
            session.setAttribute("loginId", loginMember.getId());
            return "main";
        } else {
            return "login";
        }
    }
}
