package ucne.edu.parcial1_luis.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Usuario")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val UsuarioId: Int = 0,
    val plantilla1: String,
    val plantilla2: String,
    val plantilla3: Double
)