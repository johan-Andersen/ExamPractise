package Øvelse9ConnectToEmptySpace;

public class Main {

    public static void main(String[] args) {

        MotherBoard motherBoard = new MotherBoard();

        motherBoard.print();

        SataDrive johan = new SataDrive("Johan");

        System.out.println(motherBoard.connectSataDrive(johan));

        motherBoard.print();

    }

}
