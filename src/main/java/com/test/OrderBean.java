package com.test;

import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

// Borrowed source from https://www.byteslounge.com/tutorials/jsf-flow-example
@Named
@FlowScoped("order")
public class OrderBean implements Serializable {
  private int itemCount;
  
  private String address;
  
  public int getItemCount() {
    return this.itemCount;
  }
  
  public void setItemCount(int itemCount) {
    this.itemCount = itemCount;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getReturnValue() {
    return "/home";
  }
}

