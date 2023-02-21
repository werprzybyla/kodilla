import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Ala ma kota", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Kot ma Ale", text -> text.toUpperCase());
        poemBeautifier.beautify("Deser!", text -> text + " " + text + " " + text);
        poemBeautifier.beautify("NAJPIERW OBIAD!", text -> text.toLowerCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
