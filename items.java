import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class items {
Scanner wow = new Scanner(System.in);
    



   void item(){


ArrayList <ArrayList <String>> shop = new ArrayList<>();
String[] mainItems = {"pc","bedroom","school"};

ArrayList <String> pc = new ArrayList<>();
pc.add("mouse");
pc.add("keyboard");
pc.add("monitor");
pc.add("system unit");

ArrayList <String> bedroom  = new ArrayList<>();
bedroom.add("lamp");
bedroom.add("pillows");
bedroom.add("blanket");

ArrayList <String> school  = new ArrayList<>();
school.add("ballpen");
school.add("notebook");
school.add("books");

shop.add(pc);
shop.add(bedroom);
shop.add(school);



System.out.println("Hello im selling item do you want to buy? (Yes/No)");
String by = wow.nextLine();


while (!by.equalsIgnoreCase("yes")&&!by.equalsIgnoreCase("no"))
 {System.out.println("(Yes / No) ONLY PLEASE"); by = wow.nextLine();}
    

if (by.equalsIgnoreCase("yes")){
System.out.println("Lets proceed");
System.out.println("Here's our products, Choose depending on your needs");
System.out.println();
System.out.println(Arrays.toString(mainItems));
String choice = wow.nextLine();
System.out.println();
//simula
if (choice.equalsIgnoreCase("pc")){
System.out.println("Need pc for gaming and prductivity? I got you bro");
System.out.println();
System.out.println("These are our available items");
System.out.println();
System.out.println(shop.get(0));
System.out.print("Pick the item that you want: ");
String want = wow.nextLine().toLowerCase();


if (want.equals("mouse")){System.out.println("Nice choice for picking our mouse");
System.out.println("The " + want + " price is 100");

System.out.println("enter the amount of the "+want+ " you need");
int amount = wow.nextInt();

int price = 100 * amount;
System.out.println("total price of your cart is: " + price);
System.out.println("You can proceed by typing the right total value of your cart :");
 int php = wow.nextInt();




while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
php = wow.nextInt();} 
if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
else if (php == price){System.out.println("Thank you for shopping with us");
}





}//mouse end
else if (want.equals("keyboard")){System.out.println("Nice choice for picking our keyboard");
System.out.println("The " + want + " price is 1,500");

System.out.println("enter the amount of the "+want+ " you need");
int amount = wow.nextInt();

int price = 1500 * amount;
System.out.println("total price of your cart is: " + price);
System.out.println("You can proceed by typing the right total value of your cart :");
 int php = wow.nextInt();




while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
php = wow.nextInt();} 
if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
else if (php == price){System.out.println("Thank you for shopping with us");
}



}//keyboard end
else if (want.equals("monitor")){System.out.println("Nice choice for picking our monitor");
System.out.println("The " + want + " price is 7,999");

System.out.println("enter the amount of the "+want+ " you need");
int amount = wow.nextInt();

int price = 7999 * amount;
System.out.println("total price of your cart is: " + price);
System.out.println("You can proceed by typing the right total value of your cart :");
 int php = wow.nextInt();




while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
php = wow.nextInt();} 
if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
else if (php == price){System.out.println("Thank you for shopping with us");
}



}//monitor end


else if (want.equals("system unit")){System.out.println("Nice choice for picking our system unit");
System.out.println("The " + want + " price is 50,000");

System.out.println("enter the amount of the "+want+ " you need");
int amount = wow.nextInt();

int price = 50000 * amount;
System.out.println("total price of your cart is: " + price);
System.out.println("You can proceed by typing the right total value of your cart :");
 int php = wow.nextInt();




while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
php = wow.nextInt();} 
if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
else if (php == price){System.out.println("Thank you for shopping with us");
}



}//system unit end

}
// pc end



