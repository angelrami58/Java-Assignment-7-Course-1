/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_bester;
import java.util.Random;
/**
 *
 * @author angelramirez-rivera
 */
public class Dice {
    private Random random = new Random();
    private int dMax=6, dMin=1;
    private int score;
    public int roll(){
        score = random.nextInt(dMax)+dMin;
        return score;
    }
    
    public int getScore(){
        return score;
    }
}
