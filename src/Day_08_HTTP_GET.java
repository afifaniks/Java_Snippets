import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 8/5/20
 * Web: https://afifaniks.me
 */
public class Day_08_HTTP_GET {
    public static String readURL(String url_) throws IOException {
        URL url = new URL(url_);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");

        String responseData = "";
        int response = httpURLConnection.getResponseCode();

        System.out.println("Reponse Code: " + response);

        if (response == HttpURLConnection.HTTP_OK) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                responseData += line;
                responseData += '\n';
            }
        } else {
            System.out.println("Connection Error");
        }

        return responseData;
    }

    public static void main(String[] args) throws IOException {
        String resp = readURL("https://afifaniks.me");
        System.out.println(resp);
    }
}
