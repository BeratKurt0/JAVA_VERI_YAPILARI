> Araya ekleme-silme İşlemi:

* Biz bir liste yapısında araya eklemek veya silmek istersek <u>iki parametre</u> almamız gerekir:

* birinci parametre `indeks sayısını` almalı,

* ikinci parametre `girilecek veriyi` almalıdır.

---

```java
void addBetween(int index, int data){
    //  //
}
```

Şeklinde olur.

* aradan çıkarma işlemi için bir parametre yeterli olacaktır.

```java
void deleteBetween(int index){
    //  //
}
```

biçimindedir.

**number(); fonksiyonu:**

* bu fonksiyon listeyi alıp düğüm sayısını döndürecek.

```java
private int number(){
    //  //
}
```

> Önemli Not:

* araya ekleme veya silme işleminde:

*Kural 1:* indeks numarası doğal sayı olmalıdır.

*Kural 2:*  indeks numarası geçerli bir aralıkta olmalıdır.

>ekleme işleminde  indeks aralığı:  `0 <= index <= number() `

---

![araya ekleme](./images/araya%20ekleme.png)

---

>çıkarma işleminde indeks aralığı: `0 <= index <= number()-1`

---

![aradan silme](./images/aradan%20silme.png)

olacaktır.

* indeksimiz geçerli aralıkta ise geriye artık <u>üç ihtimal</u> kalıyor:

* `indeks = 0` ise <mark>başa ekleme/silme</mark> işlemi yapılır.

* <mark> ekleme işlemi için: </mark> `index = number()` ise <u>sona eklenir.</u> 

* <mark> silme işlemi için: </mark> `index = number()-1` ise <u>sondan silinir.</u>

### Ortadan ekleme-silme işlemi:

* ekleme işlemi için:

---

![araya ekleme algoritması](./images/araya%20ekleme%20algoritma.png)

---

* silme işlemi için:

---

![aradan silme algoritması](./images/aradan%20silme%20algoritma.png)

* olacaktır.

>Önemli Not:

`Aradan silme` işlemi için <u>listenin boş olup olmama durumunu</u> da kontrol ediniz.

**Author:** Berat Kurt

*Kaynak kodlarına bknz.*

bir sonraki ders için [buraya](../ders08/) tıklayınız.