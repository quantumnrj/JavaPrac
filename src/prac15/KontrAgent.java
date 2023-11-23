package prac15;

public class KontrAgent<T> {
    private String name;
    private T agent_number;
    private double valute;
    private double reit;
    public KontrAgent() {}
    public String getName() {return name;}
    public T getAgent_number() {return agent_number;}
    public double getReit() {return reit;}
    public double getValute() {return valute;}
    protected void setName(String name) {this.name = name;}
    protected void setAgent_number(T agent_number) {this.agent_number = agent_number;}
    protected void setReit(double reit) {this.reit = reit;}
    protected void setValute(double valute) {this.valute = valute;}
}
