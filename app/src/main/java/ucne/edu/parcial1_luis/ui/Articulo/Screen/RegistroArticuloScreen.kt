package ucne.edu.parcial1_luis.ui.Articulo.Screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun RegistroArticuloScreen(
    onNavigateBack: () -> Unit,
    viewModel: ArticuloViewModel = hiltViewModel()
) {
    var context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = viewModel.descripcion,
            onValueChange = { viewModel.descripcion = it },
            label = { Text(text = "Descripcion") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.marca,
            onValueChange = { viewModel.marca = it },
            label = { Text(text = "Marca") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.existencia,
            onValueChange = { viewModel.existencia = it },
            label = { Text(text = "Existencia") },
            modifier = Modifier.fillMaxWidth()
        )


        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            onClick = {
                viewModel.Guardar()
                onNavigateBack()

            }) {
            Text(text = "Guardar Articulo")
        }

    }
}