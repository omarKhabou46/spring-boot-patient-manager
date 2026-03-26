# 🏥 Medical Management System — Backend

> Application de gestion de cabinet médical développée avec **Spring Boot** et **PostgreSQL**.  
> Elle couvre le cycle complet : inscription d'un patient → planification d'un rendez-vous → réalisation d'une consultation.

---

## 📋 Table des Matières

- [Aperçu du Projet](#-aperçu-du-projet)
- [Architecture des Données](#-architecture-des-données)
- [Technologies Utilisées](#️-technologies-utilisées)
- [Configuration & Installation](#-configuration--installation)
- [Structure du Projet](#-structure-du-projet)

---

## 🧐 Aperçu du Projet

L'objectif est de fournir une **API REST robuste** pour :

- 👤 La gestion des **Patients** et des **Médecins** (spécialités, contacts)
- 📅 La planification des **Rendez-vous** (liaison Patient ↔ Médecin)
- 📝 Le suivi des **Consultations** avec génération de rapports

---

## 📊 Architecture des Données

### Modèle Conceptuel

```
Patient  (1..*)  ──────►  (1)  RendezVous
Medecin  (1..*)  ──────►  (1)  RendezVous
                               RendezVous  (1)  ──────►  (1)  Consultation
```

### Entités Principales

| Entité          | Attributs Clés                              |
|-----------------|---------------------------------------------|
| `Patient`       | `nom`, `email`                              |
| `Medecin`       | `nom`, `email`, `specialite`                |
| `RendezVous`    | `dateRDV`, `heureRDV`                       |
| `Consultation`  | `dateConsultation`, `rapportConsultation`   |

<img width="392" height="158" alt="image" src="https://github.com/user-attachments/assets/899acb89-c2a0-4457-bebe-de38bd3cffe9" />


---

## 🛠️ Technologies Utilisées

| Couche        | Technologie                              |
|---------------|------------------------------------------|
| Langage       | Java 17+                                 |
| Framework     | Spring Boot 3.x                          |
| Data Access   | Spring Data JPA / Hibernate              |
| Base de données | PostgreSQL                             |
| Build         | Maven                                    |
| Utilitaires   | Lombok, Docker *(optionnel)*             |

---

## 🚀 Configuration & Installation

### 1. Prérequis

- ✅ **Java 17+** installé
- ✅ **Maven** installé
- ✅ **PostgreSQL** installé et en cours d'exécution  
  → Créer une base de données nommée `medical_db` :
  ```sql
  CREATE DATABASE medical_db;
  ```

### 2. Cloner le projet

```bash
git clone https://github.com/votre-utilisateur/medical-management-system.git
cd medical-management-system
```

### 3. Configuration (`application.properties`)

Modifiez le fichier `src/main/resources/application.properties` avec vos identifiants :

```properties
# ── Datasource ──────────────────────────────────────────
spring.datasource.url=jdbc:postgresql://localhost:5432/medical_db
spring.datasource.username=votre_user
spring.datasource.password=votre_password

# ── JPA / Hibernate ─────────────────────────────────────
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 4. Lancer l'application

```bash
mvn clean install
mvn spring-boot:run
```

L'API sera disponible sur : `http://localhost:8080`

### 5. (Optionnel) Avec Docker

```bash
docker-compose up --build
```

---

## 📁 Structure du Projet

```
medical-management-system/
├── src/
│   ├── main/
│   │   ├── java/com/medical/
│   │   │   ├── entities/          # Entités JPA (Patient, Medecin, RendezVous, Consultation)
│   │   │   ├── repositories/      # Interfaces Spring Data JPA
│   │   │   ├── services/          # Logique métier
│   │   │   ├── controllers/       # Contrôleurs REST
│   │   │   └── MedicalApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/medical/
├── pom.xml
└── README.md
```

---

## 📬 Contact

Pour toute question ou suggestion, n'hésitez pas à ouvrir une **issue** ou soumettre une **pull request**.
