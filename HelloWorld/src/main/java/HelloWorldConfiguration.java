import io.dropwizard.Configuration;
import lombok.Data;
import lombok.Setter;
import lombok.Value;
//import com.test.app.model.Response;


@Value
public class HelloWorldConfiguration extends Configuration {

  @Setter
  String template;

  String defaultName = "Stranger";

  HelloWorldConfiguration() {

  }
}
