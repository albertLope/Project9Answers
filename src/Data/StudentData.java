package Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class StudentData {

    private LinkedHashMap<String ,String> UsernameAndPassword = new LinkedHashMap<>();

    public StudentData(){
        AddUserNameAndPassword();
    }

    public LinkedHashMap<String,String > AddUserNameAndPassword(){
        UsernameAndPassword.put("Emily","EM12.");
        UsernameAndPassword.put("Adam","AdamApple12");
        UsernameAndPassword.put("Lallana","MidAda");
        UsernameAndPassword.put("Origi","CornerTakenQuickly");
        UsernameAndPassword.put("Handerson","Cap2005");
        UsernameAndPassword.put("Mo Salah","KingMo12");
        UsernameAndPassword.put("Robertson","Andrew00");
        UsernameAndPassword.put("Alex","Champ2019");
        UsernameAndPassword.put("Mane","No10");
        UsernameAndPassword.put("Allison","GoldGlov12");

        return UsernameAndPassword;

    }





}
