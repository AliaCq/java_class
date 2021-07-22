import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class 请求 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 80);

        String requestText = "GET /hello.html HTTP/1.0\r\n" +
                "Host: 127.0.0.1\r\n" +
                "Connection: close\r\n" +
                "\r\n";

        OutputStream os = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.printf(requestText);
        printWriter.flush();

        InputStream is = socket.getInputStream();
        Scanner scanner = new Scanner(is, "UTF-8");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        socket.close();
    }
}
