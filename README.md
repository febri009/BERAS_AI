[![febri009](https://circleci.com/gh/febri009/BERAS_AI.svg?style=shield)](https://circleci.com/gh/febri009/BERAS_AI)

<p align="center"><img src="https://i.ibb.co/mCYZSF5/logo.png" width="250"></p>


## BERAS.AI (Beras Aman dan Inovatif) 

The Rice Quality Detection Application is a mobile application designed to assist users in evaluating the quality of rice they possess. This application offers two main features: rice quality detection using images captured from the camera or selected from the device's gallery, and a Tengkulak Beras feature and Price Feature that retrieves rice price information through an API response using Retrofit.

## Application Features 
Rice Quality Detection
The rice quality detection feature allows users to evaluate the quality of their rice. The rice quality detection can be performed using two methods:

a. Camera-based Detection
Users can capture rice images using the device's camera. The application utilizes a Machine Learning (ML) model imported as TensorFlow Lite (tflite) format to analyze the rice images. This ML model has been trained to recognize various rice quality categories, such as good quality, subpar quality, or damaged rice.

The camera-based detection process involves the following steps:

1. Users access the rice quality detection feature using the camera.
2. The application requests permission to access the device's camera.
3. Users aim the camera at the rice they want to evaluate.
4. The application captures an image from the camera.
5. The captured image is passed to the imported tflite ML model.
6. The ML model analyzes the image and generates predictions regarding the rice quality.
7. The predictions are presented to the users, typically by displaying the rice quality label (good, subpar, or damaged) and relevant additional information.

b. Gallery-based Detection
Users also have the option to select rice images already present in the device's gallery. The application utilizes the same tflite ML model as the camera-based detection to analyze the selected rice images.

The gallery-based detection process involves the following steps:

1. Users access the rice quality detection feature using the gallery.
2. The application requests permission to access the device's gallery.
3. Users select a rice image from the gallery for analysis.
4. The selected image is passed to the tflite ML model.
5. The ML model analyzes the image and generates predictions regarding the rice quality.
6. The predictions are presented to the users, displaying the rice quality label and relevant additional information.

Tengkulak Beras and Price Information Feature
The application also provides a feature that allows users to obtain information about nearby rice traders and current rice prices through an API connection. This feature utilizes Retrofit, a popular Android library, to make API calls and process the received responses.

The Tengkulak Beras and Price Information feature involves the following steps:

1. Users access the Tengkulak Beras and Price Information feature within the application.
2. The application uses Retrofit to make an API call, requesting information about rice traders and current rice prices.
3. The application receives an API response containing rice trader data and rice prices.
4. The received data is processed and presented to the users in a readable format, such as a list of rice traders along with their offered prices.
5. Users can view detailed information about rice traders or choose to contact them if interested.

## Screenshot App 
<p align="center"><img src="https://i.ibb.co/0GrfpP4/screenshot.jpg" alt="screenshot" border="0"></p>

## Deployed App 
You can download the app through this link : [Link Apk](https://appdistribution.firebase.dev/i/bd94f097230d3d87)
