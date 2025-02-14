import java.util.Set;
import java.util.TreeSet;

import static collectionsproblem.setinterfaceproblems.setintosortedlist.SortedListFunction.insert;

public class SetIntoSortedTest {
    @Test
    public void Tester(){
        Set<Integer> s1=new HashSet<>();
        s1.add(11);
        s1.add(3);
        s1.add(2);
        s1.add(4);
        TreeSet<Integer> ans=insert(s1);
        Set<Integer> s2=new HashSet<>(Arrays.asList(2,3,4,11));
        Assert.assertEquals(s2,ans);

    }
}
