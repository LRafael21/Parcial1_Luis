package ucne.edu.parcial1_luis.repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ucne.edu.parcial1_luis.data.ArticuloDb
import ucne.edu.parcial1_luis.data.entity.Articulo
import javax.inject.Inject

class articulosRepository @Inject constructor(
    val db: ArticuloDb
) {


    suspend fun insert(articulo: Articulo)
    {
        db.daoArticulo.insert(articulo)

    }


    suspend fun delete(articulo: Articulo)
    {
        db.daoArticulo.delete(articulo)

    }


    fun getList() = db.daoArticulo.getList()



    suspend fun getArticuloById(id : Int)  = db.daoArticulo.getArticuloById(id)
}