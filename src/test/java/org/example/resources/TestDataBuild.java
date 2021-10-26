package org.example.resources;

import org.example.pojo.GoogleMapAPI.GoogleMap;
import org.example.pojo.GoogleMapAPI.Location;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {

    public GoogleMap addPlacePayload(String name,String address,String language){
        GoogleMap map=new GoogleMap();
        Location location=new Location();
        location.setLat(-45.56534354);
        location.setLng(63.5635624);
        map.setAccuracy(49);
        map.setAddress(address);
        map.setLanguage(language);
        map.setName(name);
        map.setPhone_number("+918667027752");
        map.setWebsite("https://www.Deekaytechniques.con");
        map.setLocation(location);
        List<String> ls=new ArrayList<String>();
        ls.add("ArnikaaaILoveYou");
        ls.add("gurulakshmi");
        ls.add("vaishuuuunavi");
        ls.add("kavya");
        map.setTypes(ls);

        return map;
    }
    public String deletePlaceBody(String place_id){
        String body="{\n" +
                "    \"place_id\":\""+place_id+"\"\n" +
                "}\n";
        return body;
    }
}
