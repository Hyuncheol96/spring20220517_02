package com.its.member.service;

import com.its.member.dto.MemberDTO;
import com.its.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void save(String memberId, String memberPassword, String memberName, int memberAge, String memberPhone) {
        memberRepository.save(memberId, memberPassword, memberName, memberAge, memberPhone);
    }
    public boolean save1(MemberDTO memberDTO) {
        int saveResult = memberRepository.save1(memberDTO);
        if (saveResult > 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<MemberDTO> findAll() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        return memberDTOList;
    }
}
