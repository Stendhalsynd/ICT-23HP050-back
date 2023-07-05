package com.example.AutomateX.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

  USER("ROLE_USER", "일반 사용자"),
  ADMIN("ROLE_ADMIN", "어드민");

  private final String key;
  private final String title;

}