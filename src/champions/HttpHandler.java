package champions;

import java.util.Iterator;
import org.json.*;
import com.mashape.unirest.http.*;

public class HttpHandler {

    public ChampionList getResponse(String url) throws Exception {
        ChampionList cList = new ChampionList();

        // HTTP GET request
        String data = Unirest.get(url)
                .header("Accept", "application/json")
                .asString()
                .getBody();

        // JSON parsing
        JSONObject json = new JSONObject(data); 
        
        //author
        if (json.has("author")) {
            JSONObject authorObj = json.getJSONObject("author");
            cList.setAuthor(authorObj.getString("name"));
        }

        //ομαδες
        for (String key : json.keySet()) {
        	if (key.equals("author")) continue; //skip τον author
            JSONObject team = json.getJSONObject(key);
            cList.addChampion(new Champion(
                    key,
                    team.getString("year"),
                    team.getString("image")
            ));
        }

        return cList;
    }
}
