package com.spring_boot_jwt_example.enums;

import com.spring_boot_jwt_example.constants.RoleConstant;

public enum RoleEnum {
  ADMIN, USER;

  public String toAuthority() {
    return RoleConstant.ROLE_PREFIX + this.name();
  }
}
