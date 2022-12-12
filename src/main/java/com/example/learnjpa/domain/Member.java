package com.example.learnjpa.domain;

import javax.persistence.*;

@Table(name = "MEMBER")
@Entity
public class Member {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "age")
  private Integer age;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String username) {
    this.name = username;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
