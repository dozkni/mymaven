package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AllRequestsServlet;

/**
 * Created by YASM on 27.10.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception
    {
        AllRequestsServlet allRequestServlet = new AllRequestsServlet();
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);
        context.addServlet(new ServletHolder(allRequestServlet),"/*");

        server.start();
        server.join();
    }
}
