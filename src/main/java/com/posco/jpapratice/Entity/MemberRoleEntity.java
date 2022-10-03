package com.posco.jpapratice.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "posco",name = "tb_mem_role")
public class MemberRoleEntity {

    @Id
    @GeneratedValue
    @Column(name = "tmr_no")
    private Integer tmrNo;

//    @Column(name = "tmr_mem_id")
//    private String tmrMemId;
//
//    @Column(name = "tmr_role_no")
//    private Integer tmrRoleNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tmr_mem_id")
    private MemberEntity memberEntity = new MemberEntity();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tmr_role_no")
    private RoleEntity roleEntity = new RoleEntity();
}
