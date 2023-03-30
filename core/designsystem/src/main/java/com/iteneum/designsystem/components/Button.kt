package com.iteneum.designsystem.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//recordatorio: cuando haga el push, no incluir el import de Example en el gradel de App
//recibir HigOrderFunction = onclick, modifiers y el texto

@Preview()
@Composable
fun LpOutlineButton(onClick: () -> Unit, textButtonDescription: String, modifier: Modifier){
    Button(onClick = onClick,
        modifier,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(contentColor = Color.Black, containerColor = MaterialTheme.colorScheme.primary)
    ){
        Text(textButtonDescription)
    }
}

@Composable
fun testButton( ){

}

