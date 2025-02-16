package regexproblems.extractionproblem.extractlinks;

public class Main {
    public static void main(String[] args) {
        String text="Visit https://www.google.com and http://example.org for more info.";

        Links li = new Links();
        li.extract(text);
    }
}
