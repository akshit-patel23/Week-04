package regexproblems.replaceandmodify.replacemultiplespace;

public class Main {
    public static void main(String[] args) {
        String text="This is an      example with multiple spaces.";
        Spaces sp= new Spaces();
        sp.replace(text);
    }
}
