# User Guide

## Introduction

HealthBud is a fitness tracking application that helps users manage their workout routines, meal logs, water intake, and
personal bests (PBs). With an easy-to-use command-line interface, users can log, view, and manage their fitness data
efficiently.

## Quick Start

1. Ensure that you have Java 17 or above installed.
2. Download the latest version of HealthBud from here.
3. Open a terminal and navigate to the folder where the application is located.
4. Run java -jar HealthBud.jar to start the application.
5. Start entering commands to log your fitness activities!

## Features

### Help
Display this list of commands

Format: `help`

Example of usage: `help`

### Bye
Exit the program

Format: `bye`

Example of usage: `bye`

### Recommend
Get workout recommendations

Format: `recommend <muscle_group>`

Example of usage: `recommend biceps`

### BMI
Calculate your BMI

Format: `bmi /w <weight_in_kg> /h <height_in_m>`

Example of usage: `bmi /w 75 /h 1.8`

### Add workout
Add a workout log

Format: `add workout <date> /e <exercise> /r <reps> /s <sets>`

Example of usage: `add workout 020225 /e bench /r 8 /s 3`

### Add meal
Adds a meal log

Format: `add meal <meal_name> /cal <calories> /d <date> /t <time>`

Example of usage: `add meal chicken rice /cal 200 /d 020225 /t 1700`

### Add water
Adds a water log

Format: `add water /ml <volume> /d <date> /t <time>`

Example of usage: `add water /ml 1000 /d 020225 /t 1700`

### Personal best 
Record a personal best

Format: `pb /e <exercise> /w <weight_in_kg> /d <date>`

Example of usage: `pb /e bench /w 120 /d 020225`

### Sum
Sum up the total calories/water for the day

Format: `sum <cal|vol> /d <date>`

Example of usage: `sum cal /d 020225`

### Clear
Clear the respective log

Format: `clear <pb|meal|workout|water>`

Example of usage: `clear meal`

## FAQ

**Q**: How do I transfer my data to another computer?

**A**: {your answer here}

## Command Summary
* 1. `help` - Display this list of commands
* 2. `bye` - Exit the program
* 3. `recommend <muscle_group>` - Get workout recommendations
* 4. `bmi /w <weight_in_kg> /h <height_in_m>` - Calculate your BMI
* 5. `add workout <date> /e <exercise> /r <reps> /s <sets>` - Add a workout log
* 6. `add meal <meal_name> /cal <calories> /d <date> /t <time>` - Add a meal log
* 7. `add water /ml <volume> /d <date> /t <time>` - Add a water log
* 8. `pb /e <exercise> /w <weight_in_kg> /d <date>` - Record a personal best
* 9. `sum <cal|vol> /d <date>` - Sum up the total calories/water for the day
* 10. `clear <pb|meal|workout|water>` - Clear the respective log
* 11. `view <date>` - view logs for that date + NEW_LINE
* 12. `add cardio <exercise> /s <speed> /i <incline> /t <duration> /d <date>` - Add a cardio log
* 13. `add goals` (keane needs to edit this);

