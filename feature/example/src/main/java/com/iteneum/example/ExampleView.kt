package com.iteneum.example

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iteneum.designsystem.components.LpBasicCard
import com.iteneum.designsystem.components.LpOutlineButton

var modifier = Modifier.fillMaxWidth().height(40.dp)
@Composable
fun ExampleView(){
    LpBasicCard {
        LpOutlineButton(onClick = {} ,"Login", modifier)
    }
}