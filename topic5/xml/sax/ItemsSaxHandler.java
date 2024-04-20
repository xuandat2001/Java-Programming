package topic5.xml.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import topic5.xml.model.*;

/**
 * Process items.xml using SAX
 * 
 * @author Caspar Ryan
 */
final class ItemsSaxHandler extends DefaultHandler
{
   // used for processing the xml payload
   private StringBuffer characters = new StringBuffer();
   // create "model" from XML
   private Item item;
   private Product product;
   // contains data after parsing complete
   private List<Item> items = new ArrayList<Item>();

   // invoked when document-parsing is started
   @Override
   public void startDocument() throws SAXException
   {
      System.out.println("SAX Document processing started");
   }

   // notified when parsing finished
   @Override
   public void endDocument() throws SAXException
   {
      System.out.println("SAX Document processing finished");
   }

   @Override
   public void startElement(String uri, String localName, String qName, Attributes attrs)
      throws SAXException
   {
      // clear the buffer when we enter a new element
      characters.delete(0, characters.length());
      // create model classes each time we reach a new <item>
      if (qName.equals("item"))
      {
         item = new Item();
         product = new Product();
      }
   }

   @Override
   public void endElement(String uri, String localName, String qName) throws SAXException
   {
      String elementData = characters.toString();
      // at the end of the element process the relevant elements character data
      // to populate the List
      if (qName.equals("description"))
      {
         product.setName(elementData);
         log(qName, elementData);
      }
      else if (qName.equals("price"))
      {
         product.setPrice(Double.parseDouble(elementData));
         log(qName, elementData);
      }
      else if (qName.equals("quantity"))
      {
         item.setQty(Integer.parseInt(elementData));
         log(qName, elementData);
      }
      else if (qName.equals("item"))
      {
         log(qName, elementData);
         item.setProduct(product);
         items.add(item);
      }
   }

   @Override
   public void characters(char buf[], int offset, int len) throws SAXException
   {
      // append character data within element (may get called more than once
      // per element)
      characters.append(new String(buf, offset, len));
   }

   private void log(String qName, String elementData)
   {
      System.out.printf("qName: %s, elementData: %s\n", qName, elementData);
   }

   public List<Item> getItems()
   {
      return items;
   }
}