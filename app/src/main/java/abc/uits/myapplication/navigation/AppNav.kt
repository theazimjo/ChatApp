package abc.uits.myapplication.navigation

import abc.uits.myapplication.screens.auth.LoginScreen
import abc.uits.myapplication.screens.splash.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNav(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen(navController)
        }
        composable("login") {
            LoginScreen()
        }
    }
}