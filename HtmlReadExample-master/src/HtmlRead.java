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
                    String link = line.substring(start);

                    int end = link.indexOf(("\""));
                    if (end==-1){
                        end = link.indexOf("'");
                    }
                    if( end==-1){
                        end = link.indexOf("--");
                    }
                    System.out.println(start+ "," + end);
                    System.out.println(line.substring(start, start+end));
                }


            }
            reader.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }

    }

}
