:: Batch script to compile and run Scala script
@echo off

set /p script_name="Directory:"

cd %1
pushd %1

cd %script_name%

call scalac %script_name%.scala
call scala %script_name%

cd ..