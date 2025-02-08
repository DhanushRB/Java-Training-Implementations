import java.util.*;

public class TCSveldingmachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int subchoice1=0,subchoice2=0,subchoice3=0,subchoice4=0;
        System.out.println("Welcome to CCD");
        System.out.print("enter the any one mainchoice:coffee(c),tea(t),soup(s),drink(d):");
        char mainchoice = in.next().toLowerCase().charAt(0);
        switch (mainchoice) {
            case 'c':
                System.out.print("enter the subchoice1 of 'c' number 1 to 3:");
                subchoice1 = in.nextInt();
                break;
            case 't':
                System.out.print("enter the subchoice2 of 't' 1 to 8:");
                subchoice2 = in.nextInt();
                break;
            case 's':
                System.out.print("enter the subchoice3 of 's' number 1 to 4:");
                subchoice3 = in.nextInt();
                break;
            case 'd':
                System.out.print("enter the subchoice4 of 'd' number 1 to 3:");
                subchoice4 = in.nextInt();
                break;
        }
        if (mainchoice == 'c') {

                if (subchoice1 == 1) {
                    System.out.println("Enjoy your Espresso Coffee!");
                } else if (subchoice1 == 2) {
                    System.out.println("Enjoy your Cappuccino Coffee!");
                } else if (subchoice1 == 3) {
                    System.out.println("Enjoy your Latte Coffee!");
                } else {
                    System.out.println("INVALID OUTPUT!");
                }
            } else if (mainchoice == 't') {


                if (subchoice2 == 1) {
                    System.out.println("Enjoy your Plain Tea!");
                } else if (subchoice2 == 2) {
                    System.out.println("Enjoy your Assam Tea!");
                } else if (subchoice2 == 3) {
                    System.out.println("Enjoy your Ginger Tea!");
                } else if (subchoice2 == 4) {
                    System.out.println("Enjoy your Cardamom Tea!");
                } else if (subchoice2 == 5) {
                    System.out.println("Enjoy your Masala Tea!");
                } else if (subchoice2 == 6) {
                    System.out.println("Enjoy your Lemon Tea!");
                } else if (subchoice2 == 7) {
                    System.out.println("Enjoy your Green Tea!");
                } else if (subchoice2 == 8) {
                    System.out.println("Enjoy your Organic Darjeeling Tea!");
                } else {
                    System.out.println("INVALID OUTPUT!");
                }
            } else if (mainchoice == 's') {

                if (subchoice3 == 1) {
                    System.out.println("Enjoy your Hot and Sour Soup!");
                } else if (subchoice3 == 2) {
                    System.out.println("Enjoy your Veg Corn Soup!");
                } else if (subchoice3 == 3) {
                    System.out.println("Enjoy your Tomato Soup!");
                } else if (subchoice3 == 4) {
                    System.out.println("Enjoy your Spicy Tomato Soup!");
                } else {
                    System.out.println("INVALID OUTPUT!");
                }
            } else if (mainchoice == 'd') {

                if (subchoice4 == 1) {
                    System.out.println("Enjoy your Hot Chocolate Drink!");
                } else if (subchoice4 == 2) {
                    System.out.println("Enjoy your Badam Drink!");
                } else if (subchoice4 == 3) {
                    System.out.println("Enjoy your Badam-Pista Drink!");
                } else {
                    System.out.println("INVALID OUTPUT!");
                }
            } else {
                System.out.println("INVALID OUTPUT!");
            }
        }
    }



