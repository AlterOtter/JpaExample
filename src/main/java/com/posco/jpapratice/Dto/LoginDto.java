package com.posco.jpapratice.Dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    public String memId;
    public String memPw;
}
