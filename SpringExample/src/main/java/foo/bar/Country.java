package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Country {

    private Capital capital;

    public Country(){
        capital = Capital.getInstance();
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});
        Country Ukraine = (Country) applicationContext.getBean("country");
    }
}

