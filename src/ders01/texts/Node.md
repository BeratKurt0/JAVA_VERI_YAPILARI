**CİDDİ BİR PROBLEMİ ORTADAN KALDIRDIK:**

<u> neydi o problem ?</u>

* Veri yapısı oluşturmak istediğimizde `düğümler` bize gerekli olacak. 

* Yani düğümleri kullanabilmek için her düğüm için bir sınıf oluşturduk ve bize sorun oldu.
 
* `Tek düğüm` kurduk ve gösterici sorununu ortadan kaldırdık.
 
### AMA BİR SORUN DAHA VAR:

* Fazla miktarda referans açıldı.
 
* 4 tane veri için 4 referans açılırsa 100 veya daha sonrası için uzun şekilde referans tanımlaması yapılamaz.

* İşte bunu bir `metod` haline (bir sisteme) çevirmemiz gerekiyor.
   
* Tam bu noktada <u><mark>veri yapıları</mark></u> devreye giriyor

* Düğüm, ref işlemleri `Abstact` edilir (Soyutlanır).

* `Ekleme`, `silme`, veri arama gibi metodlar; veri yapısına <mark>fonksiyonellik</mark> katar.

* veri yapıları hız ve zaman kazandırır. <u>JCF kütüphaneleri</u> ile modüler bir yapı kazandırılır.

* Ve daha sayamayacağımız birçok özellik veri yapılarında mevcuttur.

> Diğer dersimizde `tek yönlü doğrusal bağlı liste` kavramını öğreneceğiz.

**Author:** Berat Kurt

Önceki dosyaya dönmek için [buraya](../Listeler.md) tıklayınız.
