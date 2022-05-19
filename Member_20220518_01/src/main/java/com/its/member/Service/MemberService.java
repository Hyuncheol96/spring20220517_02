package com.its.member.Service;

import com.its.member.DTO.MemberDTO;
import com.its.member.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    public boolean save(MemberDTO memberDTO) {
        int saveResult = memberRepository.save(memberDTO);
        if (saveResult > 0) {
            return true;
        } else {
            return false;
        }
    }
    public MemberDTO login(MemberDTO memberDTO) {
        MemberDTO loginMember = memberRepository.login(memberDTO);
        return loginMember;
    }


//    public List<MemberDTO> findAll() {
//        List<MemberDTO> memberDTOList = memberRepository.findAll();
//        return memberDTOList;
//    }
}

