package Day_0604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest_07 {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = null;
        InputStreamReader ir = null;

        ir = new InputStreamReader(System.in);
        br = new BufferedReader(ir);
        String str = "";

        System.out.println("문자열을 입력하시오.");
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                ir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
