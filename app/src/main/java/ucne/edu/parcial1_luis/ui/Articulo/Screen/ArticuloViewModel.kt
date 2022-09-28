package ucne.edu.parcial1_luis.ui.Articulo.Screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Delete
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ucne.edu.parcial1_luis.data.entity.Articulo
import ucne.edu.parcial1_luis.repository.ArticulosRepository
import javax.inject.Inject

@HiltViewModel
class ArticuloViewModel @Inject constructor(
    val repository: ArticulosRepository
) : ViewModel() {
    var descripcion by mutableStateOf("")
    var marca by mutableStateOf("")
    var existencia by mutableStateOf("")



    fun Guardar() {
        viewModelScope.launch {
            repository.insert(
                Articulo(
                    descripcion = descripcion,
                    marca = marca,
                    existencia = existencia.toDouble()
                )
            )
        }

    }

}


