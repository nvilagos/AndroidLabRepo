package hu.bme.aut.android.playcatalog.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import hu.bme.aut.android.playcatalog.dao.helper.Converters;
import hu.bme.aut.android.playcatalog.dto.GameDto;
import hu.bme.aut.android.playcatalog.dto.PlayDto;

@Database(entities = {GameDto.class, PlayDto.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract GameDao gamesDao();

    public abstract PlayDao playsDao();
}
