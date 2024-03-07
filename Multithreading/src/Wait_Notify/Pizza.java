package Wait_Notify;

public class Pizza {
    int noOfPizza;


    public Pizza(int noOfPizza) {
        System.out.println(noOfPizza+" Pizzas available");
        this.noOfPizza = noOfPizza;
    }

    public int checkPizza(){
        return this.noOfPizza;
    }

    public synchronized void orderPizza(int noOfPizza)  {
        System.out.println("Ordering "+noOfPizza+" Pizza");

        if(noOfPizza > checkPizza()) {
            try {
                System.out.println(noOfPizza + " Pizzas not available " + " Please wait");
                this.wait();


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.noOfPizza -= noOfPizza;
        System.out.println("Successfully delivered "+noOfPizza+" pizzas");
        System.out.println(checkPizza()+" pizzas available");
    }

    public synchronized void bakePizza(int noOfPizza){
        this.noOfPizza += noOfPizza;
        System.out.println("Baking "+noOfPizza+" pizzas");
        System.out.println(checkPizza()+" pizzas available");
        this.notify();
    }
}
