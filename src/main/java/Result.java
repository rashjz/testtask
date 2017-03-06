import java.util.ArrayList;
import java.util.List;

public class Result {

    private double average;
    private List<Character> arrayList;
    private int length;

    public Result() {
        average = 0;
        arrayList = new ArrayList<Character>();
        length = 0;
    }

    public Result(double average, List<Character> arrayList, int length) {
        this.average = average;
        this.arrayList = arrayList;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public List<Character> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<Character> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public String toString() {
        return "(" + arrayList.toString() + " " + " ," + length + ") -> " + average;
    }
}
