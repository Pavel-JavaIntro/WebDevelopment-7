package by.pavka.module7;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    for (int i = 0; i < 4; i++) {
      String country = "";
      String language = "";
      switch (i) {
        case 0:
          country = "US";
          language = "en";
          break;
        case 1:
          country = "RU";
          language = "ru";
          break;
        case 2:
          country = "BY";
          language = "be";
          break;
        default:
          country = "CH";
          language = "fr";
          break;
      }
      Locale current = new Locale(language, country);
      System.out.println(current.getDisplayCountry());
      ResourceBundle resourceBundle = ResourceBundle.getBundle("datares.text", current);
      String question = resourceBundle.getString("question");
      System.out.println(question);
      String answer = resourceBundle.getString("answer");
      System.out.println(answer + '\n');
    }
  }
}
