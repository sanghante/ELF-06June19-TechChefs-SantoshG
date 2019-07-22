let h1 = document.getElementsByTagName('h2')[0],
    start = document.getElementById('start'),
    seconds = 0, minutes = 0,  t;
//Display the timer in the element h1

//function add will update the time displayed in the format minutes:seconds and freeze display when request time is complete.

function add() {
    seconds++;
    if (seconds >= 60) {
        seconds = 0;
        minutes++;
    }
    
    h1.textContent =  (minutes ? (minutes > 9 ? minutes : "0" + minutes) : "00") + ":" + (seconds > 9 ? seconds : "0" + seconds);

    timer();
    var input = document.getElementById('min').value;
    //when the minute value reaches the minute value entered by the user, the loop should end.
    if(minutes == input) {
        clearTimeout(t);
    }
}
//the timer function passes control to call-back function add() after timeout of 1 sec
function timer() {
    t = setTimeout(add, 1000);
}


/* Start button */
start.onclick = timer;
