package com.spring_boot_jwt_example.entity;

import com.spring_boot_jwt_example.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleEntity extends Auditable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Enumerated(EnumType.STRING)
  @JdbcTypeCode(SqlTypes.NAMED_ENUM)
  @Column(name = "name", unique = true, nullable = false, columnDefinition = "RoleEnum")
  private RoleEnum name;

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof RoleEntity that))
      return false;
    return name == that.name;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

}
