## Ödevin Cevapları:

* <u>baş düğümden başlanarak</u> yazdırma metodu: `print();`

* <u>son düğümden başlanarak</u> yazdırma metodu: `tnirp();`

* <u>baş düğümden başlanarak</u> düğüm sayma metodu: `numberH();`

* <u>son düğümden başlanarak</u> düğüm sayma metodu: `numberT();`

isimleri verilerek algoritmalar kurulmuştur.

## print(); metodu:

```java
public class List {
    void print() {
        if(head == null) {
            System.out.println("-- Liste boş --");
        }
        else {
            Node temp = head;
            System.out.println("-- Liste --");
            for(int i = 1; temp != null; i++){
                System.out.println(i + ") " + temp.data);
                temp = temp.next;
            }
            System.out.println("-----------");
        }
    }
}
```

---

## tnirp(); metodu:

```java
public class List {
    void tnirp() {
        if(tail == null) {
            System.out.println("-- Liste boş --");
        }
        else {
            Node temp = tail;
            System.out.println("-- Liste --");
            for(int i = 1; temp != null; i++){
                System.out.println(i + ") " + temp.data);
                temp = temp.prev;
            }
            System.out.println("-----------");
        }
    }
}
```
---

## numberH(); metodu:

```java
public class List {
    int numberH() {
        int i = 1;
        if(head == null) {
            return (i-1);
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
                i++;
            }
            return i;
        }
    }
}
```

---

## numberT(); metodu:

```java
public class List {
    int numberT() {
        int i = 1;
        if(tail == null) {
            return (i-1);
        }
        else {
            Node temp = tail;
            while(temp.prev != null) {
                temp = temp.prev;
                i++;
            }
            return i;
        }
    }
}
```

---
**Author:** Berat Kurt

![Creeper](../images/Creeper.gif)

> Önceki dosyaya dönmek için [buraya](../Çift_Yönlü_Doğrusal_Bağlı_Liste.md) tıklayınız.
