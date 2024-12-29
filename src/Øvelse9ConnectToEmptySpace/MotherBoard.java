package Øvelse9ConnectToEmptySpace;

import java.util.ArrayList;

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

    private ArrayList<SataDrive> getDriveList() {
        ArrayList<SataDrive> list = new ArrayList<>();
        list.add(drive1);
        list.add(drive2);
        list.add(drive3);
        list.add(drive4);

        return list;
    }

    public void print() {
        ArrayList<SataDrive> drives = getDriveList();

        for(int i = 0; i < drives.size(); i++) {
            if(drives.get(i) != null) {
                System.out.println("Slot " + (i + 1) + ": " + drives.get(i).getName());
            }
            else {
                System.out.println("Slot " + (i + 1) + ": Empty");
            }
        }

    }

    public String connectSataDrive(SataDrive drive) {

        if(drive1 == null) {
            drive1 = drive;
            return "SataDrive added to slot 1";
        }
        else if (drive2 == null) {
            drive2  = drive;
            return "SataDrive added to slot 2";
        }
        else if (drive3 == null) {
            drive3 = drive;
            return "SataDrive added to slot 3";
        }
        else if (drive4 == null) {
            drive4 = drive;
            return "SataDrive added to slot 4";
        }
        else {
            return "No available space for new SataDrive";
        }
    }


}
