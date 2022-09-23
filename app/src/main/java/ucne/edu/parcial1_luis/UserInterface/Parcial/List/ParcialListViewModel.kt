package ucne.edu.parcial1_luis.UserInterface.Parcial.List

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import ucne.edu.parcial1_luis.Entity.Usuario
import javax.inject.Inject

data class ParcialListUIState(
    val usuario: List<Usuario> = emptyList(),

    )

@HiltViewModel
class ParcialListViewModel @Inject constructor(
   // val repository: ParcialRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(ParcialListUIState())
    val uiState: StateFlow<ParcialListUIState> = _uiState.asStateFlow()

    /*init {
        viewModelScope.launch {
            repository.getAll().collect { list ->
                _uiState.update {
                    it.copy(parcial = list)
                }
            }
        }
    }*/


   }
