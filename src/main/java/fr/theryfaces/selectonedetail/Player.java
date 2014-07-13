package fr.theryfaces.selectonedetail;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Player class.
 *
 * @author Thery
 *
 */
@Data
@AllArgsConstructor
public class Player implements ItemDetail<Integer> {

  /** Serial version. */
  private static final long serialVersionUID = 4513116852215246840L;

  /** The name of the player. */
  private String name;

  /** The number of the the player. */
  private Integer number;

  /** The team of the player. */
  private String team;

  @Override
  public Integer getKey() {
    return number;
  }

  @Override
  public String getLabel() {
    return name;
  }

  @Override
  public Map<String, String> getDetailMap() {
    Map<String, String> detailMap = new LinkedHashMap<>();
    detailMap.put("Name", name);
    detailMap.put("Number", number.toString());
    detailMap.put("Team", team);
    return detailMap;
  }

}