else if (choice.equalsIgnoreCase("bedroom")){
    System.out.println("Better sleep at night? I got you bro");
    System.out.println();
    System.out.println("These are our available items");
    System.out.println();
    System.out.println(shop.get(1));
    System.out.print("Pick the item that you want: ");
    String want = wow.nextLine().toLowerCase();


    if (want.equals("lamp")){System.out.println("Nice choice for picking our lamp");
    System.out.println("The " + want + " price is 250");
    
    System.out.println("enter the amount of the "+want+ " you need");
    int amount = wow.nextInt();
    
    int price = 250 * amount;
    System.out.println("total price of your cart is: " + price);
    System.out.println("You can proceed by typing the right total value of your cart :");
     int php = wow.nextInt();
    
    
    
    
    while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
    php = wow.nextInt();} 
    if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
    else if (php == price){System.out.println("Thank you for shopping with us");
    }
    
    
    
    
    
    }//lamp end
    else if (want.equals("pillow")){System.out.println("Nice choice for picking our pillow");
    System.out.println("The " + want + " price is 90");
    
    System.out.println("enter the amount of the "+want+ " you need");
    int amount = wow.nextInt();
    
    int price = 90 * amount;
    System.out.println("total price of your cart is: " + price);
    System.out.println("You can proceed by typing the right total value of your cart :");
     int php = wow.nextInt();
    
    
    
    
    while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
    php = wow.nextInt();} 
    if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
    else if (php == price){System.out.println("Thank you for shopping with us");
    }
    
    
    
    }//pillow end
    else if (want.equals("blanket")){System.out.println("Nice choice for picking our blanket");
    System.out.println("The " + want + " price is 159");
    
    System.out.println("enter the amount of the "+want+ " you need");
    int amount = wow.nextInt();
    
    int price = 159 * amount;
    System.out.println("total price of your cart is: " + price);
    System.out.println("You can proceed by typing the right total value of your cart :");
     int php = wow.nextInt();
    
    
    
    
    while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
    php = wow.nextInt();} 
    if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
    else if (php == price){System.out.println("Thank you for shopping with us");
    }
    
    
    
    }//blanket end







}//bedroom


else if (choice.equalsIgnoreCase("school")){
    System.out.println("School essentials? I got you bro");
    System.out.println();
    System.out.println("These are our available items");
    System.out.println();
    System.out.println(shop.get(2));
    System.out.print("Pick the item that you want: ");
    String want = wow.nextLine().toLowerCase();


    if (want.equals("ballpen")){System.out.println("Nice choice for picking our ballpen");
    System.out.println("The " + want + " price is 20");
    
    System.out.println("enter the amount of the "+want+ " you need");
    int amount = wow.nextInt();
    
    int price = 20 * amount;
    System.out.println("total price of your cart is: " + price);
    System.out.println("You can proceed by typing the right total value of your cart :");
     int php = wow.nextInt();
    
    
    
    
    while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
    php = wow.nextInt();} 
    if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
    else if (php == price){System.out.println("Thank you for shopping with us");
    }
    
    
    
    
    
    }//bp end
    else if (want.equals("notebook")){System.out.println("Nice choice for picking our notebook");
    System.out.println("The " + want + " price is 25");
    
    System.out.println("enter the amount of the "+want+ " you need");
    int amount = wow.nextInt();
    
    int price = 25 * amount;
    System.out.println("total price of your cart is: " + price);
    System.out.println("You can proceed by typing the right total value of your cart :");
     int php = wow.nextInt();
    
    
    
    
    while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
    php = wow.nextInt();} 
    if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
    else if (php == price){System.out.println("Thank you for shopping with us");
    }
    
    
    
    }//nb end
    else if (want.equals("books")){System.out.println("Nice choice for picking our books");
    System.out.println("The " + want + " price is 100");
    
    System.out.println("enter the amount of the "+want+ " you need");
    int amount = wow.nextInt();
    
    int price = 100 * amount;
    System.out.println("total price of your cart is: " + price);
    System.out.println("You can proceed by typing the right total value of your cart :");
     int php = wow.nextInt();
    
    
    
    
    while (php < price) {System.out.println("the amount you have entered was unsufficient /n please enter the right amount"); 
    php = wow.nextInt();} 
    if (php > price) {System.out.println("Thanks for the tip have a safe trip");}
    else if (php == price){System.out.println("Thank you for shopping with us");
    }
    
    
    
    }//books end







}//school










// dulo
}

else if (by.equalsIgnoreCase("No")) {System.out.println("Byebye! Hope you comeback"); }

}




}
