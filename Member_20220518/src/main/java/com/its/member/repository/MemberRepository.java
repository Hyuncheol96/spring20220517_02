package com.its.member.repository;

import com.its.member.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepository {

    @Autowired
    private SqlSessionTemplate sql;

    public void save(String memberId, String memberPassword, String memberName, int memberAge, String memberPhone) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberId(memberId);
        memberDTO.setMemberPassword(memberPassword);
        memberDTO.setMemberName(memberName);
        memberDTO.setMemberAge(memberAge);
        memberDTO.setMemberPhone(memberPhone);

        System.out.println("MemberRepository.save");
        System.out.println("memberId = " + memberId + "memberPassword = " + memberPassword + "memberName = " + memberName + "memberAge = " + memberAge + "member Phone = " + memberPhone);
        sql.insert("Member.save", memberDTO);
    }


    public int save1(MemberDTO memberDTO) {
        return sql.insert("Member.save", memberDTO);
    }

    public List<MemberDTO> findAll() {
        return sql.selectList("Member.findAll");
    }
}
