package Day21;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*public class AnnotationDemo {

}*/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})

public @interface AnnotationDemo {
  /*String name();
  int time() default "Hello";
  int time()default 10;*/

}
