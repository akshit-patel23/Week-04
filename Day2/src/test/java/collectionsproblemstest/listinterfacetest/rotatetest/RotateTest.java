package collectionsproblemstest.listinterfacetest.rotatetest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static collectionsproblem.listinterfaceproblems.rotate.Rotate.rotate;

public class RotateTest {
    @Test
    public void Tester(){
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8));
        int rotate=3;
        List<Integer> ans=rotate(list,rotate);
        List<Integer> result=new ArrayList<>(Arrays.asList(6,7,8,2,3,4,5));
        Assert.assertEquals(result,ans);
    }
}