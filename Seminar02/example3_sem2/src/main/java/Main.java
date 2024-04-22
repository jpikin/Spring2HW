import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.ProjectConfig;
import domain.Car;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car myCar = context.getBean(Car.class);
        System.out.println(myCar);
        myCar.go();
    }
}