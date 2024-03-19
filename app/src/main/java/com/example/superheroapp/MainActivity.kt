@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.superheroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.SuperheroAppTheme
import com.example.superheroapp.model.HeroesRepository

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SuperheroApp()
                }
            }
        }
    }
}


@Composable
fun SuperheroApp(){
    Scaffold(
        topBar = {
            SuperheroTopBar()
        }
    ) { it ->
        it
        HeroList(heroRepository = HeroesRepository.heroes, contentPadding = it)
    }
}


@Composable
fun SuperheroTopBar(){
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
            ) {
                Text(text = "Superheroes", style = MaterialTheme.typography.displayLarge)
            }

        }
    )
}

@Preview(showBackground = true)
@Composable
fun SuperheroPreview() {
    SuperheroAppTheme {
        SuperheroApp()
    }
}