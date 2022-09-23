package ucne.edu.parcial1_luis.UserInterface.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ucne.edu.parcial1_luis.UserInterface.Parcial.List.ParcialListScreen
import ucne.edu.parcial1_luis.UserInterface.Parcial.Screen.RegistroParcialScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.parciallistscreen.route
    ) {
        composable(Screen.parciallistscreen.route) {
            ParcialListScreen(
                OnClickParcial = { navController.navigate(Screen.parciallistscreen.route) }

            )
        }
        composable(Screen.parciallistscreen.route) {
            ParcialListScreen({ navController.navigateUp() })
        }
        composable(Screen.parciallistscreen.route) {
            ParcialListScreen(
                OnClickParcial = { navController.navigate(Screen.parciallistscreen.route) }
            )
        }
        composable(Screen.registroparcialscreen.route) {
            RegistroParcialScreen({ navController.navigateUp() })
        }

    }
}