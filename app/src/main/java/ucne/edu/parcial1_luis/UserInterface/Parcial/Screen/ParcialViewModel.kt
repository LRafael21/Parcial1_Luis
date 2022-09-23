package ucne.edu.parcial1_luis.UserInterface.Parcial.Screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ucne.edu.parcial1_luis.Entity.Usuario
import javax.inject.Inject

@HiltViewModel
class ParcialViewModel @Inject constructor(
  //  val repository: ParcialRepository
) : ViewModel() {
    var plantilla1 by mutableStateOf("")
    var plantilla2 by mutableStateOf("")
    var plantilla3 by mutableStateOf("")



    fun Guardar() {
        viewModelScope.launch {
        }

    }
}