package fr.theryfaces.selectonedetail;

import java.io.Serializable;
import java.util.Map;

/**
 * SelectOneDetail item object.
 *
 * @author Thery
 *
 * @param <K> the type of the key
 */
public interface ItemDetail<K> extends Serializable {

  /**
   * @return the key
   */
  K getKey();

  /**
   * @return the label
   */
  String getLabel();

  /**
   * @return the detailMap
   */
  Map<String, String> getDetailMap();

}
