interface IsEmergency {

    void soundSiren();

}

class FireEmergency implements IsEmergency {

   

    public void soundSiren() {

        System.out.println("Siren sounded.");

    }

}

class SmokeAlarm {

    

}

public class Main {

    public static void main(String[] args) {

        Object myArray[] = new Object[4];

        myArray[0] = new SmokeAlarm();

        myArray[1] = new SmokeAlarm();

        myArray[2] = new FireEmergency();

        myArray[3] = new FireEmergency();

        for (Object obj : myArray) {

            if (obj instanceof IsEmergency) {

                ((IsEmergency) obj).soundSiren();

            }

        }

    }

   
}