package Øvelse9ConnectToEmptySpace;

public class Main {


    public static void main(String[] args) {

        MotherBoard motherBoard = new MotherBoard();

        System.out.println(motherBoard.connectedSataDrives());

        SataDrive sat1 = new SataDrive();

        System.out.println(motherBoard.connectSataDrive(sat1));

        SataDrive sat2 = new SataDrive();

        System.out.println(motherBoard.connectSataDrive(sat2));

        SataDrive sat3 = new SataDrive();
        SataDrive sat4 = new SataDrive();

        motherBoard.connectSataDrive(sat3);
        motherBoard.connectSataDrive(sat4);
        SataDrive sat5 = new SataDrive();
        System.out.println(motherBoard.connectSataDrive(sat5));
    }

}
