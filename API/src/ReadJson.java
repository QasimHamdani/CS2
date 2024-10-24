import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


// video to load jar
//https://www.youtube.com/watch?v=QAJ09o3Xl_0

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Program for print data in JSON format.
public class ReadJson {
    public static void main(String args[]) throws ParseException {
        // In java JSONObject is used to create JSON object
        // which is a subclass of java.util.HashMap.

        JSONObject file = new JSONObject();
        file.put("Full Name", "Ritu Sharma");
        file.put("Roll No.", new Integer(1704310046));
        file.put("Tution Fees", new Double(65400));
        file.put("Eye Colour", "Brown");
        file.put("Year Born", new Integer(1912));
        file.put("Mass", new Integer(225)+"lbs");



        System.out.print(file.get("Tution Fees")+"\n");
        System.out.println(file.get("Full Name"));
        System.out.print(file.get("Eye Colour")+"\n");
        System.out.print(file.get("Year Born")+"\n");
        System.out.print(file.get("Mass")+"\n");

        // To print in JSON format.
        pull();
    }

    public static void pull() throws ParseException {
        String output = "abc";
        String totlaJson="";
        try {

            URL url = new URL("https://last-airbender-api.fly.dev/api/v1/characters");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {

                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));


            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
                totlaJson+=output;
            }

            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONParser parser = new JSONParser();
        //System.out.println(str);
        org.json.simple.JSONArray jsonArray = (org.json.simple.JSONArray) parser.parse(totlaJson);

        System.out.println(jsonArray);

        try {
            int h= jsonArray.size();
            for (int e = 0; e < h; ++e) {
                JSONObject Lilly = (JSONObject) jsonArray.get(e);
                String name = (String) Lilly.get("name");


                org.json.simple.JSONArray msg = (org.json.simple.JSONArray) Lilly.get("allies");
                int n = msg.size(); //(msg).length();
                for (int i = 0; i < n; ++i) {
                    String test = (String) msg.get(i);
                    System.out.println(test);
                    // System.out.println(person.getInt("key"));
                }
                org.json.simple.JSONArray tsg = (org.json.simple.JSONArray) Lilly.get("enemies");
                int l = tsg.size(); //(msg).length();

                for (int t = 0; t < l; ++t) {
                    String test = (String) tsg.get(t);
                    System.out.println(test);
                    // System.out.println(person.getInt("key"));
                }
                // String weapon= (String)Lilly.get("weapon");
                System.out.println(name);

            }
        }

        //

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}