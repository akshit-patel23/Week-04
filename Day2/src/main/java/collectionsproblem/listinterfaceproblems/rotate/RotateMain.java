package collectionsproblem.listinterfaceproblems.rotate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static collectionsproblem.listinterfaceproblems.rotate.Rotate.rotate;

public class RotateMain {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8));
        int rotate;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Rotation number :- ");
        rotate=sc.nextInt();
        List<Integer> ans=rotate(list,rotate);
        System.out.println(ans);
    }
}