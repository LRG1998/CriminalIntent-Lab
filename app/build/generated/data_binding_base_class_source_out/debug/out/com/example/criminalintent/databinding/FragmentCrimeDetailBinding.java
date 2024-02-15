// Generated by view binder compiler. Do not edit!
package com.example.criminalintent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.criminalintent.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCrimeDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button crimeDate;

  @NonNull
  public final CheckBox crimeSolved;

  @NonNull
  public final EditText crimeTitle;

  @NonNull
  public final TextView crimeTitleLabel;

  private FragmentCrimeDetailBinding(@NonNull LinearLayout rootView, @NonNull Button crimeDate,
      @NonNull CheckBox crimeSolved, @NonNull EditText crimeTitle,
      @NonNull TextView crimeTitleLabel) {
    this.rootView = rootView;
    this.crimeDate = crimeDate;
    this.crimeSolved = crimeSolved;
    this.crimeTitle = crimeTitle;
    this.crimeTitleLabel = crimeTitleLabel;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCrimeDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCrimeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_crime_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCrimeDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.crime_date;
      Button crimeDate = ViewBindings.findChildViewById(rootView, id);
      if (crimeDate == null) {
        break missingId;
      }

      id = R.id.crime_solved;
      CheckBox crimeSolved = ViewBindings.findChildViewById(rootView, id);
      if (crimeSolved == null) {
        break missingId;
      }

      id = R.id.crime_title;
      EditText crimeTitle = ViewBindings.findChildViewById(rootView, id);
      if (crimeTitle == null) {
        break missingId;
      }

      id = R.id.crime_title_label;
      TextView crimeTitleLabel = ViewBindings.findChildViewById(rootView, id);
      if (crimeTitleLabel == null) {
        break missingId;
      }

      return new FragmentCrimeDetailBinding((LinearLayout) rootView, crimeDate, crimeSolved,
          crimeTitle, crimeTitleLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}