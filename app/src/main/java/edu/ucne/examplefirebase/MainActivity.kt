package edu.ucne.examplefirebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import edu.ucne.examplefirebase.presentation.auth.AuthScreen
import edu.ucne.examplefirebase.ui.theme.ExampleFirebaseTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExampleFirebaseTheme {
                AuthScreen()
            }
        }
    }
}