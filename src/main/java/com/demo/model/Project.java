package com.demo.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;

public class Project
  implements Serializable
{
  private static final long serialVersionUID = -5344512862131358475L;
  private String id;
  private String name;
  private List<ProjectChild> pchild;

  public String getId()
  {
    return this.id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getName()
  {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public List<ProjectChild> getPchild() {
    return this.pchild;
  }
  public void setPchild(List<ProjectChild> pchild) {
    this.pchild = pchild;
  }
}