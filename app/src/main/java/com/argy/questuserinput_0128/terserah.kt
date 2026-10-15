package com.argy.questuserinput_0128

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormatDataDiri(modifier: Modifier){
    //variabel-variabel untuk mengingat bilai masukan dari keyboard
    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}
    val gender:List<String> = listOf("laki-laki", "Perempuan")

    //variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf("") }
}

