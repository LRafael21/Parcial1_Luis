package ucne.edu.parcial1_luis.ui.Navigation

    sealed class Screen (val route : String){

        object registroarticuloscreen : Screen("RegistroArticuloScreen")
        object articulolistscreen : Screen("ArticuloListScreen")
    }
