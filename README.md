# RPG Character Roller

Write a fantasy game character creator!

## Preparation

- Option 1
  - Create a public repository on your GitHub profile
  - Clone it and add these instructions as README.md
- Option 2:
  - Fork this repository and clone your fork of this

## Requirements

- Create a new class called `Creator.java`
- Make sure .class files are not included in git
- Create a role playing game character
  - A character will randomly be a Warrior, Wizard or Potato
  - Each character has stats: Health, Strength and Magic
  - Each stat is random, between 2 and 12
  - Warriors will have triple Strength
  - Wizards will have triple Magic
  - Potatoes will have triple Health
  - Generate the team of five characters

## Example

Example of desired program output below. To keep the example short here it is only run 2 times to create 2 characters.

```sh
$ javac Creator.java && java Creator
-----------------------------------------
Welcome to the character generator!
Your next adventruer is.... a Wizard

        Strength: 5
        Magic: 21
        Health: 9

Happy adventuring!
-----------------------------------------

$ javac Creator.java && java Creator
-----------------------------------------
Welcome to the character generator!
Your next adventruer is.... a Potato

        Strength: 9
        Magic: 6
        Health: 24

Happy adventuring!
```

## Bonus

- Make Creator take in the character name as an argument!
- Example of desired program output below.

```sh
$ javac Creator.java && java Creator Veera
-----------------------------------------
Welcome to the character generator!
Veera is.... a Wizard!

        Strength: 6
        Magic: 18
        Health: 11

Happy adventuring!
-----------------------------------------
```
