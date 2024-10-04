package com.example.practicecomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicecomposebasics.ui.theme.PracticeComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeComposeBasicsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    val title = stringResource(R.string.title)
                    val intro = stringResource(R.string.intro)
                    val body = stringResource(R.string.body)
                    Article(title, intro, body)

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Article(title: String, intro: String, body: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(
        modifier = modifier
    ) {
    Image(
        painter = image,
        contentDescription = null
    )
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
    Text(
        text = intro,
        //fontSize = 12.sp,
        lineHeight = 15.sp,
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp
        ),
        textAlign = TextAlign.Justify
    )
    Text(
        text = body,
        fontSize = 12.sp,
        lineHeight = 15.sp,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    val title = stringResource(R.string.title)
    val intro = stringResource(R.string.intro)
    val body = stringResource(R.string.body)

    PracticeComposeBasicsTheme {
        Article(title, intro, body)
    }
}