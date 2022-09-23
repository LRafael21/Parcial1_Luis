package ucne.edu.parcial1_luis.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ucne.edu.parcial1_luis.data.ParcialDb
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providesDataBase(@ApplicationContext context: Context): ParcialDb {
        return Room.databaseBuilder(
            context,
            ParcialDb::class.java,
            "Parcial.db"
        ).fallbackToDestructiveMigration().build()
    }


}