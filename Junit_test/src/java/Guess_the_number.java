import java.util.Scanner;
public class Guess_the_number {
    public static void main(String[] args){
        String names = "";
        int number;
        number = (int) (Math.random() * 20);
        int guess;
        int guess_amount = 0;
        System.out.println("Hello! What is your name");
        try{Scanner name = new Scanner(System.in);
        } catch(Exception e){
            System.out.println("Caught Exception: System Input Exception");
        }
        names = name.nextLine();
        System.out.println("Well, " + names + ", I am thinking of a number between 1 and 20");
        System.out.println("Take a guess.");
        try{Scanner guess_0 = new Scanner(System.in);
        }catch (Exception e){
            System.out.println("Caught Exception: System Input Exception");
        }
        guess = guess_0.nextInt();
        if(guess != number)
        {do{
            if (guess > number) {
                do{
                    System.out.println("Your guess is to high.");
                    System.out.println("Take a guess.");
                    try{Scanner guess_1 = new Scanner(System.in);
                    } catch (Exception e){
                        System.out.println("Caught Exception: System Input Exception");
                    }
                    guess = guess_1.nextInt();
                    guess_amount++;
                } while (guess > number);
            } else{
                do{
                    System.out.println("Your guess is to low.");
                    System.out.println("Take a guess.");
                    try{Scanner guess_2 = new Scanner(System.in);
                    }catch (Exception e){
                        System.out.println("Caught Exception: System Input Exception");
                    }
                    guess = guess_2.nextInt();
                    guess_amount++;
                } while (guess < number);
            }
        }while (guess != number);} else{};
        System.out.println("Good job, " + names + "! You guessed my number in " + String.valueOf(guess_amount) + " guesses!");
        System.out.println("Would you like to play again?");
        System.exit(0);
    }
}
