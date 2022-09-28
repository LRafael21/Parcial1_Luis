package ucne.edu.parcial1_luis.ui.Articulo.Screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun RegistroParcialScreen(
    onNavigateBack: () -> Unit,
    viewModel: ArticuloViewModel = hiltViewModel()
) {
    var context = LocalContext.current

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
            ,
            onClick = {
                // viewModel.Guadar()
                onNavigateBack()

            }) {
            Text(text = "Guardame")
        }

    }
}