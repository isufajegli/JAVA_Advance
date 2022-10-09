package com.sda.lesson.one.java18.composition;

public class Bed {
   private String name;
   private String bedroomType;


   public Bed(String name, String bedroomType){
           this.bedroomType = bedroomType;
           this.name = name;
   }


   public String getName() {
       return name;
   }

  void setName(String name) {
          this.name = name;
  }

  public String getBedroomType() {
          return bedroomType;
  }

  public void setBedroomType(String bedroomType) {
          this.bedroomType = bedroomType;
  }
}
