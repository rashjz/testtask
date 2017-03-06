

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InputReader {

    public static void main(String[] args) {
        Scanner sc2 = null;
        List<Result> results = new ArrayList<>();
        try {
            InputStream is = InputReader.class.getResourceAsStream("input.txt");
            sc2 = new Scanner(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
            while (s2.hasNext()) {
                results.add(checkForVowels(s2.next().trim()));
            }
        }

        //write readed lines to file
        WriteToFile.writeToOutputFile(results);
    }

    public static Result checkForVowels(String str) {
        double average;
        List<Character> arrayList = new ArrayList<>();
        findVowelsAndMakeArray(arrayList, str);
        if (arrayList.size() > 0) {
            average = ((double) str.length()) / arrayList.size();
        } else {
            average = 0;
        }
        Result result = new Result(average, arrayList, str.length());
        return result;
    }

    public static void findVowelsAndMakeArray(List<Character> arrayList, String str) {
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {

                arrayList.add(ch);
            }
        }
    }
}
