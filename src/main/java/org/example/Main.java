package org.example;

import org.example.dto.MyName;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

                String myName = "{\n"
                        + "       \"name\": \"Nina\" , \n"
                        + "       \"lastName\": \"Zahoruiko\"\n"
                        + "}";

                MyName i = new Gson().fromJson(myName, MyName.class);
                System.out.println(i);
    }
}
