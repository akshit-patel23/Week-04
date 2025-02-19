package annotation.exerciseproblems.deprecated;

public class LegacyAPI {
    @Deprecated
    public void  oldFeature(){
        System.out.println("Old one");
    }
    public void  newFeature(){
        System.out.println("New One");
    }
}
