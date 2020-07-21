/**
 * ================================================
 * Classical Classes
 * ================================================
 */

class ClassPublication {
  constructor(title, author, pubDate) {
    this.title = title;
    this.author = author;
    this.pubDate = pubDate;
  }

  print() {
    console.log(`
            Title: ${this.title}
            By: ${this.author}
            ${this.pubDate}
        `);
  }
}

class ClassBook extends ClassPublication {
  constructor(bookDetails) {
    super(bookDetails.title, bookDetails.author, bookDetails.publishedOn);
    this.publisher = bookDetails.publisher;
    this.ISBN = bookDetails.ISBN;
  }

  print() {
    super.print();
    console.log(`
            Publisher: ${this.publisher}
            ISBN: ${this.ISBN}
        `);
  }
}

class ClassBlogPost extends ClassPublication {
  constructor(title, author, pubDate, URL) {
    super(title, author, pubDate);
    this.URL = URL;
  }

  print() {
    super.print();
    console.log(this.URL);
  }
}
var YDKJS = new ClassBook({
  title: "You Don't Know JS",
  author: "Kyle Simpson",
  publishedOn: "June 2014",
  publisher: "O'Reilly",
  ISBN: "123456-789",
});

YDKJS.print();
// Title: You Don't Know JS
// By: Kyle Simpson
// June 2014
// Publisher: O'Reilly
// ISBN: 123456-789

var forAgainstLet = new ClassBlogPost(
  "For and against let",
  "Kyle Simpson",
  "October 27, 2014",
  "https://davidwalsh.name/for-and-against-let"
);

forAgainstLet.print();
// Title: For and against let
// By: Kyle Simpson
// October 27, 2014
// https://davidwalsh.name/for-and-against-let

/**
 * ================================================================================================
 * OLD SCHOOL MODULES (aka, functions with private inner methods)
 * 
 * The module pattern has essentially the same goal as the class pattern, which is to group data and behavior together into
   logical units. Also like classes, modules can "include" or "access" the data and behaviors of other modules, for cooperation
   sake.

But modules have some important differences from classes. Most notably, the syntax is entirely different.
 * ================================================================================================
 */
function Publication(title, author, pubDate) {
  var publicAPI = {
    print() {
      console.log(`
                Title: ${title}
                By: ${author}
                ${pubDate}
            `);
    },
  };

  return publicAPI;
}

function Book(bookDetails) {
  var pub = Publication(
    bookDetails.title,
    bookDetails.author,
    bookDetails.publishedOn
  );

  var publicAPI = {
    print() {
      pub.print();
      console.log(`
                Publisher: ${bookDetails.publisher}
                ISBN: ${bookDetails.ISBN}
            `);
    },
  };

  return publicAPI;
}

function BlogPost(title, author, pubDate, URL) {
  var pub = Publication(title, author, pubDate);

  var publicAPI = {
    print() {
      pub.print();
      console.log(URL);
    },
  };

  return publicAPI;
}

var YDKJS = Book({
  title: "You Don't Know JS",
  author: "Kyle Simpson",
  publishedOn: "June 2014",
  publisher: "O'Reilly",
  ISBN: "123456-789",
});

YDKJS.print();
// Title: You Don't Know JS
// By: Kyle Simpson
// June 2014
// Publisher: O'Reilly
// ISBN: 123456-789

var forAgainstLet = BlogPost(
  "For and against let",
  "Kyle Simpson",
  "October 27, 2014",
  "https://davidwalsh.name/for-and-against-let"
);

forAgainstLet.print();
// Title: For and against let
// By: Kyle Simpson
// October 27, 2014
// https://davidwalsh.name/for-and-against-let

/**
 * ================================================
 * ES6 Modules (aka -> ESM [ES Modules])
 * ================================================
 */

// First, there's no wrapping function to define a module. The wrapping context is a file. ESMs are always file-based; one file, one module.

// Second, you don't interact with a module's "API" explicitly, but rather use the export keyword to add a variable or method to its public API definition.If something is defined in a module but not exported, then it stays hidden(just as with classic modules.

// Third, and maybe most noticeably different from previously discussed patterns, you don't "instantiate" an ES module, you just
// import it to use its single instance. ESMs are, in effect, "singletons," in that there's only one instance ever created, at
// first import in your program, and all other imports just receive a reference to that same single instance.If your module needs
// to support multiple instantiations, you have to provide a classic module - style factory function on your ESM definition for
// that purpose.
