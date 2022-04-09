package compositionAggregation.myExampleas;
//Aggregation
public class Marina {
    Money money;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marina(Money money) {
        this.money = money;
    }
}
