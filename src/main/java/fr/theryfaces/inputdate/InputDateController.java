package fr.theryfaces.inputdate;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@ViewScoped
public class InputDateController {

  @Getter
  @Setter
  private Date firstDate;
  @Getter
  @Setter
  private Date secondDate;
  @Getter
  @Setter
  private Date thirdDate;

  public String submit() {
    // Do any actions
    return null;
  }

}
