package regexproblems.replaceandmodify.replacemultiplespace;

public class Spaces{
    public static void replace(String text){
        String regex="\\s";
        String replacedText = text.replaceAll("\\s+", " ");
        System.out.println(replacedText);
    }


}
