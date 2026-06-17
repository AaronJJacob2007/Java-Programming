import java.util.*;

class PROJECTMOVIETICKET
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String m[][] = {
                {"o","o","o","o"},
                {"o","o","o","o"},
                {"o","o","o","o"},
                {"o","o","o","o"}
        };

        String movies[] = {
                "Oppenheimer",
                "Barbie",
                "Guardians of the Galaxy Vol. 3",
                "Mission: Impossible - Dead Reckoning Part One",
                "Transformers: Rise of the Beasts"
        };

        int choice;

        do
        {
            System.out.println("\nWELCOME TO AJCINEMAS");
            System.out.println("1. Enter choice of movie");
            System.out.println("2. Book seat");
            System.out.println("3. Payment");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            choice = in.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.println("Which movie would you like to watch?");

                    for(int j = 0; j < movies.length; j++)
                    {
                        System.out.println((j + 1) + ". " + movies[j]);
                    }

                    System.out.println("Enter movie number:");
                    int mn = in.nextInt();

                    if(mn >= 1 && mn <= movies.length)
                    {
                        System.out.println("Your choice: " + movies[mn - 1]);
                    }
                    else
                    {
                        System.out.println("Invalid movie number.");
                    }
                    break;

                case 2:

                    System.out.println("Enter row number (0-3):");
                    int i = in.nextInt();

                    System.out.println("Enter column number (0-3):");
                    int j = in.nextInt();

                    if(i >= 0 && i < 4 && j >= 0 && j < 4)
                    {
                        if(m[i][j].equals("o"))
                        {
                            System.out.println("Your seat is available.");
                            m[i][j] = "x";
                            System.out.println("Your seat has been booked.");
                        }
                        else
                        {
                            System.out.println("Your seat is already booked.");
                        }

                        System.out.println("* * * * * * *");

                        for(i = 0; i < 4; i++)
                        {
                            for(j = 0; j < 4; j++)
                            {
                                if(j == 0)
                                    System.out.print("* ");

                                System.out.print("|" + m[i][j] + "|");

                                if(j == 3)
                                    System.out.print(" *");
                            }
                            System.out.println();
                        }

                        System.out.println("* * * * * * *");
                    }
                    else
                    {
                        System.out.println("Invalid seat position.");
                    }

                    break;

                case 3:

                    System.out.println("Total amount to be paid = Rs.1500");
                    System.out.println("Please select your bank:");

                    System.out.println("1. HDFC Bank");
                    System.out.println("2. Axis Bank");
                    System.out.println("3. ICICI Bank");
                    System.out.println("4. Canara Bank");
                    System.out.println("5. Bank of Baroda");

                    int bankchoice = in.nextInt();

                    switch(bankchoice)
                    {
                        case 1:
                            System.out.println("Payment through HDFC Bank selected.");
                            break;

                        case 2:
                            System.out.println("Payment through Axis Bank selected.");
                            break;

                        case 3:
                            System.out.println("Payment through ICICI Bank selected.");
                            break;

                        case 4:
                            System.out.println("Payment through Canara Bank selected.");
                            break;

                        case 5:
                            System.out.println("Payment through Bank of Baroda selected.");
                            break;

                        default:
                            System.out.println("Invalid bank choice.");
                    }

                    System.out.println("Payment Successful!");
                    break;

                case 4:
                    System.out.println("Thank you for visiting AJCINEMAS!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        in.close();
    }
}