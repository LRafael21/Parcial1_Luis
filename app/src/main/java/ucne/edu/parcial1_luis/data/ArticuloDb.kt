package ucne.edu.parcial1_luis.data

import androidx.room.Database
import androidx.room.RoomDatabase
import ucne.edu.parcial1_luis.dao.DaoArticulos
import ucne.edu.parcial1_luis.data.entity.Articulo

@Database(
    entities = [Articulo::class] ,
    version = 2,
    exportSchema = false
)
abstract class ArticuloDb: RoomDatabase(){
    abstract val daoArticulo : DaoArticulos

}