package ucne.edu.parcial1_luis.ui.Articulo.Screen

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun RegistroArticuloScreen(
    onNavigateBack: () -> Unit,
    viewModel: ArticuloViewModel = hiltViewModel()
) {
    var context = LocalContext.current

    fun validar()
    {
        if(viewModel.descripcion.isEmpty())
        {
            Toast.makeText(
                context, "Campo descripcion vacio",Toast.LENGTH_LONG
            ).show()
        }

        else if (viewModel.marca.isEmpty())
        {
            Toast.makeText(
                context, "Campo marca vacio",Toast.LENGTH_LONG
            ).show()
        }
        else if (viewModel.existencia.isEmpty())
        {
            Toast.makeText(
                context, "Campo Existencia vacio",Toast.LENGTH_LONG
            ).show()
        }
        else if (viewModel.existencia.toDouble() < 0)
        {
            Toast.makeText(
                context, "Campo Existencia no puede tener un valor menor que 0",Toast.LENGTH_LONG
            ).show()

        }

        else if (viewModel.existencia.isDigitsOnly())
        {
           viewModel.Guardar()
            onNavigateBack()
        }
        else{
            Toast.makeText(
                context, "El campo existencia solo acepta numeros",Toast.LENGTH_LONG
            ).show()

        }

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TopAppBar(
            title = { Text(text = "Registro de Articulos") },
            modifier = Modifier.padding(0.dp),
            actions = {}
        )

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
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )


        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            onClick = {
               validar()

            }) {
            Text(text = "Guardar Articulo")
        }

    }
}