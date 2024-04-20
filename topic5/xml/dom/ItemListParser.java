package topic5.xml.dom;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import topic5.xml.model.*;

/**
 * This program parses an XML file containing an item list. It prints out the
 * items that are described in the XML file.
 * 
 * See JAXB https://docs.oracle.com/javase/8/docs/technotes/guides/xml/jaxb/index.html
 * for automated higher level API!
 * 
 * @author: Original author unknown, refactored by Caspar
 */
class ItemListParser
{
   private DocumentBuilder builder;

   /**
    * Construct a parser that can parse item lists
    */
   public ItemListParser() throws ParserConfigurationException
   {
      builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
   }

   /*
    * Parses an XML file containing an item list. returns an array list
    * containing all items in the XML file
    */
   public List<Item> parse(String fileName) throws SAXException, IOException
   {
      // get the <items> root element
      Element root = builder.parse(new File(fileName)).getDocumentElement();
      return getItems(root);
   }

   /**
    * Obtains an array of items from a DOM element e an <items> element returns
    * the children of e, an array of all items
    */
   private List<Item> getItems(Element e)
   {
      List<Item> items = new ArrayList<Item>();
      NodeList children = e.getChildNodes();

      for (int i = 0; i < children.getLength(); i++)
      {
         Node childNode = children.item(i);
         if (childNode instanceof Element)
         {
            Element childElement = (Element) childNode;
            if (childElement.getTagName().equals("item"))
               items.add(getItem(childElement));
         }
      }
      return items;
   }

   /**
    * Obtains an item from a DOM element. Argument passed e an <item> element
    * returns the item described by the given element
    */
   private Item getItem(Element e)
   {
      NodeList children = e.getChildNodes();
      Product p = null;
      int quantity = 0;
      for (int j = 0; j < children.getLength(); j++)
      {
         Node childNode = children.item(j);
         if (childNode instanceof Element)
         {
            Element childElement = (Element) childNode;
            String tagName = childElement.getTagName();
            if (tagName.equals("product"))
               p = getProduct(childElement);
            else if (tagName.equals("quantity"))
            {
               String data = ((Text) childElement.getFirstChild()).getData();
               quantity = Integer.parseInt(data);
            }
         }
      }
      return new Item(p, quantity);
   }

   /**
    * Obtains a product from a DOM element. Argument passed e a <product>
    * element. Returns the product described by the given element
    */
   private Product getProduct(Element e)
   {
      NodeList children = e.getChildNodes();
      String name = null;
      double price = 0;
      for (int j = 0; j < children.getLength(); j++)
      {
         Node childNode = children.item(j);
         if (childNode instanceof Element)
         {
            Element childElement = (Element) childNode;
            String tagName = childElement.getTagName();
            String data = ((Text) childElement.getFirstChild()).getData();
            if (tagName.equals("description"))
               name = data;
            else if (tagName.equals("price"))
               price = Double.parseDouble(data);
         }
      }
      return new Product(name, price);
   }
}