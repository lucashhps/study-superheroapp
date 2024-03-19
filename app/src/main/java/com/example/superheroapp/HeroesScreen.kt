package com.example.superheroapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.SuperheroAppTheme
import com.example.superheroapp.model.Hero
import com.example.superheroapp.model.HeroesRepository

@Composable
fun HeroList(
    heroRepository : List<Hero>,
    contentPadding : PaddingValues,
    modifier : Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = contentPadding
    ) {
        items(heroRepository) { hero ->
            Item(hero)

        }
    }
}
@Composable
fun Item(
    hero : Hero,
    modifier : Modifier = Modifier
){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = modifier.clip(MaterialTheme.shapes.medium).padding(start = 16.dp, end = 16.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp, 4.dp, 8.dp, 16.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.height(32.dp).fillMaxWidth(),
            ){
                Image(
                    painter = painterResource(hero.imageResource),
                    contentDescription = null,
                    modifier = Modifier.clip(MaterialTheme.shapes.extraSmall)
                )
            }

            Text(
                text = stringResource(hero.nameResource),
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Text(
                text = stringResource(hero.descriptionResource),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun ListItemPreview(){
    SuperheroAppTheme {
        HeroList(HeroesRepository.heroes, PaddingValues(horizontal = 16.dp, vertical = 8.dp))
    }

}