package cz.upce.fei.nnpia.cv02;

public class LogOutService {

    LogService logService;

    public LogOutService(LogService logService) {
        this.logService = logService;
    }

    public void logOut(String username){
        logService.logActivity(username,"ODHLASENI");
    }
}
