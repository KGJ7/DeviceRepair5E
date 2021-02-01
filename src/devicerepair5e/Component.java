package devicerepair5e;
public class Component {
    private String componentName;
    private double componentCost;

    public Component(String name, double cost) {
        this.componentName = componentName;
        this.componentCost = componentCost;
    }


    public String getName() {
        return componentName;
    }

    public double getCost() {
        return componentCost;
    }

    public void setName(String name) {
        this.componentName = componentName;
    }

    public void setCost(double cost) {
        this.componentCost = componentCost;
    }

}
