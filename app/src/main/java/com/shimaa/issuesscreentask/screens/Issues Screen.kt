package com.shimaa.issuesscreentask.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.shimaa.issuesscreentask.R
import com.shimaa.issuesscreentask.components.AppBar

@ExperimentalMaterial3Api
@Composable
fun IssuesScreen() {
    val itemInCard= listOf(
        ListItemUiModel(stringResource(id = R.string.issue_1),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_2),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_3),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_4),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_5),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_6),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_5),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_3),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_1),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_2),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_6),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),
        ListItemUiModel(stringResource(id = R.string.issue_4),stringResource(id = R.string.none),stringResource(id = R.string.date),stringResource(id = R.string.time),stringResource(id = R.string.open)),

    )
    Scaffold(modifier=Modifier.fillMaxSize(),
        topBar = {
            AppBar(
                title = stringResource(id = R.string.issues_app_bar_title),
            ) })
    { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            items(itemInCard) { cardItem ->
                CardItem(item = cardItem)
            }

        }

    }}
