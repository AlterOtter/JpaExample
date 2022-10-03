package com.posco.jpapratice.Controller;

import com.posco.jpapratice.Dto.MemberDto;
import com.posco.jpapratice.Dto.RoleDto;
import com.posco.jpapratice.Entity.MemberEntity;
import com.posco.jpapratice.Service.MemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class MemController {

    private final MemService memService;

    @PostMapping("/join")
    public ResponseEntity<?> join(MemberDto dto){
        MemberEntity mem = memService.join(dto);

        return ResponseEntity.ok().body(mem);
    }


    @PostMapping("/add-user-permission")
    public ResponseEntity<?> addRole(MemberDto dto){



            System.out.println(dto.toString());
            String mem=memService.addUserPermission(dto);
            System.out.println("SUCCESS");
            return ResponseEntity.ok().body(mem);


    }
}
