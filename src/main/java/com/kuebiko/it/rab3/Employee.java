package com.kuebiko.it.rab3;

public class Employee {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    for (Character c : name.toCharArray()) {
      if (Character.isDigit(c)) {
        throw new IllegalArgumentException("Name cant have numbers");
      }
    }
    this.name = name;
  }
}
