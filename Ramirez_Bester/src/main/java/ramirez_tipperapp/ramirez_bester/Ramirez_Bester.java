/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ramirez_bester;

/**
 *
 * @author angelramirez-rivera
 */
public class Ramirez_Bester {

    public static void main(String[] args) {
        Game game = new Game();
        Admin admin = new Admin();
        admin.intro();
        game.play();
        admin.goodbye();
    }
}
