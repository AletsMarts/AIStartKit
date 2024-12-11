package com.example.aistartkit.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aistartkit.R

// Mapa que almacena la información de cada material
val materialsInfo = mapOf(
    "Balanza Analítica" to Pair(
        R.drawable.balanza,
        """
        Una balanza analítica es un instrumento de laboratorio diseñado para medir masas con una precisión extremadamente alta, generalmente hasta 0.1 mg (0.0001 g). Es ideal para aplicaciones en química, biología, y otras ciencias donde se requieren mediciones exactas.
        
        Uso:
        • Preparación: Asegúrate de que la balanza esté nivelada y ubicada en una superficie estable y libre de vibraciones.
        • Encendido y calibración: Enciende la balanza y calibra si es necesario.
        
        Recomendaciones:
        • Evita corrientes de aire y vibraciones: Usa la balanza en un lugar cerrado o protegido para garantizar mediciones precisas.
        • Mantenimiento regular: Limpia el plato y la cabina después de cada uso para evitar residuos.
        """
    ),
    "Bureta" to Pair(
        R.drawable.bureta,
        """
        Una bureta es un instrumento volumétrico utilizado en química para medir y dispensar volúmenes precisos de líquidos, generalmente en experimentos de titulación.
        
        Uso:
        1. Limpia la bureta con agua destilada y enjuágala con la solución a utilizar.
        2. Llena la bureta con la solución química usando un embudo.
        3. Ajusta el nivel del líquido hasta la marca deseada.
        
        Recomendaciones:
        • Limpieza previa y posterior: Lava la bureta antes y después de su uso.
        • Evita burbujas de aire: Asegúrate de que no queden burbujas en la llave.
        """
    ),
    "Condensador" to Pair(
        R.drawable.condensador,
        """
        Un condensador es un instrumento de vidrio utilizado en laboratorios para enfriar y condensar vapores en líquidos.
        
        Uso:
        1. Conecta el condensador a otros componentes del sistema.
        2. Asegura el flujo de agua constante.
        
        Recomendaciones:
        • Asegura un flujo constante de agua para un enfriamiento adecuado.
        • Verifica las conexiones para evitar fugas.
        """
    ),
    "Desecador" to Pair(
        R.drawable.desecador,
        """
        El desecador es un recipiente de vidrio hermético utilizado en laboratorios de química para secar sustancias y mantenerlas libres de humedad. Su diseño incluye una base para colocar un agente desecante (como gel de sílice o cloruro de calcio) y una plataforma perforada para sostener las muestras, evitando el contacto directo con el desecante. Algunos desecadores pueden conectarse a bombas de vacío para acelerar el proceso de secado.
        
   Uso:
        1.	Preparación: Coloca un agente desecante seco en la base del desecador.	Asegúrate de que el desecante esté distribuido de manera uniforme.
        2.	Colocación de la muestra: Coloca la sustancia que deseas secar o proteger sobre la plataforma o una placa de porcelana en el interior del desecador.
        3.	Cierre hermético: Coloca la tapa del desecador asegurándote de que esté bien sellada. Si es necesario, aplica grasa de silicona en la junta de vidrio para evitar la entrada de aire.

        
  Recomendaciones:
       •	Verifica el desecante: Reemplázalo o regénéralo cuando esté saturado de agua (puedes observar un cambio de color en algunos desecantes como el gel de sílice).
       •	Evita colocar muestras calientes: Permite que las muestras se enfríen antes de introducirlas, ya que el calor puede provocar condensación en el interior.
        """
    ),
    "Embudo" to Pair(
        R.drawable.embudo,
        """
       El embudo de vidrio es un instrumento de laboratorio con forma cónica, diseñado para transferir líquidos o sólidos de un recipiente a otro de manera controlada, evitando derrames. También se utiliza en procesos de filtración con papel filtro, para separar sólidos de líquidos. Su material de vidrio lo hace resistente a la mayoría de los productos químicos, permitiendo su uso con sustancias corrosivas o a altas temperaturas.

 Uso:
1.	Preparación:	Limpia el embudo para evitar contaminaciones. 	Si es para filtración, coloca un papel filtro recortado a la medida del embudo, asegurándote de que esté bien ajustado a las paredes cónicas.
2.	Colocación: 	Inserta el embudo en la boca del recipiente receptor (como un matraz o vaso de precipitados). Asegúrate de que el tubo del embudo no toque las paredes interiores del recipiente para permitir una salida de aire continua.

Recomendaciones:
•	Usa el tamaño adecuado: Elige un embudo con un diámetro proporcional a la cantidad de líquido o sólido que manipularás.
•	Evita daños: No lo expongas a cambios bruscos de temperatura para prevenir fracturas en el vidrio.
•	Selecciona papel filtro de calidad: Si filtras, asegúrate de que el papel tenga la porosidad adecuada para retener el sólido deseado.

        """
    ),

    "Embudo de Decantación" to Pair(
        R.drawable.embudo_decantacion,
        """
      El embudo de decantación, también conocido como embudo de separación, es un instrumento de vidrio con forma cónica o esférica, equipado con una llave de paso en la parte inferior y una tapa en la superior. Se utiliza en laboratorios de química para separar mezclas de líquidos inmiscibles (que no se mezclan entre sí) basándose en sus densidades. Es especialmente útil en procesos de extracción líquido-líquido.

Uso:
1.	Preparación:	Limpia y seca el embudo antes de usarlo. 	Coloca el embudo en un soporte para garantizar su estabilidad.
2.	Añadir la mezcla: Retira la tapa superior y vierte la mezcla de líquidos inmiscibles dentro del embudo.	Coloca la tapa nuevamente para cerrar herméticamente.
3.	Agitación (si aplica): Invierte el embudo (sujetando la tapa y la llave firmemente) y agítalo suavemente para mezclar los líquidos, permitiendo la transferencia de los compuestos entre fases.

Recomendaciones:
•	Revisa la llave de paso: Asegúrate de que no tenga fugas antes de iniciar el experimento.
•	Controla la presión: Al agitar, libera la presión frecuentemente para evitar accidentes.
•	Usa el soporte adecuado: Asegura el embudo con un anillo o abrazadera para evitar caídas.

        """
    ),

    "Matraz Erlenmeyer" to Pair(
        R.drawable.matraz_erlenmeyer,
        """
     El matraz Erlenmeyer es un recipiente de vidrio caracterizado por su forma cónica y cuello estrecho. Su diseño lo hace ideal para agitar soluciones sin riesgo de derrames y para realizar mezclas, reacciones químicas y titulaciones. Es un instrumento básico en los laboratorios químicos y está disponible en diferentes capacidades, generalmente en vidrio borosilicato resistente al calor y productos químicos.

Uso:
1.	Preparación: Asegúrate de que el matraz esté limpio y seco antes de su uso. 	Selecciona un matraz del tamaño adecuado según el volumen de la sustancia que vayas a trabajar.
2.	Añadir sustancias: 	Introduce líquidos, soluciones o reactivos a través del cuello estrecho del matraz, utilizando un embudo si es necesario.
3.	Calentamiento (si aplica): 	Si necesitas calentar el contenido, coloca el matraz sobre una rejilla metálica o una placa calefactora. El vidrio borosilicato soporta altas temperaturas, pero no debe exponerse a cambios bruscos.

Recomendaciones:
•	Evita cambios térmicos bruscos: No enfríes ni calientes el matraz repentinamente para prevenir fracturas.
•	Usa soportes: Si necesitas estabilidad al calentar o durante experimentos largos, colócalo sobre un trípode o soporte adecuado.
•	Tapas adecuadas: Utiliza tapas de goma, vidrio o algodón según el experimento, evitando la contaminación o pérdidas.

        """
    ),

    "Matraz Bola" to Pair(
        R.drawable.matraz_bola,
        """
    El matraz bola, también conocido como matraz esférico, es un recipiente de vidrio con forma redonda y un cuello estrecho. Está diseñado para contener líquidos y realizar procesos químicos que impliquen calentamiento uniforme, destilación o reacciones de largo tiempo. Puede tener una base plana para mayor estabilidad o una base redonda, que requiere soporte durante su uso.

Uso:
1.	Preparación: 	Inspecciona el matraz para asegurarte de que no tenga grietas o residuos previos. 	Si tiene cuello esmerilado, verifica que las juntas y tapones sean compatibles para evitar fugas.
2.	Añadir sustancias: 	Introduce líquidos o reactivos por el cuello del matraz utilizando un embudo si es necesario. 	No llenes más de la mitad de su capacidad si planeas calentar o agitar el contenido.

Recomendaciones:
•	Evita cambios bruscos de temperatura: No expongas el matraz a frío o calor extremo de forma repentina para prevenir fracturas.
•	Utiliza soportes adecuados: Si el matraz tiene base redonda, colócalo en un soporte con aro metálico o una abrazadera para mantenerlo fijo.
•	Usa equipos de seguridad: Durante reacciones químicas, asegúrate de trabajar en una campana de extracción si hay emisión de gases.

        """
    ),

    "Matraz Volumétrico" to Pair(
        R.drawable.matraz_v,
        """
   El matraz volumétrico es un recipiente de vidrio de base plana con un cuello largo y estrecho que posee una marca de calibración (aforo). Se utiliza para medir con alta precisión un volumen específico de líquidos, siendo indispensable en análisis cuantitativos y preparación de soluciones con concentraciones exactas. Los matraces volumétricos suelen estar fabricados de vidrio borosilicato o plástico resistente a productos químicos.
Uso:
1.	Preparación: 	Asegúrate de que el matraz esté limpio y seco antes de usarlo. 	Identifica el volumen indicado en el cuerpo del matraz (por ejemplo, 100 mL, 250 mL).
2.	Añadir sustancias: 	Agrega la cantidad adecuada del soluto o sustancia a disolver. 	Añade una parte del solvente para ayudar a disolver el soluto. Agita suavemente hasta que la sustancia se disuelva completamente.
3.	Llenado hasta el aforo: 	Llena el matraz con solvente (agua destilada, por ejemplo) hasta acercarte a la marca de calibración. 	Utiliza una pipeta o gotero para ajustar el nivel de líquido exactamente a la marca de aforo. Asegúrate de que la base del menisco esté alineada con la marca cuando observes a nivel de los ojos.

Recomendaciones:
•	Manejo cuidadoso: Nunca llenes en exceso el matraz, ya que esto afecta la precisión de la medida.
•	Evita residuos: Limpia el matraz inmediatamente después de usarlo para evitar contaminación o formación de depósitos.

        """
    ),
    "Mortero" to Pair(
        R.drawable.mortero,
        """
  El mortero es un instrumento de laboratorio compuesto por un recipiente resistente (generalmente de porcelana, vidrio o ágata) y un mazo o pistilo. Se utiliza principalmente para triturar, pulverizar o mezclar sustancias sólidas, transformándolas en polvos finos o pastas, lo cual es esencial para aumentar la superficie de contacto en reacciones químicas o facilitar la disolución de sólidos.

Uso:
1.	Preparación: 	Asegúrate de que el mortero y el pistilo estén limpios y secos antes de usarlos.Elige un mortero de un material adecuado según la sustancia que vas a triturar (por ejemplo, evita el uso de ácidos fuertes en morteros de porcelana).
2.	Añadir la sustancia: 	Coloca la sustancia sólida que deseas triturar dentro del mortero. No llenes más de la mitad de su capacidad para evitar derrames y trabajar con mayor comodidad.

Recomendaciones:
•	Elige el material adecuado: 	Porcelana: Ideal para sustancias no abrasivas o reacciones generales. 	Ágata: Más resistente, utilizado para materiales duros y abrasivos. 	Vidrio: Usado para sustancias químicamente agresivas que no reaccionan con el vidrio.
•	Evita contaminaciones cruzadas: Limpia el mortero y el pistilo a fondo entre usos para evitar mezclar compuestos diferentes.

        """
    ),
    "Pipeta" to Pair(
        R.drawable.pipeta,
        """
  La pipeta es un instrumento de laboratorio utilizado para medir y transferir volúmenes específicos de líquidos con alta precisión. Existen varios tipos de pipetas, como las pipetas volumétricas (de un solo aforo) y las graduadas (que permiten medir diferentes volúmenes), todas diseñadas para operaciones donde la exactitud y la repetibilidad son esenciales.

Uso:
1.	Preparación: Asegúrate de que la pipeta esté limpia y seca. 	Selecciona la pipeta adecuada según el volumen que necesites medir.
2.	Toma de líquido: 	Inserta la punta de la pipeta en el líquido a transferir. 	Usa una perilla de succión o un propipeta para aspirar el líquido (nunca uses la boca por motivos de seguridad). 	Asegúrate de que el líquido suba ligeramente por encima de la marca o el nivel deseado.
3.	Ajuste al volumen: Retira lentamente el exceso de líquido hasta que la base del menisco quede alineada con la marca de graduación, manteniendo la pipeta a la altura de los ojos para evitar errores de paralaje.

Recomendaciones:
•	Elige la pipeta adecuada: Usa pipetas volumétricas para medidas exactas de un único volumen y graduadas para volúmenes variables.
•	Evita errores de paralaje: Coloca siempre el menisco al nivel de tus ojos para asegurar una medición precisa.

        """
    ),
    "Piseta" to Pair(
        R.drawable.piseta,
        """
 La piseta es un recipiente de plástico o vidrio (generalmente de polietileno), equipado con un tubo curvo en su tapa que permite la salida controlada de líquidos a través de presión manual. Es utilizada principalmente para enjuagar recipientes, disolver residuos en reacciones químicas o suministrar pequeñas cantidades de solventes, como agua destilada.

Uso:
1.	Llenado: Llena la piseta con el líquido requerido, como agua destilada, disolventes o reactivos específicos. 	Cierra bien la tapa para evitar derrames o fugas.
2.	Uso: 	Sostén la piseta con una mano y apunta el tubo curvo hacia el área o recipiente que deseas limpiar o enjuagar. 	Aplica presión sobre las paredes flexibles de la piseta para liberar un flujo de líquido controlado.

Recomendaciones:
•	Identificación del contenido: Etiqueta claramente la piseta con el líquido que contiene (por ejemplo, agua destilada, acetona, etanol) para evitar confusiones o accidentes.
•	Evita contaminación cruzada: Usa una piseta diferente para cada tipo de líquido o solvente.

        """
    ),
    "Probeta" to Pair(
        R.drawable.probeta,
        """
La probeta es un cilindro de vidrio o plástico graduado, utilizado para medir y contener volúmenes específicos de líquidos con una precisión moderada. Es una herramienta común en los laboratorios de química para realizar mediciones de líquidos en procesos experimentales, donde la precisión no es tan crítica como en el caso de pipetas o buretas.

Uso:
1.	Preparación: 	Asegúrate de que la probeta esté limpia y seca antes de usarla. 	Colócala sobre una superficie plana y estable para evitar errores en la medición.
2.	Medición del líquido: 	Vierte el líquido en la probeta lentamente para evitar derrames o formación de burbujas. 	Observa el nivel del líquido a la altura de tus ojos y asegúrate de que la base del menisco (la curva que forma el líquido) coincida con la marca de graduación deseada.

Recomendaciones:
•	Elige el tamaño adecuado: Usa una probeta con un rango de medición cercano al volumen que necesitas medir para maximizar la precisión.
•	Evita errores de paralaje: Siempre mide el volumen colocando la probeta a la altura de tus ojos.
        """
    ),
    "Soporte Universal" to Pair(
        R.drawable.soporte,
        """
	El soporte universal es un equipo básico y esencial en los laboratorios de química. Consiste en una base metálica rectangular o triangular, con una barra vertical de metal. Se utiliza como estructura principal para sostener otros equipos y materiales mediante el uso de pinzas o anillos, permitiendo realizar una amplia variedad de experimentos con seguridad y estabilidad.

Uso:
1.	Montaje básico:	Coloca el soporte universal sobre una superficie plana y estable.	Asegúrate de que la barra esté correctamente enroscada en la base para garantizar la estabilidad.
2.	Uso con accesorios: 	Fija las pinzas, anillos metálicos o soportes ajustables al poste vertical según el equipo que desees sujetar (por ejemplo, buretas, matraces o embudos). 	Ajusta las pinzas o anillos con firmeza, pero sin apretar excesivamente para no dañar el equipo de vidrio.

Recomendaciones:
•	Estabilidad: Asegúrate de que el soporte esté en una superficie plana y fija. Si el equipo montado es pesado, utiliza contrapesos o un soporte con una base más amplia.
•	Evita el sobreapriete: Ajusta las pinzas y anillos con firmeza, pero sin aplicar demasiada fuerza, especialmente cuando sostienes material de vidrio.

        """
    ),
    "Termometro de Alcohol" to Pair(
        R.drawable.termometro_al,
        """
	El termómetro de alcohol es un instrumento de medición utilizado para determinar la temperatura en diferentes procesos químicos. Está compuesto por un tubo de vidrio cerrado que contiene alcohol teñido con colorantes para facilitar su lectura. A diferencia de los termómetros de mercurio, es más seguro y menos tóxico, lo que lo convierte en una opción preferida en laboratorios educativos y experimentales.

Uso:
1.	Preparación: 	Limpia el termómetro con un paño suave antes de usarlo. 	Verifica que no tenga burbujas en la columna de alcohol; si las hay, golpea suavemente el termómetro con cuidado.
2.	Medición de temperatura: Introduce el bulbo del termómetro en la sustancia o medio cuya temperatura deseas medir (líquido, solución o aire). 	Asegúrate de que el bulbo esté completamente sumergido, pero sin tocar las paredes o el fondo del recipiente para evitar lecturas incorrectas.

Recomendaciones:
•	Rango de temperatura: Asegúrate de que el termómetro sea adecuado para el rango de temperatura que vas a medir, ya que los termómetros de alcohol suelen tener un límite superior menor que los de mercurio.
•	Evita temperaturas extremas: No expongas el termómetro a temperaturas superiores a su capacidad, ya que el alcohol podría evaporarse o romper el termómetro.

        """
    ),
    "Tubo de Ensaye" to Pair(
        R.drawable.tubo_ensaye,
        """
	El tubo de ensayo es un recipiente cilíndrico alargado, generalmente de vidrio, utilizado en laboratorios de química para contener, mezclar, calentar o realizar reacciones químicas a pequeña escala. Es una herramienta esencial en experimentos básicos y avanzados por su versatilidad y facilidad de uso.
Uso:
1.	Preparación:	Asegúrate de que el tubo de ensayo esté limpio y seco antes de usarlo. 	Colócalo en un soporte para tubos de ensayo o sostenlo con una pinza adecuada para evitar derrames.
2.	Añadir sustancias: Introduce reactivos o muestras en el tubo usando una pipeta, espátula o directamente desde un recipiente. No llenes el tubo más de un tercio de su capacidad para evitar derrames durante los procesos.

Recomendaciones:
•	Usa el soporte adecuado: Coloca los tubos en un soporte o gradilla cuando no los estés manipulando para evitar que rueden y se rompan.
•	Maneja con cuidado al calentar: No expongas el tubo directamente a una llama intensa o a un cambio brusco de temperatura para evitar que se rompa.
•	No sobrecargues el tubo: Mantén un volumen adecuado de sustancia para permitir la mezcla y evitar derrames.
        """
    ),
    "Vaso Precipitado" to Pair(
        R.drawable.vaso_precipitado,
        """
	El vaso de precipitado es un recipiente cilíndrico, generalmente de vidrio borosilicato o plástico, con una base plana y un pico vertedor. Es una herramienta básica en los laboratorios de química y se utiliza para medir, contener, calentar, mezclar y decantar líquidos, así como para realizar reacciones químicas simples.

Uso:
1.	Preparación: Asegúrate de que el vaso de precipitado esté limpio y seco antes de usarlo. Colócalo sobre una superficie plana o sobre una rejilla metálica si planeas calentarlo.
2.	Medición y mezcla: Vierte líquidos o reactivos en el vaso hasta el volumen deseado, utilizando el pico vertedor para evitar derrames. Usa varillas de vidrio para mezclar las sustancias, si es necesario.

Recomendaciones:
•	Evita choques térmicos: No calientes ni enfríes bruscamente el vaso de precipitado, ya que esto puede romperlo.
•	No lo uses como medidor exacto: Aunque tiene marcas de volumen, no es un instrumento de medición precisa; usa probetas o matraces volumétricos para este propósito.

        """
    ),
    "Vidrio de Reloj" to Pair(
        R.drawable.vidrioreloj,
        """
	El vidrio de reloj es un pequeño disco de vidrio redondeado, plano y de bordes ligeramente elevados, utilizado comúnmente en laboratorios de química. Su nombre proviene de su forma, que recuerda a la cubierta de un reloj. Se usa principalmente para contener pequeñas cantidades de sustancias, como muestras, y para procesos como evaporación o pesaje.

Uso:
1.	Preparación: Asegúrate de que el vidrio de reloj esté limpio y seco antes de usarlo, especialmente si lo vas a utilizar para pesar sustancias.
2.	Pesaje de sustancias: 	Coloca el vidrio de reloj en una balanza analítica para pesar pequeñas cantidades de reactivos o productos de una reacción. 	Usa una espátula para transferir la sustancia al vidrio de reloj, y evita el contacto directo con la mano para prevenir contaminaciones.

Recomendaciones:
•	Manejo cuidadoso: El vidrio de reloj es frágil, por lo que se debe manejar con precaución para evitar que se rompa.
•	Evita el sobrecalentamiento: Si se usa para evaporar líquidos, no lo expongas a altas temperaturas sin supervisión, ya que puede romperse.

        """
    ),
    //MATERIALES ELECTRICA
    "Amperímetro de Gancho" to Pair(
        R.drawable.amperimetrogancho,
        """
    El amperímetro de gancho, también llamado pinza amperimétrica, mide la corriente eléctrica en un circuito sin necesidad de desconectar los cables. Su diseño con forma de pinza permite abrazar el conductor para obtener la medición.

    Uso:
    1. Medir corriente: Coloca la pinza alrededor de un cable activo para medir la intensidad de la corriente en amperios.
    2. Diagnóstico: Útil para detectar problemas eléctricos en circuitos residenciales o industriales.

    Recomendaciones:
    • Verifica que el rango del amperímetro sea adecuado para la corriente a medir.
    • Mantén las manos alejadas de los puntos de contacto mientras realizas mediciones.
    """
    ),

    "Apagador" to Pair(
        R.drawable.apagador,
        """
    El apagador, también conocido como interruptor, se utiliza para encender o apagar el flujo de corriente hacia un dispositivo o lámpara. Es un componente esencial en circuitos eléctricos domésticos.

    Uso:
    1. Controlar iluminación: Instalado en paredes, permite manejar la energía que llega a lámparas o equipos eléctricos.
    2. Seguridad: Facilita desconectar dispositivos para mantenimiento.

    Recomendaciones:
    • Instálalo con materiales aislantes para evitar cortocircuitos.
    • Asegúrate de que esté desconectado de la corriente antes de manipularlo.
    """
    ),

    "Cinta de Aislar" to Pair(
        R.drawable.cintaaislar,
        """
    La cinta de aislar es una cinta adhesiva hecha de material aislante, como PVC, utilizada para proteger y aislar conexiones eléctricas expuestas.

    Uso:
    1. Cubrir cables pelados: Envuelve la cinta en los puntos de conexión para evitar cortocircuitos o descargas.
    2. Reparaciones temporales: Sella cables dañados como solución provisional.

    Recomendaciones:
    • Asegúrate de usar cinta de calidad para mayor durabilidad.
    • No la utilices en cables con alta tensión sin verificar su capacidad aislante.
    """
    ),

    "Contacto" to Pair(
        R.drawable.contacto,
        """
    El contacto es un dispositivo eléctrico que proporciona acceso a la corriente eléctrica a través de tomas o enchufes, comúnmente usado en hogares y oficinas.

    Uso:
    1. Alimentar dispositivos: Conecta enchufes para suministrar electricidad a equipos electrónicos.
    2. Distribuir energía: Útil en sistemas de extensión.

    Recomendaciones:
    • Usa contactos con tapas de seguridad en ambientes con niños.
    • Verifica que no haya sobrecarga conectando demasiados aparatos.
    """
    ),

    "Cutter" to Pair(
        R.drawable.cutter,
        """
    El cutter es una herramienta de corte con hoja retráctil, usada para cortar materiales como papel, plástico o cables.

    Uso:
    1. Cortar aislamientos: Útil para preparar cables antes de conectarlos.
    2. Manualidades: Adecuado para cortes precisos en proyectos de bricolaje.

    Recomendaciones:
    • Cambia la hoja cuando esté desgastada para evitar accidentes.
    • Úsalo siempre con cuidado para evitar cortes en los dedos.
    """
    ),

    "Desarmadores Aislados" to Pair(
        R.drawable.desarmadores_ais,
        """
    Los desarmadores aislados están recubiertos de material no conductor para evitar descargas eléctricas al trabajar con circuitos energizados.

    Uso:
    1. Instalaciones eléctricas: Aprieta o afloja tornillos en conexiones eléctricas.
    2. Reparaciones: Trabaja con equipos eléctricos sin riesgo de cortocircuitos.

    Recomendaciones:
    • Asegúrate de que la cobertura aislante esté en buen estado antes de usarlos.
    • No uses los desarmadores para otras tareas que puedan dañar el aislamiento.
    """
    ),

    "Guantes" to Pair(
        R.drawable.guantes,
        """
    Los guantes, especialmente los dieléctricos, protegen al usuario de descargas eléctricas al manipular instalaciones energizadas.

    Uso:
    1. Seguridad: Úsalos en trabajos eléctricos para evitar descargas.
    2. Protección: Previenen cortes y quemaduras.

    Recomendaciones:
    • Asegúrate de que sean del material adecuado para el voltaje con el que trabajarás.
    • Inspecciónalos antes de usarlos para garantizar que no tengan perforaciones.
    """
    ),

    "Guía Eléctrica" to Pair(
        R.drawable.guia_elect,
        """
    La guía eléctrica es una varilla flexible utilizada para introducir cables eléctricos en ductos o tubos.

    Uso:
    1. Instalación de cables: Facilita el paso de cables a través de conductos.
    2. Mantenimiento: Retira cables dañados con facilidad.

    Recomendaciones:
    • Lubrica la guía para un deslizamiento más suave.
    • Limpia la guía después de usarla para evitar acumulación de residuos.
    """
    ),

    "Interruptor Termomagnético" to Pair(
        R.drawable.int_ter,
        """
    Es un dispositivo de protección que interrumpe el flujo de corriente eléctrica cuando detecta sobrecargas o cortocircuitos.

    Uso:
    1. Protección: Evita daños en circuitos y dispositivos eléctricos.
    2. Seguridad: Minimiza riesgos de incendios por fallas eléctricas.

    Recomendaciones:
    • Verifica que esté dimensionado correctamente para el circuito.
    • Realiza revisiones periódicas para asegurar su buen funcionamiento.
    """
    ),

    "Pinzas de Puntas" to Pair(
        R.drawable.pinzas_punt,
        """
    Las pinzas de puntas son herramientas de precisión utilizadas para sujetar, doblar o cortar cables en espacios reducidos.

    Uso:
    1. Ajustes finos: Manipula componentes pequeños con precisión.
    2. Conexiones: Trabaja en áreas estrechas o difíciles de alcanzar.

    Recomendaciones:
    • Mantén las pinzas limpias y lubricadas para un mejor desempeño.
    • No las utilices para cortar materiales más duros de lo recomendado.
    """
    ),

    "Pinzas Pela Cable" to Pair(
        R.drawable.pinza_pela,
        """
    Estas pinzas están diseñadas para retirar el aislamiento de los cables sin dañarlos, facilitando su conexión.

    Uso:
    1. Pelado de cables: Retira el aislamiento de forma precisa.
    2. Preparación: Útil para conectar cables en terminales.

    Recomendaciones:
    • Ajusta la pinza al tamaño del cable para evitar cortes excesivos.
    • No uses las pinzas en cables energizados.
    """
    ),

    "Pinzas de Corte" to Pair(
        R.drawable.pinzas_corte,
        """
    Herramienta utilizada para cortar cables o alambres de diferentes grosores con precisión y facilidad.

    Uso:
    1. Corte de cables: Facilita el trabajo en instalaciones eléctricas.
    2. Reparaciones: Útil en proyectos de electrónica y electricidad.

    Recomendaciones:
    • Usa pinzas adecuadas para el grosor del material a cortar.
    • Evita exponerlas a humedad para prevenir oxidación.
    """
    ),

    "Probador de Circuitos" to Pair(
        R.drawable.probador,
        """
    Dispositivo utilizado para verificar la presencia de corriente eléctrica en un circuito o cable.

    Uso:
    1. Diagnóstico: Detecta si hay energía en cables o conexiones.
    2. Reparaciones: Confirma el estado de circuitos antes de trabajar.

    Recomendaciones:
    • Verifica que el probador esté en buen estado antes de usarlo.
    • No toques las puntas de prueba mientras realizas mediciones.
    """
    ),

    "Soquet" to Pair(
        R.drawable.soquet,
        """
    El soquet es el accesorio donde se instala una bombilla para proporcionar iluminación eléctrica en un espacio.

    Uso:
    1. Instalaciones de luz: Soporta y conecta bombillas al circuito.
    2. Reparaciones: Reemplaza soquets dañados para restaurar iluminación.

    Recomendaciones:
    • Elige soquets de calidad para evitar falsos contactos.
    • Desconecta la corriente antes de instalar o manipular un soquet.
    """
    ),

    //MATERIALES SISTEMAS

    "Arduino" to Pair(
        R.drawable.arduino,
        """
    Un Arduino es una plataforma de hardware y software de código abierto que permite desarrollar proyectos electrónicos interactivos. Está basada en microcontroladores programables y es ampliamente utilizada para crear prototipos y automatizar tareas.

    Cómo se usa:
    1. Conectar el hardware:
        • Conecta el Arduino a tu computadora mediante un cable USB.
        • Agrega sensores, actuadores, o componentes electrónicos según el proyecto.
    2. Instalar el software:
        • Descarga e instala el Arduino IDE (Entorno de Desarrollo Integrado) desde arduino.cc.
    3. Escribir el código:
        • Usa el lenguaje de programación basado en C/C++ que proporciona Arduino.
        • Los programas (llamados sketches) tienen dos funciones principales:
            - setup(): Configura los componentes y se ejecuta una vez.
            - loop(): Contiene las instrucciones que se repiten continuamente.
    4. Subir el código:
        • Selecciona la placa y el puerto adecuado en el IDE.
        • Haz clic en el botón de subir (Upload) para cargar el código en el Arduino.
    5. Ejecutar y probar:
        • El Arduino ejecutará el código y controlará los componentes conectados.
    6. Ajustar y mejorar:
        • Modifica el código o el diseño según sea necesario para optimizar el proyecto.

    Recomendaciones:
    • Comienza con lo básico: Aprende a encender y apagar un LED (ejemplo clásico de "Hello World" en Arduino).
    • Usa recursos de aprendizaje: Explora tutoriales en línea y ejemplos preinstalados en el Arduino IDE.
    • Organiza tu proyecto: Planifica el diseño del circuito antes de conectar los componentes.
    • Evita sobrecargar el microcontrolador: Usa relevadores o fuentes externas si es necesario.
    • Cuida el hardware: Verifica siempre las conexiones antes de energizar el circuito.
    """
    ),

    "Android Studio" to Pair(
        R.drawable.android,
        """
    Android es un sistema operativo móvil desarrollado por Google, basado en el núcleo de Linux, diseñado para dispositivos móviles como teléfonos inteligentes, tabletas, relojes inteligentes y más.

    Cómo se usa:
    1. Interacción básica:
        • Navega por la interfaz tocando, deslizando y presionando los botones virtuales o físicos.
        • Personaliza la pantalla de inicio con widgets y accesos directos.
    2. Instalación de aplicaciones:
        • Usa Google Play Store para descargar e instalar aplicaciones.
    3. Configuración del dispositivo:
        • Configura cuentas de Google para sincronizar datos.
        • Ajusta la configuración en el menú Ajustes.
    4. Funciones avanzadas:
        • Aprovecha características como la multitarea y sincronización con otros dispositivos.

    Recomendaciones:
    • Mantén tu dispositivo actualizado.
    • Descarga aplicaciones solo de fuentes confiables.
    • Optimiza el rendimiento ajustando configuraciones de ahorro de energía.
    """
    ),

    "Calculadora" to Pair(
        R.drawable.calculadora,
        """
    Una calculadora es un dispositivo, físico o digital, diseñado para realizar operaciones matemáticas.

    Cómo se usa:
    1. Encenderla:
        • Pulsa el botón de encendido o abre la aplicación de calculadora.
    2. Realizar cálculos básicos:
        • Introduce los números y selecciona las operaciones (+, -, ×, ÷).
    3. Funciones avanzadas:
        • Usa teclas específicas para cálculos como raíces, potencias o trigonometría.
    4. Memoria y ajustes:
        • Guarda valores en la memoria para reutilizarlos.

    Recomendaciones:
    • Usa una calculadora adecuada para tus necesidades.
    • Familiarízate con las funciones avanzadas.
    • Revisa los resultados en cálculos complejos.
    """
    ),

    "Laptop" to Pair(
        R.drawable.laptop,
        """
    Una laptop es un ordenador portátil diseñado para ser transportado y usado fácilmente en diferentes lugares.

    Cómo se usa:
    1. Encender y configurar:
        • Presiona el botón de encendido.
        • Configura tu sistema operativo.
    2. Uso básico:
        • Utiliza el teclado y el touchpad para navegar y realizar tareas.
    3. Conectividad:
        • Conéctala a redes Wi-Fi o por cable Ethernet para acceder a internet.

    Recomendaciones:
    • Instala un buen antivirus y mantén el sistema operativo actualizado.
    • Evita consumir alimentos cerca de la laptop.
    • Ajusta el brillo para ahorrar batería.
    """
    ),

    "Router" to Pair(
        R.drawable.router,
        """
    Un router es un dispositivo de red que conecta diferentes dispositivos a una red local y a Internet.

    Cómo se usa:
    1. Conexión del hardware:
        • Conecta el cable de entrada de Internet al puerto WAN del router.
    2. Configuración inicial:
        • Accede al panel de configuración escribiendo la dirección IP del router en un navegador web.
    3. Configura la red Wi-Fi:
        • Cambia el nombre de la red y configura una contraseña segura.

    Recomendaciones:
    • Cambia las credenciales de administrador predeterminadas.
    • Colócalo en un lugar central para maximizar la cobertura Wi-Fi.
    """
    ),

    "Sensor" to Pair(
        R.drawable.sensor,
        """
    Un sensor ultrasónico mide distancias utilizando ondas de sonido de alta frecuencia.

    Cómo se usa:
    1. Conexión del hardware:
        • Conecta el sensor a un microcontrolador como Arduino.
    2. Configuración del software:
        • Usa un entorno de programación como Arduino IDE.
    3. Calculo de distancia:
        • Aplica la fórmula: Distancia = (Tiempo del eco × Velocidad del sonido) / 2.

    Recomendaciones:
    • Coloca el sensor lejos de fuentes de ruido ultrasónico.
    • Asegúrate de que los objetos estén dentro del rango operativo del sensor.
    """
    ),

    "Switch" to Pair(
        R.drawable.switch1,
        """
    Un switch es un dispositivo de red que conecta múltiples dispositivos dentro de una red local.

    Cómo se usa:
    1. Conexión del hardware:
        • Conecta el switch a una fuente de alimentación.
        • Conecta dispositivos mediante cables Ethernet.
    2. Funcionamiento básico:
        • El switch identifica automáticamente las direcciones MAC de los dispositivos conectados.

    Recomendaciones:
    • Usa un switch gestionable para configuraciones avanzadas.
    • Coloca el switch en un lugar ventilado para evitar el sobrecalentamiento.
    """
    ),
    "Access" to Pair(
        R.drawable.access,
        """
    Microsoft Access es un sistema de gestión de bases de datos (DBMS) que permite a los usuarios crear, gestionar y analizar bases de datos. Es parte del paquete de Microsoft Office y ofrece una interfaz gráfica de usuario para facilitar la creación de bases de datos.

    Cómo se usa:
    1. Crear una base de datos:
        • Abre Microsoft Access y selecciona "Nuevo".
    2. Diseñar las tablas:
        • Crea tablas con campos para almacenar datos organizados.
    3. Ingresar datos:
        • Ingresa datos directamente o importa desde fuentes externas.
    4. Crear relaciones:
        • Establece vínculos entre tablas para bases de datos complejas.
    5. Diseñar formularios:
        • Crea formularios personalizados para entrada de datos.
    6. Crear consultas:
        • Filtra y analiza datos con herramientas avanzadas.
    7. Generar informes:
        • Presenta datos con informes personalizados.

    Recomendaciones:
    • Planifica la base de datos antes de empezar.
    • Usa claves primarias para evitar duplicados.
    • Protege la base de datos con contraseñas.
    • Realiza copias de seguridad regulares.
    """
    ),

    "Diagrama de Flujo" to Pair(
        R.drawable.diagramadeflujo,
        """
    Un diagrama de flujo es una representación gráfica que muestra el proceso de un sistema o una serie de pasos de manera secuencial.

    Cómo se usa:
    1. Definir el proceso:
        • Identifica y enumera los pasos o actividades.
    2. Seleccionar los símbolos adecuados:
        • Usa óvalos, rectángulos, rombos y flechas para representar los pasos.
    3. Conectar los pasos:
        • Conecta los símbolos con flechas indicando el flujo.
    4. Revisar el diagrama:
        • Verifica que sea claro y lógico.

    Recomendaciones:
    • Simplifica el proceso para facilitar la comprensión.
    • Usa símbolos estandarizados.
    • Mantén la dirección del flujo clara y consistente.
    """
    ),

    "Diagrama de Ishikawa" to Pair(
        R.drawable.diagramadeishikawa,
        """
    El diagrama de Ishikawa, o de causa y efecto, es una herramienta visual utilizada para identificar y analizar las causas posibles de un problema.

    Cómo se usa:
    1. Definir el problema (efecto):
        • Especifica claramente el problema a analizar.
    2. Dibujar el diagrama:
        • Dibuja una línea horizontal con el problema al final y agrega espinas principales.
    3. Identificar las causas:
        • Agrega causas secundarias y terciarias.
    4. Analizar y priorizar:
        • Identifica las causas más relevantes para abordarlas.

    Recomendaciones:
    • Sé específico en las causas.
    • Involucra al equipo en el análisis.
    • Usa el diagrama como herramienta de mejora continua.
    """
    ),

    "Foda" to Pair(
        R.drawable.foda,
        """
    El Análisis FODA (Fortalezas, Oportunidades, Debilidades, Amenazas) es una herramienta estratégica para evaluar factores internos y externos.

    Cómo se realiza:
    1. Recopilar información:
        • Reúne datos relevantes sobre la situación.
    2. Identificar fortalezas:
        • Analiza los puntos fuertes internos.
    3. Identificar debilidades:
        • Evalúa los aspectos internos a mejorar.
    4. Identificar oportunidades:
        • Explora factores externos que pueden beneficiar.
    5. Identificar amenazas:
        • Considera riesgos o desafíos externos.
    6. Desarrollar estrategias:
        • Combina factores FODA para crear planes de acción.

    Recomendaciones:
    • Sé honesto y objetivo.
    • Actualiza el análisis periódicamente.
    • Desarrolla planes de acción claros.
    """
    ),
// MATERIALES ELECTRONICA
    "Alicates" to Pair(
        R.drawable.alicates,
        """
    Un alicate es una herramienta manual utilizada para sujetar, doblar, cortar o manipular objetos con precisión.

    Cómo se usa:
    1. Agarra el objeto:
        • Coloca las mordazas del alicate alrededor del objeto que deseas manipular.
    2. Aplica presión:
        • Cierra las asas del alicate para realizar la acción requerida (corte, doblado, etc.).

    Recomendaciones:
    • Escoge el alicate adecuado según la tarea (corte, presión, punta fina, etc.).
    • Mantén el alicate limpio después de cada uso.
    • Verifica que las mordazas estén en buen estado para un mejor desempeño.
    """
    ),

    "Guantes" to Pair(
        R.drawable.guantes,
        """
    Los guantes son prendas de protección que se usan en las manos para evitar lesiones, contaminaciones o infecciones.

    Cómo se usan:
    1. Selección adecuada:
        • Escoge guantes resistentes al corte, químicos o abrasión según la tarea.
    2. Colocación:
        • Ajusta los guantes correctamente para un buen manejo y seguridad.

    Recomendaciones:
    • Inspecciona los guantes antes de usarlos para descartar agujeros o defectos.
    • Usa guantes desechables una sola vez y limpia los reutilizables tras cada uso.
    • Selecciona el material adecuado: látex, nitrilo, cuero, etc., según el trabajo.
    """
    ),

    "Microfibra" to Pair(
        R.drawable.microfibra,
        """
    La microfibra es un material sintético utilizado en paños, toallas y ropa por su alta absorción y suavidad.

    Cómo se usa:
    1. Limpieza y secado:
        • Usa un paño de microfibra seco o ligeramente humedecido para limpiar superficies.
    2. Ropa y textiles:
        • En ropa deportiva, aprovecha su ligereza y capacidad de secado rápido.

    Recomendaciones:
    • Evita el uso de suavizantes al lavar microfibra.
    • Lava con detergente suave en agua fría o tibia.
    • No uses calor excesivo para secar artículos de microfibra.
    """
    ),

    "Protoboard" to Pair(
        R.drawable.protoboard,
        """
    Un protoboard es una herramienta utilizada para construir circuitos electrónicos sin necesidad de soldar componentes.

    Cómo se usa:
    1. Conexión de componentes:
        • Inserta los componentes electrónicos en las ranuras del protoboard.
    2. Distribución de los componentes:
        • Usa las líneas de alimentación para conectar fuentes de energía.
        • Asegúrate de que las patas de los componentes estén bien conectadas.

    Recomendaciones:
    • Verifica las conexiones para evitar fallos en el circuito.
    • Usa cables de buena calidad para conexiones estables.
    • Mantén el protoboard limpio y libre de residuos.
    """
    ),

    // GESTION EMPRESARIAL
    "DosBox" to Pair(
        R.drawable.dosbox,
        """
    DOSBox es un emulador de DOS que permite ejecutar aplicaciones y juegos antiguos diseñados para sistemas MS-DOS en plataformas modernas.

    Cómo se usa:
    1. Instalación:
        • Descarga e instala DOSBox desde su sitio oficial.
    2. Configuración inicial:
        • Abre DOSBox y configura una carpeta como unidad virtual usando el comando:
          `mount c c:\ruta\a\la\carpeta`
    3. Ejecutar programas o juegos:
        • Cambia a la unidad montada con `c:` y ejecuta programas con su nombre, como `juego.exe`.
    4. Salir de DOSBox:
        • Escribe `exit` para cerrar el emulador.

    Recomendaciones:
    • Verifica la compatibilidad del juego o programa con DOSBox.
    • Ajusta configuraciones en `dosbox.conf` para un mejor rendimiento.
    • Aprende comandos básicos de DOS como `dir` (listar archivos) y `cd` (cambiar directorios).
    • Ajusta la velocidad de emulación con CTRL + F12 (aumentar) y CTRL + F11 (disminuir).
    """
    ),

    "Excel" to Pair(
        R.drawable.excel,
        """
    Microsoft Excel es una aplicación de hojas de cálculo utilizada para organizar, analizar y visualizar datos numéricos y textuales.

    Cómo se usa:
    1. Abrir un nuevo archivo:
        • Usa una hoja en blanco o elige una plantilla predefinida.
    2. Introducir datos:
        • Escribe números, texto o fórmulas en las celdas.
    3. Formato de celdas:
        • Aplica formato a las celdas (tipo de fuente, bordes, colores, etc.).

    Recomendaciones:
    • Usa referencias absolutas (A1) y relativas (A1) en fórmulas según lo necesites.
    • Aprovecha funciones integradas como SUMA, PROMEDIO y CONTAR.SI.
    • Usa la validación de datos para controlar los valores ingresados.
    • Aprende atajos de teclado como:
        - Ctrl + C (copiar)
        - Ctrl + V (pegar)
        - Ctrl + Z (deshacer)
    • Guarda copias de seguridad regularmente.
    """
    ),

    "Grafica" to Pair(
        R.drawable.grafica,
        """
    Una gráfica de barras es una representación visual de datos mediante barras rectangulares, ideales para comparar categorías.

    Cómo crear una gráfica de barras en Excel:
    1. Preparar los datos:
        • Organiza las categorías y valores en columnas.
    2. Seleccionar los datos:
        • Resalta las celdas que contienen los datos que deseas graficar.
    3. Insertar la gráfica:
        • Ve a "Insertar" en la barra de herramientas y selecciona "Gráfico de barras".
    4. Personalizar la gráfica:
        • Cambia el título, etiquetas de los ejes y colores de las barras según sea necesario.

    Recomendaciones:
    • Mantén la gráfica simple y fácil de interpretar.
    • Usa títulos claros para la gráfica y los ejes.
    • Selecciona el tipo adecuado de gráfica de barras (agrupadas o apiladas) según los datos.
    • Ajusta la escala de los ejes para evitar distorsiones en la información.
    """
    ),

    //INDUSTRIAL
    "Cizalla" to Pair(
        R.drawable.cizalla,
        """
    Una cizalla es una herramienta o máquina utilizada para cortar materiales como metales, plásticos o maderas finas.

    Cómo se usa:
    1. Preparación del material:
        • Coloca el material en la mesa de trabajo asegurándote de que esté alineado correctamente.
    2. Ajuste de la cizalla:
        • Configura la cuchilla o apertura según el grosor del material.

    Recomendaciones:
    • Usa equipo de protección personal, como guantes y gafas de seguridad.
    • Mantén la cuchilla afilada y libre de residuos.
    • Asegúrate de que el material esté bien alineado para cortes precisos.
    """
    ),

    "Destornillador" to Pair(
        R.drawable.destornillador,
        """
    Un destornillador es una herramienta manual utilizada para apretar o aflojar tornillos.

    Cómo se usa:
    1. Seleccionar el destornillador adecuado:
        • Elige una punta que encaje perfectamente en la ranura del tornillo.
    2. Posicionar la punta en el tornillo:
        • Asegúrate de que la punta esté bien alineada para evitar deslizamientos.
    3. Girar el destornillador:
        • Gira en el sentido horario para apretar y en sentido antihorario para aflojar.

    Recomendaciones:
    • Usa destornilladores de buena calidad para evitar daños.
    • No apliques demasiada fuerza para evitar dañar la rosca del tornillo.
    """
    ),

    "Dobladora de Maquina" to Pair(
        R.drawable.dobladorademaquina,
        """
    Una dobladora de máquina es utilizada para dar forma o curvar materiales metálicos de manera precisa.

    Cómo se usa:
    1. Preparación del material:
        • Coloca la pieza sobre la mesa de la dobladora, asegurándote de que esté alineada.
    2. Ajuste de la máquina:
        • Configura el ángulo y el radio de curvado según las especificaciones.

    Recomendaciones:
    • Verifica las características del material antes de doblar.
    • Ajusta correctamente los parámetros de la máquina.
    • Usa equipo de protección personal como guantes y gafas.
    """
    ),

    "Dobladora de Tubos" to Pair(
        R.drawable.dobladoradetubos,
        """
    Una dobladora de tubos se utiliza para doblar tubos de metal, plástico u otros materiales sin deformarlos.

    Cómo se usa:
    1. Preparación del tubo:
        • Coloca el tubo en la máquina y fíjalo correctamente.
    2. Ajuste de la máquina:
        • Configura el ángulo de doblado, el radio de curvado y la fuerza necesaria.

    Recomendaciones:
    • Asegúrate de que el tubo esté bien alineado.
    • Configura la máquina según el tipo y grosor del tubo.
    """
    ),

    "Duramatro" to Pair(
        R.drawable.duromatro,
        """
    Un durómetro mide la dureza de un material, evaluando su resistencia a la penetración o deformación.

    Cómo se usa:
    1. Preparación del material:
        • Limpia la superficie del material para obtener mediciones precisas.
    2. Colocación del material:
        • Posiciona la pieza en la plataforma del durómetro de forma estable.

    Recomendaciones:
    • Calibra el durómetro regularmente.
    • Asegúrate de que el área de medición esté limpia y nivelada.
    """
    ),

    "Prensa Hidraulica" to Pair(
        R.drawable.prensahidraulica,
        """
    Una prensa hidráulica utiliza fuerza hidráulica para moldear, compactar o ensamblar materiales.

    Cómo se usa:
    1. Preparación de las piezas:
        • Coloca las piezas en la prensa y verifica su alineación.
    2. Ajuste de la máquina:
        • Configura la presión y los parámetros según el trabajo requerido.

    Recomendaciones:
    • Asegura que las piezas estén bien posicionadas.
    • Revisa las especificaciones de presión para evitar daños.
    • Mantén el sistema hidráulico en buen estado.
    """
    ),

    "Soldadora de Punto" to Pair(
        R.drawable.soldaduradepunto,
        """
    La soldadura de punto une piezas metálicas aplicando presión y calor en puntos específicos.

    Cómo se usa:
    1. Preparación de las piezas:
        • Limpia las superficies de las piezas y colócalas en la posición correcta.
    2. Colocación de los electrodos:
        • Posiciona los electrodos en los puntos de contacto y aplica presión.
    3. Aplicación de corriente eléctrica:
        • Activa la máquina para generar calor y fundir los metales en los puntos de contacto.

    Recomendaciones:
    • Limpia las superficies de las piezas para asegurar buena conductividad.
    • Ajusta la corriente según el material y grosor.
    """
    ),

    // MECANICA
    "Aislador Vibraciones" to Pair(
        R.drawable.aisladorvibraciones,
        """
    Un aislador de vibraciones es un dispositivo diseñado para reducir o eliminar la transmisión de vibraciones entre componentes.

    Cómo se usa:
    1. Selección del aislador adecuado:
        • Escoge un aislador compatible con el peso y la frecuencia de las vibraciones.
    2. Instalación del aislador:
        • Coloca el aislador entre la fuente de vibración y la estructura protegida.

    Recomendaciones:
    • Asegúrate de una correcta instalación para maximizar la absorción de vibraciones.
    • Selecciona aisladores diseñados para las frecuencias específicas de vibración.
    """
    ),

    "AutoCAD" to Pair(
        R.drawable.autocad,
        """
    AutoCAD es un software de diseño asistido por computadora (CAD) utilizado para crear planos y modelos en 2D y 3D.

    Cómo se usa:
    1. Usa comandos básicos:
        • Familiarízate con comandos como L (línea) y C (círculo).
    2. Guarda y exporta:
        • Guarda en formato .dwg y exporta en PDF o imagen para compartir.
    3. Diseña en 3D:
        • Usa herramientas de modelado para crear y visualizar diseños tridimensionales.

    Recomendaciones:
    • Usa capas (Layers) para organizar los elementos del diseño.
    • Ajusta la configuración de espacio de trabajo según el proyecto.
    """
    ),

    "Calibradores" to Pair(
        R.drawable.calibradores,
        """
    Los calibradores son instrumentos de medición para obtener dimensiones precisas de objetos, como largo, ancho o profundidad.

    Cómo se usa:
    1. Selección del calibrador:
        • Escoge entre calibrador Vernier o digital según la medición.
    2. Medición externa:
        • Coloca las mordazas en el objeto y cierra suavemente para obtener la medida.

    Recomendaciones:
    • Limpia el calibrador antes y después de cada uso.
    • Verifica la calibración regularmente para garantizar precisión.
    """
    ),

    "Impresora" to Pair(
        R.drawable.impresora,
        """
    En mecánica, una impresora puede referirse a una impresora 3D o de planos técnicos.

    Cómo se usa:
    1. Impresora 3D:
        • Diseña modelos 3D en un software CAD y envíalos a la impresora para crear objetos capa por capa.
    2. Impresora de planos:
        • Diseña planos en AutoCAD y configúrala para imprimir en papel de gran formato.

    Recomendaciones:
    • Mantén las impresoras calibradas para garantizar precisión.
    • Selecciona materiales adecuados para impresión 3D según las propiedades requeridas.
    """
    ),

    "Llave Inglesa" to Pair(
        R.drawable.llaveinglesa,
        """
    La llave inglesa es una herramienta ajustable utilizada para apretar o aflojar tuercas y pernos.

    Cómo se usa:
    1. Ajusta la abertura:
        • Usa la rueda de ajuste para adaptar la mordaza al tamaño del perno.
    2. Coloca la llave:
        • Posiciona la mordaza fija sobre un lado del perno y la ajustable en el otro.

    Recomendaciones:
    • Ajusta bien la abertura para evitar resbalones.
    • No uses fuerza excesiva para evitar dañar la herramienta o la pieza.
    """
    ),

    "Medidor Flujo" to Pair(
        R.drawable.medidorflujo,
        """
    Un medidor de flujo mide la cantidad de fluido que pasa a través de una tubería o conducto.

    Cómo se usa:
    1. Instalación:
        • Coloca el medidor en la tubería siguiendo las instrucciones del fabricante.
    2. Configuración:
        • Configura la unidad de medida (litros por minuto, m³/h) y parámetros necesarios.

    Recomendaciones:
    • Selecciona el medidor adecuado para el tipo de fluido y rango de flujo.
    • Realiza mantenimiento regular para mantener la precisión.
    """
    ),

    "Medidor Fuerza" to Pair(
        R.drawable.medidorfuerza,
        """
    Un medidor de fuerza mide la cantidad de fuerza aplicada a un objeto o superficie.

    Cómo se usa:
    1. Selección del medidor:
        • Elige un medidor adecuado para tracción, compresión o torsión.
    2. Calibración y preparación:
        • Asegúrate de que el dispositivo esté calibrado antes de usarlo.

    Recomendaciones:
    • Usa el rango adecuado para evitar daños al medidor.
    • Calibra regularmente para garantizar mediciones precisas.
    """
    ),

    "Ohmímetro" to Pair(
        R.drawable.ohmimetro,
        """
    Un ohmímetro mide la resistencia eléctrica de un componente o circuito.

    Cómo se usa:
    1. Encendido y configuración:
        • Selecciona la escala adecuada para la resistencia esperada.
    2. Conexión de las sondas:
        • Conecta las sondas roja y negra a los puntos de medición.

    Recomendaciones:
    • Apaga la fuente de energía antes de medir.
    • Usa la escala adecuada para obtener lecturas precisas.
    """
    ),

    "Tenazas" to Pair(
        R.drawable.tenazas,
        """
    Las tenazas son herramientas manuales para sujetar, doblar, cortar o manipular materiales.

    Cómo se usan:
    1. Selección de la herramienta adecuada:
        • Escoge el tipo de tenazas según la tarea (corte, sujeción, doblado).
    2. Agarre correcto:
        • Sujeta las empuñaduras con firmeza y alinea correctamente con la pieza.

    Recomendaciones:
    • Usa tenazas de buena calidad para garantizar seguridad y precisión.
    • No utilices las tenazas como martillo ni para aplicar fuerza excesiva.
    """
    ),
// MECATRONICA

    "Pasta de Soldar" to Pair(
        R.drawable.pastadesoldar,
        """
    La pasta de soldar es un material utilizado para mejorar la calidad y facilidad del proceso de soldadura. Se emplea para limpiar las superficies a soldar y promover la adherencia del metal de soldadura al área de contacto. La pasta contiene flux, que ayuda a evitar la oxidación y mejora el flujo del material fundido, asegurando una soldadura fuerte y limpia.

    Cómo se usa la pasta de soldar:
    1. Aplicación de la pasta:
        • Aplica una capa delgada de pasta de soldar sobre las superficies a unir antes de realizar la soldadura.
        • Usa una brocha, espátula o aplicador para distribuir uniformemente la pasta.
    2. Realización de la soldadura:
        • Realiza la soldadura de acuerdo con las instrucciones de uso de tu equipo, ya sea un soldador de punto, soldador de arco o soldador por gas.
        • La pasta de soldar facilitará que el metal de soldadura fluya más fácilmente y se adhiera bien a las superficies.
    3. Limpieza:
        • Después de soldar, es recomendable limpiar los residuos de la pasta de soldar con un trapo húmedo o con un limpiador específico para evitar que queden restos que puedan afectar la durabilidad de la unión.

    Recomendaciones:
    • Asegúrate de usar pasta de soldar adecuada para el tipo de material que estás soldando (por ejemplo, pasta para cobre o para acero).
    • Aplica solo la cantidad necesaria de pasta para evitar acumulación excesiva.
    • Usa guantes de protección y gafas de seguridad al realizar soldaduras.
    """
    ),
    "Llaves Alen" to Pair(
        R.drawable.llavesallen,
        """
    Las llaves Allen, también conocidas como llaves hexagonales, son herramientas que se utilizan para apretar o aflojar tornillos o pernos con una cabeza con forma de hexágono interior. Están hechas de acero y suelen tener un diseño en forma de L, lo que permite un acceso más fácil a los tornillos en espacios reducidos. Se utilizan comúnmente en la industria, mecánica, reparación de bicicletas, muebles, y en aplicaciones electrónicas.

    Cómo se usa una llave Allen:
    1. Selecciona la llave Allen adecuada:
        • Elige una llave Allen que coincida con el tamaño de la cabeza hexagonal del tornillo o perno que vas a apretar o aflojar.
        • Las llaves Allen vienen en sets de diferentes tamaños; asegúrate de elegir la correcta para evitar dañar la cabeza del tornillo.
    2. Inserta la llave Allen:
        • Inserta la llave Allen en el tornillo o perno asegurándote de que quede bien ajustada para evitar deslizamientos.
    3. Gira la llave Allen:
        • Gira la llave en sentido horario para apretar el tornillo o en sentido antihorario para aflojarlo.
    4. Usa la longitud adecuada:
        • La parte más larga de la llave Allen proporciona mayor torque, pero en espacios reducidos, la parte más corta puede ser útil para un mayor control.

    Recomendaciones para el uso de llaves Allen:
    • Asegúrate de que la llave Allen esté completamente insertada en el tornillo para evitar daños tanto en la herramienta como en el tornillo.
    • Usa llaves Allen de alta calidad para evitar que se deformen con el uso frecuente.
    • Evita aplicar demasiada fuerza para evitar que el tornillo o perno se rompa.
    """
    ),
    "Alambre" to Pair(
        R.drawable.alambre,
        """
    El alambre es un hilo delgado y flexible fabricado generalmente de metal como acero, cobre, aluminio o hierro.

    Cómo se usa:
    1. Selecciona el tipo adecuado de alambre:
        • Eléctrico: Para conducción de corriente eléctrica.
        • Galvanizado: Para cercas o aplicaciones exteriores.
        • De acero: Para resistencia estructural.
        • Recocido: Para ataduras en construcción o manualidades.
    2. Corta el alambre:
        • Utiliza cortadores adecuados al grosor del alambre.
        • Mide y marca antes de cortar para precisión.

    Recomendaciones:
    • Usa guantes al manipular alambre para evitar lesiones.
    • Selecciona el tipo de alambre según la aplicación específica (resistencia, conductividad, etc.).
    """
    ),

    "Alicate" to Pair(
        R.drawable.alicate,
        """
    El alicate es una herramienta manual utilizada para sujetar, doblar, cortar o manipular objetos con precisión.

    Cómo se usa:
    1. Agarra el objeto:
        • Coloca las mordazas del alicate alrededor del objeto que deseas manipular.
    2. Aplica presión:
        • Cierra las asas del alicate para realizar la acción deseada.

    Recomendaciones:
    • Escoge el alicate adecuado para el trabajo (corte, presión, punta fina, etc.).
    • Mantén el alicate limpio para un mejor desempeño y longevidad.
    """
    ),

    "Calibrador" to Pair(
        R.drawable.calibrador,
        """
    El calibrador es una herramienta de medición de precisión que se utiliza para medir diámetros, espesores y longitudes.

    Cómo se usa:
    1. Selección de las piezas a medir:
        • Coloca las piezas dentro de las mordazas del calibrador.
    2. Toma la medición:
        • Asegúrate de que la pieza esté correctamente alineada con las escalas del calibrador.
    3. Lee la medición:
        • Dependiendo del tipo de calibrador, toma la medición en milímetros o pulgadas.

    Recomendaciones:
    • Usa el calibrador con delicadeza para no dañar la pieza o la herramienta.
    • Mantén el calibrador limpio y calibrado regularmente.
    """
    ),

    "Cautin" to Pair(
        R.drawable.cautin,
        """
    El cautín es una herramienta utilizada para soldar componentes electrónicos, principalmente en circuitos de baja potencia.

    Cómo se usa:
    1. Calienta el cautín:
        • Conecta el cautín y espera a que se caliente.
    2. Aplica el cautín sobre las piezas a soldar:
        • Coloca la punta del cautín sobre las uniones que deseas soldar.
    3. Sella la soldadura:
        • Aplica la soldadura fundida en el área deseada.

    Recomendaciones:
    • Usa pinzas para sujetar las piezas para evitar quemaduras.
    • Mantén el cautín limpio y bien cuidado.
    """
    ),

    "Corta Alambre" to Pair(
        R.drawable.cortaalambre,
        """
    El corta alambre es una herramienta especializada para cortar cables y alambres de diferentes grosores.

    Cómo se usa:
    1. Coloca el alambre entre las mordazas:
        • Asegúrate de que el alambre esté alineado con las cuchillas.
    2. Aplica presión:
        • Cierra el mango del corta alambre con fuerza para cortar el material.

    Recomendaciones:
    • Usa la herramienta adecuada según el grosor del alambre.
    • Mantén el corta alambre limpio para un corte más preciso.
    """
    ),
    "Desarmadores" to Pair(
        R.drawable.desarmadores,
        """
    Los desarmadores son herramientas manuales utilizadas para apretar o aflojar tornillos.

    Cómo se usa:
    1. Selección del desarmador adecuado:
        • Elige el tipo de desarmador (plano o de estrella) según el tornillo a manipular.
    2. Uso:
        • Coloca la punta del desarmador en la ranura o hendidura del tornillo.
        • Gira el mango en sentido horario para apretar o en sentido antihorario para aflojar.
    3. Técnica:
        • Aplica presión constante mientras giras para evitar dañar el tornillo o la superficie.

    Recomendaciones:
    • Utiliza el desarmador correcto para evitar dañar los tornillos.
    • Mantén la herramienta limpia y libre de aceite para un mejor agarre.
    """
    ),
    // RENOVABLES
    "Alicantes de punta" to Pair(
        R.drawable.alicate,
        """
    Un alicate es una herramienta manual compuesta por dos brazos que, al juntarse, ejercen presión sobre unas mordazas. Se utiliza para sujetar, cortar, doblar o manipular diversos materiales, como cables, alambres o piezas pequeñas. Es ampliamente empleado en tareas de electricidad, plomería, mecánica y bricolaje.

    Cómo se usa un alicate:
    1. Selecciona el tipo de alicate adecuado:
        • Alicates universales: Para múltiples usos, como sujetar o cortar.
        • Alicates de punta fina: Para trabajos en espacios reducidos o precisión.
        • Alicates de corte: Para cortar cables o alambres.
        • Alicates de presión: Para sujetar firmemente piezas mientras trabajas en ellas.
    2. Agarra el alicate correctamente:
        • Sostén los mangos con una mano firme pero cómoda.

    Recomendaciones para usar un alicate:
    • Elige el alicate correcto según la tarea (sujetar, cortar, doblar o crimpado).
    • Si trabajas con electricidad, asegúrate de que el alicate tenga mangos aislados y esté diseñado para esa función.
    • No fuerces el alicate: No uses el alicate para tareas que excedan su capacidad, como cortar materiales muy gruesos o duros.
    • Mantenimiento: Mantén el alicate limpio y libre de óxido para asegurar su efectividad.
    """
    ),
    "Densimetro" to Pair(
        R.drawable.densimetro,
        """
    Un densímetro es un instrumento utilizado para medir la densidad de líquidos o sólidos. Es esencial en diversas aplicaciones industriales y científicas, como en la verificación de la calidad de líquidos (como combustibles, aceites o soluciones químicas) o en la caracterización de materiales sólidos.

    Cómo se usa un densímetro:
    1. Selecciona el tipo de densímetro adecuado:
        • Densímetro de líquidos: Para medir la densidad de líquidos en tanques, depósitos o muestras pequeñas.
        • Densímetro de sólidos: Para medir la densidad de materiales sólidos mediante la medición de su volumen y peso.
    2. Coloca la muestra:
        • En el caso de líquidos, coloca el densímetro directamente en el líquido hasta que se estabilice.
        • Para sólidos, asegúrate de medir correctamente su volumen y peso.
    3. Lee la medición:
        • La escala del densímetro indicará la densidad del material medido.

    Recomendaciones para el uso de un densímetro:
    • Asegúrate de que el densímetro esté limpio antes de usarlo para evitar lecturas incorrectas.
    • Utiliza el densímetro en un ambiente controlado, donde las condiciones de temperatura no afecten la medición.
    • Verifica regularmente la calibración del densímetro para asegurar mediciones precisas.
    """
    ),
    "Maquina de Soldar" to Pair(
        R.drawable.maquinadesoldar,
        """
    Una máquina de soldar es un equipo utilizado para unir piezas de metal mediante un proceso de fusión, que se realiza aplicando calor. Existen diferentes tipos de máquinas de soldar, como la soldadura por arco eléctrico, MIG (Metal Inert Gas) y TIG (Tungsten Inert Gas), cada una con sus aplicaciones específicas.

    Cómo se usa una máquina de soldar:
    1. Selecciona el tipo de soldadura adecuado:
        • Soldadura por arco eléctrico: Utiliza un electrodo para crear un arco eléctrico que funde las piezas a soldar.
        • Soldadura MIG: Utiliza un alambre como electrodo y gas protector para crear la soldadura.
        • Soldadura TIG: Utiliza un electrodo de tungsteno no consumible y gas protector para lograr una soldadura precisa y limpia.
    2. Prepara el equipo:
        • Asegúrate de que la máquina de soldar esté correctamente conectada a una fuente de energía.
        • Coloca las piezas a soldar en la posición adecuada y asegúrate de que estén limpias de óxido y suciedad.
    3. Realiza la soldadura:
        • Enciende la máquina y ajusta los parámetros (como voltaje y corriente) según el tipo de metal y grosor de las piezas.
        • Mantén el electrodo o alambre en la posición correcta mientras aplicas calor para fundir el material.

    Recomendaciones para usar una máquina de soldar:
    • Usa equipo de protección adecuado: gafas de seguridad, guantes, y ropa ignífuga.
    • Asegúrate de trabajar en un área bien ventilada para evitar la acumulación de humos peligrosos.
    • No toques el electrodo o las piezas calientes con las manos desnudas para evitar quemaduras.
    • Realiza pruebas de la soldadura antes de usar la pieza soldada en una aplicación crítica.
    """
    ),
    "Multimetro" to Pair(
        R.drawable.multimetro,
        """
    Un multímetro es una herramienta eléctrica utilizada para medir varias magnitudes eléctricas, como voltaje (V), corriente (A) y resistencia (Ω). Es esencial para realizar diagnósticos y pruebas en circuitos eléctricos, componentes electrónicos y sistemas de energía.

    Cómo se usa un multímetro:
    1. Selección del tipo de medición:
        • Para medir voltaje (DC o AC), selecciona la opción de voltaje en el multímetro.
        • Para medir corriente, selecciona la opción de amperaje.
        • Para medir resistencia, ajusta el multímetro a la opción de ohmios (Ω).
    2. Conectar las sondas:
        • Conecta las sondas del multímetro al circuito o componente que deseas medir, asegurándote de conectar la sonda roja al terminal positivo y la sonda negra al terminal negativo.
    3. Realizar la medición:
        • Lee los valores en la pantalla del multímetro para obtener las lecturas correspondientes al voltaje, corriente o resistencia.
    4. Apagar el multímetro:
        • Después de realizar la medición, apaga el multímetro para conservar la batería.

    Recomendaciones para el uso de un multímetro:
    • Asegúrate de que el multímetro esté en la configuración correcta antes de realizar la medición.
    • No realices mediciones de corriente en circuitos sin desconectar primero la fuente de alimentación.
    • Mantén el multímetro limpio y sin daños para obtener mediciones precisas.
    """
    ),

    "Paneles Solares" to Pair(
        R.drawable.panelessolares,
        """
    Un panel solar es un dispositivo que convierte la luz solar en energía eléctrica mediante el efecto fotovoltaico. Los paneles solares están compuestos por celdas solares hechas de materiales semiconductores, como el silicio, que generan corriente continua (CC) cuando son iluminadas por el sol. Estos paneles son fundamentales en sistemas de energía renovable, especialmente para la generación de electricidad en lugares donde no hay acceso a la red eléctrica.

    Cómo se usa un panel solar:
    1. Instalación del panel solar:
        • Selecciona un lugar con buena exposición al sol, como un techo o una superficie sin sombras.
        • Monta el panel solar en un ángulo adecuado para maximizar la captación de luz solar.
        • Conecta el panel solar al inversor, que convertirá la corriente continua (CC) en corriente alterna (CA).
    2. Conexión y mantenimiento:
        • Asegúrate de que todas las conexiones estén bien ajustadas y protegidas de la humedad o la corrosión.
        • Realiza un mantenimiento regular limpiando el panel de polvo y suciedad para asegurar un rendimiento óptimo.

    Recomendaciones para el uso de paneles solares:
    • Realiza una instalación adecuada siguiendo las instrucciones del fabricante para maximizar la eficiencia.
    • Asegúrate de que el panel esté orientado correctamente hacia el sol y con un ángulo adecuado para capturar la mayor cantidad de luz.
    • Protege las conexiones y cables del sistema para evitar daños por intemperie.
    """
    ),
    "Pinzas" to Pair(
        R.drawable.pinzas,
        """
    Las pinzas son herramientas manuales utilizadas para sujetar, doblar, cortar o manipular objetos pequeños con precisión. Están compuestas por dos brazos que, al ser presionados, ejercen fuerza en sus puntas, permitiendo agarrar o trabajar sobre los objetos. Se utilizan comúnmente en tareas de electrónica, electricidad, joyería y reparación de pequeños componentes.

    Cómo se usan las pinzas:
    1. Selecciona el tipo de pinzas adecuado:
        • Pinzas de punta fina: Para trabajos de precisión en espacios reducidos.
        • Pinzas universales: Para sujetar o doblar objetos de tamaño medio.
        • Pinzas de corte: Para cortar cables, alambres u otros materiales.
    2. Uso de las pinzas:
        • Sostén las pinzas con firmeza y asegúrate de que las puntas estén bien posicionadas sobre el objeto a manipular.
        • Aplica presión de forma controlada para sujetar o cortar sin dañar los materiales.
    3. Recomendaciones:
        • Elige las pinzas adecuadas para cada tarea, según el tamaño y la forma del objeto.
        • Mantén las pinzas limpias y libres de suciedad para asegurar un buen agarre y precisión.
    """
    ),
    "Taladro" to Pair(
        R.drawable.taladro,
        """
    Un taladro es una herramienta eléctrica o manual utilizada para perforar materiales como madera, metal, concreto o plástico. Está compuesto por un motor que hace girar una broca a altas revoluciones, permitiendo perforar diferentes superficies. Los taladros también pueden ser utilizados para atornillar y desatornillar, dependiendo de los accesorios que se le coloquen.

    Cómo se usa un taladro:
    1. Selección de la broca adecuada:
        • Para madera: Usa brocas específicas para madera, con puntas afiladas y bordes diseñados para cortar madera.
        • Para metal: Usa brocas de acero rápido (HSS) o brocas de carburo para perforar metal.
        • Para concreto: Usa brocas de carburo con puntas de acero para perforar materiales duros como el concreto.
    2. Ajusta la velocidad:
        • La velocidad del taladro debe ajustarse dependiendo del material a perforar. Para materiales blandos, usa una velocidad alta; para materiales más duros, usa una velocidad baja.
    3. Perforación:
        • Sostén el taladro firmemente y asegúrate de que la broca esté perpendicular a la superficie a perforar.
        • Enciende el taladro y aplica presión de manera constante para hacer el agujero.

    Recomendaciones para el uso de un taladro:
    • Usa gafas de seguridad y protección auditiva para evitar lesiones.
    • Asegúrate de que la broca esté bien ajustada y sin daños.
    • No fuerces el taladro; si encuentras resistencia, detén la perforación y revisa el material o la broca.
    • Mantén el taladro limpio y lubricado para asegurar su buen funcionamiento.
    """
    ),
    //SEMICONDUCTORES
    "Marposs" to Pair(
        R.drawable.marposs,
        """
    Marposs es una empresa que diseña y fabrica sistemas avanzados de medición y control para la industria, especialmente en procesos de mecanizado y producción. Sus productos incluyen soluciones para inspección dimensional, detección de defectos, monitoreo de procesos y calibración, utilizadas en sectores como automotriz, aeroespacial, y manufactura.

    Cómo se usa un sistema Marposs:
    1. Instalación del sistema:
        • Monta el equipo en la máquina o línea de producción según las especificaciones del fabricante.
        • Conecta los sensores, actuadores o interfaces necesarias para el monitoreo o control del proceso.
    2. Configuración inicial:
        • Configura el sistema usando el software proporcionado por Marposs o el panel de control integrado.
        • Introduce los parámetros de medición o control requeridos para tu aplicación específica.
    3. Uso en producción:
        • Activa el sistema durante el proceso de producción para supervisar dimensiones, vibraciones, fuerza o cualquier variable monitoreada.
        • Los datos recopilados pueden usarse para ajustar parámetros automáticamente o para análisis posterior.
    4. Mantenimiento y calibración:
        • Realiza calibraciones periódicas para asegurar la precisión del sistema.
        • Revisa regularmente los componentes para detectar desgaste o mal funcionamiento.

    Recomendaciones para usar un sistema Marposs:
    • Selección adecuada: Asegúrate de elegir el sistema Marposs que se ajuste a las necesidades de tu proceso y al tipo de medición o control que requieres.
    • Mantenimiento regular: Realiza mantenimiento preventivo para evitar fallos y garantizar la precisión del sistema.
    • Capacitación: Asegúrate de que el personal esté capacitado para operar el sistema correctamente y sacar el máximo provecho de sus funcionalidades.
    """
    ),
    "Tornillo" to Pair(
        R.drawable.tornillo,
        """
    Un tornillo es un elemento de fijación utilizado para unir piezas mediante su rosca helicoidal, la cual permite que se atornille en un material. Los tornillos están hechos de diversos materiales como acero, inoxidable, plástico o cobre, y se utilizan ampliamente en la industria de manufactura, electrónica, construcción y en muchos otros campos.

    Cómo se usa un tornillo:
    1. Selección del tipo de tornillo adecuado:
        • Tornillos para madera: Tienen una rosca más gruesa para proporcionar un agarre fuerte en materiales blandos como madera.
        • Tornillos para metal: Tienen una rosca más fina y están hechos de materiales más resistentes, como acero o acero inoxidable.
        • Tornillos autoperforantes: Diseñados para perforar el material mientras se atornillan.
    2. Inserción del tornillo:
        • Coloca el tornillo en el agujero o la pieza a fijar y empieza a girarlo manualmente o con un destornillador hasta que empiece a hacer contacto con la superficie.
    3. Apriete:
        • Utiliza un destornillador o una herramienta eléctrica para apretar el tornillo, asegurándote de no aplicar demasiada fuerza para evitar dañar la rosca o la pieza.
    4. Comprobación:
        • Verifica que el tornillo esté completamente fijado y que las piezas estén alineadas correctamente.

    Recomendaciones para el uso de tornillos:
    • Selecciona el tornillo adecuado según el material y el propósito de la unión.
    • Usa la herramienta correcta para evitar dañar la cabeza del tornillo o la rosca.
 
    """
    )


)

