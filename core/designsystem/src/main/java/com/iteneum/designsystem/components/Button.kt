package com.iteneum.designsystem.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LpFilledTonalButton(modifier: Modifier, textButtonDescription: String, onClick: () -> Unit){
    FilledTonalButton(onClick = onClick,
        modifier,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary, contentColor = MaterialTheme.colorScheme.secondary)
    ){
        Text(textButtonDescription)
    }
}


