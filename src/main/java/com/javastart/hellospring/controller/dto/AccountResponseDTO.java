package com.javastart.hellospring.controller.dto;

import com.javastart.hellospring.entity.Account;
import lombok.*;

@Data
@AllArgsConstructor
public class AccountResponseDTO {
    private Long accountId;
    private String name;
    private String email;
    private Integer bill;

    public  AccountResponseDTO(Account account) {
        accountId = account.getId();
        name = account.getName();
        email = account.getEmail();
        bill = account.getBill();
    }

}
