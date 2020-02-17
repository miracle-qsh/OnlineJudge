import Compile
import Time_Memory_Judge
import Ans_Judge

def Judge(problem_id, data_num, time_limit, mem_limit, language):
    time_max = 0
    mem_max = 0
    problem_info = { 'time': 0, 'memory': 0, 'result': 'Waiting'}
    result = Compile.compile(language)
    if result == False:
        problem_info['result'] = 'Compile Error'
        return problem_info
    for i in range(1, data_num + 1):
        problem_info['result'] = 'Running'
        try:
            problem_info = Time_Memory_Judge.time_memory_judge(problem_id, i, time_limit, mem_limit)
        except:
            problem_info['time'] = time_max
            problem_info['memory'] = mem_max
            problem_info['result'] = 'System Error'
            return problem_info
        if time_max < problem_info['time']:
            time_max = problem_info['time']
        if mem_max < problem_info['memory']:
            mem_max = problem_info['memory']
        if problem_info['result'] != 'Accepted':
            problem_info['time'] = time_max
            problem_info['memory'] = mem_max
            return problem_info
    problem_info['time'] = time_max
    problem_info['memory'] = mem_max
    return problem_info

ans = Judge(1001, 3, 1000, 5000, "g++")
print(ans)