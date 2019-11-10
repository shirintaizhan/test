package com.shop.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    Laptop laptop;

    static List<Laptop> laptopsInStock = new ArrayList<Laptop>();
   static {

        laptopsInStock.add(new Laptop("Acer","Core i3","4 Gb","HDD","15 inches","",30.200,1));
        laptopsInStock.add(new Laptop("HP","core i5","8 Gb","SSD","15 inches","", 40.500,1 ));
        laptopsInStock.add(new Laptop("Lenovo","core i3","4 Gb","HDD","15 inches","",31.600,1 ));
        laptopsInStock.add(new Laptop("Asus","core i7","8 Gb","SSD","15 inches","",60.500,1));
        laptopsInStock.add(new Laptop("Samsung","core i7", "8 Gb","SSD","15 inches","", 70.555,1));
        laptopsInStock.add(new Laptop("Lg", "core i5"," 8 GB","HDD","15 inches","", 54.300,1));

  }

    public Shop (String laptopName, String laptopCPU,String laptopRAM,String laptopstorageDevice,String laptopscreen,double laptopprice){

       this.laptop=new Laptop(laptopName,laptopCPU, laptopRAM,laptopstorageDevice,laptopscreen,"HJKHJ",laptopprice,12 );
    }

    public Laptop buylaptop()
    {
        return laptopsInStock.stream().filter(c ->
        {
            if(c.getName().equals(laptop.getName()) && c.getCPU().equals(laptop.getCPU())&&  c.getScreen().equals(laptop.getScreen())&& c.getStorageDevice().equals(laptop.getStorageDevice())&& c.getPrice().equals(laptop.getPrice()))
            {
                System.out.println("check");
                return true;
            }
            return false;
        }).collect(Collectors.toList()).get(0);
    }
}
