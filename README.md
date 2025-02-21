# Projet Chat Motivation - Java Spring Boot

## Description

Ce projet est composé de **deux applications Spring Boot** :

***API*** (Projet 1) : Fournit des citations inspirantes stockées en base de données et exposées via une API REST.

***Application Web*** (Projet 2) : Interface utilisateur permettant de soumettre un message et recevoir une citation inspirante. Les conversations sont enregistrées en base de données et un historique est disponible.

## Prérequis

- ***Java 17+***

- ***Maven***

- ***MySQL***

## Installation et Configuration

1. **Création de la base de données**

Avant de lancer les projets, créez manuellement une base de données MySQL vide :
```
CREATE DATABASE quote_bdd;
```

2. **Configuration MySQL dans les projets**

Les projets contiennent chacun un fichier ***application.properties*** dans ***src/main/resources/***, ce fichier contient des valeurs relatives à la configuration de MySQL (username, password), veuillez les modifier si besoin.

3. **Lancement du projet API (Backend)**

Ce projet est responsable de l'initialisation de la base de données et de l'exposition des citations.

Placez-vous dans le dossier du projet API :
```
cd api
```

Compilez et lancez l'API :
```
mvn spring-boot:run
```

L'API démarre sur le port 8080.

Route disponible :

> ***GET /quote*** : Retourne une citation aléatoire depuis la base de données.

4. **Lancement du projet Application Web**

Ce projet permet aux utilisateurs d'envoyer des messages et recevoir des citations inspirantes.

Placez-vous dans le dossier du projet web :
```
cd app
```

Compilez et lancez l'application :
```
mvn spring-boot:run
```

L'application démarre sur le port 8081 et est accessible à l'adresse : http://localhost:8081

## Fonctionnalités

Soumettre un message : L'utilisateur entre son nom et un message.

Réception d'une citation aléatoire : Une citation inspirante est renvoyée par l'API.

Enregistrement des conversations : Les échanges sont stockés en base de données.

Affichage de l'historique des conversations : Une page dédiée permet de visualiser les échanges passés (**/historique**).

## Structure de la Base de Données

La base de données contient deux tables :

- **quote** : id (INT clé primaire), content (TEXT)
- **conversation** : id (INT clé primaire), username (VARCHAR), message (TEXT), response_id (INT clé étrangère en référence à quote.id), created_at (TIMESTAMP)

Les fichiers SQL situés dans le projet API contiennent :

- **schema.sql** : Création des tables (quote, conversation)

- **data.sql** : Insertion des citations de base

## Remarque

L'API doit être lancée avant l'application Web pour garantir le bon fonctionnement des appels à la base de données.