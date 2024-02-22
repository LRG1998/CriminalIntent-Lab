package com.example.criminalintent;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.UUID;

public class CrimeDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private CrimeDetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private CrimeDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static CrimeDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    CrimeDetailFragmentArgs __result = new CrimeDetailFragmentArgs();
    bundle.setClassLoader(CrimeDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("crimeId")) {
      UUID crimeId;
      if (Parcelable.class.isAssignableFrom(UUID.class) || Serializable.class.isAssignableFrom(UUID.class)) {
        crimeId = (UUID) bundle.get("crimeId");
      } else {
        throw new UnsupportedOperationException(UUID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (crimeId == null) {
        throw new IllegalArgumentException("Argument \"crimeId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("crimeId", crimeId);
    } else {
      throw new IllegalArgumentException("Required argument \"crimeId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CrimeDetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    CrimeDetailFragmentArgs __result = new CrimeDetailFragmentArgs();
    if (savedStateHandle.contains("crimeId")) {
      UUID crimeId;
      crimeId = savedStateHandle.get("crimeId");
      if (crimeId == null) {
        throw new IllegalArgumentException("Argument \"crimeId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("crimeId", crimeId);
    } else {
      throw new IllegalArgumentException("Required argument \"crimeId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public UUID getCrimeId() {
    return (UUID) arguments.get("crimeId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("crimeId")) {
      UUID crimeId = (UUID) arguments.get("crimeId");
      if (Parcelable.class.isAssignableFrom(UUID.class) || crimeId == null) {
        __result.set("crimeId", Parcelable.class.cast(crimeId));
      } else if (Serializable.class.isAssignableFrom(UUID.class)) {
        __result.set("crimeId", Serializable.class.cast(crimeId));
      } else {
        throw new UnsupportedOperationException(UUID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    CrimeDetailFragmentArgs that = (CrimeDetailFragmentArgs) object;
    if (arguments.containsKey("crimeId") != that.arguments.containsKey("crimeId")) {
      return false;
    }
    if (getCrimeId() != null ? !getCrimeId().equals(that.getCrimeId()) : that.getCrimeId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCrimeId() != null ? getCrimeId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "CrimeDetailFragmentArgs{"
        + "crimeId=" + getCrimeId()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull CrimeDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull UUID crimeId) {
      if (crimeId == null) {
        throw new IllegalArgumentException("Argument \"crimeId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("crimeId", crimeId);
    }

    @NonNull
    public CrimeDetailFragmentArgs build() {
      CrimeDetailFragmentArgs result = new CrimeDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setCrimeId(@NonNull UUID crimeId) {
      if (crimeId == null) {
        throw new IllegalArgumentException("Argument \"crimeId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("crimeId", crimeId);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public UUID getCrimeId() {
      return (UUID) arguments.get("crimeId");
    }
  }
}
