# FabrykaOdtwarzaczy

- It's a simple video player factory.


# Introduction
- Program can distuinguish from different types of video players,
- It can be useful on a daily basis,
- It might be attractive for everyone.

# Technology
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)


# Setup
- To run this project all you have to do is to install the Intellij and then copy the code below.


# Code

    public class Main {

    public static void main(String[] args) {
        FabrykaOdtwarzaczy fabryka = new FabrykaOdtwarzaczy();
        OdtwarzajWideo odtwarzacz = FabrykaOdtwarzaczy.zwrocOdtwarzacz("Sample.avi");
        if (odtwarzacz != null) {
            odtwarzacz.odtwarzaj("Sample.avi");
        }
    }}

    interface OdtwarzajWideo {
    public void odtwarzaj(String nazwaPliku);}

    class OdtwarzaczMP4 implements OdtwarzajWideo {
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("Odtwarzaj format mp4 z pliku " + nazwaPliku);
    }}
    class OdtwarzaczAVI implements OdtwarzajWideo {
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("Odtwarzaj format avi z pliku " + nazwaPliku);
    }}
    class FabrykaOdtwarzaczy {
    public  static OdtwarzajWideo zwrocOdtwarzacz(String typ) {
        if (typ.endsWith("mp4")) {
            return new OdtwarzaczMP4();
        } else if (typ.endsWith("avi")) {
            return new OdtwarzaczAVI();
        } else {
            return null;
        }
    }}
