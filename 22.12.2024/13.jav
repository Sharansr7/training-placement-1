 import java.util.Scanner;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

         Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            while (m.find()) {
                input = input.replaceAll("\\b" + Pattern.quote(m.group()) + "\\b", m.group(1));
            }

            System.out.println(input);
        }

        in.close();
    }
}