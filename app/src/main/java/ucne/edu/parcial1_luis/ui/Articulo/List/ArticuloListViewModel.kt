package ucne.edu.parcial1_luis.ui.Articulo.List

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import ucne.edu.parcial1_luis.data.entity.Articulo
import ucne.edu.parcial1_luis.repository.articulosRepository
import javax.inject.Inject

data class ArticuloListUIState(
    val articulo: List<Articulo> = emptyList(),

    )

@HiltViewModel
class ArticuloListViewModel @Inject constructor(
    val repository: articulosRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(ArticuloListUIState())
    val uiState: StateFlow<ArticuloListUIState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            repository.getList().collect { list ->
                _uiState.update {
                    it.copy(articulo = list)
                }
            }
        }
    }


   }
