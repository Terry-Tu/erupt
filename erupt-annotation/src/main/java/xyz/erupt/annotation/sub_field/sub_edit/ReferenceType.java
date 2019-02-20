package xyz.erupt.annotation.sub_field.sub_edit;

import xyz.erupt.annotation.sub_erupt.Filter;

/**
 * Created by liyuepeng on 9/28/18.
 */
public @interface ReferenceType {
    String id();

    String label();

    String pid() default "";

    Filter filter() default @Filter(condition = "");

    String[] depends() default {};

    Class<?> refClass() default void.class;


}
