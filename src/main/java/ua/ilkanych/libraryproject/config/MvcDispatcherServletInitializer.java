package ua.ilkanych.libraryproject.config;

import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class MvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};  //Тут ми вказуєм на наш applicationContext.xml, який ми реалізували в класі springConfig
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"}; //Вказуємо, що всі запити від користувача ми посилаємо на диспетчер сервлетів
    }


//    Так як html5 приймає тільки get/post запити, за допомогою таймліфу ми можем вказати і інші, а цей фільтр якраз для того щоб мати можливість прийняти patch/delete запити
    @Override
    public void onStartup(ServletContext aServletContext) throws ServletException {
        super.onStartup(aServletContext);
        registerHiddenFieldFilter(aServletContext);
    }

    private void registerHiddenFieldFilter(ServletContext aContext) {
        aContext.addFilter("hiddenHttpMethodFilter",
                new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null, true, "/*");
    }
}
