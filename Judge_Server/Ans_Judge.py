import os
import Config
def ans_judge(problem_id, data_id):
    file_cur = os.path.join(Config.Data_Dir, '%s'%problem_id, 'data%s.out'%data_id)
    file_user = 'data%s.out'%data_id
    cur = open(file_cur).read().replace('\r','').rstrip()
    user = open(file_user).read().replace('\r','').rstrip()
    if cur==user:
        return "Accepted"
    if cur.split()==user.split():
        return "Presentation Error"
    if cur in user:
        return "Output Limit Exceeded"
    return "Wrong Answer"
