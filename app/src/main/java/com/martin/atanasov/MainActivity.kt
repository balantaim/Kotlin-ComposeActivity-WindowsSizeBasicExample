package com.martin.atanasov

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.martin.atanasov.ui.theme.TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowInfo = rememberWindowSize()

            if(windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact){
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            //modifier = Modifier.fillMaxSize()
                            modifier = Modifier
                                .heightIn(200.dp, 300.dp)
                                .width(150.dp)
                                .background(Color.Cyan, RoundedCornerShape(22.dp))

                        ) {
                            Text(
                                "Frag one",
                                //modifier = Modifier.fillMaxSize()
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            //modifier = Modifier.fillMaxSize()
                            modifier = Modifier
                                .heightIn(200.dp, 300.dp)
                                .width(150.dp)
                                .background(Color.Blue, RoundedCornerShape(22.dp))
                                .padding(start = 2.dp)

                        ) {
                            Text(
                                "Frag two",
                                //modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .height(200.dp)
                            .fillMaxSize(fraction = 0.65f)
                            .padding(10.dp)
                            .background(Color.Black, RoundedCornerShape(22.dp)),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Card(
                            shape = MaterialTheme.shapes.small,
                            modifier = Modifier
                                .padding(
                                    bottom = 6.dp,
                                    top = 6.dp,
                                )
                                .fillMaxWidth(),
                            elevation = 10.dp
                        )
                        {

                        }
                    }
                }

            } //End of Compact
            else{
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        "Not Compact",
                        modifier = Modifier.fillMaxSize()
                            .background(Color.Blue),
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello 1-23 $name!")
}

@Preview(
    showBackground = true,
    //uiMode = UI_MODE_NIGHT_YES
)
@Composable
fun DefaultPreview() {
    TestTheme {
        Greeting("Android")
    }
}