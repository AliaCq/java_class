import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

public class ThymeleafDemo {
    public static void main(String[] args) {
        TemplateEngine engine = new TemplateEngine();
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setCharacterEncoding("utf-8");
        resolver.setCacheable(false);   // 开发阶段，不考虑效率，可以关掉缓存
        resolver.setPrefix("/templates/"); //前缀设置
        resolver.setSuffix(".html");    //后缀设置

        engine.setTemplateResolver(resolver);

        List<String> someName = new ArrayList<>();
        someName.add("干炒");
        someName.add("木须肉");

        Context context = new Context();
        context.setVariable("person","java21");
        context.setVariable("foodList",someName);
        String demo = engine.process("hello/world", context);
        System.out.println(demo);

        /*
        engine.process("demo"); // /templates/demo.html
        engine.process("hello/world");  // templates/hello/world.html
         */
    }
}
