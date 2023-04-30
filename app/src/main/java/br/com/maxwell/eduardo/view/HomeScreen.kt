package br.com.maxwell.eduardo.view

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.maxwell.eduardo.BackgroundSplashScreen
import br.com.maxwell.eduardo.R
import br.com.maxwell.eduardo.dateUtil.convertDateByPattern
import br.com.maxwell.eduardo.model.Note
import br.com.maxwell.eduardo.ui.theme.NoteColor
import br.com.maxwell.eduardo.ui.theme.Purple40

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
@Preview
fun HomeScreen() {


    Scaffold(

        floatingActionButton = { FloatActionButton() },
        content = {
            BackgroundSplashScreen()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 16.dp)
            ) {

                SearchBar {}

                LazyColumn {

                    items(items) { item ->
                        NoteItem(item)

                    }
                }

            }

        }
    )
}

@Composable
fun MyTopAppBar(title: String, onBackPressed: () -> Unit) {
    TopAppBar(
        backgroundColor = Color.Transparent,
        title = { Text(text = title) },
        navigationIcon = {
            IconButton(onClick = onBackPressed) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Voltar"
                )
            }
        }
    )
}

@Composable
fun SearchBar(onSearch: (String) -> Unit) {
    var searchText by remember { mutableStateOf("") }


    TextField(
        value = searchText,
        onValueChange = { searchText = it },
        placeholder = { Text(text = stringResource(R.string.search_hint)) },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(onSearch = { onSearch(searchText) }),
        trailingIcon = {

            IconButton(onClick = {
                Log.d("HomeScreen", "SearchBar: $searchText")
            }) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            }
        },
        colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 0.dp),
        shape = RoundedCornerShape(10.dp),
        textStyle = TextStyle(
            color = Purple40,
        )
    )

}

@Composable
fun FloatActionButton() {
    FloatingActionButton(
        onClick = {},
        backgroundColor = Purple40
    ) {
        Icon(imageVector = Icons.Default.Add, "Button add new note", tint = Color.White)
    }
}


val date = convertDateByPattern("dd MMMM yyyy")
val items = listOf<Note>(
    Note(
        "Estudar Compose",
        "Bora estudar compose! Bora estudar compose Bora estudar compose Bora estudar compose SimpleDateFormat SimpleDateFormat SimpleDateFormat SimpleDateFormat",
        date
    ),
    Note(
        "Estudar Compose",
        "Bora estudar compose! Bora estudar compose Bora estudar compose Bora estudar compose SimpleDateFormat SimpleDateFormat SimpleDateFormat SimpleDateFormat",
        date
    ),
    Note(
        "Estudar Compose",
        "Bora estudar compose! Bora estudar compose Bora estudar compose Bora estudar compose SimpleDateFormat SimpleDateFormat SimpleDateFormat SimpleDateFormat",
        date
    ),
    Note(
        "Estudar Compose",
        "Bora estudar compose! Bora estudar compose Bora estudar compose Bora estudar compose SimpleDateFormat SimpleDateFormat SimpleDateFormat SimpleDateFormat",
        date
    ),
    Note(
        "Estudar Compose",
        "Bora estudar compose! Bora estudar compose Bora estudar compose Bora estudar compose SimpleDateFormat SimpleDateFormat SimpleDateFormat SimpleDateFormat",
        date
    ),
    Note(
        "Estudar Compose",
        "Bora estudar compose! Bora estudar compose Bora estudar compose Bora estudar compose SimpleDateFormat SimpleDateFormat SimpleDateFormat SimpleDateFormat",
        date
    ),
    Note(
        "Estudar Compose",
        "Bora estudar compose! Bora estudar compose Bora estudar compose Bora estudar compose SimpleDateFormat SimpleDateFormat SimpleDateFormat SimpleDateFormat",
        date
    ),
    Note(
        "Estudar Compose",
        "Bora estudar compose! Bora estudar compose Bora estudar compose Bora estudar compose SimpleDateFormat SimpleDateFormat SimpleDateFormat SimpleDateFormat",
        date
    ),
    Note(
        "Estudar Compose",
        "Bora estudar compose! Bora estudar compose Bora estudar compose Bora estudar compose SimpleDateFormat SimpleDateFormat SimpleDateFormat SimpleDateFormat",
        date
    ),

    )

