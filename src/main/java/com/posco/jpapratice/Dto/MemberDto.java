package com.posco.jpapratice.Dto;

import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class MemberDto {

    private String id;

    private String pw;

    private String nm;
}
