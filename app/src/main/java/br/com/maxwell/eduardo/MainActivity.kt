package br.com.maxwell.eduardo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.maxwell.eduardo.ui.theme.MyListTheme
import br.com.maxwell.eduardo.view.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyListTheme {
                HomeScreen()
            }
        }
    }
}

