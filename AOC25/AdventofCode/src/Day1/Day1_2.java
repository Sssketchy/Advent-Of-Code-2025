package Day1;

import java.io.File;
import java.util.Scanner;

public class Day1_2 {
    public static void main(String[] args) {
        File file = new File("D:\\D Folders\\Programs\\Java\\AOC25\\AdventofCode\\src\\Day1\\input.txt");
        int x = 50;
        int ans = 0;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                int length = line.length();
                String s = line.substring(1, length);
                int n = Integer.parseInt(s);

                if (line.charAt(0) == 'R') {
                    int cnt = (x + n) / 100;
                    ans += cnt;
                    x = (x + n) % 100;
                    if (x < 0) x += 100;
                } else {
                    if (x == 0) {
                        int New = Math.abs(x - n) / 100;
                        ans += New;
                        x = (x - n) % 100;
                        if (x < 0) x += 100;
                    } else {
                        if (x - n <= 0) {
                            ans++;
                            int New = Math.abs(x - n) / 100;
                            ans += New;
                            x = (x - n) % 100;
                            if (x < 0) x += 100;
                        } else {
                            x = x - n;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(ans);
    }
}
