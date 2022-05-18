package com.its.member.Controller;

import com.its.member.dto.MemberDTO;
import com.its.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MmeberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("save")
    public String save() {
        return "save-form";
    }

    @PostMapping("save1")
    public String save1(@RequestParam("memberId") String memberId,
                        @RequestParam("memberPassword") String memberPassword,
                        @RequestParam("memberName") String memberName,
                        @RequestParam("memberAge") int memberAge,
                        @RequestParam("memberPhone") String memberPhone) {
        System.out.println("memberId = " + memberId + "memberPassword = " + memberPassword + "memberName = " + memberName + "memberAge = " + memberAge + "member Phone = " + memberPhone);
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberId(memberId);
        memberDTO.setMemberPassword(memberPassword);
        memberDTO.setMemberName(memberName);
        memberDTO.setMemberAge(memberAge);
        memberDTO.setMemberPhone(memberPhone);
        memberService.save1(memberDTO);
        return null;
    }

    @GetMapping("findAll")
    public String findAll(Model model) {
        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberList", memberDTOList);
        return "list";
    }
}
