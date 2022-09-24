package ucne.edu.parcial1_luis.ui.Parcial.List

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import ucne.edu.parcial1_luis.data.entity.Usuario
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
