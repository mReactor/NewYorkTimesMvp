package promobi.newyorkimes.com.newyorkmvp.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by mazeqube on 4/28/18.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface DatabaseInfo {
}
