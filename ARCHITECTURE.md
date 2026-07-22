# 🏰 Architecture POO : Donjon & Dragonnet (Version Composition)

Fiche récapitulative sur la structure du projet basée sur le principe de **Composition** (*Composition plutôt qu'Héritage*).

---

## 📦 1. Le Principe : La Case comme Conteneur

Toutes les cases du jeu sont des instances de la même classe unique **`Cell`**.
Une `Cell` agit comme un conteneur (une boîte) qui possède un attribut `content` :
* Si `content == null` ➔ La case est **vide**.
* Si `content != null` ➔ La case contient un **événement**, un **monstre** (`Character`) ou un **équipement** (`Item`).

---

## 🛠️ 2. Structure des Classes

### 🟢 `Board` (Le Plateau)
- Contient une `ArrayList<Cell> cells` de 64 éléments.
- Rempli avec des instances de `Cell` (certaines vides, certaines avec du contenu).
- Exemple d'initialisation aléatoire :
  ```java
  if (roll < 60) {
      cells.add(new Cell()); // Case vide (content == null)
  } else if (roll < 80) {
      cells.add(new Cell("Un Gobelin", new Goblin())); // Case avec contenu
  }
  ```

### 🔵 `Cell` (La classe unique de Case)
- Possède un nom/description (`String name`) et un contenu (`Object content`).
- Ne nécessite **aucune sous-classe** (`EmptyCell`, `EnemyCell`, etc.).
- Méthodes utiles :
  - `isEmpty()` : retourne `true` si `content == null`.
  - `getContent()` : retourne l'objet ou le monstre présent sur la case.

---

## ⚡ 3. Déroulement d'un tour de jeu (`Game` ↔ `Board` ↔ `Cell`)

1. **Le joueur lance le dé** ➔ le pion avance sur `currentCell`.
2. **`Game` récupère la case** ➔ `Cell cell = board.getCell(currentCell);`
3. **`Game` vérifie la case** :
   - Si `cell.isEmpty()` ➔ Case calme, rien ne se passe.
   - Si `cell.getContent()` contient un monstre/objet ➔ Le jeu déclenche le combat ou le ramassage !

---
*Fiche générée pour le projet Donjon & Dragonnet* 🐉
