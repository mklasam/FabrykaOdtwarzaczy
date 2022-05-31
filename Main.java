package com.company;

public class Main {

    public static void main(String[] args) {
        FabrykaOdtwarzaczy fabryka = new FabrykaOdtwarzaczy();
        OdtwarzajWideo odtwarzacz = FabrykaOdtwarzaczy.zwrocOdtwarzacz("Sample.avi");
        if (odtwarzacz != null) {
            odtwarzacz.odtwarzaj("Sample.avi");
        }
    }
}
interface OdtwarzajWideo {
    public void odtwarzaj(String nazwaPliku);
}

class OdtwarzaczMP4 implements OdtwarzajWideo {
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("Odtwarzaj format mp4 z pliku " + nazwaPliku);
    }
}
class OdtwarzaczAVI implements OdtwarzajWideo {
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("Odtwarzaj format avi z pliku " + nazwaPliku);
    }
}
class FabrykaOdtwarzaczy {
    public  static OdtwarzajWideo zwrocOdtwarzacz(String typ) {
        if (typ.endsWith("mp4")) {
            return new OdtwarzaczMP4();
        } else if (typ.endsWith("avi")) {
            return new OdtwarzaczAVI();
        } else {
            return null;
        }
    }
}