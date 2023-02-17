import Algos.Polymosphism.FalconHeavy;
import Algos.Polymosphism.FalconNine;
import Algos.Polymosphism.SpaceShip;
import Algos.Polymosphism.Starship;

public class Main {
    public static void main(String[] args) {

        SpaceShip[] ships = new SpaceShip[3];

        //Add the ships to the array
        ships[0] =  new FalconNine();
        ships[1] = new FalconHeavy();
        ships[2] = new Starship();

        for (SpaceShip ship :
                ships) {
            System.out.println(ship);
        }


    }
}