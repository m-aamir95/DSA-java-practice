package Algos.Polymosphism;

public class Starship implements SpaceShip{
    @Override
    public String rocket_name() {
        return "Starship";
    }

    @Override
    public String get_parent_company_name() {
        return "SpaceX";
    }

    @Override
    public int get_no_of_engines() {
        return 33; //These represent the number of engines of the booster
    }

    @Override
    public String toString() {
        return this.get_parent_company_name() + " -- " + this.rocket_name() + " -- " + this.get_no_of_engines();
    }

}
