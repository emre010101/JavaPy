from datetime import datetime
from pathlib import Path
Path = Path(r'C:\Users\emrek\OneDrive\Desktop\General\dropchef\money.txt')

def newweek():
    f = open(r'C:\Users\emrek\OneDrive\Desktop\General\dropchef\money.txt', 'a+')
    f.write("\n--------+++++NEW WEEK+++++-----------")
    f.close()
    
                   
def takenote():
    f = open(r'C:\Users\emrek\OneDrive\Desktop\General\dropchef\money.txt', 'a+')
    f.write("\n--------------------------------")
    f.write(f"\nThe date of the work: {date}")
    f.write(f"\nStart time: {t1.time()}")
    f.write(f"\nEnd time: {t2.time()}")
    f.write(f"\nBreak time: {b_time}")
    f.write(f"\nThe total work hour: {hour}")
    f.write(f"\nThe money has been earned: {earning}£")
    f.close()
    
def takenote2():
    f = open(r'C:\Users\emrek\OneDrive\Desktop\General\dropchef\money.txt', 'w')
    f.write("\n--------------------------------")
    f.write(f"\nThe date of the work: {date}")
    f.write(f"\nStart time: {t1.time()}")
    f.write(f"\nEnd time: {t2.time()}")
    f.write(f"\nBreak time: {b_time}")
    f.write(f"\nThe total work hour: {hour}")
    f.write(f"\nThe money has been earned: {earning}£")
    f.close()

while(True):
    print("Do you want to insert another date -1 or 0-")
    more = int(input())
    print(more)
    if more==True:
        pass
    else:
        print("The system is shutting down!")
        break
    print("Please enter the date of the work: ", end="")
    date = input()
    date = date[0:2] + "." + date[2:4]
    print(date)
    print("Enter start time: ", end="")
    start_time = input()

    start_time = start_time[0:2] + ":" + start_time[2:4]
    print(start_time)

    print("Enter finishing time: ", end="")
    end_time = input()
    end_time = end_time[0:2] + ":" + end_time[2:4]

    print("Enter break duration: ", end="")
    b_time = input()
    b_time = int(b_time[:-2]) * 60 + int(b_time[-2:])

    t1 = datetime.strptime(start_time, "%H:%M")
    print("Start time: ", t1.time())
                       
    t2 = datetime.strptime(end_time, "%H:%M")
    print("End time: ", t2.time())

    print(f"Break time in minutes: {b_time}")


    delta = t2 - t1
    print("Time difference: ", delta)
    print(f"Time difference is in seconds {delta.total_seconds()}")

    seconds = delta.total_seconds()         
    minutes = seconds / 60

    print("The difference in minutes: ", minutes)
    total_minutes = minutes - b_time
    print("total minutes after break discounted: ", total_minutes)
    hour=total_minutes/60                  
    print("The total work hour: ", hour)
                       
    earning = hour * 11.20                  
    print("£££", earning)
    if Path.is_file():
        takenote()
    else:
        takenote2()
    newweek()


    


