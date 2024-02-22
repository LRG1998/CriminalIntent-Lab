package com.example.criminalintent;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u001a\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0012R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/criminalintent/CrimeDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "crimeId", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "_crime", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/criminalintent/Crime;", "crime", "Lkotlinx/coroutines/flow/StateFlow;", "getCrime", "()Lkotlinx/coroutines/flow/StateFlow;", "crimeRepository", "Lcom/example/criminalintent/CrimeRepository;", "onCleared", "", "updateCrime", "onUpdate", "Lkotlin/Function1;", "app_debug"})
public final class CrimeDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.criminalintent.CrimeRepository crimeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.criminalintent.Crime> _crime = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.criminalintent.Crime> crime = null;
    
    public CrimeDetailViewModel(@org.jetbrains.annotations.NotNull()
    java.util.UUID crimeId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.criminalintent.Crime> getCrime() {
        return null;
    }
    
    public final void updateCrime(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.criminalintent.Crime, com.example.criminalintent.Crime> onUpdate) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}