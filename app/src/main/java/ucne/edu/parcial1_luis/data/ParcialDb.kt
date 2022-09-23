package ucne.edu.parcial1_luis.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ucne.edu.parcial1_luis.Entity.Usuario

@Database(
    entities = [Usuario::class] ,
    version = 1,
    exportSchema = false
)
abstract class ParcialDb: RoomDatabase(){


    companion object {
        @Volatile
        private var INSTANCE: ParcialDb? = null
        fun getInstance(context: Context): ParcialDb {
            synchronized(this) {
                var instance = INSTANCE

                if(instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ParcialDb::class.java,
                        "Parcial.db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}