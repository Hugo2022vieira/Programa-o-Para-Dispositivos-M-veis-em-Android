package com.exemplo.topcursosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.exemplo.topcursosapp.ui.theme.TopCursosAppTheme
import com.exemplo.topcursosapp.ui.theme.VerdeAcqua
import com.exemplo.topcursosapp.ui.theme.VerdeMusgo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopCursosAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = VerdeAcqua
                ) {
                    CursoListScreen()
                }
            }
        }
    }
}

@Composable
fun CursoListScreen() {
    val cursos = listOf(
        Curso("Informática Básica", "Curso introdutório com noções gerais.", R.drawable.informatica_basica),
        Curso("Excel Básico", "Introdução ao Excel e suas fórmulas.", R.drawable.excel_basico),
        Curso("Introdução à Programação", "Primeiros passos no mundo da lógica.", R.drawable.intro_programacao),
        Curso("Introdução à Internet", "Conceitos de navegação e uso seguro.", R.drawable.intro_internet),
        Curso("Word Essencial", "Formatação e edição de textos.", R.drawable.word_essencial),
        Curso("Windows 10/11", "Operações e configurações básicas.", R.drawable.windows),
        Curso("Segurança da Informação", "Boas práticas e proteção digital.", R.drawable.seguranca_info),
        Curso("Digitação", "Técnicas de digitação rápida e correta.", R.drawable.digitacao),
        Curso("Montagem e Manutenção", "Aprenda a montar e cuidar do PC.", R.drawable.montagem_manutencao),
        Curso("Excel Intermediário", "Funções, gráficos e recursos avançados.", R.drawable.excel_intermediario)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(VerdeMusgo)
            .padding(8.dp)
    ) {
        items(cursos.size) { index ->
            CursoCard(curso = cursos[index]) {
                // Aqui podemos colocar ação ao clicar no curso
            }
        }
    }
}
