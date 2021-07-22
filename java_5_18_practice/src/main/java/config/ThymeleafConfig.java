package config;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ThymeleafConfig implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver(servletContext);
        resolver.setTemplateMode(TemplateMode.HTML);
        resolver.setCacheable(false);
        resolver.setCharacterEncoding("utf-8");
        resolver.setPrefix("/WEB-INF/templates/");
        resolver.setSuffix(".html");

        TemplateEngine engine = new TemplateEngine();
        engine.setTemplateResolver(resolver);

        servletContext.setAttribute("engine",engine);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
