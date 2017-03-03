import java.util.*;

/**
 * Class to parse data from .ini-file on sections, on keys and keys values.
 */
class Parser {
  private int first = 0;
  private ArrayList<String> list = new ArrayList<String>();
  private ArrayList<String> keyListWithValues = new ArrayList<String>();
  private ArrayList<String> keyList = new ArrayList<String>();
  private String paramValue = new String();

/**
 * @param text contain data from .ini-file.
 * @return the list of sections.
 */
  public ArrayList<String> getListOfSections(String text) {
    for(int i = 1; i < text.length(); i++) {
      if(text.charAt(i) == '[') {
        list.add(text.substring(first, i));
        first = i;
      }
      if(i == text.length() - 1) {
        list.add(text.substring(first, text.length()));
        break;
      }
    }

    return list;
  }

/**
 * @param text contain name of section.
 * @return the list of keys with values.
 * This method only in class.
 */
  private ArrayList<String> getListOfKeysWithValues(String text, ArrayList<String> sectionList) {
    for(int i = 0; i < sectionList.size(); i++) {
      for(int j = 1; j < sectionList.get(i).length(); j++) {
        if(sectionList.get(i).charAt(j) == ']' & text.equals(sectionList.get(i).substring(1, j))) {
          first = j + 2;
          for(int k = j + 1; k < sectionList.get(i).length(); k++) {
            if(sectionList.get(i).charAt(k) == ';') {
              keyListWithValues.add(sectionList.get(i).substring(first, k));
              first = k + 2;
            }
          }
          break;
        }
      }
    }

    return keyListWithValues;
  }

/**
 * @param text contain name of section choosing in Main class.
 * @return the list of keys with them values.
 */
  public ArrayList<String> getListOfKeys(String text, ArrayList<String> sectionList) {
    keyListWithValues = getListOfKeysWithValues(text, sectionList);
    for(int i = 0; i < keyListWithValues.size(); i++) {
      for(int j = 1; j < keyListWithValues.get(i).length(); j++) {
        if(keyListWithValues.get(i).charAt(j) == '=') {
          keyList.add(keyListWithValues.get(i).substring(0, j));
        }
      }
    }

    return keyList;
  }

/**
 * @param text contain data from .ini-file.
 * @return the list of keys.
 */
  public String getValueOfParam(String paramName) {
    for(int i = 0; i < keyListWithValues.size(); i++) {
      for(int j = 0; j < keyListWithValues.get(i).length(); j++) {
        if(keyListWithValues.get(i).charAt(j) == '=' & keyListWithValues.get(i).substring(0, j).equals(paramName)) {
          paramValue = keyListWithValues.get(i).substring(j + 1, keyListWithValues.get(i).length());
          break;
        }
      }
    }
    return paramValue;
  }
}