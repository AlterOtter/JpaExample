package com.posco.jpapratice.Dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class RoleDto {
    @Id
    @GeneratedValue
    @Column(name = "role_no",nullable = false)
    private Integer roleNo;

    @Column(name = "role_nm",nullable = false)
    private String roleNm;

}
