import java.util.Scanner;
public class Switch {



        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter the LEVEL i have to achieve");
            String level=s.nextLine();
            switch(level)
            {
                case("LOW"):
                    System.out.println("I will develop best website that every person learn programing for free");
                    break;
                case("MEDIUM"):
                    System.out.println("I will develop 100 mini and top 10 applications amazingly used in our country ");
                    break;
                case("HIGH"):
                    System.out.println("I will be the owner of big software company and join the biggest industry :serving the world ");
                    break;
                default:
                    System.out.println("i am no longer software enjineer and try another way of leaving");
            }

        }
    }




