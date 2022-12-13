package com.example.learnjpa.domain;

import javax.persistence.*;

@Entity
@Table(name = "ITEM")
public class Item {

  @Id @GeneratedValue
  @Column(name = "ITEM_ID")
  private Long id;

  private String name;
  private String price;
  private String stockQuantity;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getStockQuantity() {
    return stockQuantity;
  }

  public void setStockQuantity(String stockQuantity) {
    this.stockQuantity = stockQuantity;
  }
}
