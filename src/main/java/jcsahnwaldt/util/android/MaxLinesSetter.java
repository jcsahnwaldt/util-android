package jcsahnwaldt.util.android;

import android.view.View;
import android.widget.TextView;

public class MaxLinesSetter
extends SubViewModifier
{
  private int maxLines;

  public MaxLinesSetter(int maxLines) {
    this(0, maxLines);
  }

  public MaxLinesSetter(int viewId, int maxLines) {
    super(viewId);
    this.maxLines = maxLines;
  }
  
  @Override
  public boolean canUse(View view) {
    return findView(view, false) instanceof TextView;
  }
  
  @Override
  public void modify(View view) {
    ((TextView)findView(view, true)).setMaxLines(maxLines);
  }
}
