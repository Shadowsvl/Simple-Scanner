# Escáner Simple
[![en](https://img.shields.io/badge/lang-en-red.svg)](https://github.com/Shadowsvl/Simple-Scanner/blob/develop/README.en.md)

Proyecto desarrollado usando [Jetpack Compose](https://developer.android.com/jetpack/compose). Con el objetivo de mostrar las capacidades actuales para la creación de UI, y su uso en conjunto con el resto de librerías para navegación, inyección de dependencias, cámara y escaneo de códigos de barras. Siguiendo las prácticas actuales recomendadas por la [Guía de Arquitectura](https://developer.android.com/topic/architecture).

Escáner de códigos QR y barras, con opciones básicas para compartir, copiar o ir al sitio web del código.
Identifica otros formatos de código.

### [Ver en Google Play](https://play.google.com/store/apps/details?id=com.heka.simplescanner)

## Características

La aplicación consta de una pantalla principal con la vista prévia de la cámara, que al enfocar un código de barras o QR muestra el texto del contenido y permite compartir, copiar o en caso de una url ir al sitio web.

Usa la librería de google [ML Barcode Scanning](https://developers.google.com/ml-kit/vision/barcode-scanning).

#### Dependencias principales
* **Compose** - UI
* **Hilt** - Inyección de dependencias
* **Camera X** - Cámara del dispositivo
* **ML Barcode Scanning** - API de escaneo de códigos de barras

## Capturas

<img src="https://drive.google.com/uc?id=1H_VQ_qNf0LjflnXqeBjqZjGYgE39OeeR" alt="Screenshot">
<img src="https://drive.google.com/uc?id=1SVqerGgmtAvHWYaLAFuetRuLEFMQHX4k" alt="Screenshot">
<img src="https://drive.google.com/uc?id=17wv_i7MIPJlSUE58ZOw3HffwPyHWzpwr" alt="Screenshot">