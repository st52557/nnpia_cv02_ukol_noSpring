package cz.upce.fei.nnpia.cv02;

public class DependencyInjector {
    // singleton - v main se vytvoří vždy max 1 instance.
    private static LogInService logInService;
    private static LogOutService logOutService;
    private static LogService logService;

    private static LogService getLogService(){
        if(logService == null){
            logService = new LogService();
        }
        return logService;
    }

    private static LogInService getLogInService(){
        if (logInService == null){
            logInService = new LogInService(getLogService()); // lazy loading - nevytváříme obj, dokud ho někdo nepotřebuje
        }
        return logInService;
    }

    private static LogOutService getLogOutService(){
        if (logOutService == null){
            logOutService = new LogOutService(getLogService()); // lazy loading - nevytváříme obj, dokud ho někdo nepotřebuje
        }
        return logOutService;
    }

    public static ILoggerApp getLoggerApp() {
        return new LoggerApp(getLogInService(), getLogOutService());
    }
}
