package com.example.criminalintent.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.UUIDUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.criminalintent.Crime;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CrimeDao_Impl implements CrimeDao {
  private final RoomDatabase __db;

  private final EntityDeletionOrUpdateAdapter<Crime> __updateAdapterOfCrime;

  private final CrimeTypeConverters __crimeTypeConverters = new CrimeTypeConverters();

  public CrimeDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__updateAdapterOfCrime = new EntityDeletionOrUpdateAdapter<Crime>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `Crime` SET `id` = ?,`title` = ?,`date` = ?,`isSolved` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Crime entity) {
        statement.bindBlob(1, UUIDUtil.convertUUIDToByte(entity.getId()));
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        final long _tmp = __crimeTypeConverters.fromDate(entity.getDate());
        statement.bindLong(3, _tmp);
        final int _tmp_1 = entity.isSolved() ? 1 : 0;
        statement.bindLong(4, _tmp_1);
        statement.bindBlob(5, UUIDUtil.convertUUIDToByte(entity.getId()));
      }
    };
  }

  @Override
  public Object updateCrime(final Crime crime, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCrime.handle(crime);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Crime>> getCrimes() {
    final String _sql = "SELECT * FROM crime";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"crime"}, new Callable<List<Crime>>() {
      @Override
      @NonNull
      public List<Crime> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfIsSolved = CursorUtil.getColumnIndexOrThrow(_cursor, "isSolved");
          final List<Crime> _result = new ArrayList<Crime>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Crime _item;
            final UUID _tmpId;
            _tmpId = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfId));
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Date _tmpDate;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfDate);
            _tmpDate = __crimeTypeConverters.toDate(_tmp);
            final boolean _tmpIsSolved;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSolved);
            _tmpIsSolved = _tmp_1 != 0;
            _item = new Crime(_tmpId,_tmpTitle,_tmpDate,_tmpIsSolved);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getCrime(final UUID id, final Continuation<? super Crime> $completion) {
    final String _sql = "SELECT*FROM crime WHERE id=(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindBlob(_argIndex, UUIDUtil.convertUUIDToByte(id));
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Crime>() {
      @Override
      @NonNull
      public Crime call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfIsSolved = CursorUtil.getColumnIndexOrThrow(_cursor, "isSolved");
          final Crime _result;
          if (_cursor.moveToFirst()) {
            final UUID _tmpId;
            _tmpId = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfId));
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Date _tmpDate;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfDate);
            _tmpDate = __crimeTypeConverters.toDate(_tmp);
            final boolean _tmpIsSolved;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSolved);
            _tmpIsSolved = _tmp_1 != 0;
            _result = new Crime(_tmpId,_tmpTitle,_tmpDate,_tmpIsSolved);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
