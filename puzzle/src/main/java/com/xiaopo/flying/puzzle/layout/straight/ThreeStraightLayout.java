package com.xiaopo.flying.puzzle.layout.straight;

import com.xiaopo.flying.puzzle.Line;

/**
 * @author wupanjie
 */
public class ThreeStraightLayout extends NumberStraightLayout {

  public ThreeStraightLayout(int theme) {
    super(theme);
  }

  @Override public int getThemeCount() {
    return 6;
  }

  @Override public void layout() {
    switch (theme) {
      case 0:
        cutAreaEqualPart(0, 3, Line.Direction.HORIZONTAL);
        break;
      case 1:
        cutAreaEqualPart(0, 3, Line.Direction.VERTICAL);
        break;
      case 2:
        addLine(0, Line.Direction.HORIZONTAL, 1f / 2);
        addLine(0, Line.Direction.VERTICAL, 1f / 2);
        break;
      case 3:
        addLine(0, Line.Direction.HORIZONTAL, 1f / 2);
        addLine(1, Line.Direction.VERTICAL, 1f / 2);
        break;
      case 4:
        addLine(0, Line.Direction.VERTICAL, 1f / 2);
        addLine(0, Line.Direction.HORIZONTAL, 1f / 2);
        break;
      case 5:
        addLine(0, Line.Direction.VERTICAL, 1f / 2);
        addLine(1, Line.Direction.HORIZONTAL, 1f / 2);
        break;
      default:
        cutAreaEqualPart(0, 3, Line.Direction.HORIZONTAL);
        break;
    }
  }
}
