package ucne.edu.parcial1_luis.UserInterface.Parcial.Screen

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import ucne.edu.parcial1_luis.UserInterface.Parcial.List.ParcialListViewModel

@Composable
fun RegistroParcialScreen(
    onNavigateBack: () -> Unit,
    viewModel: ParcialViewModel = hiltViewModel()
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

            }) {
            Text(text = "Guardame")
        }

    }
}