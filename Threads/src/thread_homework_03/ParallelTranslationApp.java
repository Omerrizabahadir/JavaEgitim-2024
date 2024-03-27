package thread_homework_03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Bir metin çeviri uygulaması geliştirmeniz gerekiyor.
Bu uygulama, farklı diller arasında metinleri çevirmelidir.
Çevirileri paralel olarak gerçekleştirecek bir sistem tasarlayın ve uygulamayı oluşturun.
Kullanıcıdan çevirilecek metni ve hedef dili girdi olarak alarak,
çeviriyi paralel olarak gerçekleştirip sonucu ekrana yazdıran bir program yapın."

 */

public class ParallelTranslationApp {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // 5 threadli bir havuz oluştur

        String textToTranslate = "Hello, how are you?";
        String targetLanguage = "es"; // Hedef dil kodu (örneğin: "es" -> İspanyolca)

        String[] availableLanguages = {"es", "fr", "de", "it"}; // Desteklenen diller

        for (String language : availableLanguages) {
            if (!language.equals(targetLanguage)) {
                Runnable translationTask = new TranslationTask(textToTranslate, language, targetLanguage);
                executor.execute(translationTask);
            }
        }

        executor.shutdown();
    }
}

class TranslationTask implements Runnable {
    private final String text;
    private final String sourceLanguage;
    private final String targetLanguage;

    public TranslationTask(String text, String sourceLanguage, String targetLanguage) {
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
    }

    @Override
    public void run() {
        // Bu bölümde metni çevirebilir ve sonucu ekrana yazdırabilirsiniz.
        System.out.println("Translation from " + sourceLanguage + " to " + targetLanguage + ": " + translate(text));
    }

    private String translate(String text) {
        // Metin çeviri işlemleri burada gerçekleştirilir
        // Örnek olarak, basit bir sözlük kullanılabilir veya harici bir çeviri API'si kullanılabilir
        // Bu örnekte sadece örnek çeviriyi simüle ediyoruz
        return text + " translated";
    }
}