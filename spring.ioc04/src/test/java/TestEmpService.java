import com.bean1.EmpService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpService {


    @Test
    public void testEmpServcie2() {
        ApplicationContext context =new ClassPathXmlApplicationContext("application.xml");
        EmpService empService = context.getBean(EmpService.class);
        empService.addEmp();
    }


}
