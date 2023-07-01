class Bike {
    protected int Gear;
    protected int Speed;
    
    public Bike(int startGear,int startSpeed){
        Gear=startGear;
        Speed=startSpeed;
    }

    public int incSpeed(int startSpeed){
        return Speed+startSpeed;
    }
    public int addGear(int startGear){
        return Gear+startGear;
    }
}
class CityBike extends Bike{
    protected int  redGear;
    public CityBike(int startGear, int startSpeed) {
        super(startGear, startSpeed);
        //TODO Auto-generated constructor stub
    }
    public int  reduceGear(int GearNum){
        return Gear-GearNum;
    }
}
class MountainBike extends CityBike{
    protected int AGS;
    public MountainBike(int startGear,int startSpeed){
        super(startGear, startSpeed);
    }

    public int gearShift(int AGS){
        return redGear+AGS;
    }
}
