import animals.Cat;
import database.CatJDBC;
import helpers.NewAnimal;
import helpers.JsonFileReader;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Main {
    public static void main(String args[]) {
        System.out.println("== Animals Management app ==");
        // Animal testAnimal = NewAnimal.createNewCat();
        // System.out.println(testAnimal);
        Cat testAnimal = new Cat(001, "Max", "male", "22-22-2222", true, null, 
            null, null, null, null);
        Cat testAnimal2 = new Cat(001, "Pistacha", "female", "22-22-2222", true, null, 
        null, null, null, null);

        // In java JSONObject is used to create JSON object
        // which is a subclass of java.util.HashMap.
 
        // JSONObject file = new JSONObject();
 
        // file.put("Full Name", "Ritu Sharma");
        // file.put("Roll No.", new Integer(1704310046));
        // file.put("Tuition Fees", new Double(65400));
 
        // // To print in JSON format.
        // System.out.print(file);

         // Converting JSON data into Java String format
          String k = "{\"Full Name\":\"Lando Icaza\", \"Tuition Fees\":65400.0, \"Roll No.\":1704310046}";
          Object file = JSONValue.parse(k);
   
          // In java JSONObject is used to create JSON object
          JSONObject jsonObjectdecode = (JSONObject)file;
   
          // Converting into Java Data type
          // format From Json is the step of Decoding.
          String name
              = (String)jsonObjectdecode.get("Full Name");
          double fees
              = (Double)jsonObjectdecode.get("Tuition Fees");
          long rollno
              = (Long)jsonObjectdecode.get("Roll No.");
          System.out.println(name + " " + fees + " "
                             + rollno);

        JsonFileReader.printJsonData();
    }
}