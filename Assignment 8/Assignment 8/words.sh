#!/bin/bash
sudo javac Words.java
printf "Biased 1k:\n"
sudo ./xtime java Words<biased1k.txt >/dev/null
printf "Sorted 1k:\n"
sudo ./xtime java Words<sorted1k.txt >/dev/null
printf "Random 1k:\n"
sudo ./xtime java Words<random1k.txt >/dev/null
printf "Biased 10k:\n"
sudo ./xtime java Words<biased10k.txt >/dev/null
printf "Sorted 10k:\n"
sudo ./xtime java Words<sorted10k.txt >/dev/null
printf "Random 10k: \n"
sudo ./xtime java Words<random10k.txt >/dev/null
printf "Biased 100k: \n"
sudo ./xtime java Words<biased100k.txt >/dev/null
printf "Sorted 100k: \n"
sudo ./xtime java Words<sorted100k.txt >/dev/null
printf "Random 100k: \n"
sudo ./xtime java Words<random100k.txt >/dev/null
printf "Biased 500k: \n"
sudo ./xtime java Words<biased500k.txt >/dev/null
printf "Sorted 500k: \n"
sudo ./xtime java Words<sorted500k.txt >/dev/null
printf "Random 500k: \n"
sudo ./xtime java Words<random500k.txt >/dev/null
