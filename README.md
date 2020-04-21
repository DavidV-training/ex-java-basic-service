### Exercice : 
A) Ecrire le Dockerfile
- Qui se base sur jopenjdk:15-alpine
- Qui doit : 
  1) ajouter le jar à la racide de l'image en le renommant service.jar
  2) ajouter le script run.sh à la racine de l'image
  3) lancer le script run.sh a l'instanciation du conteneur

B) Construire l'image avec le tag : training/basicservice:[votre-prénom]

C) instancier un conteneur :
- en affectant 256m aux variables Xms et Xmx
- en le demarrant sur le port 8081 (sans modification du source / container)
- en mappant le port 8081 du conteneur vers un port aléatoire de l'hote

---------------------------------------------------------
### Initialisation : 
```sh
$ # Récupérer le source
$ git clone https://github.com/DavidV-training/ex-java-basic-service.git
$ 
$ # générer le jar
$ cd basicservice
$ maven package
$ 
$ # l'executer localement (pour tester)
$ java -jar basic-service-1.0-SNAPSHOT.jar
```

---------------------------------------------------------
### Attendus : 
- un fichier Dockerfile
- un fichier exo.sh avec la commande de build et la commande de run


