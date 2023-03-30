package com.iteneum.example

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iteneum.designsystem.components.LpBasicCard
import com.iteneum.designsystem.components.LpFilledTonalButton


var modifier = Modifier
    .fillMaxWidth()
    .height(40.dp)
@Composable
fun ExampleView(){
    LpBasicCard {
        LpFilledTonalButton(onClick = {} ,"Login", modifier)
    }
}