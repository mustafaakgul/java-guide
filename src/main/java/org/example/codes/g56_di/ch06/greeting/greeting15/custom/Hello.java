package org.javaturk.spring.di.ch06.greeting.greeting15.custom;

import java.lang.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Hello {

}
