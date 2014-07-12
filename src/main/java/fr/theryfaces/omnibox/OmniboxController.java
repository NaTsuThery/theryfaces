package fr.theryfaces.omnibox;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import lombok.Getter;
import lombok.Setter;

/**
 * Omnibox Controller.
 * 
 * @author Thery
 *
 */
@ManagedBean
@ViewScoped
public class OmniboxController {

  /** List of all colors. */
  @Getter
  @Setter
  private List<String> colorList;

  /** List of all selected colors. */
  @Getter
  @Setter
  private List<String> selectedColors;

  /**
   * Initialize color list.
   */
  @PostConstruct
  public void init() {
    selectedColors = new ArrayList<String>();
    colorList = new ArrayList<String>();
    colorList.add("Red");
    colorList.add("Yellow");
    colorList.add("Orange");
    colorList.add("Green");
    selectedColors.addAll(colorList);
  }

}
