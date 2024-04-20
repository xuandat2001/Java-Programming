package topic5.xml.model;

// simple model class for XML parsing
public class Item
{
   private Product product;
   private int qty;

   public Item()
   {
   }

   public Item(Product product, int qty)
   {
      this.product = product;
      this.qty = qty;
   }

   public Product getProduct()
   {
      return product;
   }

   public int getQty()
   {
      return qty;
   }

   public void setProduct(Product product)
   {
      this.product = product;
   }

   public void setQty(int qty)
   {
      this.qty = qty;
   }

   @Override
   public String toString()
   {
      return String.format("%s:%s:%s", product.getName(), product.getPrice(), qty);
   }
}