import java.util.*;
import java.util.stream.*;
public class Shop {
    laptop laptop;

    static List<laptop> laptopsInStock = new ArrayList<>();
   static {

        laptopsInStock.add(new laptop("Acer","Core i3","4 Gb","HDD","15 inches","",30.200));
        laptopsInStock.add(new laptop("HP","core i5","8 Gb","SSD","15 inches","", 40.500 ));
        laptopsInStock.add(new laptop("Lenovo","core i3","4 Gb","HDD","15 inches","",31.600 ));
        laptopsInStock.add(new laptop("Asus","core i7","8 Gb","SSD","15 inches","",60.500));
        laptopsInStock.add(new laptop("Samsung","core i7", "8 Gb","SSD","15 inches","", 70.555));
        laptopsInStock.add(new laptop("Lg", "core i5"," 8 GB","HDD","15 inches","", 54.300));

  }

    public Shop (String laptopName, String laptopCPU,String laptopRAM,String laptopstorageDevice,String laptopscreen,String laptopprice){

       this.laptop=new laptop(laptopName,laptopCPU, laptopRAM,laptopstorageDevice,laptopscreen,laptopmodel, laptopprice);
    }

    public laptop buylaptop()
    {
        return laptopsInStock.stream().filter(c ->
        {
            if(c.getName().equals(laptop.getName()) && c.getCPU().equals(laptop.getCPU())&&  c.getScreen().equals(laptop.getScreen())&& c.getStorageDevice().equals(laptop.getStorageDevice())&& c.getPrice().equals(laptop.getPrice())
            {
                System.out.println("check");
                return true;
            }
            return false;
        }).collect(Collectors.toList()).get(0);
    }
}
