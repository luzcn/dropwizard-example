import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

  @Override
  public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {

    environment.jersey().register(new HelloWorldResource());
  }
}
