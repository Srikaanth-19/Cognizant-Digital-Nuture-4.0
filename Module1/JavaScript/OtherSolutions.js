//2. Syntax, Data Types, and Operators

const eventName = "Art Exhibition";
const eventDate = "2025-06-15";
let availableSeats = 30;

console.log(`Event: ${eventName} on ${eventDate}, Seats Available: ${availableSeats}`);

availableSeats--;
console.log("Seat booked! Remaining:", availableSeats);


//3. Conditionals, Loops, and Error Handling

const events = [
  { name: "Music Fest", date: "2025-08-01", seats: 5 },
  { name: "Past Meetup", date: "2024-05-01", seats: 0 }
];

const today = new Date().toISOString().split('T')[0];

events.forEach(event => {
  if (event.date > today && event.seats > 0) {
    console.log("Upcoming Event:", event.name);
  } else {
    console.log("Hidden:", event.name);
  }
});

function register(seats) {
  try {
    if (seats <= 0) throw "No seats available";
    console.log("Registration successful");
  } catch (e) {
    console.error("Registration failed:", e);
  }
}


//4. Functions, Scope, Closures

function addEvent(name, category) {
  return { name, category };
}

function registerUser(event) {
  console.log(`User registered for ${event.name}`);
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

// Closure to count category-wise registrations
function createCategoryCounter() {
  let counts = {};
  return function(category) {
    counts[category] = (counts[category] || 0) + 1;
    return counts[category];
  };
}

const countReg = createCategoryCounter();
countReg("Music");
countReg("Tech");


//5. Objects and Prototypes

function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const event = new Event("Tech Talk", "2025-07-01", 50);
console.log(Object.entries(event));


//6. Arrays and Methods

let eventList = [];

eventList.push({ name: "Cooking Workshop", type: "Food" });
eventList.push({ name: "Rock Concert", type: "Music" });

const musicEvents = eventList.filter(e => e.type === "Music");

const cards = eventList.map(e => `<div class="card">${e.name}</div>`);
console.log(cards);

//7. DOM Manipulation

const container = document.querySelector("#events");

const event = { name: "Yoga Camp", date: "2025-06-20" };
const card = document.createElement("div");
card.textContent = `${event.name} - ${event.date}`;
container.appendChild(card);

//8. Event Handling

<input type="text" id="search">
<select id="categoryFilter"></select>
<button onclick="register()">Register</button>

//javascript
document.getElementById("search").addEventListener("keydown", e => {
  console.log("Searching:", e.target.value);
});

document.getElementById("categoryFilter").addEventListener("change", e => {
  console.log("Category selected:", e.target.value);
});

function register() {
  alert("Registered!");
}


//9. Async JS, Promises, Async/Await

// Using fetch with .then()
fetch("https://jsonplaceholder.typicode.com/posts")
  .then(res => res.json())
  .then(data => console.log("Fetched:", data))
  .catch(err => console.error("Error:", err));

// Using async/await
async function loadEvents() {
  document.body.innerHTML += "<p>Loading...</p>";
  try {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await res.json();
    console.log(data);
  } catch (err) {
    console.error(err);
  }
}


//10. Modern JavaScript Features

const defaultSeats = (seats = 50) => seats;

const event = { name: "Quiz Night", date: "2025-08-10" };
const { name, date } = event;

const copy = [...eventList];


//11. Working with Forms
//html
<form id="regForm">
  <input name="name" required>
  <input name="email" type="email" required>
  <select name="event"><option value="1">Music</option></select>
  <button type="submit">Submit</button>
</form>

//javascript
document.getElementById("regForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const { name, email, event } = e.target.elements;
  if (!name.value || !email.value) {
    alert("Please fill all fields");
  } else {
    console.log("Registered for:", event.value);
  }
});


//12. AJAX & Fetch API
function sendRegistration(data) {
  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      body: JSON.stringify(data),
      headers: { "Content-Type": "application/json" }
    })
      .then(res => res.json())
      .then(result => alert("Success"))
      .catch(err => alert("Failed"));
  }, 2000);
}


/*13. Debugging and Testing
Use console.log() at form submission

Use Chrome DevTools > Network to verify POST request

Add breakpoints in DevTools > Sources tab*/



//14. jQuery and JS Frameworks

// jQuery example
$('#registerBtn').click(() => alert("jQuery registered"));
$('.eventCard').fadeIn().fadeOut();

// Benefit of React/Vue:
console.log("Efficient UI updates and component-based structure");
