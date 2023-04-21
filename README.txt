
            Projet MODCRAFT
-------------------------------------------


Pour créer un mod:
==============================

Etape 1: Rendez-vous sur le site https://sae.skyhosting.fr/sae/modcraft/

Etape 2: Créez votre mod en suivant les instructions sur le site. Téléchargez
         Le zip nommé resources.zip et placez le dans le dossier "resources"
         à la racine de Modcraft_template-master

Etape 3: extrayez de resources.zip le dossier "assets" et le fichier "configs.json" dans le dossier "resources".
         Vous pouvez vous débarasser de "resources.zip" après cette étape.

Etape 4: double-cliquez sur "Generate_jar.bat" cela charge vos configurations et génère un
         .jar que vous pouvez retrouver dans le dossier "build/libs"

Etape 5: si vous souhaitez tester votre mod avec une version de minecraft prévue uniquement
         pour le développement, double-cliquez sur "runCLient.bat" tout simplement.
         Aucune autre manipulation n'est nécessaire.
         Sinon placez le jar généré dans votre dossier "mods" de votre jeu.


Si vous souhaitez Modifier le mod en vous basant sur Modcraft
(Attention ! Si vous ne vous y connaissez pas en modding de Minecraft,
 cette opération pourrait casser le reste de votre mod.):
==============================

Etape 1: Téléchargez le code depuis Github.

Etape 2: Construisez le projet avec gradle.

Etape 3: Modifiez le contenu du mod.

Si vous rencontrez des problèmes lors de la création de votre mod
==============================

- Vérifiez que le dossier "assets" et le fichier "configs.json"
  sont bien placés dans le dossier Modcraft_Template-master/resources 
  et pas Modcraft_Template-master/resources/resources
  
- Vérifiez bien de lancer "Generate_jar.bat" avant de lancer 
  "runClient.bat". Si vous avez des soucis pour l'execution de ces scripts, 
  vérifiez que vous avez Java installé sur votre machine.
  (erreur JAVA_HOME is not set)

- Supprimez votre dossier Modcraft_Template-master et retéléchargez le
  depuis Github (Code > Donwnload archive .zip)
