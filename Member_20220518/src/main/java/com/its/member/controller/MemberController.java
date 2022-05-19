package com.its.member.controller;

import com.its.member.dto.MemberDTO;
import com.its.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("save")
    public String saveForm() {
        return "save";
    }


//    @PostMapping("save1")
//    public String save1(@RequestParam("memberId") String memberId,
//                        @RequestParam("memberPassword") String memberPassword,
//                        @RequestParam("memberName") String memberName,
//                        @RequestParam("memberAge") int memberAge,
//                        @RequestParam("memberPhone") String memberPhone) {
//        System.out.println("memberId = " + memberId + "memberPassword = " + memberPassword + "memberName = " + memberName + "memberAge = " + memberAge + "member Phone = " + memberPhone);
//        MemberDTO memberDTO = new MemberDTO();
//        memberDTO.setMemberId(memberId);
//        memberDTO.setMemberPassword(memberPassword);
//        memberDTO.setMemberName(memberName);
//        memberDTO.setMemberAge(memberAge);
//        memberDTO.setMemberPhone(memberPhone);
//        memberService.save1(memberDTO);
//        return null;
//    }

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

    @GetMapping("findAll")
    public String findAll(Model model) {
        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberList", memberDTOList);
        return "list";
    }
}
