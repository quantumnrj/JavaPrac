package prac15;

public class AgentView<T> extends KontrAgent<T> {
    public void printAgentData() {
        System.out.println("KontrAgent:");
        System.out.println("Name: " + getName());
        System.out.println("Id: " + getAgent_number());
        System.out.println("Reit: " + getReit());
        System.out.println("Valute: " + getValute());
    }
}
