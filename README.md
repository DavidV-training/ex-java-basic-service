### Exercice : 
A) Ecrire le Dockerfile
- Qui se base sur java:8u111-jdk-alpine
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
$ git clone https://gitlab.com/dve-formation-docker/basicservice.git
$ 
$ # générer le jar
$ cd basicservice
$ maven package
$ 
$ # l'executer localement
$ java -jar basic-service-1.0-SNAPSHOT.jar
```





