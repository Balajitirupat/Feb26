import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("Name", "Sudha");
		jsonobject.put(""Age", 49); 
		JSONArray array=new JSONArray();
		array.add("Hot navel");
		array.add("big Butt");
		jsonobject.put("Qualities", array);
		FileWriter filewriter=new FileWriter("balaji.json");
		filewriter.write(jsonobject.toJSONString());
		filewriter.close();
	}

}
