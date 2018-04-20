package hu.bme.aut.android.playcatalog.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
public class Game   {

    @SerializedName("id")
    private Long id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("plays")
    private List<Play> plays = new ArrayList<>();



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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public List<Play> getPlays() {
        return plays;
    }
    public void setPlays(List<Play> plays) {
        this.plays = plays;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Game game = (Game) o;
        return Objects.equals(id, game.id) &&
                Objects.equals(name, game.name) &&
                Objects.equals(plays, game.plays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, plays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Game {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    plays: ").append(toIndentedString(plays)).append("\n");
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
