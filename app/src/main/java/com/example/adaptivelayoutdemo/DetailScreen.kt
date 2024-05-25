package com.example.adaptivelayoutdemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailsScreen(contact: Contact,modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = contact.name,
            style = MaterialTheme.typography.titleMedium
        )

        HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))

        Text(
            text = contact.phone,
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = contact.email,
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = contact.address,
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = contact.website,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun ContactDetails(contact: Contact) {

}