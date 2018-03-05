import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans-challenge.xml");
		
		City cty=(City) ctx.getBean("mycity");
		
		cty.cityName();
		
		((FileSystemXmlApplicationContext)ctx).close();
		
	}

}
