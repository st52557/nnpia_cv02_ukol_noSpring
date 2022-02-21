package cz.upce.fei.nnpia.cv02;

public class LogInService {

    LogService logService;

    public LogInService(LogService logService) {
        this.logService = logService;
    }

    public void logIn(String username){
        logService.logActivity(username,"PRIHLASENI");
    }
}
