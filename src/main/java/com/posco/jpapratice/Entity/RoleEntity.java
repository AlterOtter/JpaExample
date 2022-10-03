package com.posco.jpapratice.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "tb_role",schema = "posco")
public class RoleEntity {

    @Id
    @GeneratedValue
    @Column(name = "role_no",nullable = false)
    private Integer roleNo;

    @Column(name = "role_nm",nullable = false)
    private String roleNm;

    @OneToMany(mappedBy = "roleEntity")
    private List<MemberRoleEntity> roles = new ArrayList<>();
}
