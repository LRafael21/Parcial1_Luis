package ucne.edu.parcial1_luis.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ucne.edu.parcial1_luis.data.entity.Usuario

@Database(
    entities = [Usuario::class] ,
    version = 2,
    exportSchema = false
)
abstract class ParcialDb: RoomDatabase(){

}