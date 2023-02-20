package ObserverPattern;

public class Chart implements Observer{
    private DataSource datasource;

    public Chart(DataSource datasource) {
        this.datasource = datasource;
    }

    @Override
    public void update() {
        System.out.println("Chart got Updated: ");
    }
}
