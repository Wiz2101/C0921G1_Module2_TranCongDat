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

    public static void writeCSV(Map<Facility, Integer> map, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        for (Map.Entry<Facility, Integer> mp : map.entrySet()) {
            if (mp.getKey() instanceof House) {
                File file = new File(HOUSE_DESTINATION);
                try {
                    fileWriter = new FileWriter(file,append);
                    bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(mp.getKey().getServiceID() + COMMA + mp.getKey().getServiceName() + COMMA + mp.getKey().getUsableArea() + COMMA + mp.getKey().getRentalCost() + COMMA + mp.getKey().getMaxCapacity() + COMMA + mp.getKey().getRentalType() + COMMA + ((House) mp.getKey()).getRoomStandard() + COMMA + ((House) mp.getKey()).getFloor() + COMMA + mp.getValue());
                    bufferedWriter.newLine();
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
            } else if (mp.getKey() instanceof Villa){
                File file = new File(VILLA_DESTINATION);
                try {
                    fileWriter = new FileWriter(file, append);
                    bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(mp.getKey().getServiceID() + COMMA + mp.getKey().getServiceName() + COMMA + mp.getKey().getUsableArea() + COMMA + mp.getKey().getRentalCost() + COMMA + mp.getKey().getMaxCapacity() + COMMA + mp.getKey().getRentalType() + COMMA + ((Villa) mp.getKey()).getRoomStandard() + COMMA + ((Villa) mp.getKey()).getPoolArea() + COMMA + ((Villa) mp.getKey()).getFloor() + COMMA + mp.getValue());
                    bufferedWriter.newLine();
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
            } else if (mp.getKey() instanceof Room){
                File file = new File(ROOM_DESTINATION);
                try {
                    fileWriter = new FileWriter(file, append);
                    bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(mp.getKey().getServiceID() + COMMA + mp.getKey().getServiceName() + COMMA + mp.getKey().getUsableArea() + COMMA + mp.getKey().getRentalCost() + COMMA + mp.getKey().getMaxCapacity() + COMMA + mp.getKey().getRentalType() + COMMA + ((Room) mp.getKey()).getFreeService() + COMMA + mp.getValue());
                    bufferedWriter.newLine();
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
        }
    }

    public static List<String> readCSV() {
        List<String> stringList = new ArrayList<>();
        File file = new File(HOUSE_SOURCE);
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

    public static Map<Facility, Integer> convertStringToHouse() {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        List<String> stringList = readCSV();
        House house = new House();
        int value;
        String[] str;
        for (String st : stringList) {
            str = st.split(",");
            house.setServiceID(str[0]);
            house.setServiceName(str[1]);
            house.setUsableArea(Double.parseDouble(str[2]));
            house.setRentalCost(Integer.parseInt(str[3]));
            house.setMaxCapacity(Integer.parseInt(str[4]));
            house.setRentalType(str[5]);
            house.setRoomStandard(str[6]);
            house.setFloor(Integer.parseInt(str[7]));
            value = Integer.parseInt(str[8]);
            map.put(house, value);
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
