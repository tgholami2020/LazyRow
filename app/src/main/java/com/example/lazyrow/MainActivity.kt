package com.example.lazyrow

import android.content.Context
import android.os.Bundle
import android.text.Layout.Alignment
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazyrow.ui.theme.LazyRowTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()
                .background(Color.Gray),
                verticalArrangement = Arrangement.Center,
            ) {
                LazyRowList(this@MainActivity)
            }

        }
    }
}
@Composable
fun LazyRowList(context: Context){

    LazyRow{
        items(( 1..10).toList()){
            Card(modifier = Modifier
                .width(200.dp)
                .height(100.dp)
                .padding(8.dp)
                .clickable {
                    Toast
                        .makeText(context, "" + it, Toast.LENGTH_SHORT)
                        .show()
                },
                elevation = 10.dp
            ) {
                Column(modifier = Modifier.fillMaxSize()
                    .background(Color.Yellow),
                verticalArrangement = Arrangement.Center,
                    ) {
                        Text(text = "item $it", fontSize = 18.sp)
                }
            }
        }

    }
}