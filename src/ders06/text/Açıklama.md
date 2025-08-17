> Alışveriş sorusunun cevabı:

### 1. Adım:

* önceki derslerde olduğu gibi `Node` ve `List` yapısını oluştur.

### 2. Adım:

#### Scanner nesnesi:

* kullanıcıdan değer alacağımız için önemlidir.

* içeri aktarım için:

```java
import java.util.Scanner;
```

* Scanner nesnesini oluşturmak için:

```java
Scanner scan = new Scan(System.in);
```

diyebilirsiniz.

#### loop(); Fonksiyonu:

* bu fonksiyon ekleme, çıkarma; sondan, baştan işlemleri; ekrana yazdırma veya çıkş işlemleri ile ilgili kullanıcıya <u>bir temel arayüz</u> sunar.

* değer döndürür, döndüren değere bağlı olarak istenilen işlem gerçekleşir.


* içerisinde `try-catch` yapısı bulunur. (<u>InputMismatchException</u> hatası oluşmaması için)

#### switch-case yapısı:

* girdiye bağlı olarak ilgili case'e yönlendirilir.

* işlem bittiğinde tekrar `select = loop();` yapısı kurulur.

---

![alışveriş sepeti](../images/alışveriş%20sepeti.jpg)

---

önceki dosyaya dönmek için [buraya](../Örnek.md) tıkalyınız.

**Kaynak kodlarına bakmayı unutmayınız.**