package about_streams;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        String src = "E:\\java代码\\191129-IO\\测试目录\\测试文件.txt";
        String dest = "E:\\java代码\\191129-IO\\测试目录\\目标文件.txt";

        InputStream is = new FileInputStream(src);
        OutputStream os = new FileOutputStream(dest);
        int b;
        while ((b = is.read()) != -1) {
            os.write(b);
        }
    }
}
