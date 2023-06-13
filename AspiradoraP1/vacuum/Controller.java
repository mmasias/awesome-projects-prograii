package vacuum;


public class Controller {



    public static void gameKeys(VacuumCleaner P1, Board map1) {
        switch (PlayerInput.takePlayerInput()) {
            case 'r', 'R' -> P1.setAutomated(!P1.getAutomated());
            case 'f', 'F' -> System.out.println("el juego terminara");
            case 'e', 'E' -> P1.emptyBag();
            case 'm', 'M' -> P1.DMovement(P1,map1);
            default -> {
                if (P1.getAutomated()) {
                    P1.RMovement();
                    P1.setSteps(P1.getSteps()+1);
                    P1.setCurrentBattery(P1.getCurrentBattery()-1);
                }
            }
        }
    }

    public static void printHeader(VacuumCleaner P1, Cat C1, Board map){
        System.out.println("______________________________________________________________________");
        System.out.println("(f) Finish");
        System.out.println("total dirt:" + map.getTotalDirt());
        P1.checkCoordinates(P1);
        P1.checkBattery(P1);
        P1.checkBag(P1);
        System.out.println("Steps taken: " + P1.getSteps());
        C1.checkCat(C1);
        System.out.println("(R) Toggle automated mode: " + P1.getAutomated());
        System.out.println("(M) Manual movement");
        System.out.println("______________________________________________________________________");


    }


}