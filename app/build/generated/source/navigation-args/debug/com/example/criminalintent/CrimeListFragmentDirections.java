package com.example.criminalintent;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.UUID;

public class CrimeListFragmentDirections {
  private CrimeListFragmentDirections() {
  }

  @NonNull
  public static ShowCrimeDetail showCrimeDetail(@NonNull UUID crimeId) {
    return new ShowCrimeDetail(crimeId);
  }

  public static class ShowCrimeDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ShowCrimeDetail(@NonNull UUID crimeId) {
      if (crimeId == null) {
        throw new IllegalArgumentException("Argument \"crimeId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("crimeId", crimeId);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ShowCrimeDetail setCrimeId(@NonNull UUID crimeId) {
      if (crimeId == null) {
        throw new IllegalArgumentException("Argument \"crimeId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("crimeId", crimeId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("crimeId")) {
        UUID crimeId = (UUID) arguments.get("crimeId");
        if (Parcelable.class.isAssignableFrom(UUID.class) || crimeId == null) {
          __result.putParcelable("crimeId", Parcelable.class.cast(crimeId));
        } else if (Serializable.class.isAssignableFrom(UUID.class)) {
          __result.putSerializable("crimeId", Serializable.class.cast(crimeId));
        } else {
          throw new UnsupportedOperationException(UUID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.show_crime_detail;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public UUID getCrimeId() {
      return (UUID) arguments.get("crimeId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ShowCrimeDetail that = (ShowCrimeDetail) object;
      if (arguments.containsKey("crimeId") != that.arguments.containsKey("crimeId")) {
        return false;
      }
      if (getCrimeId() != null ? !getCrimeId().equals(that.getCrimeId()) : that.getCrimeId() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getCrimeId() != null ? getCrimeId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ShowCrimeDetail(actionId=" + getActionId() + "){"
          + "crimeId=" + getCrimeId()
          + "}";
    }
  }
}
