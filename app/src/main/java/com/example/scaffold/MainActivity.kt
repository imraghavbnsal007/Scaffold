package com.example.scaffold

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.composable
import com.example.scaffold.ui.theme.ScaffoldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScaffoldTheme {
                // A surface container using the 'background' color from the theme
                ScaffoldApp()
            }
        }
    }
}
@Composable
fun MyTopBar()
{
    var expanded by remember { mutableStateOf(false) }
    TopAppBar(
        title = { Text(text = "My App")},
        navigationIcon = {
            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(Icons.Filled.Menu, contentDescription = null)
            }
        },
        actions = {
            IconButton(
                onClick = {
                    expanded = !expanded
                }
            ) {

                Icon(Icons.Filled.MoreVert, contentDescription = null)
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }) {
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Text(text = "Info")
                }
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Text(text = "Settings")
                }

            }
        }
    )
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldApp()
{

    Scaffold(
        topBar = { MyTopBar() },
        content = { Text(text = "Content for Home screen")},
//        bottomBar = { BottomAppBar { Text(text = "Bottom Bar") }}
    )
}



