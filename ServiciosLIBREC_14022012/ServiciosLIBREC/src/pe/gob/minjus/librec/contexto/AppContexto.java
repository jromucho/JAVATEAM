package pe.gob.minjus.librec.contexto;
import org.springframework.context.ApplicationContext;
	public class AppContexto {
	
	private static ApplicationContext ctx;
	
	public static void setApplicationContext(ApplicationContext applicationContext) {
	ctx = applicationContext;
	}
	
	public static ApplicationContext getApplicationContext() {
	return ctx;
}
}
