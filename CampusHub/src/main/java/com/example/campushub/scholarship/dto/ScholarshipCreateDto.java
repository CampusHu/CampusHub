package com.example.campushub.scholarship.dto;

import com.example.campushub.scholarship.domain.PaymentType;
import com.example.campushub.scholarship.domain.Scholarship;
import com.example.campushub.schoolyear.domain.SchoolYear;

import com.example.campushub.user.domain.User;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;

@Getter
public class  ScholarshipCreateDto {

    private String userNum;
    private String userName;
    private String deptName;
    private SchoolYear schoolYear;
    //private
    @NotBlank(message = "장학금 명을 입력하세요")
    private String scholarshipName;
    @NotBlank(message = "지급 구분을 입력하세요")
    private PaymentType type;
    @NotBlank(message = "금액을 입력하세요")
    private int amount;

    @Builder
    public ScholarshipCreateDto(String userNum, String userName, String deptName, SchoolYear schoolYear, String scholarshipName, int amount, PaymentType type) {
        this.userNum = userNum;   //학번 이름 학과 학년도 장학금명 금액 지급구분
        this.userName = userName;
        this.deptName = deptName;
        this.schoolYear = schoolYear;
        this.scholarshipName = scholarshipName;
        this.amount = amount;
        this.type = type;

    }

    public Scholarship toEntity() {
        return Scholarship.builder()
            .scholarshipName(scholarshipName)
            .type(type)
            .amount(amount)
            .build();

    }

}
