package javaErrorException.HomeWork_003;

import java.util.HashMap;

import javax.xml.bind.DataBindingException;
public class Program {
    public static void main(String[] args) throws Exception {
        ParsData parsData = new ParsData();
                String newFileName = null;
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new Exception();
            } catch (DataBindingException e) {
                data = parsData.parsInputData();
            }
        }

        newFileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);
    }
}
