package pe.gob.minjus.librec.contexto;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppContextoAware implements ApplicationContextAware {

public void setApplicationContext(ApplicationContext ctx) throws BeansException {
AppContexto.setApplicationContext(ctx);
}
}
