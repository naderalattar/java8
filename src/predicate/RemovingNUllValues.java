package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemovingNUllValues {
    public static void main(String[] args) {

        Predicate<String> isValid=s->s!=""&& s!=null;
        List<String> names=new ArrayList<>();
        names.add("");
        names.add("nader");
        names.add("gomaa");
        names.add(null);
        List<String> validNames=new ArrayList<>();
        System.out.println(names);
        for (String s: names){
            if(isValid.test(s))
               validNames.add(s);
        }

        names=validNames;
        System.out.println(names);

    }
}
