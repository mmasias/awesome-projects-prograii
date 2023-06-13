package Vacuum;



public abstract class MovingEntity  {

    int id;
    int xCoordinate;
    int yCoordinate;

    boolean automated;

    public MovingEntity(int id, int xCoordinate, int yCoordinate, boolean automated) {
        this.id = id;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.automated = automated;
    }

    protected void RMovement(){
        int[] X={0, 0, -1, 1, -1, 1, -1, -1};
        int[] Y = {1, -1, 0, 0, 1, 1, -1, -1};
        int direction = (int)(Math.random()*8);

        this.xCoordinate = this.xCoordinate + X[direction];
        this.yCoordinate = this.yCoordinate + Y[direction];


    }


    protected void DMovement(VacuumCleaner P1){
        System.out.println("-------------Choose a direction to take!-------------");
        System.out.println("--   (0) Stay       (1) Up         (2) Down        --");
        System.out.println("--   (3) Left       (4) Right      (5) Up-left     --");
        System.out.println("--   (6) Up-right   (7) Down-left  (8) Down-right  --");
        System.out.println("-------------Choose a direction to take!-------------");
        int[] X={0, 0, 0, -1, 1, -1, 1, -1, -1};
        int[] Y = {0, 1, -1, 0, 0, 1, 1, -1, -1};
        int input = Controller.takePlayerInput();
        int direction = Character.getNumericValue(input);

        setXCoordinate(this.xCoordinate + X[direction]);
        setYCoordinate(this.yCoordinate + Y[direction]);
        P1.setSteps(P1.getSteps()+1);
        P1.setCurrentBattery(P1.getCurrentBattery()-1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public boolean getAutomated() {
        return automated;
    }

    public void setAutomated(boolean automated) {
        this.automated = automated;
    }

    //aun abierta a cambios, pero completamente implementada a Vacuum.Cat y Vacuum cleaner
}
