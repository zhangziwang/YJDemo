package com.demo.model;


import java.io.Serializable;

public class ProjectChild
  implements Serializable
{
  private static final long serialVersionUID = -2593929255129828125L;
  private String id;
  private String name;
  private String value;

  public String getId()
  {
    return this.id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getValue() {
    return this.value;
  }
  public void setValue(String value) {
    this.value = value;
  }
}