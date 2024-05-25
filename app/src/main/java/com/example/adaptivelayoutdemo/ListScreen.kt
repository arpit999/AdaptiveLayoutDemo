package com.example.adaptivelayoutdemo

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListScreen(modifier: Modifier = Modifier, onItemClicked: (Contact) -> Unit) {
    LazyColumn(modifier = modifier, contentPadding = PaddingValues(2.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(dummyContacts) { contact ->
            Card(Modifier.fillMaxWidth().clickable { onItemClicked(contact) }) {
                Text(modifier = Modifier.padding(8.dp), text = contact.name)
            }
        }
    }
}

@Composable
fun ContactItem(contact: Contact, onItemClicked: (Contact) -> Unit) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(text = contact.name)
    }
}
