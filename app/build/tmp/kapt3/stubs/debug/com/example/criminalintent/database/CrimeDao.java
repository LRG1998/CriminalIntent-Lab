package com.example.criminalintent.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\bH\'J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/criminalintent/database/CrimeDao;", "", "getCrime", "Lcom/example/criminalintent/Crime;", "id", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrimes", "Lkotlinx/coroutines/flow/Flow;", "", "updateCrime", "", "crime", "(Lcom/example/criminalintent/Crime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface CrimeDao {
    
    @androidx.room.Query(value = "SELECT * FROM crime")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.criminalintent.Crime>> getCrimes();
    
    @androidx.room.Query(value = "SELECT*FROM crime WHERE id=(:id)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCrime(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.criminalintent.Crime> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCrime(@org.jetbrains.annotations.NotNull()
    com.example.criminalintent.Crime crime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}