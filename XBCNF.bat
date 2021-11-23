@ECHO OFF
ECHO "Aquest programa et preguntara primer pel titol dels archius, per la extensio, per el numero de archius que vols crear, per el numero pel qual vols començar, i per si li vols ficar zeros abans del numero. Clica enter per continuar."
pause
java -cp %~dp0; CreateNumberedFile
ECHO "FET."
pause