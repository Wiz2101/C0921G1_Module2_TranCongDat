package case_study.services.impl;

import case_study.models.*;
import case_study.services.FacilityService;
import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;
import java.util.regex.Pattern;

public class FaciltyServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> map = new LinkedHashMap<>();

    static {
//        map.put(new House("SVHO-1234","rent house", 70, 9900000, 4, "short-term", "superior", 2), 1);
//        map.put(new Room("SVRO-1234","rent room", 25, 1750000, 2, "short-term", "welcome-drink"), 1);
//        map.put(new Villa("SVVL-1234","rent villa", 45, 4500000, 2, "short-term", "ocean view", 15, 1), 1);
        map = FacilityWriteReadServiceImpl.convertStringToMap();
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the type of Facility as below:");
        System.out.println("1. Add New House");
        System.out.println("2. Add New Villa");
        System.out.println("3. Add New Room");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                System.out.println("Enter the Service ID");
                String houseID = scanner.nextLine();
                while (!(Pattern.compile("^SV(HO|VL|RO)-\\w*$").matcher(houseID).matches())) {
                    System.out.println("Please re-enter the Service Name");
                    houseID = scanner.nextLine();
                }
                System.out.println("Enter the Service Name");
                String houseName = scanner.nextLine();
                while (!(Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z]|[a-z])*){0,}$")).matcher(houseName).matches()) {
                    System.out.println("Please re-enter the Service Name");
                    houseName = scanner.nextLine();
                }
                System.out.println("Enter the Usable Area");
                double houseUsage = Double.parseDouble(scanner.nextLine());
                while (!(houseUsage > 30)) {
                    System.out.println("Please re-enter the Usable Area more than 30");
                    houseUsage = Double.parseDouble(scanner.nextLine());
                }
                System.out.println("Enter the Rental Cost");
                int houseCost = Integer.parseInt(scanner.nextLine());
                while (!(houseCost >= 0)) {
                    System.out.println("Please re-enter the Rental Cost");
                    houseCost = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Enter the Capacity");
                int houseCapacity = Integer.parseInt(scanner.nextLine());
                while (!(houseCapacity > 0 && houseCapacity < 20)) {
                    System.out.println("re-enter the Capacity");
                    houseCapacity = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Enter the Rental Type");
                String houseType = scanner.nextLine();
                while (!(Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z]|[a-z])*){0,}$")).matcher(houseType).matches()) {
                    System.out.println("Please re-enter the Rental Type");
                    houseType = scanner.nextLine();
                }
                System.out.println("Enter the Room Standard");
                String houseRoom = scanner.nextLine();
                while (!(Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z]|[a-z])*){0,}$")).matcher(houseRoom).matches()) {
                    System.out.println("Please re-enter the Room Standard");
                    houseRoom = scanner.nextLine();
                }
                System.out.println("Enter the Floor of House");
                int houseFloor = Integer.parseInt(scanner.nextLine());
                while (!(houseFloor > 0)) {
                    System.out.println("Please re-enter the Floor of House");
                    houseFloor = Integer.parseInt(scanner.nextLine());
                }
                House house = new House(houseID, houseName, houseUsage, houseCost, houseCapacity, houseType, houseRoom, houseFloor);
                if (map.containsKey(house)) {
                    map.put(house, map.get(house) + 1);
                } else {
                    map.put(house, 1);
                }
                FacilityWriteReadServiceImpl.writeCSV(map, false);
                break;
            case 2:
                System.out.println("Enter the Service ID");
                String villaID = scanner.nextLine();
                while (!(Pattern.compile("^SV(HO|VL|RO)-\\w*$").matcher(villaID).matches())) {
                    System.out.println("Please re-enter the Service Name");
                    villaID = scanner.nextLine();
                }
                System.out.println("Enter the Service Name");
                String villaName = scanner.nextLine();
                while (!(Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z]|[a-z])*){0,}$")).matcher(villaName).matches()) {
                    System.out.println("Please re-enter the Service Name");
                    villaName = scanner.nextLine();
                }
                System.out.println("Enter the Usable Area");
                double villaUsage = Double.parseDouble(scanner.nextLine());
                while (!(villaUsage > 30)) {
                    System.out.println("Please re-enter the Usable Area more than 30");
                    villaUsage = Double.parseDouble(scanner.nextLine());
                }
                System.out.println("Enter the Rental Cost");
                int villaCost = Integer.parseInt(scanner.nextLine());
                while (!(villaCost >= 0)) {
                    System.out.println("Please re-enter the Rental Cost");
                    villaCost = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Enter the Capacity");
                int villaCapacity = Integer.parseInt(scanner.nextLine());
                while (!(villaCapacity > 0 && villaCapacity < 20)) {
                    System.out.println("re-enter the Capacity");
                    villaCapacity = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Enter the Rental Type");
                String villaType = scanner.nextLine();
                while (!(Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z]|[a-z])*){0,}$")).matcher(villaType).matches()) {
                    System.out.println("Please re-enter the Rental Type");
                    villaType = scanner.nextLine();
                }
                System.out.println("Enter the Room Standard");
                String villaRoom = scanner.nextLine();
                while (!(Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z]|[a-z])*){0,}$")).matcher(villaRoom).matches()) {
                    System.out.println("Please re-enter the Room Standard");
                    villaRoom = scanner.nextLine();
                }
                System.out.println("Enter the Pool Area");
                double villaPool = Double.parseDouble(scanner.nextLine());
                while (!(villaPool >= 30)) {
                    System.out.println("Please re-enter the Pool Area more than 30");
                    villaPool = Double.parseDouble(scanner.nextLine());
                }
                System.out.println("Enter the Floor");
                int villaFloor = Integer.parseInt(scanner.nextLine());
                Villa villa = new Villa(villaID, villaName, villaUsage, villaCost, villaCapacity, villaType, villaRoom, villaPool, villaFloor);
                if (map.containsKey(villa)) {
                    map.put(villa, map.get(villa) + 1);
                } else {
                    map.put(villa, 1);
                }
                FacilityWriteReadServiceImpl.writeCSV(map, false);
                break;
            case 3:
                System.out.println("Enter the Service ID");
                String roomID = scanner.nextLine();
                while (!(Pattern.compile("^SV(HO|VL|RO)-\\w*$").matcher(roomID).matches())) {
                    System.out.println("Please re-enter the Service Name");
                    roomID = scanner.nextLine();
                }
                System.out.println("Enter the Service Name");
                String roomName = scanner.nextLine();
                while (!(Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z]|[a-z])*){0,}$")).matcher(roomName).matches()) {
                    System.out.println("Please re-enter the Service Name");
                    roomName = scanner.nextLine();
                }
                System.out.println("Enter the Usable Area");
                double roomUsage = Double.parseDouble(scanner.nextLine());
                while (!(roomUsage > 30)) {
                    System.out.println("Please re-enter the Usable Area more than 30");
                    roomUsage = Double.parseDouble(scanner.nextLine());
                }
                System.out.println("Enter the Rental Cost");
                int roomCost = Integer.parseInt(scanner.nextLine());
                while (!(roomCost >= 0)) {
                    System.out.println("Please re-enter the Rental Cost");
                    roomCost = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Enter the Capacity");
                int roomCapacity = Integer.parseInt(scanner.nextLine());
                while (!(roomCapacity > 0 && roomCapacity < 20)) {
                    System.out.println("re-enter the Capacity");
                    roomCapacity = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Enter the Rental Type");
                String roomType = scanner.nextLine();
                while (!(Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z]|[a-z])*){0,}$")).matcher(roomType).matches()) {
                    System.out.println("Please re-enter the Rental Type");
                    roomType = scanner.nextLine();
                }
                System.out.println("Enter the Free Service");
                String roomService = scanner.nextLine();
                while (!(Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z]|[a-z])*){0,}$")).matcher(roomService).matches()) {
                    System.out.println("Please re-enter the Rental Type");
                    roomService = scanner.nextLine();
                }
                Room room = new Room(roomID, roomName, roomUsage, roomCost, roomCapacity, roomType, roomService);
                if (map.containsKey(room)) {
                    map.put(room, map.get(room) + 1);
                } else {
                    map.put(room, 1);
                }
                FacilityWriteReadServiceImpl.writeCSV(map, false);
                break;
            case 0:
                break;
            default:
                System.out.println("Please choose from 0-3");
        }

    }

    @Override
    public void display() {
        System.out.println("---------FACILITIES LIST-----------");
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            Facility key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void edit() {
        System.out.println("Enter the Service ID:");
        String input = scanner.nextLine();
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            if (entry.getKey() instanceof House && entry.getKey().getServiceID().toLowerCase().equals(input.toLowerCase())) {
                House house = (House) entry.getKey();
                System.out.println("Please choose 1 in 7 as below:");
                System.out.println("1. Service Name");
                System.out.println("2. Usable Area");
                System.out.println("3. Rental Cost");
                System.out.println("4. Max Capacity");
                System.out.println("5. Rental Type");
                System.out.println("6. Room Standard");
                System.out.println("7. Floor");
                System.out.println("0. Exit");
                System.out.println("Please enter your choice: ");
                int subInput = Integer.parseInt(scanner.nextLine());
                switch (subInput) {
                    case 1:
                        System.out.println("Enter the new Service Name");
                        String newName = scanner.nextLine();
                        house.setServiceName(newName);
                        break;
                    case 2:
                        System.out.println("Enter the new Usuable Area");
                        double newArea = Double.parseDouble(scanner.nextLine());
                        house.setUsableArea(newArea);
                        break;
                    case 3:
                        System.out.println("Enter the new Rental Cost");
                        int newCost = Integer.parseInt(scanner.nextLine());
                        house.setRentalCost(newCost);
                        break;
                    case 4:
                        System.out.println("Enter the new Capacity");
                        int newCapacity = Integer.parseInt(scanner.nextLine());
                        house.setMaxCapacity(newCapacity);
                        break;
                    case 5:
                        System.out.println("Enter the new Rental Type");
                        String newRentalType = scanner.nextLine();
                        house.setRentalType(newRentalType);
                        break;
                    case 6:
                        System.out.println("Enter the new Room Standard");
                        String newStandard = scanner.nextLine();
                        house.setRoomStandard(newStandard);
                        break;
                    case 7:
                        System.out.println("Enter the new Floor");
                        int newFloor = Integer.parseInt(scanner.nextLine());
                        house.setFloor(newFloor);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Please choose from 0-7");
                }
                FacilityWriteReadServiceImpl.writeCSV(map,false);
            } else if (entry.getKey() instanceof Villa && entry.getKey().getServiceID().toLowerCase().equals(input.toLowerCase())) {
                Villa villa = (Villa) entry.getKey();
                System.out.println("Please choose 1 in 7 as below:");
                System.out.println("1. Service Name");
                System.out.println("2. Usable Area");
                System.out.println("3. Rental Cost");
                System.out.println("4. Max Capacity");
                System.out.println("5. Rental Type");
                System.out.println("6. Room Standard");
                System.out.println("7. Pool Area");
                System.out.println("8. Floor");
                System.out.println("0. Exit");
                System.out.println("Please enter your choice: ");
                int subInput = Integer.parseInt(scanner.nextLine());
                switch (subInput) {
                    case 1:
                        System.out.println("Enter the new Service Name");
                        String newName = scanner.nextLine();
                        villa.setServiceName(newName);
                        break;
                    case 2:
                        System.out.println("Enter the new Usuable Area");
                        double newArea = Double.parseDouble(scanner.nextLine());
                        villa.setUsableArea(newArea);
                        break;
                    case 3:
                        System.out.println("Enter the new Rental Cost");
                        int newCost = Integer.parseInt(scanner.nextLine());
                        villa.setRentalCost(newCost);
                        break;
                    case 4:
                        System.out.println("Enter the new Capacity");
                        int newCapacity = Integer.parseInt(scanner.nextLine());
                        villa.setMaxCapacity(newCapacity);
                        break;
                    case 5:
                        System.out.println("Enter the new Rental Type");
                        String newRentalType = scanner.nextLine();
                        villa.setRentalType(newRentalType);
                        break;
                    case 6:
                        System.out.println("Enter the new Room Standard");
                        String newStandard = scanner.nextLine();
                        villa.setRoomStandard(newStandard);
                        break;
                    case 7:
                        System.out.println("Enter the new Pool Area");
                        double newPool = Double.parseDouble(scanner.nextLine());
                        villa.setPoolArea(newPool);
                        break;
                    case 8:
                        System.out.println("Enter the new Floor");
                        int newFloor = Integer.parseInt(scanner.nextLine());
                        villa.setFloor(newFloor);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Please choose from 0-8");
                }
                FacilityWriteReadServiceImpl.writeCSV(map,false);
            } else if (entry.getKey() instanceof Room && entry.getKey().getServiceID().toLowerCase().equals(input.toLowerCase())) {
                Room room = (Room) entry.getKey();
                System.out.println("Please choose 1 in 7 as below:");
                System.out.println("1. Service Name");
                System.out.println("2. Usable Area");
                System.out.println("3. Rental Cost");
                System.out.println("4. Max Capacity");
                System.out.println("5. Rental Type");
                System.out.println("6. Free Service");
                System.out.println("0. Exit");
                System.out.println("Please enter your choice: ");
                int subInput = Integer.parseInt(scanner.nextLine());
                switch (subInput) {
                    case 1:
                        System.out.println("Enter the new Service Name");
                        String newName = scanner.nextLine();
                        room.setServiceName(newName);
                        break;
                    case 2:
                        System.out.println("Enter the new Usuable Area");
                        double newArea = Double.parseDouble(scanner.nextLine());
                        room.setUsableArea(newArea);
                        break;
                    case 3:
                        System.out.println("Enter the new Rental Cost");
                        int newCost = Integer.parseInt(scanner.nextLine());
                        room.setRentalCost(newCost);
                        break;
                    case 4:
                        System.out.println("Enter the new Capacity");
                        int newCapacity = Integer.parseInt(scanner.nextLine());
                        room.setMaxCapacity(newCapacity);
                        break;
                    case 5:
                        System.out.println("Enter the new Rental Type");
                        String newRentalType = scanner.nextLine();
                        room.setRentalType(newRentalType);
                        break;
                    case 6:
                        System.out.println("Enter the new Room Standard");
                        String newFreeService = scanner.nextLine();
                        room.setFreeService(newFreeService);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Please choose from 0-6");
                }
                FacilityWriteReadServiceImpl.writeCSV(map,false);
            }
        }
    }

    public void displayMaintain(){
        List<Booking> maintainceList = new ArrayList<>();
        int count = 0;
        System.out.println("Enter the current month: ");
        String month = scanner.nextLine();
        for (Booking bo:BookingServiceImpl.bookingList){
            if (month.equals(bo.getStartDate().substring(3,5))){
                maintainceList.add(bo);
                count++;
            }
        }
        System.out.println("The total booking in this month: " + count);
        for (Booking mt:maintainceList){
            System.out.println(mt);
        }
    }
}
