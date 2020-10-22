package chap06.lecture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어디에든 붙일수있지만 붙일수있는 위치를 지정해줄수 있다.
// ElementType.xx 라는 inner 타입에 붙일수있다.
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String value() default "123";
	int number() default 3;
	String[] names() default{"a", "b"};
}
