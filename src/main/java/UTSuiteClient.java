import javax.json.*;
import java.net.URL;
import java.io.*;

public class UTSuiteClient{
	public static void main(String args[]){

		try
		{
			URL url = new URL("http://nkapi.novalsoftware.com/v1/state?format=json");
			
			InputStream inputStream = url.openStream();

			JsonReader reader = Json.createReader(inputStream);

			JsonObject obj = reader.readObject();

			String status = obj.getString("hardwareState");

			System.out.println("And hardware is ........."+status+"!");
		}
		catch (Exception e)
		{
			System.out.println("Error"+e);
		}
	}
}