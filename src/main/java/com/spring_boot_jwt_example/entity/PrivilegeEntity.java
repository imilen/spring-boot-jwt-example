package com.spring_boot_jwt_example.entity;

import com.spring_boot_jwt_example.enums.PrivilegeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Entity
@Table(name = "privileges")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrivilegeEntity extends Auditable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Enumerated(EnumType.STRING)
  @JdbcTypeCode(SqlTypes.NAMED_ENUM)
  @Column(name = "name", unique = true, nullable = false, columnDefinition = "PrivilegeEnum")
  private PrivilegeEnum name;

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof PrivilegeEntity that))
      return false;
    return name == that.name;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
