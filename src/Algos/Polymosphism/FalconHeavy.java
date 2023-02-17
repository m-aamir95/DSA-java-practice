package Algos.Polymosphism;

public class FalconHeavy implements SpaceShip{
    @Override
    public String rocket_name() {
        return "Falcon Heavy";
    }

    @Override
    public String get_parent_company_name() {
        return "SpaceX";
    }

    @Override
    public String toString() {
        return this.get_parent_company_name() + " -- " + this.rocket_name() + " -- " + this.get_no_of_engines();
    }

    @Override
    public int get_no_of_engines() {
        return 9 * 3; //Because each booster has 9 engines
    }
}
