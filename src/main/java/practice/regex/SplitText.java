package practice.regex;

public class SplitText {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    return text.replaceAll("[;,.:0-9]","")
               .replaceAll(" +", System.lineSeparator());
  }

}