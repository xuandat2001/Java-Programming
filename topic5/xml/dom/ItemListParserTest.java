package topic5.xml.dom;

import java.util.List;

import topic5.xml.model.*;

/**
 * This program parses an XML file containing an item list. It prints out the
 * items that are described in the XML file.
 * 
 * @author: Original author unknown, refactored by Caspar
 */
public class ItemListParserTest
{
   public static void main(String[] args) throws Exception
   {
      List<Item> items = new ItemListParser().parse("xml/items.xml");
      for (Item item : items)
         System.out.println(item);
   }
}
