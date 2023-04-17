import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine
{
    private int amount = 0;
    private int cost = 0;
    
    public int getAmount() 
    {
        return amount;
    }

    List<Cofe> cofeList= new ArrayList<>();

    public List<Cofe> getCofeList() 
    {
        return cofeList;
    }

    public CoffeeMachine addCofe (Cofe cofe)
    {
        cofeList.add(cofe);
        return this;
    }
    
    public Cofe findCofe(String string)
    {
        for (int i = 0; i < getCofeList().size(); i++) {
            if (getCofeList().get(i).getName().equals(string)){
                return getCofeList().get(i);
            }
        }
        return null;
    }

    public Cofe sellCofe(Cofe cofe)
    {
        try{
            Cofe cofeFind = findCofe(cofe.getName());
            //getCofeList().remove(cofeFind);
            amount += cofeFind.getCost();
            return cofeFind;

        } catch(Exception ex) {
            throw new RuntimeException("Product not found");

        }   
    }

    public Cofe priceTo(Cofe cofe)
    {
        Cofe price = findCofe(cofe.getName());
        //getCofeList().remove(cofeFind);
        cost = price.getCost();
        return price;
    }

    public int getPrice() 
    {
        return cost;
    }
}