/**
 * Pantalla que muestra la información detallada de un material seleccionado.
 * @param material Nombre del material seleccionado.
 * @param onBack Callback para regresar a la pantalla anterior.
 */
@Composable
fun MaterialDetails(material: String, onBack: () -> Unit) {
    val materialInfo = materialsInfo[material]

    if (materialInfo != null) {
        val (imageRes, description) = materialInfo

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black) // Fondo negro
                .padding(16.dp)
                .verticalScroll(rememberScrollState()), // Habilitar scroll
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Imagen del material
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = material,
                modifier = Modifier
                    .size(200.dp)
                    .padding(bottom = 16.dp)
            )

            // Título del material
            Text(
                text = material,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Separar el contenido en líneas
            val sections = description.split("\n") // Divide el texto en líneas

            sections.forEach { line ->
                when {
                    line.startsWith("Significado") -> {
                        // Título "Significado" destacado
                        HighlightedTitle(line)
                    }
                    line.startsWith("Uso") -> {
                        // Título "Uso" destacado
                        HighlightedTitle(line)
                    }
                    line.startsWith("Recomendaciones") -> {
                        // Título "Recomendaciones" destacado
                        HighlightedTitle(line)
                    }
                    else -> {
                        // Contenido normal
                        Text(
                            text = line,
                            fontSize = 16.sp,
                            color = Color.White,
                            textAlign = TextAlign.Justify,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f)) // Espaciador flexible

            // Botón para regresar
            Button(
                onClick = onBack,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2)) // Azul
            ) {
                Text(text = "Regresar", fontSize = 16.sp, color = Color.White)
            }
        }
    } else {
        // Mensaje en caso de que el material no tenga información disponible
        Text(
            text = "Información no disponible",
            fontSize = 16.sp,
            color = Color.Red,
            modifier = Modifier.padding(16.dp)
        )
    }
}

/**
 * Composable para títulos destacados como "Significado", "Uso", "Recomendaciones".
 */
@Composable
fun HighlightedTitle(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color(0xFF1E1E1E)) // Fondo
            .padding(8.dp)
    )
}