# Traffic Emulator Data Collector

This project enables the automated creation of traffic data by using the proprietary emulator built into the Siemens IC4 Configuration Tool. 

This has been developed to support a dissertation titled _"A study of machine learning algorithms and their 
suitability for predicting traffic signal timing"_ towards an MSc in Software Engineering at the University of 
Oxford.

## Features

* Uses emulator built into the Siemens IC4 Configuration Tool's to simulate button presses and user key presses to create data.
* Archives
* Deploys a number of scenarios to generate data, offering options around volume and traffic parallelism.
* Allows timestamped comma-separated data to be archived each time the emulator runs.

## Getting started

The software is built into a single package with all necessary components for data generation and archiving.

### Pre-requisites

The following versions (or newer) are required to run the Traffic Emulator Data Collector:

* Siemens IC4 Configuration Tool (including security dongle) - v14.0
* Siemens IC4 EMulator - v14.0
* SikuliX - v1.1.1
* Java SE Development Kit - v8u144


## Author

* **Priscilla Nagashima Boyd** - [priscillaboyd](https://github.com/priscillaboyd)


## License

This project is licensed under the Apache Licence 2.0 - see the [LICENSE](LICENSE) file for further information

### Citation
If you use SPaT Prediction, we would appreciate a citation :blush: :

`A study of machine learning algorithms and their suitability
for predicting traffic signal timing, Nagashima Boyd, P., University of Oxford, 2017.`
