package cz.upce.fei.nnpia.cv02;

public class LoggerApp implements ILoggerApp{

    LogInService logInService;
    LogOutService logOutService;

    public LoggerApp(LogInService logInService, LogOutService logOutService){
        this.logInService = logInService;
        this.logOutService = logOutService;
    }


    public static void main(String[] args) {
        ILoggerApp loggerApp = DependencyInjector.getLoggerApp();
        loggerApp.process();
    }

    @Override
    public void process(){
        logInService.logIn("Lukas");
        logOutService.logOut("Lukas");
        logInService.logIn("Rick");
        logOutService.logOut("Rick");
    }

}
