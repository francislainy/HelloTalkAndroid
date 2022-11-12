import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.francislainy.hellotalk.components.HomeAppBar
import com.francislainy.hellotalk.components.HomeBottomMenu
import com.francislainy.hellotalk.components.MovieList
import com.francislainy.hellotalk.components.SearchMovies

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = { HomeAppBar() },
        bottomBar = {
            HomeBottomMenu(navController)
        }
    ) {

        Column() {
            SearchMovies()
            MovieList(it, navController)
        }

    }
}