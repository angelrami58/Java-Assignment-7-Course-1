/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_bester;
import java.util.Scanner;
/**
 *
 * @author angelramirez-rivera
 */
public class Game {
    Scanner input = new Scanner(System.in);
    View view = new View();
    Player computer = new Player();
    Player user = new Player();
    int lost = 5;
    int rolls = 5;
    int round=0;
    int sum = 0;
    
    public void calculateWinner(){ 
        if (computer.getScore() > user.getScore()){
            
            view.winner(computer.getName(),computer.getScore(),round);
            user.subtractPoints(lost);
        } else {
            
            view.winner(user.getName(), user.getScore(),round);
            computer.subtractPoints(lost);
        }
        view.showPoints(user.getName(), user.getPoints(), computer.getName(), computer.getPoints());
    }
    
    public boolean computerCount(){
        int selection;
        boolean computerCount;
        System.out.println("\n\n (1) to play the game again (2) to exit\n\n");
        selection = input.nextInt();
        if(selection == 1){
            computerCount= true;
            computerCount();
    } else { 
            computerCount = false;
        }return computerCount;
      }
    
    public boolean userCount(){
        int selection;
        boolean userCount;
        System.out.println("\n\n (1) to play the game again (2) to exit\n\n");
        selection = input.nextInt();
        if(selection == 1){
            userCount= true;
            userCount();
    } else { 
            userCount = false;
        }return userCount;
      }
 public boolean playerPass(){
        int inValue; 
        boolean pass= false;
        System.out.println("Do you want to pass press (2).");
        System.out.println("If not press (3) to roll");
        inValue = input.nextInt();
        input.nextLine();
        if(inValue == 2 ){
            pass = true;
    } else if(inValue == 3){
            pass = false;
        } return pass;
    }
    public void play(){
        computer.setName("Computer");
        String name = view.playerName();
        user.setName(name);
        boolean exit=false;
        boolean pass =false;
        final int FIRST=1;
        final int SECOND=2;
        
       
        do{
            view.showRoll(computer.getName(), computer.rollDice(FIRST));
            view.showRoll(computer.getName(), computer.rollDice(SECOND));
            
           do {
               if(pass = true) 
           {
               
                view.showRoll(computer.getName(), computer.rollDice(FIRST));
                view.showRoll(computer.getName(), computer.rollDice(SECOND));
                System.out.println("Sum of roll " + sum);
            } else {
          
                 view.showRoll(user.getName(), user.rollDice(FIRST));
                 view.showRoll(user.getName(), user.rollDice(SECOND));
                 sum = (user.rollDice(FIRST) + user.rollDice(SECOND));
                 System.out.println("Sum of roll " + sum);
            }
           }while(pass = false);
              
            round++;
            calculateWinner();
            exit=view.exit();
        } while ((exit == false) && (user.getPoints()>0) && (computer.getPoints()>0));
    }
    public void loseRolls(int rolls){
        this.rolls-= rolls;
    }
}
