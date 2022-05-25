package RegExClasses;

import java.util.regex.*;

public class RegExClasses {
    public static void main(String[] args) {
        String regex_test;
        System.out.println("1) Começa com aa: ");
        System.out.println(Pattern.matches("a[a]+", "aa")); // true
        System.out.println(Pattern.matches("a[a]+", "aba"));// false

        System.out.println("2) Não começa com aa: ");
        System.out.println(Pattern.matches("a[b]+", "ab")); // true
        System.out.println(Pattern.matches("a[b]+", "aab")); // false

        System.out.println("3) Terminam com bbb: ");
        System.out.println(Pattern.matches("a[b]+", "abbb")); // true
        System.out.println(Pattern.matches("a[b]+", "bbab")); // false

        System.out.println("4) Não terminam com bbb: ");
        regex_test = "[a-z][b]+a";
        System.out.println(Pattern.matches(regex_test, "ab")); // true
        System.out.println(Pattern.matches(regex_test, "aba")); // false

        System.out.println("5) Contém a subcadeia aabbb: ");
        regex_test = "[a]+[b]+";
        System.out.println(Pattern.matches(regex_test, "aabbb")); // true
        System.out.println(Pattern.matches(regex_test, "aaba")); // false

        System.out.println("6) Possuem comprimento maior ou igual a 3 ");
        regex_test = "[a-z]{3,}";
        System.out.println(Pattern.matches(regex_test, "aabbb")); // true
        System.out.println(Pattern.matches(regex_test, "aab")); // true
        System.out.println(Pattern.matches(regex_test, "aa")); // false

        System.out.println("7) Possuem comprimento menor ou igual a 3 ");
        regex_test = "[a-z]{1,3}";
        System.out.println(Pattern.matches(regex_test, "aaa")); // true
        System.out.println(Pattern.matches(regex_test, "aa")); // true
        System.out.println(Pattern.matches(regex_test, "aaba")); // false

        System.out.println("8) Possuem comprimento diferente de 3 ");
        regex_test = "[13579]";
        System.out.println(Pattern.matches(regex_test, "aabbb")); // true
        System.out.println(Pattern.matches(regex_test, "ab")); // true
        System.out.println(Pattern.matches(regex_test, "aab")); // false
    }
}
