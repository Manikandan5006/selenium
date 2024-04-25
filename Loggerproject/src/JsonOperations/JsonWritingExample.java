package JsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        //first JSON ku objet create pannanum
		JSONObject jsonobject = new JSONObject();
		
         //add key value pairs using put()
        jsonobject.put("fruits", "apple");
        jsonobject.put("fruits", "mango");
        jsonobject.put("vegitables", "tomato");
        jsonobject.put("fruits", "onion");
        //i am gointo create json araay so i need create json array object and then add it to the json object
         JSONArray array = new JSONArray();
         array.add("soil with water");
         array.add("soil without water");
         //now i am going to addthis array object to json object as a value
         jsonobject.put("food and process", array);
         
         /* {
           "fruits":"apple",
             
            "fruits":"mango",
            
           "vegitables":"tomato",
           
            "food and process":["soil with water", "soil without water"]
            
              }
          
           */
         // ippo oru file writer use panni oru ithayellam oru file al write panna poran, , itha namma filewriter, 
         //bufferedwriter, path ipdi ethula vena eluthikalam.
         
         //file writer use panni manukandan.josn oru file all eluthu athula ithayellam write pandran
         
         FileWriter filewriter = new FileWriter("food.json");
         
         //ippa write panna poran
//         normal ahh oru file write pannanumna namma file. write use panlam, but ithu oru json file so naan antha jsonobject ahh
//         Tostring ahh or toJSONstring ahho h ulla covert pannanum, so
         filewriter.write(jsonobject.toJSONString());
         filewriter.close();
         
        
	}

}
