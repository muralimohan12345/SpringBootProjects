package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
  private int ProductId;
  private String ProductName;
  private String ProductType;
  private String ProductCategory;
  private double ProductPrice;
  private double discount;
  private double gst;
  private double deliverycharges;
  private double finalprice;
}
