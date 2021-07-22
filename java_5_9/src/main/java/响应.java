import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class 响应 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        while (true) {
            Socket socket = serverSocket.accept();

            OutputStream os = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);

            printWriter.printf("HTTP/1.0 200 OK\r\n");
            printWriter.printf("Content-Type: text/plain; charset=utf-8\r\n");
            printWriter.printf("\r\n");
            printWriter.printf("<h1>你好中国</h1>");
            printWriter.flush();

            socket.close();
        }
    }
}
