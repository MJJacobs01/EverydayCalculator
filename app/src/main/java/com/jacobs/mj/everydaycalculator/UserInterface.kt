package com.jacobs.mj.everydaycalculator

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorApp(viewModel: UserInterfaceViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        CalculationsCard(viewModel = viewModel)
        OneRow(viewModel = viewModel)
        FourRow(viewModel = viewModel)
        SevenRow(viewModel = viewModel)
        ClearRow(viewModel = viewModel)
    }
}

@Composable
fun CalculationsCard(viewModel: UserInterfaceViewModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 5.dp),
        elevation = 5.dp
    ) {
        Column {
            Text(
                text = viewModel.expression.value,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Left,
                fontSize = 12.sp
            )
            Text(
                text = viewModel.answer.value,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Right,
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun ClearRow(viewModel: UserInterfaceViewModel) {
    Row {
        Button(
            onClick = viewModel::clearExpression,
            modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "C")
        }
        Button(
            onClick = { viewModel.appendExpression(addedValue = "0") },
            modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "0")
        }
        Button(
            onClick = viewModel::equals,
            modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "=")
        }
        Button(
            onClick = {viewModel.appendExpression(addedValue = "+")},
            modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "+")
        }
    }
}

@Composable
fun OneRow(viewModel: UserInterfaceViewModel) {
    Row {
        Button(
            onClick = {viewModel.appendExpression("1")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "1")
        }
        Button(
            onClick = {viewModel.appendExpression("2")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "2")
        }
        Button(
            onClick = {viewModel.appendExpression("3")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "3")
        }
        Button(
            onClick = {viewModel.appendExpression("-")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "-")
        }
    }
}

@Composable
fun FourRow(viewModel: UserInterfaceViewModel) {
    Row {
        Button(
            onClick = {viewModel.appendExpression("4")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "4")
        }
        Button(
            onClick = {viewModel.appendExpression("5")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "5")
        }
        Button(
            onClick = {viewModel.appendExpression("6")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "6")
        }
        Button(
            onClick = {viewModel.appendExpression("*")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "*")
        }
    }
}

@Composable
fun SevenRow(viewModel: UserInterfaceViewModel) {
    Row {
        Button(
            onClick = {viewModel.appendExpression("7")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "7")
        }
        Button(
            onClick = {viewModel.appendExpression("8")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "8")
        }
        Button(
            onClick = {viewModel.appendExpression("9")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "9")
        }
        Button(
            onClick = {viewModel.appendExpression("/")}, modifier = Modifier
                .padding(2.dp)
                .weight(1f)
        ) {
            Text(text = "/")
        }
    }
}