package com.murerwa.composenavigation.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.murerwa.composenavigation.ui.components.common.CustomTopAppBar

@Composable
fun DetailScreen(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        CustomTopAppBar(
            title = "Detail",
            onBackClick = { navController.popBackStack() }
        )
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                modifier = Modifier.clickable {
                    navController.popBackStack()
                },
                text = "Detail Screen",
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h3.fontSize,
                color = Color.Red
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DetailScreenPreview() {
    DetailScreen(navController = rememberNavController())
}