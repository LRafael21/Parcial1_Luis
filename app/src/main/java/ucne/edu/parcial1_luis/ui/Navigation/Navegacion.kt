package ucne.edu.parcial1_luis.ui.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ucne.edu.parcial1_luis.ui.Articulo.List.ArticuloListScreen
import ucne.edu.parcial1_luis.ui.Articulo.Screen.RegistroArticuloScreen

@Composable
fun Navegacion() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.articulolistscreen.route
    ) {
        composable(Screen.articulolistscreen.route) {
            ArticuloListScreen(
                OnClickArticulo = { navController.navigate(Screen.registroarticuloscreen.route) }

            )
        }
        composable(Screen.articulolistscreen.route) {
            ArticuloListScreen({ navController.navigateUp() })
        }
        composable(Screen.articulolistscreen.route) {
            ArticuloListScreen(
                OnClickArticulo = { navController.navigate(Screen.registroarticuloscreen.route) }
            )
        }
        composable(Screen.registroarticuloscreen.route) {
            RegistroArticuloScreen({ navController.navigateUp() })
        }

    }
}