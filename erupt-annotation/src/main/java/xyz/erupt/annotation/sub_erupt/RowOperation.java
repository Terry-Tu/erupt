package xyz.erupt.annotation.sub_erupt;

import xyz.erupt.annotation.fun.OperationHandler;

import java.beans.Transient;

/**
 * 使用一列或者多列的数据执行特定代码
 *
 * @author liyuepeng
 * @date 2018-10-09.
 */
public @interface RowOperation {

    String code();

    String title();

    String tip() default "";

    //请参考font awesome
    String icon() default "fa fa-ravelry";

    /**
     * 控制按钮显示与隐藏（JS表达式）
     * 参考变量 -> item
     */
    String ifExpr() default "";

    Mode mode() default Mode.MULTI;

    @Transient
    String[] operationParam() default {};

    @Transient
    Class<? extends OperationHandler> operationHandler();

    Class eruptClass() default void.class;

    enum Mode {
        SINGLE, MULTI, BUTTON
    }
}
