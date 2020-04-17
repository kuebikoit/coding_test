package com.kuebiko.it.karya;
//POJO -> plain old java objects
public class VoidMethod {

  private int c;

  void calculate(int a, int b) {
    c = a - b;
  }

  public int getC() {
    return c;
  }

  public void modifyPOJO(POJO pojo) {
    pojo.setField1("Saransh");
    pojo.setValue(100);
  }
}
