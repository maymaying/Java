package about_streams;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        File file = new File("测试目录\\测试文件.txt");
//        OutputStream os = new FileOutputStream(file);
//        os.write("我是中国人".getBytes("GB18030"));
        InputStream is = new FileInputStream(file);
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        System.out.println(len);
        //System.out.println(Arrays.toString(buf));
        String s = new String(buf, 0, len, "UTF-8");
        System.out.println(s);
        */
        /*
        System.out.println(is.available());// 估算值，平时不要用
        int b;
        // 正确的方式
        while ((b = is.read()) != -1) {
            System.out.println(b);
        }
        */

        /*
        String s = "我是中国人";
        byte[] buf = s.getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(buf);
        int b;
        while ((b = is.read()) != -1) {
            System.out.printf("\\x%x", b);
        }
        System.out.println();
        */
    }
}
