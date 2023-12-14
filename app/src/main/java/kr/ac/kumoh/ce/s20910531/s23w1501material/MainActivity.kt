package kr.ac.kumoh.ce.s20910531.s23w1501material

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import kr.ac.kumoh.ce.s20910531.s23w1501material.ui.theme.S23W1501MaterialTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    S23W1501MaterialTheme {
        SongDrawer()
    }
}