package org.delivery.db.account.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mapping.model.PropertyNameFieldNamingStrategy;

import java.time.LocalDateTime;

@Data
@Builder
public class AccountMeResponse {

    private String email;

    private String name;

    private LocalDateTime registeredAt;
}
