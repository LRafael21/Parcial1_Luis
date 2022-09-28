package ucne.edu.parcial1_luis.ui.Articulo.List

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import ucne.edu.parcial1_luis.data.entity.Articulo

@Composable
fun ArticuloListScreen(
    OnClickArticulo: () -> Unit,
    viewModel: ArticuloListViewModel = hiltViewModel()
) {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = OnClickArticulo) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Agregar Articulo")
            }

        },

        ) {
        val uiState by viewModel.uiState.collectAsState()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(it)
        ) {
            ArticuloList(
                articulo = uiState.articulo,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )

        }
    }


}


@Composable
fun ArticuloList(
    articulo: List<Articulo>,
    viewModel: ArticuloListViewModel = hiltViewModel(),
    modifier: Modifier = Modifier,
) {
    TopAppBar(
        title = { Text(text = "Lista de Articulos") },
        modifier = Modifier.padding(0.dp),
        actions = {}
    )

    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        color = Color.Red
    )

    Spacer(modifier = Modifier.height(15.dp))

    LazyColumn(
        modifier = modifier,
    ) {
        items(articulo) { articulo ->
            ArticuloRow(articulo, viewModel)
        }
    }

}

@Composable
fun ArticuloRow(articulo: Articulo, viewModel: ArticuloListViewModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
    ) {
        Row() {
            Text(
                text = "Descripción: ",
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
            Text(
                text = " ${articulo.descripcion} "
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Text(
                text = "Marca: ",
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
            Text(
                text = " ${articulo.marca} "
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Text(
                text = "Existencia: ",
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
            Text(
                text = " ${articulo.existencia} "
            )
        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {


            IconButton(
                modifier = Modifier.padding(0.dp),
                onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.Clear, contentDescription = "noidea",
                    tint = Color.Red,

                    )
            }

            IconButton(
                onClick = {  }) {
                Icon(
                    imageVector = Icons.Outlined.Add, contentDescription = "noidea",
                    tint = Color.Blue,

                    )
            }
        }

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            color = Color.Red
        )
    }
}