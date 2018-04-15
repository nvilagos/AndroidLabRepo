package hu.bme.aut.android.playcatalog.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import hu.bme.aut.android.playcatalog.dto.PlayDto;

@Dao
public interface PlayDao {
    @Query("SELECT * FROM plays")
    List<PlayDto> getAll();

    @Insert
    void insertAll(PlayDto... plays);

    @Delete
    void delete(PlayDto play);

    @Update
    void update(PlayDto play);
}
