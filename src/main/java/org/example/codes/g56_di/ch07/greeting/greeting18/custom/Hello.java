package org.javaturk.spring.di.ch07.greeting.greeting18.custom;

import java.lang.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Hello {

}
