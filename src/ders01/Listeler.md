> Önceki derste veri türlerini işlemiştik.
>ilerideki konuları daha rahat anlamak için sağlam bir temel attık.

* Beraber liste kavramını işleyelim.

## Liste Nedir : 

* Birbiriyle `mantıksal ilişki` içerisinde bulunan öğelere denir.

* <u>Market listesi</u>, <u>bir otobüsteki yolcular listesi</u> vs. örnek olarak verilebilir.

![liste](./images/liste.png)

---

**Liste, Java'da iki başlık altında incelenir:**

### Doğrusal Liste:

* `Diziler`in oluşturduğu yapıya denir.

* Dizilerde veriler tek tipte olur ve peşpeşe dizilirler.

* Dizi boyutu önceden belirlenir ve <mark>statiktir</mark>.

* sonradan eleman eklemek veya çıkarmak işleri karmaşıklaştırır.

* Doğrusal liste, dinamik bellek özelliğini <u>sağlamadığı</u> için veritabanı işlemlerinde sürdürülebilir <u>değildir</u>.

![doğrusal liste](./images/doğrusal%20liste.png)

---

### Bağlı Liste:

* `Nesneler`in oluşturduğu yapıya denir.

> Nesne ve referans kavramlarını hatırlamıyorsanız [buraya](./texts/Nesne%20&%20Referans.md) tıklayınız.

* Verilerin `birbirini gösterecek` şekilde dizilerek oluşturduğu yapıya denir. 

* her bir elemana `Düğüm (Node)` denir ve her bir <u>düğüm bir nesneye</u> karşılık gelir.

* Düğümler `Veri + Link` biçiminde hareket eder. Yani düğümler, bellekte rastgele dizilir
ve her bir link kendinden bir sonraki düğümü tutar.

* En son düğüm nesneye işaret etmez. (null.)

* Düğümler bellekte <mark>dinamik</mark> olarak davranır. Ekleme vaya silme işleminde yapı bozulmaz.

* Bağlı liste, dinamik bellek özelliğini sağladığı için veritabanı işlemlerinde <u>sürdürülebilir</u> özelliktedir.


![bağlı liste](./images/bağlı%20liste.png)

---

### Doğrusal Liste için:

|+ 'lar | - 'ler|
|-------|-------|
|Herhangi bir elemana kolayca ve hızlı bir biçimde ulaşabiliriz. (1. elemana da 1000. elemana da aynı birim sürede ulaşılır.) |  Geçersiz indeks değeri girilirse `java.lang.ArrayIndexOutOfBoundsException` hatası fırlatır.
|İşlemci ve bellek açısından gayet uygundur.|Eleman ekleme veya çıkarma işlemi için uygun yapıda değildir.
||Bellekte statik olarak kaldığı için bellek israfına yol açar.|

### Bağlı Liste için:

|+ 'lar|- 'ler|
|------|------|
|Gayet esneklik sağlar. (Veri çeşitlerini tutabilme )|Değer okumada işlemci yorulur.|
|Dinamik yapıdadır.|Karmaşık algoritmalara sahiptir.|

---

![spiderman](./images/SPİDERMAN.jpg)

---
#### Bağlı listeler temelde 4 tanedir:

- Tek yönlü doğrusal bağlı liste `(TYDoBL)`
- Çift yönlü doğrusal bağlı liste `(ÇYDoBL)`
- Tek yönlü dairesel bağlı liste `(TYDaBL)`
- Çifte yönlü dairesel bağlı liste `(ÇYDaBL)`

> Bu dersin devamında önce bir örnek çözüp ardından `Nesneleri Bağlama` kavramına değinip algoritmasını yazacağız.

* 1. Örneği görnek için [buraya](./texts/Örnek_1.md) tıklayınız.

> Ardınan dersin devamı için [Nesneleri Bağlama.md](./texts/Nesneleri%20Bağlama.md) dosyasına ve içerisindeki 2. Örneğe bknz.

> Sonrasında bulunan [Node.md](./texts/Node.md) dosyasına da bakmayı unutmayınız.

> Diğer ders `tek yönlü doğrusal bağlı liste` kavramına değinip yine algoritmasını yazaağız.

> Dersin bu noktasına kadar sıkılman normaldir, bayağı konu başlıklarını inceledik.
Sonraki derslerde sadece küçük bilgiler ve ağırlıklı olarak örnekler çözeceğiz.

**Author:** Berat Kurt

Diğer derse geçmek için [buraya](../ders02/) tıklayınız.