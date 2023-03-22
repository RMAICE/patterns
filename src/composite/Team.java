package composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Unit {
  private List<Unit> units = new ArrayList<>();

  public void add(Unit unit) {
    units.add(unit);
  }

  public void deploy() {
    for (var unit : units)
      unit.deploy();
  }
}
