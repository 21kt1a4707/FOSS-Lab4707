#shellbscript to show various system configurations
echo "\n 1:-currently logged user and his log name\n 2:-current shell\n 3:-home directory\n 4:-operating system type\n 5:-current path setting\n 6:-current working directory\n 7:-logged no.of users"
echo "choose option from 1 to 7"
read op 
case $op in 
1)echo " current logged user is :-$USER"
echo " log name:-$LOGNAME"
;;
2)echo "current shell:-$SHELL"
;;
3)echo "home directory:-$HOME"
;;
4)echo "operating system type and its version:- $(cat /proc/version)"
;;
5)echo "current path setting:- $PATH"
;;
6)echo "current working directory:-$PWD"
;;
7)echo "currently logged number of users:- "who|wc -l
;;
8)exit;;
*)echo "invalid option"
;;
esac

