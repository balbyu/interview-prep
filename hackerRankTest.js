// const https = require("https");

// async function getArticleTitles(author) {
//   let titles = [];
//   const myFunc = await https
//     .get(
//       `https://jsonmock.hackerrank.com/api/articles?author=${author}`,
//       (resp) => {
//         let payload = "";
//         let titles = [];

//         //Receive chunks & populate data
//         resp.on("data", (chunk) => {
//           payload += chunk;
//         });

//         // All data received. Do further processing.
//         resp.on("end", () => {
//           const data = JSON.parse(payload).data;
//           //Only bother if we have data and there are more than 0 entries
//           if (data && data.length > 0) {
//             data.forEach((article) => {
//               //   Both title and story_title null, continue forEach to next article.
//               if (article.title == null && article.story_title == null) return;

//               //   Add either title or story_title to article array
//               if (article.title == null) {
//                 titles.push(article.story_title);
//               } else {
//                 titles.push(article.title);
//               }
//             });
//           }
//         });
//       }
//     )
//     .on("error", (err) => {
//       console.log("Error: " + err.message);
//     });
//   console.log(myFunc);
// }

// getArticleTitles("epaga");

function fizzBuzz(n) {
  for (let i = 1; i < n + 1; i++) {
    if (i % 3 == 0 && i % 5 == 0) console.log("FizzBuzz");
    else if (i % 3 == 0) console.log("Fizz");
    else if (i % 5 == 0) console.log("Buzz");
    else console.log(i);
  }
}

fizzBuzz(100);
