public class Main {
	public static void main(String[] args) {
		// ----------------------------- ERRORS ------------------------------
		// Gli Errors, come ad esempio lo StackOverflowError, sono dei problemi irrecuperabili tramite gestione errori/eccezioni.
		// Nel senso che non si può scrivere semplicemente del codice che li gestiscano (come try-catch), bensì bisogna intervenire
		// solitamente o modificando il codice in maniera importante, oppure addirittura in casi più gravi (come ad esempio se c'è
		// un problema hw) aggiustando il computer sul quale si sta eseguendo il codice prima di eseguirlo

		// --------------------------- UNCHECKED EXCEPTIONS ----------------------------
		// Sono delle eccezioni che NON abbiamo l'obbligo di dover gestire tramite try-catch o similari. Invece queste sono problematiche
		// solitamente prevenibili con qualche tipo di accorgimento e controllo in più (ad esempio un qualche if(...) )
		int[] numbers = {1, 2, 3, 4, 5};

		int index = 4;
		if (index < 0 || index > 4) System.out.println("Il numero inserito deve essere compreso tra 0 e 4");
		else System.out.println(numbers[index]); // ArrayIndexOutOfBoundsException

		System.out.println("Caro utente, dammi un numero");
		String input = "un numero";
		/*		System.out.println(Integer.parseInt(input)); // NumberFormatException*/

		String str = "Qualcosa";
		str = null;
		if (str != null) System.out.println(str.length()); // NullPointerException

		int num1 = 5;
		int num2 = 0;

		if (num2 != 0) System.out.println(num1 / num2); // ArithmeticException
		else System.out.println("Non si può dividere per zero!");

		// --------------------------- CHECKED EXCEPTIONS ----------------------------
		// Questo tipo di Exceptions ci costringe a doverle gestire in qualche maniera (es. try-catch) se voglio far partire il codice.
		// Infatti qualora Java rilevasse una potenziale problematica del genere, e questa non fosse gestita, non potrei neanche
		// eseguire l'applicazione. Quindi non mi basterà inserire un qualche tipo di controllo (tipo if(..) ) per prevenire l'eccezione,
		// quindi questa potrebbe capitare comunque e di conseguenza farci crashare l'applicazione

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("CIAO");
	}

	public static void print(String message) {
		// print(message);
	}
}