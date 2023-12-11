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
public class View {
      Scanner input = new Scanner(System.in);

    public String playerName(){
        System.out.println("Please enter the players name: ");
        return input.nextLine();
    }
    
    public String playersTurn(){
        System.out.println("Press enter to roll dice.");
        return input.nextLine();
    }
    
   
    
    public boolean exit(){
        int inValue;
        boolean exit=false;
        
        System.out.println("(0) to exit");
        System.out.println("(1) to roll again");
        inValue = input.nextInt();
        input.nextLine();
        
        if (inValue == 0){
            exit=true;
        } 
        return exit;
    }
    
    public void showRoll(String name, int score){
        System.out.println("\n"+name+":\t......................."+score+"\n\n");
    }
    
    public void showPoints(String player1, int p1Score, String player2, int p2Score){
        System.out.println(player1+" score:\t"+p1Score);
        System.out.println(player2+" score:\t"+p2Score);
    }
    
    public void winner(String name){
        System.out.println("The winner is "+name);
    }
    //added here
    public void winner(String name, int score, int round){
        System.out.println("The winner of round "+round+" is "+name+" with "+score+".");
    }
    public void computerCount(int count){
        System.out.println("Computer roll is "+count);
    }
    public void userCount(int count){
        System.out.println("User rolled "+count);
    }
}
