INF1000
-------

## Variabler

```java
int ettTall = 1;
String enTekst = "Dette er en test";
```

## Flytkontroll

### If else

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
  System.out.println("Dette er gang nr " + i);
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
Scanner s = new Scanner(System.in) // Husk "import java.io.Scanner"
boolean fortsett = true;

while (fortsett) {                 // Fortsetter til "fortsett-variablen blir endret
  String input = s.nextLine();
  if (input.equalsIgnoreCase("stop")) {  // Sjekker om input er lik stop, uten å sjekke for store eller små bokstaver
    fortsett = false;              // Avslutter løkka når brukeren skriver "Stop"
  }
}
```

## String


## Arrays

```java
int[] enListe = new int[6];              // Tom liste med seks plasser
int[] endaEnListe = new int[] {5, 3, 5}; // Liste med innhold

enList[2] = 6;                           // Lagrer tall i lista
int tallFraLista = enList[2]             // Henter ut tredje tallet fra lista (begynner på 0)
```

### Løkke for arrays

Vanlig løkke med arrays. `i` er indeksen til hvor lang man er kommet i lista.

```java
int[] liste = new int[] {2, 54, 4, 5};

for (int i = 0; i < liste.length; i++) {
  int talletFraLista = liste[i];
  System.out.println("Tall nr " + (i + 1) + " er " + talletFraLista);
}
```

Forenkla for-løkke. Har får man ikke ut nummeret på plassen, men bare innholdet i lista

```java
for (int tall : liste) {
  System.out.print(tall);
}
```

## ArrayList

```java
ArrayList<String> listeOverStrenger = new ArrayList<String>(); // Lager en ny tom liste

listeOverStrenger.add("Stian");             // Legger til. Gjør at .size() blir en større.
String innhold = listeOverStrenger.get(0);  // Henter ut innholdet i plass 0
int antallElementer = listeOverStrenger.size(); // Returnerer hvor mange elementer det er i lista
listeOverStrenger.remove(0);                // Fjerner et element. Gjør at .size() blir en mindre.
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
// En ny hashmap med String som nøkkel og MinKlasse som value/innhold.
HashMap<String, Person> map = new HashMap<String, Person>();

map.put("Stian", new Person());  // Legger inn en Person med nøkkel "Stian"
Person p = map.get("Stian");     // Henter ut igjen objektet
boolean finnesStian = map.containsKey("Stian");  // Sjekker om det finner en nøkkel som er "Stian"
```

### Løkke for HashMap

```java
HashMap<String, Person> map = new HashMap<String, Person>();

for (String key : map.keySet()) { // Lager en liste av alle nøklene og går igjennom dem
  Person p = map.get(key);        // Henter ut value basert på nøkkelen
  // Gjøre noe med person?
}
```


