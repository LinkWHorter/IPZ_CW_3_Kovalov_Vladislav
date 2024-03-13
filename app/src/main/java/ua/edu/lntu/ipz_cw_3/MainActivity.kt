package ua.edu.lntu.ipz_cw_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.ipz_cw_3.ui.theme.IPZ_CW_3_Kovalov_VladislavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_3_Kovalov_VladislavTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainWindow()
                }
            }
        }
    }
}

@Composable
fun MainWindow( modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                //.background(color = colorBackTile)
                .align(alignment = Alignment.CenterHorizontally)
                .padding(top = 22.dp, bottom = 23.dp, start = 14.dp, end = 16.dp)
        ) {
            Box(
                modifier = Modifier
                    .padding(bottom = 0.dp, top = 250.dp, end = 0.dp, start = 0.dp)
            ) {

            }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_CW_3_Kovalov_VladislavTheme {
        Greeting("Android")
    }
}