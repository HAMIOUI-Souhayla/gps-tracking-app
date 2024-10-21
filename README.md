# GPS Tracking Application

## Description
Cette application permet de lire les coordonnées GPS à partir d'une base de données MySQL via un back-end développé avec Spring Boot, et de les afficher sous forme de polyline sur une carte interactive en utilisant **Leaflet.js** dans une application développée avec **Ionic**. Une animation simule le déplacement d’un marqueur à travers les points GPS, tout en affichant des bulles d’informations supplémentaires comme la vitesse et le carburant. 

## Fonctionnalités
- Affichage des points GPS sur une carte interactive.
- Connexion des points GPS avec une **polyline**.
- Animation simulant le déplacement entre les points GPS.
- Affichage de bulles avec des informations supplémentaires à chaque point.
- Back-end RESTful pour l’accès aux données GPS.

## Technologies utilisées
- **Back-end** : Spring Boot, MySQL
- **Front-end mobile** : Ionic Framework, Leaflet.js
- **API** : RESTful API pour récupérer les données GPS

## Prérequis
- **Node.js** et **npm**
- **Ionic CLI** installé globalement
- **Java** et **Maven** pour le back-end Spring Boot
- **MySQL** pour la base de données GPS

## Installation

### 1. Cloner le dépôt
```bash
git clone https://github.com/HAMIOUI-Souhayla/gps-tracking-app.git
cd gps-tracking-app
```

### 2. Configuration du Back-end

- Accédez au répertoire `GPS-backend`.

- Mettez à jour le fichier `application.properties` avec vos informations MySQL :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/archive
spring.datasource.username=nom_utilisateur
spring.datasource.password=mot_de_passe
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
### 3. Configuration de la base de données
- Utiliser le fichier SQL fourni pour configurer la base :
``` bash
mysql -u nom_utilisateur -p archive < archive.sql
```

### 4. Configuration du Front-end

- Accédez au répertoire `myGpsApp`.
- Installer les dépendances Node.js :
```bash
npm install
```
- Démarrer l'application Ionic :
```bash
ionic serve
```
## API Endpoints
GET http://localhost:8080/api/gps: Récupère toutes les coordonnées GPS.
