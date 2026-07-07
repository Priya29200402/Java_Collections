package in.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.List;

public class Country {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Japan");
        countries.add("Brazil");
        countries.add("Egypt");
        countries.add("Sweden");
        countries.add("Canada");
        countries.add("Nigeria");
        countries.add("Vietnam");
        countries.add("Poland");
        countries.add("Mexico");
        countries.add("Russia");
        countries.add("South Africa");
        countries.add("Thailand");
        countries.add("Turkey");
        countries.add("Germany");
        countries.add("Peru");
        countries.add("Greece");
        countries.add("Pakistan");
        countries.add("Malaysia");
        countries.add("Chile");
        countries.add("Netherlands");
        countries.add("Bangladesh");
        countries.add("Kenya");
        countries.add("Ukraine");
        countries.add("Argentina");
        countries.add("Morocco");
        countries.add("Colombia");
        countries.add("Hungary");
        countries.add("Austria");
        countries.add("Sri Lanka");
        countries.add("New Zealand");
        countries.add("Philippines");
        countries.add("Belgium");
        countries.add("Norway");
        countries.add("Czech Republic");
        countries.add("Romania");
        countries.add("Indonesia");
        countries.add("Israel");
        countries.add("Chile");
        countries.add("Kazakhstan");
        countries.add("Lebanon");
        countries.add("Ghana");
        countries.add("Singapore");
        countries.add("Portugal");
        countries.add("Ethiopia");
        countries.add("Denmark");
        countries.add("Malaysia");
        countries.add("Jordan");
        countries.add("Uganda");
        countries.add("Ecuador");
        countries.add("Angola");
        countries.add("Tanzania");
        countries.add("Myanmar");
        countries.add("Nepal");
        countries.add("Iceland");
        countries.add("Tunisia");
        countries.add("Bosnia and Herzegovina");
        countries.add("Latvia");
        countries.add("Croatia");
        countries.add("Zimbabwe");
        countries.add("Zambia");
        countries.add("Ireland");
        countries.add("Bahrain");
        countries.add("Cameroon");
        countries.add("Venezuela");
        countries.add("Dominican Republic");
        countries.add("Serbia");
        countries.add("Guatemala");
        countries.add("Mauritius");
        countries.add("Oman");
        countries.add("Kuwait");
        countries.add("Panama");
        countries.add("Qatar");
        countries.add("Luxembourg");
        countries.add("Jamaica");
        countries.add("Cyprus");
        countries.add("Bulgaria");
        countries.add("Madagascar");
        countries.add("Tajikistan");
        countries.add("Libya");
        countries.add("Kyrgyzstan");
        countries.add("Côte d'Ivoire");
        countries.add("Trinidad and Tobago");
        countries.add("Sudan");
        countries.add("Botswana");
        countries.add("Namibia");
        countries.add("Mali");
        countries.add("Montenegro");
        countries.add("Benin");
        countries.add("Senegal");
        countries.add("Brunei");
        countries.add("Liechtenstein");
        countries.add("Samoa");
        countries.add("Fiji");
        countries.add("Bahamas");
        countries.add("Belize");
        countries.add("Sierra Leone");

        System.out.println("=============Filtering countries with starts with 'I' ================");
        countries.stream()
                .filter(country -> country.startsWith("I"))
                .forEach(country -> System.out.println(country));

        System.out.println("=============Filtering countries with ends with 'a'================");
        countries.stream()
                .filter(country ->country.endsWith("a"))
                .forEach(country-> System.out.println(country));

        System.out.println("============Filtering countries with length>10 =================");
        countries.stream()
                .filter(country->country.length()>10)
                .forEach(country-> System.out.println(country));

        System.out.println("============Filtering countries with length<=5=================");
        countries.stream()
                .filter(country->country.length()<=5)
                .forEach(country-> System.out.println(country));

        System.out.println("============Printing all countries=================");
        for (String country : countries) {
                System.out.println(country);
        }

        System.out.println("=============Filtering countries with two or more words=================");
        countries.stream()
                .filter(country -> country.trim().split("\\s+").length >= 2)
                .forEach(country -> System.out.println(country));
        
    }
}
