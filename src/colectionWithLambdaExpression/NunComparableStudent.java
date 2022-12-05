package colectionWithLambdaExpression;

public class NunComparableStudent {
    int id;

    public NunComparableStudent(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }


}
