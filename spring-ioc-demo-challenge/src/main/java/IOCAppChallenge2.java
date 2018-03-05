import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		City ct=(City) ctx.getBean("mycity");
		
		ct.cityName();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
