package livros.ocaocpstudyguide.cap1.classdeclarations.finalclasses;

/**
 * Created by alex on 10/04/2015.
 */
public final class ClasseA {
    public void setA (String a){

    }

   /* campos nao compilam
    private class X extends ClasseA{
        @Override
        public void setA(String a) {
            super.setA(a);
        }
    }
    ClasseA ca = new ClasseA(){
        @Override
        public void setA(String a) {
            super.setA(a);
        }
    };
    */
}
