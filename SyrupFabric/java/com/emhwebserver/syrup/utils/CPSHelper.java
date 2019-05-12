package com.emhwebserver.syrup.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CPSHelper {
  private static List<Long> clicks = new ArrayList<Long>();

  public static void addClick() {
    clicks.add(System.currentTimeMillis());
  }

  public static int getClicks() {
    Iterator<Long> iterator = clicks.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() >= System.currentTimeMillis() - 1000L) continue;
      iterator.remove();
    }
    return clicks.size();
  }
}
