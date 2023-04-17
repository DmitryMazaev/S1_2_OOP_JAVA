import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addCofe(new Cofe("Американо", 100, 120))
                    .addCofe(new Cofe("Капучино", 95, 110))
                    .addCofe(new Cofe("Латте", 90, 130))
                    .addCofe(new Cofe("Эспрессо", 100, 140));

        Scanner in = new Scanner(System.in);
        while (true)
        {
            //Scanner in = new Scanner(System.in);
            System.out.println("Вас приветствует кофейный автомат! Выберите напиток, нажав соответствующую цифру: ");
            System.out.println("1 - Американо, 2 - Капучино, 3 - Латте, 4 - Эспрессо");

            int n = in.nextInt();
            
            int money = 0;
        
            if (n == 1)
            {
                Cofe found = coffeeMachine.findCofe("Американо");
                System.out.println("Вы выбрали " + found);
                Cofe price = coffeeMachine.priceTo(found);
                System.out.print("Внесите " + coffeeMachine.getPrice() + " рублей: ");
                int cash = in.nextInt();
                money += cash;
                int more = coffeeMachine.getPrice() - money;
                while (money < coffeeMachine.getPrice())
                {
                    System.out.printf("Внесите еще %d рублей: ", more);
                    cash = in.nextInt();
                    money += cash;
                    more = coffeeMachine.getPrice() - money;
                }
                int change = money - coffeeMachine.getPrice();
                System.out.println("Деньги внесены, получите напиток: ");
                Cofe sold = coffeeMachine.sellCofe(found);
                System.out.println(sold);
                System.out.printf("Получите сдачу %d рублей", change);
                System.out.println();
                System.out.println("*********************************");
                System.out.print("Денег в автомате: ");
                System.out.println(coffeeMachine.getAmount());
                System.out.println("*********************************");

            }

            else if (n == 2)
            {
                Cofe found = coffeeMachine.findCofe("Капучино");
                System.out.println("Вы выбрали " + found);
                Cofe price = coffeeMachine.priceTo(found);
                System.out.print("Внесите " + coffeeMachine.getPrice() + " рублей: ");
                int cash = in.nextInt();
                money += cash;
                int more = coffeeMachine.getPrice() - money;
                while (money < coffeeMachine.getPrice())
                {
                    System.out.printf("Внесите еще %d рублей: ", more);
                    cash = in.nextInt();
                    money += cash;
                    more = coffeeMachine.getPrice() - money;
                }
                int change = money - coffeeMachine.getPrice();
                System.out.println("Деньги внесены, получите напиток: ");
                Cofe sold = coffeeMachine.sellCofe(found);
                System.out.println(sold);
                System.out.printf("Получите сдачу %d рублей", change);
                System.out.println();
                System.out.print("Денег в автомате: ");
                System.out.println(coffeeMachine.getAmount());

            }

            else if (n == 3)
            {
                Cofe found = coffeeMachine.findCofe("Латте");
                System.out.println("Вы выбрали " + found);
                Cofe price = coffeeMachine.priceTo(found);
                System.out.print("Внесите " + coffeeMachine.getPrice() + " рублей: ");
                int cash = in.nextInt();
                money += cash;
                int more = coffeeMachine.getPrice() - money;
                while (money < coffeeMachine.getPrice())
                {
                    System.out.printf("Внесите еще %d рублей :", more);
                    cash = in.nextInt();
                    money += cash;
                    more = coffeeMachine.getPrice() - money;
                }
                int change = money - coffeeMachine.getPrice();
                System.out.println("Деньги внесены, получите напиток: ");
                Cofe sold = coffeeMachine.sellCofe(found);
                System.out.println(sold);
                System.out.printf("Получите сдачу %d рублей ", change);
                System.out.println();
                System.out.print("Денег в автомате: ");
                System.out.println(coffeeMachine.getAmount());

            }

            else if (n == 4)
            {
                Cofe found = coffeeMachine.findCofe("Эспрессо");
                System.out.println("Вы выбрали " + found);
                Cofe price = coffeeMachine.priceTo(found);
                System.out.print("Внесите " + coffeeMachine.getPrice() + " рублей: ");
                int cash = in.nextInt();
                money += cash;
                int more = coffeeMachine.getPrice() - money;
                while (money < coffeeMachine.getPrice())
                {
                    System.out.printf("Внесите еще %d рублей: ", more);
                    cash = in.nextInt();
                    money += cash;
                    more = coffeeMachine.getPrice() - money;
                }
                int change = money - coffeeMachine.getPrice();
                System.out.println("Деньги внесены, получите напиток: ");
                Cofe sold = coffeeMachine.sellCofe(found);
                System.out.println(sold);
                System.out.printf("Получите сдачу %d рублей", change);
                System.out.println();
                System.out.print("Денег в автомате: ");
                System.out.println(coffeeMachine.getAmount());

            }
            //for (Cofe text : coffeeMachine.getCofeList()) 
            //{
            //   System.out.println(text);
            //} 
            //in.close();
        }
    }

}