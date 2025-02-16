package regexproblems.replaceandmodify.censorbadwords;

public class BadWords {

    String [] Badwordarr={"damn","stupid","shit","fuck","jerk","bitch"};
    public void Censor(String text){
        for (String word:Badwordarr){
            String regex="\\b"+word;
            text= text.replaceAll("(?i)"+regex,"****");
        }
        System.out.println(text);
    }
}
