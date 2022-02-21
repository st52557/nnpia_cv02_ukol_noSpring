package cz.upce.fei.nnpia.cv02;

public class LogService {

    public LogService(){
        System.out.println("LogService created");
    }

    public void logActivity(String user, String activity){
        System.out.println("User "+ user +" did activity: "+ activity);
    }
}
