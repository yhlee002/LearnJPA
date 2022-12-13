package com.example.learnjpa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "MEMBER")
@Entity
public class Member {

  @Id
  @Column(name = "MEMBER_ID")
  @GeneratedValue // (strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private Integer city;
  private String street;
  private String zipcode;

  @OneToMany(mappedBy = "member") // Order의 멤버 변수 member과 매핑된다는 의미
  private List<Order> orders = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String username) {
    this.name = username;
  }

  public Integer getCity() {
    return city;
  }

  public void setCity(Integer city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }
}
