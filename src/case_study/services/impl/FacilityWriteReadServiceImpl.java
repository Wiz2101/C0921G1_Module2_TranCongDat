package case_study.services.impl;

import case_study.models.*;
import case_study.models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityWriteReadServiceImpl {
    static final String HOUSE_SOURCE = "src/case_study/data/House.csv";
    static final String HOUSE_DESTINATION = "src/case_study/data/House.csv";
    static final String VILLA_SOURCE = "src/case_study/data/Villa.csv";
    static final String VILLA_DESTINATION = "src/case_study/data/Villa.csv";
    static final String ROOM_SOURCE = "src/case_study/data/Room.csv";
    static final String ROOM_DESTINATION = "src/case_study/data/Room.csv";
    static final String COMMA = ",";

    /*Wirte
     * Bao gồm cả 3 loại facilities. Phân biệt với nhau bởi instance of
     * */
    public static void writeCSV(Map<Facility, Integer> map, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        File houseFile = new File(HOUSE_DESTINATION);
        File villaFile = new File(VILLA_DESTINATION);
        File roomFile = new File(ROOM_DESTINATION);
        try {
            fileWriter = new FileWriter(houseFile, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> mp : map.entrySet()) {
                if (mp.getKey() instanceof House) {
                    bufferedWriter.write(mp.getKey().getServiceID() + COMMA + mp.getKey().getServiceName() + COMMA + mp.getKey().getUsableArea() + COMMA + mp.getKey().getRentalCost() + COMMA + mp.getKey().getMaxCapacity() + COMMA + mp.getKey().getRentalType() + COMMA + ((House) mp.getKey()).getRoomStandard() + COMMA + ((House) mp.getKey()).getFloor() + COMMA + mp.getValue());
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileWriter = new FileWriter(villaFile, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> mp : map.entrySet()) {
                if (mp.getKey() instanceof Villa) {
                    bufferedWriter.write(mp.getKey().getServiceID() + COMMA + mp.getKey().getServiceName() + COMMA + mp.getKey().getUsableArea() + COMMA + mp.getKey().getRentalCost() + COMMA + mp.getKey().getMaxCapacity() + COMMA + mp.getKey().getRentalType() + COMMA + ((Villa) mp.getKey()).getRoomStandard() + COMMA + ((Villa) mp.getKey()).getPoolArea() + COMMA + ((Villa) mp.getKey()).getFloor() + COMMA + mp.getValue());
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileWriter = new FileWriter(roomFile, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> mp : map.entrySet()) {
                if (mp.getKey() instanceof Room) {
                    bufferedWriter.write(mp.getKey().getServiceID() + COMMA + mp.getKey().getServiceName() + COMMA + mp.getKey().getUsableArea() + COMMA + mp.getKey().getRentalCost() + COMMA + mp.getKey().getMaxCapacity() + COMMA + mp.getKey().getRentalType() + COMMA + ((Room) mp.getKey()).getFreeService() + COMMA + mp.getValue());
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /*Read
     * Bao gồm cả 3 facilities. Duyệt 3 file riêng biệt và tạo mới đối tượng trong vòng for*/
    public static List<String> readCSV(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }

    /*Chuyển từ chuỗi (trong file CSV) sang Map
     * Lần lượt tạo list mới và gán bằng list đọc được từ file CSV
     * Sau đó khởi tạo đối tượng mới trong vòng for và dùng phương thức Setter để gán giá trị*/
    public static Map<Facility, Integer> convertStringToMap() {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        List<String> houseList = readCSV(HOUSE_SOURCE);
        int houseValue;
        String[] houseStr;
        for (String st : houseList) {
            houseStr = st.split(",");
            House house = new House();
            house.setServiceID(houseStr[0]);
            house.setServiceName(houseStr[1]);
            house.setUsableArea(Double.parseDouble(houseStr[2]));
            house.setRentalCost(Integer.parseInt(houseStr[3]));
            house.setMaxCapacity(Integer.parseInt(houseStr[4]));
            house.setRentalType(houseStr[5]);
            house.setRoomStandard(houseStr[6]);
            house.setFloor(Integer.parseInt(houseStr[7]));
            houseValue = Integer.parseInt(houseStr[8]);
            map.put(house, houseValue);
        }
        List<String> villaList = readCSV(VILLA_SOURCE);
        int villaValue;
        String[] villaStr;
        for (String st : villaList) {
            villaStr = st.split(",");
            Villa villa = new Villa();
            villa.setServiceID(villaStr[0]);
            villa.setServiceName(villaStr[1]);
            villa.setUsableArea(Double.parseDouble(villaStr[2]));
            villa.setRentalCost(Integer.parseInt(villaStr[3]));
            villa.setMaxCapacity(Integer.parseInt(villaStr[4]));
            villa.setRentalType(villaStr[5]);
            villa.setRoomStandard(villaStr[6]);
            villa.setPoolArea(Double.parseDouble(villaStr[7]));
            villa.setFloor(Integer.parseInt(villaStr[8]));
            villaValue = Integer.parseInt(villaStr[9]);
            map.put(villa, villaValue);
        }
        List<String> roomList = readCSV(ROOM_SOURCE);
        int roomValue;
        String[] roomStr;
        for (String st : roomList) {
            roomStr = st.split(",");
            Room room = new Room();
            room.setServiceID(roomStr[0]);
            room.setServiceName(roomStr[1]);
            room.setUsableArea(Double.parseDouble(roomStr[2]));
            room.setRentalCost(Integer.parseInt(roomStr[3]));
            room.setMaxCapacity(Integer.parseInt(roomStr[4]));
            room.setRentalType(roomStr[5]);
            room.setFreeService(roomStr[6]);
            roomValue = Integer.parseInt(roomStr[7]);
            map.put(room, roomValue);
        }

        return map;
    }

    public static List<String> covertHouseToString() {
        List<String> listString = new ArrayList<>();
        List<House> houseList = null;
        for (House house : houseList) {
            listString.add(house.toString());
        }
        return listString;
    }
}
