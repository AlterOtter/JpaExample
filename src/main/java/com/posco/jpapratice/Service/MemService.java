package com.posco.jpapratice.Service;

import com.posco.jpapratice.Dto.MemberDto;
import com.posco.jpapratice.Dto.RoleDto;
import com.posco.jpapratice.Entity.MemberEntity;
import com.posco.jpapratice.Entity.MemberRoleEntity;
import com.posco.jpapratice.Entity.RoleEntity;
import com.posco.jpapratice.Repository.MemRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemService {

    private final MemRepo memRepo;

    private final EntityManager em;

    public MemberEntity join(MemberDto dto) {
        MemberEntity entity = new MemberEntity();

        entity.setId(dto.getId());
        entity.setPw(dto.getPw());
        entity.setNm(dto.getNm());


        return  this.memRepo.save(entity);

    }

    public String addUserPermission(MemberDto dto){

        //세타 조인 cross JOIN
//        String query = "select mem from MemberEntity mem,MemberRoleEntity mre where mem.id = mre.tmrMemId ";
        //Inner JOIN
//        String query = "select mem from MemberEntity mem inner join mem.roles r ";
        //Fetch JOIN (권장)   distinct 필수 !  2개 이상의 컬랙션은 쿼리를 분리 시키는게 좋다. ( 데이터 X 데이터가 되기 때문에 )  페치 조인은 페이징 X
        String query = "select distinct mem from MemberEntity mem join fetch mem.roles r join fetch r.roleEntity";
        List<MemberEntity> users = em.createQuery(query,MemberEntity.class).getResultList();
        System.out.println("<===========================================================================>");
        System.out.println(users.size());
        System.out.println("<===========================================================================>");
        for (MemberEntity mem: users) {
            System.out.println("ID : "+mem.getId()+" PW :"+mem.getPw()+" ROLES : "+mem.getRoles().size());
            List<MemberRoleEntity> roles = mem.getRoles();
            for(MemberRoleEntity role:roles){
                System.out.println(role.getRoleEntity().getRoleNm());
            }
        }
        return "success";

    }
}
