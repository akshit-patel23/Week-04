package annotation.exerciseproblems.override;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog bark!");
    }
}
