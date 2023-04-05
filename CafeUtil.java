import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum = i + sum;
        }
        return sum;

    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i = 0; i < prices.length; i++){
            total = prices[i] + total;
        }
        return total;

    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println("Index of: " + i + ", "+ "Menu: " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: " );
        String userName = System.console().readLine();
        String greetingMessage = String.format("Hello, %s !", userName);
        System.out.println(greetingMessage);

        int customerOrders = customers.size();
        String waitList = String.format("There are %d people in front of you", customerOrders);
        System.out.println(waitList);


        customers.add(userName);

        System.out.println(customers);

    }
}

