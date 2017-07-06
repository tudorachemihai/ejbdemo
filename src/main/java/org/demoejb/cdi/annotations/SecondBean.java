package org.demoejb.cdi.annotations;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Target(value={ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD})
@Retention(value= RetentionPolicy.RUNTIME)
public @interface SecondBean {
}
