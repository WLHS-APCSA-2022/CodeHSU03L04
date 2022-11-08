import static org.junit.Assert.*;

import org.junit.Test;
public class BillTester
{
    public static void main(String[] args)
    {
        double cost = 125.45;
        //int numPeople = 10;
        // Create a bill for a birthday dinner for 10 people
        Bill birthdayDinner = new Bill(cost,10);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);

        // Add the tip
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);



        System.out.println("\n\n"); // print a few blank lines
        // Another dinner with 5 guests
        birthdayDinner = new Bill(cost,5);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);

        // Add the tip
        birthdayDinner.addTip();
        // Notice the difference in the final amount
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);



        System.out.println("\n\n"); // print a few blank lines
        // Another dinner with 2 guests
        birthdayDinner = new Bill(cost,2);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);

        // Add the tip
        // Notice the difference in the final amount
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);

    }

   @Test
    public void testBill(){
        Bill testBill = new Bill(125.45,10);
        testBill.addTip();
        assertEquals(156.81,testBill.getCost(),0.01);

        testBill = new Bill(125.45,8);
        testBill.addTip();
        assertEquals(156.81,testBill.getCost(),0.01);

        testBill = new Bill(125.45,7);
        testBill.addTip();
        assertEquals(150.54,testBill.getCost(),0.01);

        testBill = new Bill(125.45,4);
        testBill.addTip();
        assertEquals(150.54,testBill.getCost(),0.01);

        testBill = new Bill(125.45,3);
        testBill.addTip();
        assertEquals(131.72,testBill.getCost(),0.01);

        testBill = new Bill(125.45,2);
        testBill.addTip();
        assertEquals(131.72,testBill.getCost(),0.01);

        testBill = new Bill(125.45,1);
        testBill.addTip();
        assertEquals(125.45,testBill.getCost(),0.01);

    }
}
