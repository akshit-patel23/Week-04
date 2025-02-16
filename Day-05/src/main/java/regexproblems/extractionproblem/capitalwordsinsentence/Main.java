package regexproblems.extractionproblem.capitalwordsinsentence;

public class Main {
    public static void main(String[] args) {


        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        CapitalWord cw= new CapitalWord();
        cw.capital(text);

    }
}
