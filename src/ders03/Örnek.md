## Örnek:

**Ali, Berkan, Canan, Defne, Emre** 

adında 5 arkadaş kulaktan kulağa olacak şekilde birbirlerine doğum tarihlerini söylüyorlar:

* İlk başta Ali, doğum tarihini Berkan'a söylüyor. Sonra Berkan, doğum tarihini Canan'a söylüyor ve bu şekilde ABCDE sırasına göre en son Emre' ye kadar geliyor 
 
* Buna göre her birinin doğum tarihine ve ismine ulaşabilmek için gerekli veri yapısını oluşturunuz?

Ali: 2003,

Berkan: 1999,

Canan: 2001,

Defne: 2006,

Emre: 2005,

doğumludur.

> Bu örneğimizde ekstradan `yazdırma metodunu` da beraber işleyeceğiz.

## print(); Metodu:

* yazdırma işlemi için temp'e ihtiyaç duyulur.

* öncelikle liste boş mu dolu mu ? Kontrol edilir. Liste boşsa Liste <u>yazdırılamaz</u>.

* Eğer liste boş değilse baş düğümden başlanarak son düğüme kadar (yani `temp = null` olana kadar) gidilir ve her seferinde temp'in o anki değeri ekrana yazılmış olur.

```java
public class List {
    void print() {
        if(head != null) {
            Node temp = head;
            System.out.println("--- Liste ---");
            for(int i = 1 ; temp != null ; i++) {
                System.out.println(i + ".) " + temp.data);
                temp = temp.next;
            }
            System.out.println("-------------");
        }
        else {
            System.out.println("--- Liste boş --- ");
        }
    }
}
```

sorunun çözümü için ilgili derste bulunan kaynak kodlarına göz atınız. 

* Bir sonraki ders için [buraya](../ders04/) tıklayınız.

**Author:** Berat Kurt