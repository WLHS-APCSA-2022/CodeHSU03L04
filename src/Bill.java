class Bill
{
    private double costOfMeal;
    private int totalCustomers;

    // Constructor
    public Bill(double totalBill, int numCustomers)
    {
        costOfMeal = totalBill;
        totalCustomers = numCustomers;
    }

    // Add a tip based on the number of guests
    //if the total number of customers is over 8, 25% extra
    //if the total number of customers is 4 or more but less than 8, 20% extra
    //less than 4 but 2 or more, 5% extra
    //less than 2, nothing extra
    public void addTip()
    {
        if(totalCustomers >= 8){
            costOfMeal *= 1.25;
        }
        else if(totalCustomers >= 4){
            costOfMeal *= 1.2;
        }
    }


    public String toString()
    {
        // Round the bill to two decimal places
        double roundedBill = Math.round(costOfMeal * 100.0) / 100.0;

        return "Bill for " + totalCustomers + " comes to $" + roundedBill;
    }


}
