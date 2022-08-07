<a name="readme-top"></a>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
      <li>
      <a href="#getting-started">Assignment</a>
      <ul>
        <li><a href="#tugas-1">Tugas 1</a></li>
        <li><a href="#tugas-2">Tugas 2</a></li>
         <li><a href="#tugas-3">Tugas 3</a></li>
        <li><a href="#tugas-4">Tugas 4</a></li>
         <li><a href="#tugas-5">Tugas 5</a></li>
        <li><a href="#tugas-6">Tugas 6</a></li>
        <li><a href="#tugas-7">Tugas 7</a></li>
      </ul>
    </li>
  </ol>
</details>

## About The Project

### Repo QA-Automation-JLABS-Batch-10
Repositori ini dibuat untuk menyimpan tugas - tugas dari kelas QA Automation Batch 10 Jakarta Labs

## Getting Started

### Prerequisites
```
Java
```
### Installation
```
git clone https://github.com/alfahmist/QA-Automation-Batch-10.git

```

## Assignment

<!-- Tugas 1 -->
### Tugas 1
Pada minggu pertama mempelajari fundamental java map/collection diberi tugas membuat Treemap dan Treeset dengan minimum 3 member.

TreeMap berfungsi menyimpan collection secara urut berdasarkan key dari value (key,value).

TreeSet berfungsi menyimpan collection secara urut berdasarkan value.

* Lokasi
```
tugas1/tree.java
```
* Code TreeSet:
```
int numbering;
System.out.println("TreeSet");
TreeSet<String> ts = new TreeSet<>();
ts.add("Lia");
ts.add("Lia");
ts.add("Arif");
ts.add("Felix");
ts.add("John");

numbering = 1;
for (String item : ts) {
  System.out.println(numbering + ". " + item);
  numbering++;
}

System.out.println("TreeSet First : " + ts.first());
System.out.println("TreeSet Last : " + ts.last());
```
* Output

![image](https://user-images.githubusercontent.com/48145002/183289838-0412bbb2-1f1c-4979-a5ea-2443b7e47ab9.png)


* Code TreeMap:
```
TreeMap<Integer, String> tm = new TreeMap<>();
tm.put(26, "Lia");
tm.put(26, "Doraemon");
tm.put(19, "Arif");
tm.put(8, "Felix");
tm.put(11, "Arif");

numbering = 1;
for (Integer key : tm.keySet()) {
  System.out.println(numbering + ". Favorite number of " + tm.get(key) + " is " + key);
  numbering++;
}

System.out.println("Lowest number : " + tm.firstKey());
System.out.println("Highest number : " + tm.lastKey());
```
* Output

![image](https://user-images.githubusercontent.com/48145002/183289510-901fb44a-f93b-40b7-a8ae-cb6bd2f74641.png)


* TreeMap dan TreeSet secara default mengurutkan secara ascending
* TreemSet tidak dapat menyimpan value duplikat, dia akan menyimpan value terakhir (paling baru)
* TreeMap tidak dapat menyimpan key duplikat, dia akan menyimpan key terakhir (paling baru), karena key pada treeset bersifat unique. sedangkan valuenya boleh duplikat.
* Perbedaan dari set dan map diatas, jika treeSet mengurutkan berdasarkan value dan treeMap mengurutkan berdasarkan key. 
<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- Tugas 2-->
### Tugas 2

Pada minggu ke-2 mempelajari OOP (Object Oriented Programming).
Kami diberi tugas membuat calculator sederhana menggunakan OOP. kalau inputnya string, throw error kalo dia bukan angka.
saya membuatnya dengan flow berikut.

![image](https://user-images.githubusercontent.com/48145002/183291251-af9e56fb-ce4b-41cd-b796-52063168a550.png)


1. Memilih Menu.
2. Jika tidak ada menunya input menu lagi.
3. Jika ada lanjut input angka
4. Input angka pertama dan kedua.
5. Apakah ada string atau tidak ?
5. Jika ada tipe data string print error dan kembali input angka lagi.
6. jika tidak ada print hasil.

Untuk throw error nya saya bungkus dengan error handling yaitu try catch agar program dapat terus berjalan.

* Lokasi
```
tugas2/Calculator.java
tugas2/CalculatorMain.java
```

* Potongan Code :
```
void inputAngka() {
  try {
    Scanner inputValue1 = new Scanner(System.in);
    Scanner inputValue2 = new Scanner(System.in);
    System.out.print("Masukkan Angka pertama : ");
    String scan1 = inputValue1.next();
    System.out.print("Masukkan Angka Kedua : ");
    String scan2 = inputValue2.next();
    value1 = Integer.parseInt(scan1);
    value2 = Integer.parseInt(scan2);
  } catch (Exception e) {
    printError("Tidak bisa input string\n"); //throw error
    inputAngka(); // rekursif
  }
}

void printError(String message) {
  System.err.println(message);
}
```
* Output

![image](https://user-images.githubusercontent.com/48145002/183292026-3fea2591-16bc-448f-96cd-d7917c34bbed.png)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Tugas 3


### Tugas 4


1. Go to saucedemo.com.
2. Input username and password.
3. Add 2 product.
4. Checkout and pay.
5. Please create all of this using POM.

* Lokasi
```
tugas4
 ├──tugas4.pages
 │  ├── BasePage.java   # Basic function (click, setText, getText)
 │  ├── CartPage.java   # handle CartPage (click checkout button)
 │  ├── Checkout.java   # handle Checkout (fill customer information, click continue and finish button, getSuccessText)
 │  ├── Inventory.java  # handle Inventory (click an item button to add to cart)  
 │  └── LoginPage.java  # handle Login (input username and password, click login button)            
 ├──tugas4.test 
    ├── BaseTest.java   # congfiguration (Webdriver, BeforeTest and AfterTest)
    ├── SauceDemo.java  # main test
```
    
    
* Potongan Code
```
@Test
public void checkoutTest() {

  loginPage.login(username, password);
  inventoryPage.buySomeItems();
  cartPage.checkout();
  checkoutPage.fillCustomerInformation(username, username, postalCode);

  String actualText = checkoutPage.getSuccessText();
  String expectedText = "THANK YOU FOR YOUR ORDER";

  Assert.assertTrue((actualText).contains(expectedText));
  System.out.println(actualText);
}
```
* Output

https://user-images.githubusercontent.com/48145002/183294083-9c84f900-967d-4002-b9ef-7fcbd8da52c4.mp4

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Tugas 5
<p align="right">(<a href="#readme-top">back to top</a>)</p>
### Tugas 6
<p align="right">(<a href="#readme-top">back to top</a>)</p>
### Tugas 7
<p align="right">(<a href="#readme-top">back to top</a>)</p>
