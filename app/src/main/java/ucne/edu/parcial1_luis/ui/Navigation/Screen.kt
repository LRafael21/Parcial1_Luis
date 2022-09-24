package ucne.edu.parcial1_luis.ui.Navigation

    sealed class Screen (val route : String){

        object registroparcialscreen : Screen("RegistroParcialScreen")
        object parciallistscreen : Screen("ParcialListScreen")
    }
