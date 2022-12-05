package functionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterface2 {
    public static void main(String[] args) {
        Function<List<Student>,Boolean> populate=l->{
            l.add(new Student("nader",2000));
            l.add(new Student("mohamed",2500));
            l.add(new Student("ahmed",3000));
            l.add(new Student("elsayed",3500));
            l.add(new Student("salama",4000));
            return true;
        };
        Predicate<Student> salaryCheck=s->s.salary<3500;
        Function<Student,String> incrementSalary=s->{
            if(salaryCheck.test(s))
                s.salary+=300;
            return s.name+" : "+String.valueOf(s.salary);
        }


        ;
        List<Student> students=new ArrayList<>();
        populate.apply(students);
        for (Student s:students){
            String msg=incrementSalary.apply(s);
            System.out.println(msg);
        }
        System.out.println(students);

    }
}
class Student{
    String name;
    double salary;

    public Student(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
