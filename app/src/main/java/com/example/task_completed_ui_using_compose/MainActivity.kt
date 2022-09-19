package com.example.task_completed_ui_using_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task_completed_ui_using_compose.ui.theme.Task_Completed_UI_using_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task_Completed_UI_using_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskCompleted(text1 = "All tasks completed", text2 = "Nice Work!")
                }
            }
        }
    }
}

@Composable
fun TaskCompleted(text1:String,text2:String)
{
    val image= painterResource(id = R.drawable.done)
    Column()
    {
        Image(painter = image, contentDescription = null, modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.CenterHorizontally).padding(top = 400.dp))
        Text1(text1 = text1)
        Text2(text2 = text2)
    }
}

@Composable
fun Text1(text1:String)
{
    Text(text = text1, fontSize = 24.sp, modifier= Modifier
        .fillMaxWidth().wrapContentWidth(align = Alignment.CenterHorizontally))
}

@Composable
fun Text2(text2:String)
{
    Text(text = text2, fontSize = 16.sp, modifier=Modifier.fillMaxWidth().wrapContentWidth(align=Alignment.CenterHorizontally))
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Task_Completed_UI_using_composeTheme {
        TaskCompleted(text1 = "All tasks completed", text2 = "Nice Work!")
    }
}