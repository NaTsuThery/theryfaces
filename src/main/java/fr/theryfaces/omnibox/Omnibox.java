package fr.theryfaces.omnibox;

import java.util.List;
import java.util.stream.Collectors;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.component.UINamingContainer;
import javax.faces.event.AjaxBehaviorEvent;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.collections4.CollectionUtils;

@FacesComponent("omnibox")
public class Omnibox extends UIInput implements NamingContainer {

  /** Inputtext value. */
  @Getter
  @Setter
  private String value;

  /** The list to filter with {@code value}. */
  @Getter
  @Setter
  private List<Object> listToFilter;

  /** The component to update after the search action. */
  @Getter
  @Setter
  private String update;

  /**
   * Returns the component family of {@link UINamingContainer}. (that's just required by composite
   * component)
   */
  @Override
  public String getFamily() {
    return UINamingContainer.COMPONENT_FAMILY;
  }

  /**
   * Search element in {@code listToFilter} which match with {@code value}.
   */
  @SuppressWarnings("unchecked")
  public void searchKeyUpEvent(AjaxBehaviorEvent event) {
    List<Object> fullList = (List<Object>) getStateHelper().eval("fullList");
    List<Object> filteredList = (List<Object>) getStateHelper().eval("filteredList");

    // Clear second list if needed
    if (!CollectionUtils.isEmpty(fullList)) {
      filteredList.clear();
    }

    // Lambda expression filter
    filteredList.addAll(fullList.stream()
        .filter(o -> o.toString().toUpperCase().contains(getValue().toUpperCase()))
        .collect(Collectors.toList()));
  }
}
