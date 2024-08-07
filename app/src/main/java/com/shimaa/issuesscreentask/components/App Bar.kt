package com.shimaa.issuesscreentask.components

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.shimaa.issuesscreentask.R

@ExperimentalMaterial3Api
@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    title:String,
    titleStyle:TextStyle=MaterialTheme.typography.titleLarge,
    backgroundColor:Color=MaterialTheme.colorScheme.primary,
    onBackArrowClicked:()->Unit={},
    showBackArrow:Boolean=true
) {
    CenterAlignedTopAppBar(
        modifier = Modifier.background(backgroundColor),
        title = {
            TextComponent(
                title = title,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        },
        navigationIcon = {
            if(showBackArrow)
                IconButton(onClick = onBackArrowClicked) {
                    Icon(imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(id = R.string.app_bar_back_arrow_description))
                }
        }
    )

}