import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int distancia (int x, int y) {
        if (x < 0 && y <0) {

        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new OutputStreamWriter(System.out)));

        String  s = br.readLine();
        if (s == null || s.isEmpty()) {out.flush(); return;}
        int T = Integer.parseInt(s.trim());
        for (int i = 0; i < T; i++) {
            String line;
            while ((line = br.readLine()) != null && line.trim().isEmpty()) {
                StringTokenizer st = new StringTokenizer(line);
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int C = Integer.parseInt(st.nextToken());
            }
        }






    }
}