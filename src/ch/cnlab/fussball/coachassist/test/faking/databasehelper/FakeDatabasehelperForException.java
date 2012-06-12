package ch.cnlab.fussball.coachassist.test.faking.databasehelper;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;

public class FakeDatabasehelperForException extends OrmLiteSqliteOpenHelper {
	public FakeDatabasehelperForException(final Context context) {
		super(context, null, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase arg0, ConnectionSource arg1) {
		// do nothing
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, ConnectionSource arg1, int arg2, int arg3) {
		// do nothing
	}

	@Override
	public <D extends Dao<T, ?>, T> D getDao(Class<T> clazz) throws SQLException {
		throw new SQLException();
	}

}
