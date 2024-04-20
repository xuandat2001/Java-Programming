package topic5.xml.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import topic5.xml.model.*;

/**
 * Use SAX to process items.xml and reproduce result of ItemListParserTest.java
 * 
 * @author Caspar Ryan
 */
public class ItemSaxParserTest
{
   public static void main(String[] args) throws Exception
   {
      // create SAX-parser
      SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
      // and parse using our custom handler
      ItemsSaxHandler handler = new ItemsSaxHandler();
      parser.parse("xml/items.xml", handler);
      // log model data once parsing complete
      for (Item item : handler.getItems())
         System.out.println(item);
   }
}