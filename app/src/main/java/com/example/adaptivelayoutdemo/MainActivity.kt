@file:OptIn(ExperimentalMaterial3AdaptiveApi::class)

package com.example.adaptivelayoutdemo

import android.os.Bundle
import android.os.Parcelable
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.AnimatedPane
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.ThreePaneScaffoldNavigator
import androidx.compose.material3.adaptive.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.adaptivelayoutdemo.ui.theme.AdaptiveLayoutDemoTheme
import kotlinx.parcelize.Parcelize

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3AdaptiveApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navigator = rememberListDetailPaneScaffoldNavigator<Contact>()
            AdaptiveLayoutDemoTheme {
                ListDetailScreen(navigator = navigator)
            }
        }
    }
}

@Composable
fun ListDetailScreen(
    navigator: ThreePaneScaffoldNavigator<Contact>
) {
    BackHandler(navigator.canNavigateBack()) {
        navigator.navigateBack()
    }

    ListDetailPaneScaffold(
        listPane = {
            ListScreen { contact ->
                // Navigate to the detail pane with the passed item
                navigator.navigateTo(ListDetailPaneScaffoldRole.Detail, contact)
            }
        },
        detailPane = {
            // Show the detail pane content if selected item is available
            navigator.currentDestination?.content?.let {
                DetailsScreen(contact = it)
            }
        },
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val navigator = rememberListDetailPaneScaffoldNavigator<Contact>()

    AdaptiveLayoutDemoTheme {
        ListDetailScreen(navigator)
    }
}