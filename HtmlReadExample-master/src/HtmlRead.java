import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HtmlRead {

    public static void main(String[] args) {
        HtmlRead html = new HtmlRead();
    }

    public HtmlRead() {

        try {
            System.out.println();
            System.out.print("hello \n");
            URL url = new URL("https://www.milton.edu/");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );
            //System.out.println(reader);


            String line;
            //int x=0;
            //while (x<4) {

            //   System.out.println(reader.readLine());
            // x++;
        //}
            while ( (line = reader.readLine()) != null ) {
                if (line.contains("https")) {

                    int start = line.indexOf("https");

                    System.out.println(line);
                    String link = line.substring(start);
                    int end = link.indexOf(("\""));
                    System.out.println("chop start " + link);
                    System.out.println("link: " + line.substring(0, end));
                }
                if (line.contains("https")) {
                    int start = line.indexOf("https");
                    System.out.println(line);
                    String link = line.substring(start);
                    int end2 = link.indexOf(("\'"));
                    System.out.println("chop start " + link);
                    System.out.println("link: " + line.substring(0, end2));
                }
                if (line.contains("https")) {
                    int start = line.indexOf("https");
                    System.out.println(line);
                    String link = line.substring(start);
                    int end3 = link.indexOf((" "));
                    System.out.println("chop start "+ link);
                    System.out.println("link: "+ line.substring(0, end3));
                }

            }
            reader.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }

    }

}
