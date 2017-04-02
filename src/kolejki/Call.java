package kolejki;

public class Call {
    /* identyfikator zgłoszenia */
    private final int _id;

    /* czas trwania obsługi zgłoszenia */
    private final int _duration;

    /* czas wygenerowania zgłoszenia */
    private final long _startTime;

    /* konstruktor
    parametry: identyfikator zgłoszenia, czas trwania obsługi zgłoszenia
     */

    public Call(int id, int duration){
        assert duration >= 0 : "czas obsługi nie może być ujemny";

        _id = id;
        _duration = duration;
        _startTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Zgłoszenie " + _id;
    }

    public void answer(){
        System.out.println(this + " rozpoczęcie obsługi po oczekiwaniu " + (System.currentTimeMillis() - _startTime)
                + " milisekund");
        try{
            Thread.sleep(_duration);
        } catch (InterruptedException e){
            // Ignoruj
        }
    }
}
