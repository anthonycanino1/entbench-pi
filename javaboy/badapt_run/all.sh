#!/bin/bash

dir=`dirname "$0"`

runs=(
  sd.sh
  md.sh
  ld.sh
)

contexts=(
  hc
  mc
  lc
)

blevels=(
  0.90
  0.70
  0.40
)

echo "Running javaboy"
PANDA_RUNS=11

for i in `seq 0 2`; do
  export ENT_BATTERY_LEVEL=${blevels[$i]}

  for rn in ${runs[@]}; do
    echo "Starting ${contexts[$i]} ${rn}"
    out=$(./$rn ${contexts[$i]} ${PANDA_RUNS})  
		echo $out
    echo "Completed ${contexts[$i]} ${rn}"
  done
done

