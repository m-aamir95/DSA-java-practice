package Algos.Polymosphism;

public class FalconNine implements SpaceShip{
    @Override
    public String rocket_name() {
        return "Falcon 9";
    }

    @Override
    public String get_parent_company_name() {
        return "SpaceX";
    }

    @Override
    public int get_no_of_engines() {
        return 9;
    }

    @Override
    public String toString() {
        return this.get_parent_company_name() + " -- " + this.rocket_name() + " -- " + this.get_no_of_engines();
    }

}
