#!/bin/bash

dir=`dirname "$0"`

if [ $# -ne 1 ]; then
  echo "sd usage: [ESTIMATED_LEVEL]"
  exit
fi

level=$1 

panda -cp $dir/../build/classes:$dir/../janino.jar SunflowGUI -aa 0 1 -nogui $dir/large.sc
mv $dir/mode.txt $dir/run_ld_${level}.txt