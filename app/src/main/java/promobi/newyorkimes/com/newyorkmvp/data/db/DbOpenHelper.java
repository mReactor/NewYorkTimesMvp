package promobi.newyorkimes.com.newyorkmvp.data.db;


import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import promobi.newyorkimes.com.newyorkmvp.data.db.model.DaoMaster;
import promobi.newyorkimes.com.newyorkmvp.di.scope.ApplicationContext;
import promobi.newyorkimes.com.newyorkmvp.di.scope.DatabaseInfo;

/**
 * Created by mazeqube on 4/28/18.
 */
@Singleton
public class DbOpenHelper extends DaoMaster.OpenHelper{


    @Inject
    public DbOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }


}
