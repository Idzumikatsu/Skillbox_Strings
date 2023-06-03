package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {

        StringBuilder sb = new StringBuilder();

        int start = 0;
        int end = text.indexOf(" ");
        int count = 0;
        String s;
        String template = "(%d) ";

        while (end > 0) {
            s = text.substring(start, end);

            if (count != 0) {
                template = " (%d) ";
            }

            sb.append(template.formatted(++count)).append(s);
            start = end + 1;
            int temp = start;
            end = text.indexOf(" ", start);

            if (end == -1) {
                template = " (%d) ";
                s = text.substring(temp);
                sb.append(template.formatted(++count))
                        .append(s);
                break;
            }
        }

        if (text.equals("")) {
            return "";
        }

        if (!text.contains(" ")) {
            return template.formatted(++count)
                    .concat(text);
        }

        return sb.toString();
    }
}
