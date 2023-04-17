//наименование, объем, температура, цена

public class Cofe 
{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private Integer temperature;

    public Integer getTemperature() {
        return temperature;
    }
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
    private Integer cost;

    public Integer getCost() {
        return cost;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return String.format("Кофе %S, температура %d градусов стоимостью %d рублей", name,  temperature, cost);
        
    }
    
    public Cofe (String name, Integer temperature, Integer cost)
    {
        this.name = name;
        this.temperature = temperature;
        this.cost = cost;
    }
    

}
