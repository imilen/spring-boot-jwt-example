package com.spring_boot_jwt_example.constants;

public final class SecurityConstant {
  public static final String AUTHORIZATION_HEADER = "Authorization";
  public static final String BEARER_PREFIX = "Bearer ";
  public static final String[] PUBLIC_URLS = { "/api/auth/register",
      "/api/auth/login", "/api/auth/refresh-token" };

  private SecurityConstant() {
  }
}
