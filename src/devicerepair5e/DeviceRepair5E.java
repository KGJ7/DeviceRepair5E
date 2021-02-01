
package devicerepair5e;

import java.util.*;
public class DeviceRepair5E {


    public static void main(String[] args) {
        Device userDevice = new Device("12345", "Apple", "Glec", "Broken screen", "Not started", 1);

        System.out.println(userDevice.toString());
        System.out.println(userDevice.getOwner());
        String thing = userDevice.toString();
        String[] device = thing.split(", ");
        System.out.println(device[2]);

    }
        public static void mainMenu() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to:\n(1) Add a new device.\n(2) Assign a device to a user.\n(3)Raise an issue with a device.\n(4)Track the repair status of a device.\n(5)Assign a repair to a technician.\n(6)Update the status of a device.\n(7)Remove a device from the system.");
            int userChoice = scan.nextInt();
            switch (userChoice) {
                case 1:
                    addNewDevice();
                    break;
                case 2:
                    assignDeviceToUser();
                    break;
                case 3:
                    raiseDeviceIssue();
                    break;
                case 4:
                    trackRepairStatus();
                    break;
                case 5:
                    assignRepair();
                    break;
                case 6:
                    updateDeviceStatus();
                    break;
                case 7:
                    removeDevice();
                    break;
            }
        }

    public static void addNewDevice(){

    }

    public static void assignDeviceToUser(){

    }
    public static void raiseDeviceIssue(){

    }
    public static void trackRepairStatus(){

    }
    public static void assignRepair(){

    }
    public static void updateDeviceStatus(){

    }
    public static void removeDevice(){
        
    }

}
