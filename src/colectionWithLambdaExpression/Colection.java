package colectionWithLambdaExpression;

import java.util.*;

public class Colection {
    public static void main(String[] args) {

        ComparableStudent comparableStudent1 =new ComparableStudent(244);
        ComparableStudent comparableStudent2 =new ComparableStudent(100);
        ComparableStudent comparableStudent3 =new ComparableStudent(50);
        ComparableStudent comparableStudent4 =new ComparableStudent(22);
        ComparableStudent comparableStudent5 =new ComparableStudent(33);
        ComparableStudent comparableStudent6 =new ComparableStudent(1);

        List<ComparableStudent> comparableStudents =new ArrayList<>();
        comparableStudents.add(comparableStudent1);
        comparableStudents.add(comparableStudent2);
        comparableStudents.add(comparableStudent3);
        comparableStudents.add(comparableStudent4);
        comparableStudents.add(comparableStudent5);
        comparableStudents.add(comparableStudent6);
        Collections.sort(comparableStudents);
        System.out.println(comparableStudents);

        NunComparableStudent nunComparableStudent1=new NunComparableStudent(67);
        NunComparableStudent nunComparableStudent2=new NunComparableStudent(33);
        NunComparableStudent nunComparableStudent3=new NunComparableStudent(100);
        NunComparableStudent nunComparableStudent4=new NunComparableStudent(20);
        NunComparableStudent nunComparableStudent5=new NunComparableStudent(200);

        ArrayList<NunComparableStudent> nunComparableStudents=new ArrayList<>();
        nunComparableStudents.add(nunComparableStudent1);
        nunComparableStudents.add(nunComparableStudent2);
        nunComparableStudents.add(nunComparableStudent3);
        nunComparableStudents.add(nunComparableStudent4);
        nunComparableStudents.add(nunComparableStudent5);

        Collections.sort(nunComparableStudents,( s1, s2)-> (s1.id>s2.id)?-1:(s1.id<s2.id)?1:0);
        System.out.println(nunComparableStudents);




        //        List<Integer> list=new ArrayList<>();
//        list.add(66);
//        list.add(45);
//        list.add(22);
//        list.add(88);
//        list.add(2);
//        Collections.sort(list,(a,b)->{
//            if(a>b)
//                return -1;
//            else if(a<b)
//                return 1;
//            else
//                return 0;
//        });
//        System.out.println(list);

        TreeSet<Integer> integers=new TreeSet<>();
       






    }
}
