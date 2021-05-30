package com.incubator.dbs.authenticateservice.model.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequestDto {
  @NotBlank
  private String username;
  private String name;
  private String address;
  private String phoneNumber;
}
