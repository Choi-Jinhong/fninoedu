package Day_0604;

import java.io.*;

public class FileIOReader_08 {
    public static void main(String[] args) {
        String filepath = "c:\\fninoedu\\java\\src\\Day_0601\\CardTest_01.java";

        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(filepath);
            System.out.println("파일 체크");
            br = new BufferedReader(fr);
            int cnt = 1;
            while (true){
//              파일에서 한줄씩 read
                String line = br.readLine();

//              문서의 끝으로 가게 되면 null 반환
                if(line == null)
                    break;

                System.out.println(cnt+ " " + line);
                cnt++;
            }
        } catch (IOException e) {
            System.out.println("파일을 찾을 수 없습니다." + e.getMessage());
        }finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
