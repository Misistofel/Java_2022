package compositionAggregation.myExampleas;

public class MarinaComposition {
    private Money money;

    public MarinaComposition() {
        this.money = new Money();//тут більш тісний звєязо!
    }
}
