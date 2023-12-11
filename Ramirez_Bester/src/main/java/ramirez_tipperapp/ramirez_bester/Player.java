/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_bester;

/**
 *
 * @author angelramirez-rivera
 */
public class Player {
  
    final private int NumOfDice=2;
    private Dice[] dice = new Dice[NumOfDice];
    private String name;
    private int points = 50;
    
    
    Player(){
        for (int index=0;index < dice.length;index++){
            dice[index] = new Dice();
        }
    }
    
    public void addPoints(int points){
        this.points += points;
    }
    
    public void subtractPoints(int points){
        this.points -= points;
    }
    
    public int getPoints(){
        return points;
    }
//    public void subtractRolls(int rolls){
//        this.rolls -= rolls;
//    }
//    public int getRolls(){
//        return rolls;
//    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
   
    
    public Dice[] rollDice(){
        for (int index=0;index < dice.length;index++){
            dice[index].roll();
        }
        return dice;
    }
    
    public int rollDice(int index){ 
        index--; 
        if (index > dice.length || index < 0){
            index=0;
        }
        return dice[index].roll();
    }

    public int getScore(){ 
        int total=0;
        for (int index=0;index < dice.length;index++){
            total+= dice[index].getScore();
        }
        return total;
    }
}