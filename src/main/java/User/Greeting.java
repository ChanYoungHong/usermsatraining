package User;

import lombok.Data;
import lombok.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Greeting {

    @Value("${greeting.message}")
    private String message;

}
