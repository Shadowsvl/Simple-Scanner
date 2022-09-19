# Simple Scanner

Sample project developed using [Jetpack Compose](https://developer.android.com/jetpack/compose). With the aim of showing the current capabilities UI creation, and its use in conjunction with the rest of the libraries for navigation, dependency injection, camera and barcode scanning. Following the current practices recommended by the [Architecture Guide](https://developer.android.com/topic/architecture).

QR and barcode scanner, with basic options to quickly share, copy or go to the code website.
Identifies other code formats.

### [See on Google Play](https://play.google.com/store/apps/details?id=com.heka.simplescanner)

## Features

The application consists of a main screen with the camera preview, which when focusing on a barcode or QR shows the content text and allows you to share, copy or in case of a url go to the website.

Uses the [ML Barcode Scanning](https://developers.google.com/ml-kit/vision/barcode-scanning) google library.

#### Main dependencies
* **Compose** - UI
* **Hilt** - Dependency Injection
* **Camera X** - Device camera
* **ML Barcode Scanning** - Barcode scanning API


## Screenshots

<img src="https://drive.google.com/uc?id=1s3lqk9hRv2yO_gpBEgiypTLt_hpUVVSJ" alt="Screenshot">
<img src="https://drive.google.com/uc?id=1LiNa40gQSendmTUVme53vrvS1eRlAUG-" alt="Screenshot">