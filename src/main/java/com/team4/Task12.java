//Task 12 (Lombok Encapsulation)
package com.team4;
public class Task12 {
  private int number;
  private String stringValue;
  private Object anObject;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public Object getAnObject() {
    return anObject;
  }

  public void setAnObject(Object anObject) {
    this.anObject = anObject;
  }

  public Task12() {
  }

  public Task12(int number, String stringValue, Object anObject) {
    this.number = number;
    this.stringValue = stringValue;
    this.anObject = anObject;
  }
}
