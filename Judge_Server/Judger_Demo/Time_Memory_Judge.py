import time
import psutil
import os
import Config
import subprocess
import Ans_Judge

def time_memory_judge(problem_id, data_id, time_limit, mem_limit):
    p_cmd = "main.exe"
    time_limit /= 1000.0
    mem_limit *= 1024
    max_rss = 0
    problem_imfo = {}

    file_in = os.path.join(Config.Data_Dir, '%s'%problem_id, 'data%s.in'%data_id)
    fin = open(file_in, "r+")
    fout = open("data%s.out"%data_id, "w+")
    p = subprocess.Popen(p_cmd, shell=True, stdin=fin, stdout=fout,stderr=subprocess.PIPE)
    start = time.time()
    pid = p.pid
    glan = psutil.Process(pid)

    while True:
        time_now = time.time() - start
        problem_imfo['time'] = time_now * 1000
        problem_imfo['memory'] = max_rss / 1024.0
        if p.poll() == 0:
            break
        if p.poll() != 0 and p.poll() != None:
            if p.poll() == 0:
                break
            problem_imfo['time'] = time_now * 1000
            problem_imfo['memory'] = max_rss / 1024.0
            problem_imfo['result'] = "Runtime Error"
            return problem_imfo
        rss = 0
        try:
            m_infor = glan.memory_info()
            rss = m_infor[0]
        except:
            pass
        if max_rss < rss:
            max_rss = rss
        if time_now > time_limit:
            problem_imfo['time'] = time_now * 1000
            problem_imfo['memory'] = max_rss / 1024.0
            problem_imfo['result'] = "Time Limit Exceeded"
            glan.terminate()
            return problem_imfo
        if max_rss > mem_limit:
            print(max_rss)
            problem_imfo['time'] = time_now * 1000
            problem_imfo['memory'] = max_rss / 1024.0
            problem_imfo['result'] = "Memery Limit Exceeded"
            glan.terminate()
            return problem_imfo
    problem_imfo['result'] = Ans_Judge.ans_judge(problem_id, data_id)
    return problem_imfo

