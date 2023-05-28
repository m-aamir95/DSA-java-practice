import Algos.Polymosphism.FalconHeavy;
import Algos.Polymosphism.FalconNine;
import Algos.Polymosphism.SpaceShip;
import Algos.Polymosphism.Starship;
import Algos.Merge_sorted_array.Basic_Test;
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



        Basic_Test test =  new Basic_Test();

        test.run_test_cases();

    }
}