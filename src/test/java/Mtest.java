import com.hsd.entity.User;
import com.hsd.service.UserService;
import org.junit.Test;

import java.util.List;

public class Mtest {
    @Test
    public void test001(){
        UserService service = new UserService();
        List<User> findall = service.findall();
        for ( User user :findall) {
            System.out.println(user.getName());
        }

    }
}
