package topic5.xml.model;

//simple model class for XML parsing
public class Product
{
   private String name;
   private double price;

   public Product()
   {
   }

   public Product(String name, double price)
   {
      this.name = name;
      this.price = price;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   public String getName()
   {
      return name;
   }

   public double getPrice()
   {
      return price;
   }
}