package hu.bme.aut.android.playcatalog.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import hu.bme.aut.android.playcatalog.dto.GameDto;
import hu.bme.aut.android.playcatalog.dto.PlayDto;

@Dao
public interface GameDao {
    @Query("SELECT * FROM games")
    List<GameDto> getAll();

    @Query("SELECT * FROM plays WHERE id = :gameId")
    List<PlayDto> getPlaysForGame(Long gameId);

    @Insert
    void insertAll(GameDto... games);

    @Delete
    void delete(GameDto game);

    @Update
    void update(GameDto game);
}
