import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> map;
    public IOU() {
        this.map = new HashMap<>();
    }
    public void setSum(String toWhom, double amount) {
        map.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom) {
        return map.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
mattsIOU.setSum("Arthur", 51.5);
mattsIOU.setSum("Michael", 30);

System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}