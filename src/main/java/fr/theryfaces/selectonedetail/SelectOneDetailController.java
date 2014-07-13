package fr.theryfaces.selectonedetail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import lombok.Getter;
import lombok.Setter;

/**
 * SelectOneDetail component's controller.
 * 
 * @author Thery
 *
 */
@ManagedBean
@ViewScoped
public class SelectOneDetailController implements Serializable {

  /** Serial version. */
  private static final long serialVersionUID = -6896794740494332795L;

  /** Initial player list. */
  @Getter
  @Setter
  private List<Player> playerList;

  /** Filtered player list. */
  private List<Player> playerFilteredList;

  /** Selected player. */
  @Getter
  @Setter
  private Player selectedPlayer;

  /**
   * Initialize lists.
   */
  @PostConstruct
  public void init() {
    playerList = new ArrayList<>();
    playerFilteredList = new ArrayList<>();
    playerList.add(new Player("Wesley Sneijder", 10, "Galatasaray"));
    playerList.add(new Player("Dirk Kuyt", 15, "Fenerbahçe"));
    playerList.add(new Player("Robin Van Persie", 9, "Manchester United "));
    playerList.add(new Player("Arjen Robben", 11, "Bayern Munich"));
    playerList.add(new Player("Klaas-Jan Huntelaar", 19, "Schalke 04"));

    playerFilteredList.addAll(playerList);
  }

  /**
   * @return the playerFilteredList
   */
  public List<Player> getPlayerFilteredList() {
    return playerFilteredList;
  }

  /**
   * @param playerFilteredList the playerFilteredList to set
   */
  public void setPlayerFilteredList(List<Player> playerFilteredList) {
    this.playerFilteredList = playerFilteredList;
  }



}
