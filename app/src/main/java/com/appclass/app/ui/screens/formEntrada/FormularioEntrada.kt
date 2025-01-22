package com.appclass.app.ui.screens.formEntrada

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appclass.app.ui.theme.GrisOutlined


//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormularioEntrada(viewModel: FormularioEntradaViewModel) {

    LlamadaFunciones(
        modifier = Modifier
            .fillMaxSize()
            //.padding(16.dp)
    )
}

@Composable
fun CamposFormulario(modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(start = 10.dp)
    ) {
        Spacer(modifier = Modifier.size(75.dp))
        Text(
            text = "Formulario de facturas",
            //style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            color = Color(0xFF202c41),
            modifier = Modifier.padding(bottom = 63.dp),
        )



        Text(
            text = "1. Datos del Emisor",
            //style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
            //style = MaterialTheme.typography.titleLarge, //titleLarge va a hacer referencia al FontWeight_Bold
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start),

        )

        // Variables del formulario para la base de datos
        var domicilio by remember { mutableStateOf("") }
        var ciudad by remember { mutableStateOf("") }
        var provincia by remember { mutableStateOf("") }
        var dni by remember { mutableStateOf("") }


//        // Campos de entrada
//        OutlinedTextField(
//            value = domicilio,
//            onValueChange = { domicilio = it },
//            modifier = Modifier
//                .fillMaxWidth(),
//            //.height(56.dp),
//            singleLine = true,
//            label = { Text("Empresa") },
//            shape = MaterialTheme.shapes.large.copy(all = CornerSize(10.dp)),
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedBorderColor = GrisOutlined,
//                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
//                focusedLabelColor = GrisOutlined,
//                unfocusedLabelColor = GrisOutlined,
//                cursorColor = GrisOutlined
//            )
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        OutlinedTextField(
//            value = ciudad,
//            onValueChange = { ciudad = it },
//            modifier = Modifier
//                .fillMaxWidth(),
//            //.height(56.dp),
//            label = { Text("NIF") },
//            shape = MaterialTheme.shapes.large.copy(all = CornerSize(10.dp)),
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedBorderColor = GrisOutlined,
//                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
//                focusedLabelColor = GrisOutlined,
//                unfocusedLabelColor = GrisOutlined,
//                cursorColor = GrisOutlined
//            )
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        OutlinedTextField(
//            value = provincia,
//            onValueChange = { provincia = it },
//            modifier = Modifier
//                .fillMaxWidth(),
//            //.height(56.dp),
//            label = { Text("Dirección") },
//            shape = MaterialTheme.shapes.large.copy(all = CornerSize(10.dp)),
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedBorderColor = GrisOutlined,
//                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
//                focusedLabelColor = GrisOutlined,
//                unfocusedLabelColor = GrisOutlined,
//                cursorColor = GrisOutlined
//            )
//        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp) // Espaciado entre elementos
        ) {
            OutlinedTextField(
                value = domicilio,
                onValueChange = { domicilio = it },
                modifier = Modifier
                    .weight(1f), // Ocupa la mitad del espacio disponible
                singleLine = true,
                label = { Text("Empresa") },
                shape = MaterialTheme.shapes.large.copy(all = CornerSize(10.dp)),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = GrisOutlined,
                    unfocusedBorderColor = GrisOutlined,
                    focusedLabelColor = GrisOutlined,
                    unfocusedLabelColor = GrisOutlined,
                    cursorColor = GrisOutlined
                )
            )

            OutlinedTextField(
                value = ciudad,
                onValueChange = { ciudad = it },
                modifier = Modifier
                    .weight(1f), // Ocupa la otra mitad del espacio disponible
                label = { Text("NIF") },
                shape = MaterialTheme.shapes.large.copy(all = CornerSize(10.dp)),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = GrisOutlined,
                    unfocusedBorderColor = GrisOutlined,
                    focusedLabelColor = GrisOutlined,
                    unfocusedLabelColor = GrisOutlined,
                    cursorColor = GrisOutlined
                )
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Campo Dirección ocupa todo el ancho
        OutlinedTextField(
            value = provincia,
            onValueChange = { provincia = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Dirección") },
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(10.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = GrisOutlined,
                unfocusedBorderColor = GrisOutlined,
                focusedLabelColor = GrisOutlined,
                unfocusedLabelColor = GrisOutlined,
                cursorColor = GrisOutlined
            )
        )



        Spacer(modifier = Modifier.size(32.dp))

        Text(
            text = "4. Otros datos:",
            //style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
            //fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        OutlinedTextField(
            value = dni,
            onValueChange = { dni = it },
            modifier = Modifier
                .fillMaxWidth(),
            //.height(56.dp),
            label = { Text("DNI/NIE") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = GrisOutlined,
                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
                focusedLabelColor = GrisOutlined,
                unfocusedLabelColor = GrisOutlined,
                cursorColor = GrisOutlined
            ),
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.,
//                    contentDescription = "Phone Icon",
//                    tint = GrisOutlined //aqui para el cambio de color
//                )
//            }
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) {
//            ImgDecorativa(
//                modifier = Modifier
//                    .align(Alignment.CenterVertically)
//            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ){
            Button(
                onClick = { /* Acción de siguiente */ },
                colors = ButtonDefaults.buttonColors(Color(0xFF3F51B5)),
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .height(50.dp)
            ) {
                Text("enviar", color = Color.White, fontSize = 18.sp)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    Icons.Default.Send,
                    contentDescription = "enviar formulario",
                    tint = Color.White
                )
            }
        }
    }

    }

@Composable
fun LlamadaFunciones(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 10.dp)
    ){
        CamposFormulario(modifier = Modifier)
    }
}