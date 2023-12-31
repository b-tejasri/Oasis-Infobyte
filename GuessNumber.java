import java.util.Scanner;
import java.util.Random;
class RandomNumber{
    int choice, r1,guess;
    public void Guess(){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
                System.out.print("Guess the number: ");
                String input = sc.next();
		try{
                guess = Integer.parseInt(input);
		} catch (NumberFormatException n){
             		System.out.println("The number should be an integer");
                    i--;
                    continue;
        }
            if (guess < r1){
                if (i<=4){
                    System.out.println("Your guess is low");
                } else {
		            System.out.println("The Number is: "+r1);
                    System.out.println("YOU LOST\nTry Again");
                }
            }else if(guess > r1) {
                if (i<=4){
                    System.out.println("Your guess is high");
                }else{
		            System.out.println("The Number is: "+r1);
                    System.out.println("YOU LOST");
                }
            } else {
                if (i==1){
                    System.out.println("Great Guess\nYOU WIN");
                    break;
                }else if(i==2){
                    System.out.println("WELL DONE\nYOU WIN");
                    break;
                }else if(i==3){
                    System.out.println("Good Job\nYOU WIN");
                    break;
                }else if(i == 4){
                    System.out.println("Exactly\nYOU WIN");
                    break;
                }else {
                    System.out.println("Nice Try\nYOU WIN");
                    break;
                }
            }
        }
    } 

    public void intro(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("\t\tGAME: GUESS THE NUMBER");
        System.out.println("Do you want to set the range by yourself\n1.YES\t2.NO");
        choice = sc.nextInt();
        if (choice == 1){
            System.out.println("You chose YES so please select the number so that the number generated by the computer will be in that range");
            System.out.print("Enter range: ");
            int range = sc.nextInt();
            r1 = r.nextInt(range);
        }else if(choice == 2){
            System.out.println("You chose NO so the range from 0 - 100 ");
            r1 = r.nextInt(100);
        }else{
            System.out.println("Invalid Input\nTry again");
            intro();
        }
        System.out.println("ROUND - 1\nYou have 5 chances to guess");
        Guess();
           
    }

}
class GuessNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        RandomNumber no = new RandomNumber();
        no.intro();
        while (b) {
            System.out.println("Do you want to play again?1. YES\t2. NO");
            int ch = sc.nextInt();
            if (ch == 1){
                no.intro();
            }else if (ch == 2){
                System.out.println("Thank You.");
                b = false;
            }else{
                System.out.println("Invalid Number");
            }
        }
    }
}
