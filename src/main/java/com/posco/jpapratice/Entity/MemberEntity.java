package com.posco.jpapratice.Entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(schema = "posco",name = "tb_mem")
public class MemberEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "pw")
    private String pw;

    @Column(name = "nm")
    private String nm;

    @OneToMany(mappedBy = "memberEntity")
    private List<MemberRoleEntity> roles = new ArrayList<>();
}
