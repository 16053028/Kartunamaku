package com.example.kartunamaku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kartunamaku.ui.theme.KartuNamaKuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KartuNamaKuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    /* Using ArticleTextWithImage
                    ArticleTextWithImage(
                        title = "Jetpack Compose tutorial",
                        subTitle = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                        article = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
                    )*/

                    TaskManager()
                }
            }
        }
    }
}

@Composable
fun TextInfoKartuNamaWithImage(nama: String, telp: String, alamat: String) {
    val image = painterResource(id = R.drawable.pexels_eberhard_grossgasteiger_1428277)
    Box{
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
}
@Composable
fun TextInfoKartuNama(nama: String, telp: String, alamat: String) {

    Column{
        Text(
            text = nama,
            fontSize = 32.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth()
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = telp,
            fontSize = 25.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth()
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = alamat,
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth()
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}

/* Practice 01 Article
@Composable
fun ArticleTextWithImage(title: String, subTitle: String, article: String){
    val headImg = painterResource(id = R.drawable.bg_compose_background)
    Box {
        Column {
                Image(
                    painter = headImg,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                ArticleText(title, subTitle, article)
            }
        }
}

@Composable
fun ArticleText(title: String, subTitle: String, article: String){
    Column {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = subTitle,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = article,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all = 16.dp)
        )
    }
}
*/

@Composable
fun TaskManager() {
    val icSuccess = painterResource(id = R.drawable.ic_task_completed)
    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(all = 16.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.Center)) {
            Image(
                painter = icSuccess,
                contentDescription = null,
            )
            Text(
                text = "All tasks completed",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp)
            )
            Text(text = "Nice work!", fontSize = 16.sp)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun TextInfoKartuNamaPreview() {
    KartuNamaKuTheme {
        /* Using the ArticleTextWithImage
        ArticleTextWithImage(
            title = "Jetpack Compose tutorial",
            subTitle = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            article = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
        )*/

        TaskManager()
    }
}