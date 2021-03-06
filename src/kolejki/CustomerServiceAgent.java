package kolejki;

public class CustomerServiceAgent implements Runnable {

    /* zgłoszenie syngalizujące konsultantowi, że następnych zgłoszeń już nie będzie */
    public static final Call GO_HOME = new Call(-1,0);

    /* identyfikator konsultanta */
    private final int _id;

    /* kolejka zgłoszeń */
    private final Queue _calls;

    /* konstruktor
    parametry: identyfikator konsultanta, kolejka zgłoszeń
     */
    public CustomerServiceAgent(int id, Queue calls){
        assert calls != null : "Nie określono kolejki zgłoszeń";
        _id = id;
        _calls = calls;
    }

    public String toString(){
        return "Konsultant " + _id;
    }

    @Override
    public void run() {
        System.out.println(this + " obecny");

        while(true){
            System.out.println(this + " oczekuje");
            Call call = (Call) _calls.dequeue();
            System.out.println(this + " obsługuje " + call);

            if(call == GO_HOME){
                break;
            }

            call.answer();
        }

        System.out.println(this + " zakończył pracę");
    }
}
