//package kolejki;
//
//import listy.ArrayList;
//import listy.List;
//
//public class CallCenter {
//
//    /* kolejka zgłoszeń */
//    private final Queue _calls = new BlockingQueue(new ListFifoQueue());
//
//    /* liczba działających konsultantów */
//    private final int _numberOfAgents;
//
//    /* lista wątków konsultantów
//    pusta, gdy centrum zamknięte i niepusta gdy centrum otwarte
//     */
//    private final List _threads;
//
//    /* konstruktor
//    parametr: liczba działających konsultantów
//     */
//    public CallCenter(int numberOfAgents){
//        _threads = new ArrayList(numberOfAgents);
//        _numberOfAgents = numberOfAgents;
//    }
//
//    public void open(){
//        assert _threads.isEmpty(): "Centrum obsługi jest już otwarte";
//
//        System.out.println("Otwieranie centrum obsługi");
//
//
//    }
//}
