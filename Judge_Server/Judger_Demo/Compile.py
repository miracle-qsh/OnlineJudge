import subprocess

def compile(language):
    build_cmd = {
        "gcc"  : "gcc -g main.c -o main -Wall -lm -O2 -std=c99 --static -DONLINE_JUDGE",
        "g++"  : "g++ -g main.cpp -o main -Wall -lm -O2 --static -DONLINE_JUDGE",
        "java" : "javac main.java"
    }
    pp = subprocess.Popen(build_cmd[language], shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    pp.communicate()
    if pp.returncode == 0:
        return True
    return False
