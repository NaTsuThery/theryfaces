package fr.theryfaces.utility;


/**
 * Enum Utility class.
 *
 * @author Thery
 *
 */
public final class EnumUtility {

  /**
   * Private constructor.
   */
  private EnumUtility() {

  }

  /**
   * Retrieving enum list from his name.
   *
   * @param enumType the fullname of the enum
   * @return the object array
   * @throws ClassNotFoundException happens when the enum is not finded in the classpath
   */
  public static Object[] getEnumList(String enumType) throws ClassNotFoundException {
    Class<?> enumTypeClass = Class.forName(enumType);
    if (enumTypeClass.isEnum()) {
      return enumTypeClass.getEnumConstants();
    } else {
      // TODO : Throw exception
    }
    return null;
  }
}
