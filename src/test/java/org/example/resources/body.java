package org.example.resources;

public class body {

    public String getaddplacebody(){
        String body="{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}\n";
        return body;
    }
    public String getaddplacesampleresponse(){
        String sampleresponse="{\n" +
                "    \"status\": \"OK\",\n" +
                "    \"place_id\": \"928b51f64aed18713b0d164d9be8d67f\",\n" +
                "    \"scope\": \"APP\",\n" +
                "    \"reference\": \"736f3c9bec384af62a184a1936d42bb0736f3c9bec384af62a184a1936d42bb0\",\n" +
                "    \"id\": \"736f3c9bec384af62a184a1936d42bb0\"\n" +
                "}\n";
        return sampleresponse;
    }
    public String getgetplacesampleresponse(){
        String sampleresponse="{\n" +
                " \n" +
                "    \t\"location\":{\n" +
                " \n" +
                "    \t\"lat\" : -38.383494,\n" +
                " \n" +
                "    \t\"lng\" : 33.427362\n" +
                " \n" +
                "    \t},\n" +
                " \n" +
                "    \t\"accuracy\":50,\n" +
                " \n" +
                "    \t\"name\":\"Frontline house\",\n" +
                " \n" +
                "    \t\"phone_number\":\"(+91) 983 893 3937\",\n" +
                " \n" +
                "    \t\"address\" : \"29, side layout, cohen 09\",\n" +
                " \n" +
                "    \t\"types\": [\"shoe park\",\"shop\"],\n" +
                " \n" +
                "    \t\"website\" : \"http://google.com\",\n" +
                " \n" +
                "    \t\"language\" : \"French-IN\"\n" +
                " \n" +
                "}\n";
        return sampleresponse;
    }
    public String getputplacebody(String place_id,String address){
        String body="{\n" +
                "\"place_id\":\""+place_id+"\",\n" +
                "\"address\":\""+address+"\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}\n";
        return body;
    }
    public String getputplacesampleresponse(){
        String sampleresponse="{\n" +
                " \n" +
                "    \t\"location\":{\n" +
                " \n" +
                "    \t\"lat\" : -38.383494,\n" +
                " \n" +
                "    \t\"lng\" : 33.427362\n" +
                " \n" +
                "    \t},\n" +
                " \n" +
                "    \t\"accuracy\":50,\n" +
                " \n" +
                "    \t\"name\":\"Frontline house\",\n" +
                " \n" +
                "    \t\"phone_number\":\"(+91) 983 893 3937\",\n" +
                " \n" +
                "    \t\"address\" : \"29, side layout, cohen 09\",\n" +
                " \n" +
                "    \t\"types\": [\"shoe park\",\"shop\"],\n" +
                " \n" +
                "    \t\"website\" : \"http://google.com\",\n" +
                " \n" +
                "    \t\"language\" : \"French-IN\"\n" +
                " \n" +
                "}\n";
        return sampleresponse;
    }
    public String getdeleteplacebody(String place_id){
        String body="{\n" +
                "    \"place_id\":\""+place_id+"\"\n" +
                "}\n";
        return body;
    }
    public String getdeleteplacesampleresponse(){
        String sampleresponse="{\n" +
                "    \"status\": \"OK\"\n" +
                "}\n";
        return sampleresponse;
    }

    public String getsamplejson1(){
        String json="{\n" +
                "  \"dashboard\": {\n" +
                "    \"purchaseAmount\": 910,\n" +
                "    \"website\": \"rahulshettyacademy.com\"\n" +
                "  },\n" +
                "  \"courses\": [\n" +
                "    {\n" +
                "      \"title\": \"Selenium Python\",\n" +
                "      \"price\": 50,\n" +
                "      \"copies\": 6\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Cypress\",\n" +
                "      \"price\": 40,\n" +
                "      \"copies\": 4\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"RPA\",\n" +
                "      \"price\": 45,\n" +
                "      \"copies\": 10\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        return json;
    }

    public String getaddbookbody(String isbn,String aisle){
        String body="{\n" +
                "\n" +
                "\"name\":\"Learn Appium Automation with Java\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\"John foe\"\n" +
                "}\n";
        return body;
    }
    public String getdeletebookbody(String ID){
        String body="{\n" +
                " \n" +
                "\"ID\" : \""+ID+"\"\n" +
                " \n" +
                "} \n";
        return body;
    }

}
