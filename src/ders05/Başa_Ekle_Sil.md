>Önceki konularda:
>ekrana yazdırma, sona ekleme, sondan çıkarma işlemlerini gördük.

## Başa Ekleme/Silme İşlemleri:

---

* önceki gördüğümüz konular üzerinde biraz daha metod ekleyip listeyi <mark>geliştireceğiz.</mark>

## Başa Ekleme:

* eğer liste boşsa, `normal ekleme işlemi` yapılır. 

* liste boş değilse:

1. Geçici düğüm `temp` tanımlanır.
2. `temp.next = head;` işlemi yapılır.
3. `head = temp;` işlemi yapılır.

---

**Görsel olarak da:**

![başa ekle](images/başa%20ekle.png)

Şeklinde oluşturulur.


---

## Bastan Sil:

* eğer liste boşsa, düğüm <u>çıkarılamaz.</u>

* listede <mark>yanlız bir düğüm</mark> varsa `head = null` yazılır.

* listede birden fazla düğüm varsa:

1. `Node temp = head.next` yazılır.
2. `head.next = null` yazılır. Daha sonra,
3. `head = temp` yazılır.

---

**Görsel olarak da:**

![baştan çıkar](images/baştan%20çıkar.png)

Şeklinde oluşturulur.

* Kaynak kodlarını incelemeyi unutmayınız.

* Bir sonraki derste önemli bir örnek işleyeceğiz. Sonra da 
<mark>araya düğüm ekleme-çıkarma</mark> işlemlerine göz atacağız.

**Author:** Berat Kurt

Bir sonraki ders için [buraya](../ders06/) tıklayınız.