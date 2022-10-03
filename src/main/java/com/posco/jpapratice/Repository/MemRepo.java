package com.posco.jpapratice.Repository;

import com.posco.jpapratice.Entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemRepo extends JpaRepository<MemberEntity,String> {

    @Query("select m from MemberEntity m where m.id = :id")
    MemberEntity findUser(@Param("id")String id);
}
