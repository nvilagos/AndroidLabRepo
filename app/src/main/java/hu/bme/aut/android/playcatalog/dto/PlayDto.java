package hu.bme.aut.android.playcatalog.dto;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

@Entity(tableName = "plays",
        foreignKeys = @ForeignKey(
                entity = GameDto.class,
                parentColumns = "id",
                childColumns = "gameId"),
        indices = { @Index("id"), @Index("gameId") })
public class PlayDto {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private Long id;

    @SerializedName("date")
    @Expose
    @ColumnInfo(name = "date")
    private Date date;

    @SerializedName("quantity")
    @Expose
    @ColumnInfo(name = "quantity")
    private Integer quantity;

    @SerializedName("gameId")
    @Expose
    @ColumnInfo(name = "gameId")
    private Long gameId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
}
