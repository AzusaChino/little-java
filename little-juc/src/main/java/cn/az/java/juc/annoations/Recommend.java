package cn.az.java.juc.annoations;

import java.lang.annotation.*;

/**
 * 课程里用来标记【推荐】的类或者写法
 * @author az
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Recommend {

    String value() default "";
}