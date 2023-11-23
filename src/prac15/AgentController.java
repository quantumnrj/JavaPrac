package prac15;

public class AgentController<T> {
    private KontrAgent<T> agent;
    private AgentView<T> view;
    public AgentController(KontrAgent<T> ag, AgentView<T> v) {agent = ag; view = v;}
    public void setAgentName(String name) {agent.setName(name);}
    public void setAgentReit(double reit) {agent.setReit(reit);}
    public void setAgentValute(double valute) {agent.setValute(valute);}
    public void setAgentNumber(T Id) {agent.setAgent_number(Id);}
    public double getAgentReit() {return agent.getReit();}
    public double getAgentValute() {return agent.getValute();}
    public T getAgentNumber() {return agent.getAgent_number();}
    public String getAgentName() {return agent.getName();}
    public void updateView() {
        view.setName(getAgentName());
        view.setAgent_number(getAgentNumber());
        view.setValute(getAgentValute());
        view.setReit(getAgentReit());
    }
}
