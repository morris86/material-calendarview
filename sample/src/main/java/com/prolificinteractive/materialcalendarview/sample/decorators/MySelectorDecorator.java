package com.prolificinteractive.materialcalendarview.sample.decorators;

import android.graphics.drawable.Drawable;

import androidx.appcompat.app.AppCompatActivity;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.sample.R;

/**
 * Use a custom selector
 */
public class MySelectorDecorator implements DayViewDecorator {

  private final Drawable drawable;

  public MySelectorDecorator(AppCompatActivity context) {
    drawable = context.getResources().getDrawable(R.drawable.my_selector);
  }

  @Override
  public boolean shouldDecorate(CalendarDay day) {
    return true;
  }

  @Override
  public void decorate(DayViewFacade view) {
    view.setSelectionDrawable(drawable);
  }
}
