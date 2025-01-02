package Øvelse9ConnectToEmptySpace;

import java.util.ArrayList;
import java.util.List;

public class MotherBoard {

    private SataDrive drive1;
    private SataDrive drive2;
    private SataDrive drive3;
    private SataDrive drive4;

    public MotherBoard() {

        this.drive1 = null;
        this.drive2 = null;
        this.drive3 = null;
        this.drive4 = null;

    }

    public StringBuilder connectedSataDrives() {

//        ArrayList<SataDrive> driveList = new ArrayList<>();
//
//        if(drive1 != null) {
//            driveList.add(drive1);
//        }
//        if(drive2 != null) {
//            driveList.add(drive2);
//        }
//        if(drive3 != null) {
//            driveList.add(drive3);
//        }
//        if(drive4 != null) {
//            driveList.add(drive4);
//        }
//
//        return driveList;

        StringBuilder stringBuilder = new StringBuilder();
        if(drive1 != null) {
            stringBuilder.append(drive1).append("\n");
        }
        if(drive2 != null) {
            stringBuilder.append(drive2).append("\n");
        }
        if(drive3 != null) {
            stringBuilder.append(drive3).append("\n");
        }
        if(drive4 != null) {
            stringBuilder.append(drive4).append("\n");
        }

        if(drive1 == null && drive2 == null && drive3 == null && drive4 == null) {
            stringBuilder.append("There are no connected SataDrives");
        }

        return stringBuilder;

    }

    public String connectSataDrive(SataDrive sataDrive) {

        if(drive1 == null) {
            drive1 = sataDrive;
            return "SataDrive connected at space 1";
        } else if(drive2 == null) {
            drive2 = sataDrive;
            return "SataDrive connected at space 2";
        } else if (drive3 == null) {
            drive3 = sataDrive;
            return "SataDrive connected at space 3";
        } else if(drive4 == null) {
            drive4 = sataDrive;
            return "SataDrive connected at space 4";
        } else {
            return "There are no empty spaces for a new sataDrive";
        }

    }


}
