package com.shimaa.issuesscreentask.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextComponent(
    modifier: Modifier = Modifier,
    title:String,
    fontWeight: FontWeight=FontWeight.Normal,
    fontSize:TextUnit=18.sp,
    overflow: TextOverflow= TextOverflow.Ellipsis,
    maxLine:Int=1
) {
    Text(
        text = title,
        fontWeight=fontWeight,
        fontSize=fontSize,
        overflow = overflow,
        maxLines = maxLine

        )
}



