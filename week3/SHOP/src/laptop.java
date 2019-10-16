
public class laptop {

         private String name ;
         private String CPU;
         private String RAM;
         private String storageDevice;
         private String screen;
         private String model;
         private Double price;

         public laptop(String name, String CPU, String RAM, String storageDevice, String screen, String model, double price)
         {
             this.name=name;
             this.CPU=CPU;
             this.RAM=RAM;
             this.storageDevice=storageDevice;
             this.screen=screen;
             this.price=price;
         }

         public void setName(String name)
         {
           this.name =name;
         }

         public String getName()
         {
             return name;
         }

         public void setCPU(String CPU)
         {
             this.CPU=CPU;
         }

         public String getCPU()
         {
             return CPU;
         }

         public void setRAM( String RAM) {
             this.RAM = RAM;
         }
         public String get()
         {
             return RAM;
         }
         public void setStorageDevice (String storageDevice)
         {
             this.storageDevice=storageDevice;
         }

         public String getStorageDevice()
         {
             return storageDevice;
         }

         public void setScreen(String screen)
         {
             this.screen=screen;
         }

         public String getScreen()
         {
             return screen;
         }

         public void setModel(String model)
         {
             this.model=model;
         }
         public String getModel()
         {
             return model;
         }

         public void setPrice(double price)
         {
             this.price=price;
         }

         public Double getPrice()
         {
             return price;

         }

         public String toString()
         {
             return "name: " + name+"\nCPU: " + CPU+"\nRAM: "+ RAM+
                     "\nStorage device: "+storageDevice+
                     "\nscreen: " + screen + "\nPrice: "+ price;
         }
}