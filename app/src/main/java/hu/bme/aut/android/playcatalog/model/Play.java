package hu.bme.aut.android.playcatalog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.Objects;

@ApiModel(description = "")
public class Play   {

    @SerializedName("id")
    private Long id = null;

    @SerializedName("date")
    private Date date = null;

    @SerializedName("quantity")
    private Integer quantity = null;

    @SerializedName("game")
    private Game game = null;



    /**
     **/
    @ApiModelProperty(required = true, value = "")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    /**
     **/
    @ApiModelProperty(required = true, value = "")
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    /**
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    /**
     **/
    @ApiModelProperty(required = true, value = "")
    public Game getGame() {
        return game;
    }
    public void setGame(Game game) {
        this.game = game;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Play play = (Play) o;
        return Objects.equals(id, play.id) &&
                Objects.equals(date, play.date) &&
                Objects.equals(quantity, play.quantity) &&
                Objects.equals(game, play.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, quantity, game);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Play {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    game: ").append(toIndentedString(game)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
