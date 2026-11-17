# COE 528 Final Project – JavaFX Banking Application

**Course:** COE 528 – Object-Oriented Engineering Analysis and Design  
**Tools:** Java, JavaFX, Ant (NetBeans)

## Overview

A desktop bank account manager built with JavaFX. A manager can create and delete customer accounts. Customers can log in, deposit, withdraw and make online purchases. Each customer's level (`Silver`, `Gold`, `Platinum`) is a State-pattern object that sets the purchase fee and changes with the balance. Accounts are saved as text files in `Customer Accounts/`.

UML use-case and class diagrams are in `docs/`.

## Build / run

Open the folder as a NetBeans JavaFX project and run `App`, or build it with Ant (`ant jar`).

## Notes

The files in `Customer Accounts/` are made-up sample accounts used to test the app.
