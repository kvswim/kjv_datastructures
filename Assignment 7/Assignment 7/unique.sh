#!/bin/bash
sudo javac UniqueQueue.java
printf "Biased 1k:\n"
sudo ./xtime java UniqueQueue<biased1k.txt >/dev/null
printf "Mixed 1k:\n"
sudo ./xtime java UniqueQueue<mixed1k.txt >/dev/null
printf "Random 1k:\n"
sudo ./xtime java UniqueQueue<random1k.txt >/dev/null
printf "Biased 10k:\n"
sudo ./xtime java UniqueQueue<biased10k.txt >/dev/null
printf "Mixed 10k:\n"
sudo ./xtime java UniqueQueue<mixed10k.txt >/dev/null
printf "Random 10k: \n"
sudo ./xtime java UniqueQueue<random10k.txt >/dev/null
printf "Biased 100k: \n"
sudo ./xtime java UniqueQueue<biased100k.txt >/dev/null
printf "Mixed 100k: \n"
sudo ./xtime java UniqueQueue<mixed100k.txt >/dev/null
printf "Random 100k: \n"
sudo ./xtime java UniqueQueue<random100k.txt >/dev/null
