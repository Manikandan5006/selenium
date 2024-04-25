package JsonOperations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {            //// json vachi url ahh ead pandrathu paakanum net la

	public static void main(String[] args) throws IOException, ParseException {
		
		
		// step1: JSON parsor create pannanum, from json simple package 
		JSONParser jsonparser = new JSONParser();
		
		//step2: Json file ahh read pannanum so athukku file reader theva
		
		FileReader filereader = new FileReader("food.json");
		
		// itha parser nama file reader la kudutha json file ahh read pandra capablities vachirukku, 
		//so json parser vachi parse pannitu ,  atha Object la store pannanum, pannaitan
		
	Object parsedjsonobject = jsonparser.parse(filereader);
	
	/*  ippo parser enakku antha json file ahh translate pannirukkum, so ippo nana atha get pannanum, normal ahh
	    Json object la data va kudukka put() um data edukku or read panna get() irukku, but enakku inga parse panni
	    Object la vachirukka so firstnan parse panna Object ahh normal json object ahh maathanum, and athukappuram json object la 
	    irukka get() vachi namma read pannikalam    ------------
	JSONObject normaljosnobject  = (JSONObject) parsedjsonobject;
	
	  // ippo nan get use panni jsonfile ahh irukka key ahh edukkuran,apdi edukkum pothu athu vara value string ahh vo illa integer ahhvoo
     //irukkalam, intha file la ennoda key kaana value vanthu string so nan atha stringla store pandran,but athula oru error varum, jsonobject la
	 //irunthu get use panni athula string edukuram, object use panni edukurathaala return type objectla than irukkum, so nan atha type cast pannikuran
	
	  String fruitname=  (String)normaljosnobject.get("fruits");
	  String vegname=(String) normaljosnobject.get("vegitables");
	  //suppose oru integer value edukkanumna nam long ahh typcaste pannitu than edukkanum, json ahh oru integer 
	  //long ahh than store aagum
	  
	  // ippo enakku json file ahh json arrava edukkanum athukum typecaste pannikanum
	  JSONArray arrayvalues = (JSONArray) normaljosnobject.get("food and process");
	  // mela iruntha values ahh ellam single ahh irunthathaala eduthutom but array la irukka value ahh namma full edukkanumna namma
	  //loop than use pannanum
	  
	  //athukku iterator() vachi array la irukka ellatym iterate pannitu antha iteratred values ahh loop vachi edukuram
	  Iterator iterator= arrayvalues.iterator();
	  System.out.println("iteratoter values"+iterator);
	  System.out.println(fruitname);
	  System.out.println(vegname);
	  
	  while(iterator.hasNext()) {   // irerator la irukka adutha value irukka varaikum loop pandran
		  //same athey than ingaym , next vaule irukkura vara print opandran
		  System.out.println(iterator.next());
		  
	  }
	  
	
	   
		/*
		JSONParser jsonparser = new JSONParser();
		FileReader filereader = new FileReader("food.json");
		Object parserobject = jsonparser.parse(filereader);
		JSONObject normaljsonobject=(JSONObject)parserobject;
		 String fruitname=(String)normaljsonobject.get("fruits");
		 String vegname= (String)normaljsonobject.get("vegitables");	 
		 JSONArray array = (JSONArray) normaljsonobject.get("food and process");
		 Iterator iterator = array Iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }
		
		
	*/
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
