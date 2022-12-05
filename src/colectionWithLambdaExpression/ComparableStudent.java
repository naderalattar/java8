package colectionWithLambdaExpression;

public class ComparableStudent implements Comparable {
    int id;

    public ComparableStudent(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        ComparableStudent s=(ComparableStudent) o;
        if(this.id>s.id)
            return -1;
        else if(this.id<s.id)
            return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
