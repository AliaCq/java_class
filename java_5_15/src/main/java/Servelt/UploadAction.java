package Servelt;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
@MultipartConfig
@WebServlet("/upload.action")
public class UploadAction extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part upload = req.getPart("upload");
        InputStream inputStream = upload.getInputStream();
        String path = "F:\\java_5_15\\uploads";  //存放上传上来文件的路径
        String submittedFileName = upload.getSubmittedFileName();
        String filename = path + "\\" + submittedFileName;
        byte[] buffer = new byte[1024];
        int len;
        try (OutputStream os = new FileOutputStream(filename)) {
            while (true) {
                len = inputStream.read(buffer);
                if (len == -1) {
                    break;
                }
                os.write(buffer, 0, len);
            }
            os.flush();
        }
    }
}
