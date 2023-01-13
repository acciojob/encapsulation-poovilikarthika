package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly obj=new RWOnly();
     // System.out.println(obj.name="poovili");
      //error
      // C:\Users\admin\IdeaProjects\encapsulation-poovilikarthika\src\main\java\com\driver\Main.java:6:29
      //java: name has private access in com.driver.RWOnly

      obj.setName("Poovili");
      System.out.println(obj.getName());

  }
}