package org.delivery.api.account;

import lombok.RequiredArgsConstructor;
import org.delivery.db.account.AccountEntity;
import org.delivery.db.account.AccountRepository;
import org.delivery.db.account.model.AccountMeResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountApiController {

    private final AccountRepository accountRepository;

    @PostMapping("/join")
    public void join(@RequestParam("name") String name) {

        var account = AccountEntity
                .builder().name(name)
                .build();


        accountRepository.save(account);


    }

    @GetMapping("/me")
    public AccountMeResponse save() {
        return AccountMeResponse.builder()
                .name("김승원")
                .email("dnjs5397@naver.com")
                .registeredAt(LocalDateTime.now())
                .build();
    }
}
