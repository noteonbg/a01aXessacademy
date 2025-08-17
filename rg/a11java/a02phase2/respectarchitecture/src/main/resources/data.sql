INSERT INTO patient (name, age, gender, condition) VALUES
('Aarav Sharma', 30, 'Male', 'Diabetes'),
('Meera Iyer', 25, 'Female', 'Asthma'),
('Rohan Verma', 40, 'Male', 'Hypertension'),
('Anjali Deshmukh', 32, 'Female', 'Anemia');


INSERT INTO patient_poc (name, age, gender, condition, street, city, state, pincode) VALUES
('Rajesh Kumar', 65, 'Male', 'Arthritis', '123 MG Road', 'Delhi', 'Delhi', '110001'),
('Neeta Joshi', 45, 'Female', 'Diabetes', '56 Park Street', 'Mumbai', 'Maharashtra', '400001');


delete from aadhaar_card;
delete from citizen;


INSERT INTO citizen (id, name, age, gender) VALUES
(1, 'Suresh Reddy', 42, 'Male'),
(2, 'Priya Nair', 29, 'Female');

-- Aadhaar Cards
INSERT INTO aadhaar_card (aadhaar_number, citizen_id) VALUES
('123456789012', 1),
('987654321098', 2);


delete from medicine;
delete from pharmacy;


-- Insert pharmacies
INSERT INTO pharmacy (id, name, location) VALUES
(1, 'Apollo Pharmacy', 'Mumbai'),
(2, 'MedPlus', 'Hyderabad'),
(3, '1MG', 'Bengaluru');

-- Insert medicines
INSERT INTO medicine (name, price, pharmacy_id) VALUES
('Paracetamol', 25.00, 1),
('Amoxicillin', 38.50, 1),
('Dolo 650', 18.00, 2),
('Cetrizine', 15.00, 2),
('Azithromycin', 60.00, 3),
('Metformin', 22.00, 3);


INSERT INTO book (title, author, genre) VALUES
('Dune', 'Frank Herbert', 'Sci-Fi'),
('Neuromancer', 'William Gibson', 'Sci-Fi'),
('1984', 'George Orwell', 'Dystopian'),
('Pride and Prejudice', 'Jane Austen', 'Romance'),
('To Kill a Mockingbird', 'Harper Lee', 'Classic'),
('The Great Gatsby', 'F. Scott Fitzgerald', 'Classic'),
('Brave New World', 'Aldous Huxley', 'Dystopian'),
('Foundation', 'Isaac Asimov', 'Sci-Fi'),
('Wings of Fire', 'A.P.J. Abdul Kalam', 'Autobiography'),
('Train to Pakistan', 'Khushwant Singh', 'Historical Fiction'),
('The Guide', 'R.K. Narayan', 'Literary Fiction'),
('Godaan', 'Munshi Premchand', 'Classic Hindi');

