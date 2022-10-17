import java.util.logging.Logger;

public class Main {
    public static void main(String[] args)
    {
        //Polymorphism Çok biçimlilik
        EmailLogger logger = new EmailLogger();
        logger.Log("Log mesajı");

        BaseLogger [] loggers = new BaseLogger[] {new DatabaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};
        for (BaseLogger  logger1 : loggers){
            logger1.Log("Log mesajı");
        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}