package br.com.maxwell.eduardo.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.maxwell.eduardo.model.Note
import br.com.maxwell.eduardo.ui.theme.NoteColor
import br.com.maxwell.eduardo.ui.theme.WhiteTransparent

@Composable
fun NoteItem(note: Note) {

    Card(
        modifier = Modifier
            .height(120.dp)
            .fillMaxWidth()
            .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
        backgroundColor = NoteColor,
        shape = RoundedCornerShape(10.dp),
        contentColor = Color.White
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        )
        {
            Text(text = note.title, Modifier.padding(start = 16.dp), style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold), maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(text = note.body, Modifier.padding(start = 16.dp, end = 16.dp), overflow = TextOverflow.Ellipsis, maxLines = 2)
            Text(text = "Criado em: ${note.createdDate}", Modifier.padding(start = 16.dp), style = TextStyle(color = WhiteTransparent))
        }
    }

}