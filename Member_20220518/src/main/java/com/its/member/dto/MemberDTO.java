package com.its.member.dto;

import lombok.Data;

@Data
public class MemberDTO {
    private String memberId;
    private String memberPassword;
    private String memberName;
    private int memberAge;
    private String memberPhone;
}
