import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class MainService extends Service<MainConfiguration>{

    public static void main(String[] args) throws Exception {
        new MainService().run(args);
    }
    public void initialize(Bootstrap<MainConfiguration> bootstrap) {
    }

    public void run(MainConfiguration mainConfiguration, Environment environment) throws Exception {
        environment.addResource(new MainResource());
    }
}
