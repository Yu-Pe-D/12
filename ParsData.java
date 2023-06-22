package javaErrorException.HomeWork_003;

import java.util.HashMap;

public class ParsData {

    public HashMap<String, Object> parsInputData() {
        HashMap<String, Object> dataDic = new HashMap<>();
        StringBuilder sb = new StringBuilder();
                String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dataDic.put("firstName", fullName[1]);
            dataDic.put("lastName", fullName[0]);
            dataDic.put("patronymic", fullName[2]);
        }
        return dataDic;
    }

}
