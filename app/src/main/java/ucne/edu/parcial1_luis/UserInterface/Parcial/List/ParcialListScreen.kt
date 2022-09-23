package ucne.edu.parcial1_luis.UserInterface.Parcial.List

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
import ucne.edu.parcial1_luis.Entity.Usuario

@Composable
fun ParcialListScreen(
    OnClickParcial: () -> Unit,
    viewModel: ParcialListViewModel = hiltViewModel()
) {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = OnClickParcial) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Agregar Entidad")
            }

        },

        ) {
        val uiState by viewModel.uiState.collectAsState()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(it)
        ) {
            ParcialList(
                usuario = uiState.usuario,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )

        }
    }


}


@Composable
fun ParcialList(
    usuario: List<Usuario>,
    viewModel: ParcialListViewModel = hiltViewModel(),
    modifier: Modifier = Modifier,
) {
    TopAppBar(
        title = { Text(text = "Lista de Entidad") },
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
        items(usuario) { usuario ->
            ParcialRow(usuario, viewModel)
        }
    }

}

@Composable
fun ParcialRow(usuario: Usuario, viewModel: ParcialListViewModel) {
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
                text = " ${usuario.plantilla1} "
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Text(
                text = "Salario: ",
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
            Text(
                text = " ${usuario.plantilla2} "
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