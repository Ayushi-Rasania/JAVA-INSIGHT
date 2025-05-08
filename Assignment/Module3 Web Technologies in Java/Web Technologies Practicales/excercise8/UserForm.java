import java.io.*;
import java.util.*;

public class UserForm {
    public static void main(String[] args) throws IOException {
        System.out.println("Content-Type: text/html\n");

        String query = System.getenv("QUERY_STRING");
        Map<String, String> params = new HashMap<>();

        if (query != null) {
            for (String pair : query.split("&")) {
                String[] parts = pair.split("=");
                if (parts.length == 2) {
                    params.put(parts[0], java.net.URLDecoder.decode(parts[1], "UTF-8"));
                }
            }
        }

        System.out.println("<html><body>");
        System.out.println("<h2>Form Result</h2>");
        System.out.println("Name: " + params.get("username") + "<br>");
        System.out.println("Email: " + params.get("email") + "<br>");
        System.out.println("</body></html>");
    }
}

