package ucne.edu.parcial1_luis.util

sealed class Screen(val route: String){

    sealed class Screen (val route : String){

        object registroparcialscreen : Screen("RegistroParcialScreen")
        object parciallistscreen : Screen("ParcialListScreen")
    }

}