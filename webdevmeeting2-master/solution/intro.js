// Function to draw a circl and insert the calculated area and
// circumference into the page
function getCircle(id, x, y, radius, idAnswer) {
    var circRadius = parseFloat(radius);
    var xVal = parseFloat(x);
    var yVal = parseFloat(y);
    // Get the canvas element where we will draw the circle
    var canvas = document.getElementById(id);      
    // Define the drawing canvas                       
    var context = canvas.getContext("2d");

    // Make sure to get rid of the previous circle drawn
    context.clearRect(0, 0, canvas.width, canvas.height);

    // Draw a circle
    context.beginPath();
    context.arc(xVal, yVal, circRadius, 0, 2*Math.PI);
    context.stroke();

    // Display the circumference and area
    var circumference = 2*Math.PI*radius;
    var area = Math.PI*radius*radius;
    var answer = document.getElementById(idAnswer);
    // Clear previous answer
    answer.innerHTML = "";
    answer.innerHTML += "<div>Area: "+area.toFixed(2)+"</div>";
    answer.innerHTML += "<div>Circumference: "+circumference.toFixed(2)+"</div>";
}