package com.shimaa.issuesscreentask.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shimaa.issuesscreentask.R
import com.shimaa.issuesscreentask.components.TextComponent
import com.shimaa.issuesscreentask.ui.theme.lightGrey
import com.shimaa.issuesscreentask.ui.theme.light_inverse_primary

@Composable
fun CardItem(item:ListItemUiModel) {
    Row (
        modifier= Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 2.5.dp)
            .background(lightGrey, shape = RoundedCornerShape(15.dp))
            .padding(15.dp),
    ){
        Box(modifier = Modifier
            .size(28.dp)
            .border(width = 2.dp, color = light_inverse_primary, shape = CircleShape)
        ){
            Box(modifier = Modifier
                .size(12.dp)
                .border(width = 10.dp, color = light_inverse_primary, shape = CircleShape)
                .align(Alignment.Center)
            )
        }

        Column(
            modifier = Modifier.padding(start = 10.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            TextComponent(title = item.title,
                fontWeight =FontWeight.Bold
            )

       TextComponent(title =item.number)

       TextComponent(title = "${stringResource(id = R.string.created_at)}${item.date}${item.time}", fontSize = 14.sp, fontWeight = FontWeight.Bold)

        }
        Spacer(modifier = Modifier.weight(1f))
        TextComponent(title = item.source)
    }


}
