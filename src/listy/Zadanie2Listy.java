package listy;

public class Zadanie2Listy {

    public static void main(String[] args) {

        LinkedList lista1 = new LinkedList();
        LinkedList lista2 = new LinkedList();

        lista1.add();
        lista1.add();
        lista1.add();

        lista2.add();
        lista2.add();

        System.out.println(polaczListyNumerElementu(lista1, lista2, 1));

//        polaczListyWartoscElementu(lista1, lista2, lista1.get(1));
//
//        konkatenacjaList(lista1, lista2);

    }


        private static LinkedList polaczListyNumerElementu(LinkedList listaJeden, LinkedList listaDwa, int index){
            LinkedList listaNowa = new LinkedList();
            int staryIndexListyJeden = 0;

            if(index == 0){
                listaNowa = listaDwa;
                for(int i = 0; i < listaJeden.size(); i++){
                    listaNowa.add();
                }
            } else {
                for(int i = 0; i < index; i++){
                    listaNowa.add();
                    staryIndexListyJeden++;
                }
                for(int i = 0; i < listaDwa.size(); i++){
                    listaNowa.add();
                }
                for(int i = staryIndexListyJeden; i < listaJeden.size(); i++){
                    listaNowa.add();
                }
            }


            return listaNowa;
        }

        private static LinkedList polaczListyWartoscElementu(LinkedList listaJeden, LinkedList listaDwa, Object
                element) {
            LinkedList listaNowa = new LinkedList();
            if(listaJeden.get(0).equals(element)){
                listaNowa = listaDwa;
                for(int i = 0; i < listaJeden.size(); i++){
                    listaNowa.add();
                }
            } else {
            }

            return listaNowa;
        }

        private static LinkedList konkatenacjaList(LinkedList listaJeden, LinkedList listaDwa){
//            LinkedList listaNowa = new LinkedList();
            LinkedList listaNowa = listaJeden;

            for(int i = 0; i < listaDwa.size(); i++){
                listaNowa.add();
            }
            return listaNowa;
        }
    }
