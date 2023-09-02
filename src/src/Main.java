import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public  static void main(String args[]){
        System.out.print("Welcome to Pizza Hub \n ");
        System.out.print("Do you want to our Pizza .\n if Yes then press 1 or press 0 for No \n ");
        Scanner sc=new Scanner(System.in);
        int Option=sc.nextInt();
        if(Option == 0){
            System.out.println("Thanks for Visiting us. Please Come Again");
        }
        else{
            System.out.println("How Many Pizza you want to order");
            int NumberPizza=sc.nextInt();
            ArrayList<Pizza> PizzaOrder=new ArrayList<>();
            for(int i=0; i<NumberPizza; i++) {
                System.out.println("Are Looking for a Non-veg Pizza ?  if Yes, press 1 or press 0 for veg");
                int isVeg = sc.nextInt();
                Boolean Veg = false;
                if (isVeg == 0) {
                    Veg = true;
                }
                System.out.println("What size you prefered ? press \n 0: Small \n 1: Medium \n 2: Large");
                int size = sc.nextInt();
                Pizza pizza = new Pizza(Veg, size);
                System.out.println("Do you want to Add ExtraTopings? yes: 1 or No:0");
                int extraToppings = sc.nextInt();
                if (extraToppings == 1) {
                    pizza.addExtraTopings();
                }
                System.out.println("Do you want to Add ExtraCheese? yes: 1 or No:0");
                int extraCheese = sc.nextInt();
                if (extraCheese == 1) {
                    pizza.addExtraCheese();
                }
                System.out.println("Do you want a TakeAway Bag? yes: 1 or No:0");
                int Bag = sc.nextInt();
                if (Bag == 1) {
                    pizza.addTakeAway();
                }

                PizzaOrder.add(pizza);
                String TotalBill="";
                int Total=0;
                for (int j = 0; j< NumberPizza; j++) {
                     Pizza  localPizza=PizzaOrder.get(i);
                     TotalBill+= localPizza.getBill();
                     Total+=localPizza.getTotal();
                }

                TotalBill+=" Your Grand Total for your order is "+ Total+" /-"+"\n";
                System.out.println(TotalBill);

            }
        }
    }
}