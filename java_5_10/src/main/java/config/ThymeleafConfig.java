package config;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// 监听器(Listener)模式
// 会在 Tomcat 启动时一个何时的位置，执行这个代码一次
// ServletContext —— WebApp
// 初始化
// 销毁
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

        servletContext.setAttribute("template-engine", engine);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
