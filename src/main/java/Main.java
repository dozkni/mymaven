import com.sun.corba.se.spi.activation.ServerHolder;
import org.eclipse.jetty.server.Server;

/**
 * Created by YASM on 27.10.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        Frontend frontend = new Frontend();
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);
        context.addServlet(new ServerHolder(frontend),'/authform');

        server.start();
        server.join();
    }
}
