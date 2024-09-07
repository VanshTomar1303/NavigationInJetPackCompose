package com.vansh.navigationscreen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyNavigationApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.screenA , builder = {
        composable(Routes.screenA){
            Screen_A(navController)
        }
        composable(Routes.screenB+"/{name}"){
            val name = it.arguments?.getString("name")
            Screen_B(name?:"No Name")
        }
    } )
}