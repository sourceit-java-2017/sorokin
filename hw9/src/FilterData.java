import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class FilterData {
    public static void getDataByType(String type) {
        Set<Object> set = new HashSet<>();
        try {
            BufferedReader input = new BufferedReader(new FileReader("resources\\data"));

            String line;
            while ((line = input.readLine()) != null) {
                String[] strArray = line.split(" ");
                for (int i = 0; i < strArray.length; i++) {
                    try {
                        switch (type.toUpperCase()) {
                            case "DOUBLE":
                                set.add(Double.parseDouble(strArray[i]));
                                break;
                            case "BOOLEAN":
                                set.add(Boolean.parseBoolean(strArray[i]));
                                break;
                            case "BYTE":
                                set.add(Byte.parseByte(strArray[i]));
                                break;
                            case "SHORT":
                                set.add(Short.parseShort(strArray[i]));
                                break;
                            case "LONG":
                                set.add(Long.parseLong(strArray[i]));
                                break;
                            case "FLOAT":
                                set.add(Float.parseFloat(strArray[i]));
                                break;
                            case "INTEGER":
                                set.add(Integer.parseInt(strArray[i]));
                                break;
                            case "STRING":
                                set.add(strArray[i]);
                                break;
                            default:
                                System.out.println(type + " is not correct data type.");
                                return;
                        }


                    } catch (NumberFormatException e) {
                        System.out.println(strArray[i] + " is not " + type);
                    }
                }
            }

            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open text file");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println("All " + type + "s from the file: " + set);
    }
}
