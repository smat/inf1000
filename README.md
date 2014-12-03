INF1000
-------

## Variabler

```java
int ettTall = 1;
String enTekst = "Dette er en test";
```

## Regnefunksjoner

```java
int a = 5;
int b = 7;

int c = a + b // Pluss sammen to tall
int d = a - b // Trekke fra ett tall
int e = a * b // Gange sammen to tall

int f = a / b // Dele på et tall. Ved int vil den fjerne alt etter komma
int g = a % b // Rest etter etter deling

a += b // Er det samme som: a = a + b
a -= b // Er det samme som a = a - b
```

## Flytkontroll

### If else

Primitiver er `int`, `double`, `boolean` (alle med små forbokstav). `String` er ikke en primitiv.

Man kan ha alle funksjoner som returnerer `boolean` inne i parentesen til if-en.

```java
int tall = 1

if (tall == 0) {   // Primitiver bruker == for å sammenligne
  System.out.println("Tallet er null");
}
else if (tall == 1) {
  System.out.println("Tallet er en");
}
else {
  System.out.println("Tallet er ikke null eller en");
}
```

```java
String tekst = "Stian";

if (tekst.equals("Stian")) { // String bruker .equals for å sammenligne
  System.out.println("Teksten er Stian");
}
```

### For-løkke

Best å bruke når du vet hvor mange ganger du skal gjenta noe, eller hvis man skal gå igjennom en array.

#### Vanlig løkke

```java
for (int i = 0; i < 5; i++) {
  System.out.println("Dette er gang nr " + (i + 1));
}
```

```java
// Skriver ut "0 2 4 6 8 10 "
for (int i = 0; i =< 10; i + 2) {
  System.out.print(i + " ");
}
```


### While-løkke

Best å bruke når du ikke vet hvor mange ganger noe skal gjentas

```java
Scanner s = new Scanner(System.in) // Husk "import java.util.Scanner"
boolean fortsett = true;

while (fortsett) { // Fortsetter til "fortsett-variablen blir endret
  String input = s.nextLine();
  // Sjekker om input er lik stop,
  // uten å sjekke for store eller små bokstaver
  if (input.equalsIgnoreCase("stop")) {
    fortsett = false; // Avslutter løkka når brukeren skriver "Stop"
  }
}
```

## Arrays

```java
int[] enListe = new int[6];     // Tom liste med seks plasser
int[] endaEnListe = {5, 3, 5};  // Liste med innhold

enListe[2] = 6;                 // Lagrer tall i lista
int tallFraLista = enListe[2];  // Henter ut tredje tallet fra lista (begynner på 0)
int lengde = enListe.length;    // Størrelsen på array-et
```

### Løkke for arrays

Vanlig løkke med arrays. `i` er indeksen til hvor langt man er kommet i lista.

```java
int[] liste = {2, 54, 4, 5};

for (int i = 0; i < liste.length; i++) {
  int talletFraLista = liste[i];
  System.out.println("Tall nr " + (i + 1) + " er " + talletFraLista);
}
```

Forenkla for-løkke. Her får man ikke ut nummeret på plassen, men bare innholdet i lista

```java
for (int tall : liste) {
  System.out.print(tall);
}
```

## ArrayList

```java
ArrayList<String> listeOverStrenger = new ArrayList<String>(); // Lager en ny tom liste

// Legger til. Gjør at .size() blir en større.
listeOverStrenger.add("Stian");
// Henter ut innholdet i plass 0
String innhold = listeOverStrenger.get(0);
// Returnerer hvor mange elementer det er i lista
int antallElementer = listeOverStrenger.size();
// Fjerner elementet på plass 0. Gjør at .size() blir en mindre.
listeOverStrenger.remove(0);
// Overskriver et element i lista
listeOverStrenger.set(0, "Karoline");
```

### Løkke for ArrayList

En vanlig for-løkke som går igjennom alle nummerene på plasser, og så henter ut innholdet på den plassen.

```java
ArrayList<String> liste = new ArrayList<String>();

for (int i = 0; i < liste.size(); i++) {
  String ettElement = liste.get(i);
  System.out.println(ettElement);
}
```

Spesiell for-løkke som bare henter ut innholdet på alle plassene, en etter en. Oppfører seg likt som koden over.

```java
ArrayList<String> liste = new ArrayList<String>();

for (String ettElement : liste) {
  System.out.println(ettElement);
}
```

## HashMap

`Person` som er brukt under er et klassenavn som er funnet på, og kan være navnet på en klasse man lager selv.

```java
// En ny hashmap med String som nøkkel og Person som value/innhold.
HashMap<String, Person> map = new HashMap<String, Person>();

Person p = new Person();
// Legger inn en Person med nøkkel "Stian"
map.put("Stian", p);
// Henter ut igjen objektet
Person sammePerson = map.get("Stian");
// Sjekker om det finner en nøkkel som er "Stian"
boolean finnesStian = map.containsKey("Stian");
```

### Løkke for HashMap

```java
HashMap<String, Person> map = new HashMap<String, Person>();

// Lager en liste av alle nøklene og går igjennom dem
for (String key : map.keySet()) {
  Person p = map.get(key); // Henter ut value basert på nøkkelen
  // Gjøre noe med person. Egen kode
}
```


## Metoder

### Statiske metoder

Statiske metoder kan alltid kjøres inne i samme klasse, uten å kjøre den på noe.

```java
class StatiskMetodeEksempel {

  public static void main(String[] args) {
    skrivUtNoeGoy("Stian");
    skrivUtNoeGoy("Karoline");
  }

  public static void skrivUtNoeGoy(String navn) {
    System.out.println("Dette er goy, eller hva, " + navn);
  }

}

```


### Ikke-statiske metoder og konstruktør

Kan kun kjøres fra andre ikke-statiske metoder i samme klasse, eller på et objekt (eks `enTekstStreng.substring(5, 2)`)


```java
class Person {

  private String navn;

  public static void main(String[] args) {
    Person s = new Person("Stian");
    Person k = new Person("Karoline");
    s.siHei();  // Må kjøres på et objekt, siden main-metoden er statisk
    hadet();    // Kan kjøres alene, siden hadet er static

    // Skriver ut:
    // Hei, Stian
    // Hei, Karoline
    // Stian sier hei til Karoline
    s.siHeiTilNoen(k)
  }

  // Konstruktør:
  Person(String navn) {
    this.navn = navn; // this.navn referer til navn deklarert direkte i klassen
  }

  void siHeiToGanger() {
    siHei();       // Disse to linjene betyr det samme
    this.siHei();
    hadet();       // Ikke-statiske metoder kan kjøre statiske metoder direkte (men ikke omvendt)
  }

  void siHei() {
    System.out.println("Hei, " + navn);
  }

  void siHeiTilNoen(Person p) {
    siHei();    // Kjører siHei-metoden til objektet den ble kjørt på
    p.siHei();  // Kjører siHei-metoden til objektet som ble sendt inn
    System.out.println(this.navn + " sier hei til " + p.navn);
  }

  static void hadet() {
    System.out.println("Hadet");
  }

}
```
