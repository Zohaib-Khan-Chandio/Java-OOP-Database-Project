create database project;
use project;


create table doctor(

	Doctor_Id int auto_increment primary key,
	Full_Name varchar(100) ,
    Specialization varchar(100),
	Qualification varchar(100),
	Contact_Number varchar(15),
	Years_of_Experience int,
    Consultation_Fee float,
    Gender varchar(10)
);

create table patient(

	Patient_Id int auto_increment primary key,
    Full_Name varchar(100),
    Symptoms varchar(200),
    Diagnosis varchar(100),
    Treatment_Given varchar(50),
    Doctor_Assigned varchar(50),
    Date_of_Admission varchar(20), 
    Date_of_Discharge varchar(20),
    Age int,
    Gender Varchar(20)
);

insert into patient(Full_Name, Symptoms, Diagnosis, Treatment_Given, Doctor_Assigned, Date_of_Admission, Date_of_Discharge, Age, Gender)
values 
		('Faraz Ahmed', 'Severe Abdominal Pain', 'Appendicitis', 'Surgery Performed', 'Dr. Afzal Khan', '2025-05-01', '2025-05-07', 23, 'Male'),
    ('Zainab Tariq', 'Chest Pain and Palpitations', 'Mild Arrhythmia', 'ECG and Medication', 'Dr. Farhan Ali', '2025-04-22', '2025-04-25', 22, 'Female'),
    ('Ali Usman', 'Fever and Cough', 'Seasonal Flu', 'Paracetamol & Rest', 'Dr. Sana Iqbal', '2025-04-15', '2025-04-18', 21, 'Male'),
    ('Hira Shah', 'Itchy Skin and Redness', 'Allergic Dermatitis', 'Antihistamine Cream', 'Dr. Hina Qureshi', '2025-03-10', '2025-03-12', 20, 'Female'),
    ('Talha Raza', 'Ear Pain and Hearing Loss', 'Ear Infection', 'Antibiotics & Ear Drops', 'Dr. Kamran Ali', '2025-03-20', '2025-03-23', 24, 'Male'),
    ('Areeba Khan', 'High Fever and Rash', 'Viral Infection', 'Fluids and Medication', 'Dr. Muskan Ansai', '2025-02-18', '2025-02-21', 5, 'Female'),
    ('Hamza Shaikh', 'Joint Pain after Fall', 'Knee Dislocation', 'Joint Relocation & Rest', 'Dr. Shakir Khoso', '2025-02-10', '2025-02-16', 25, 'Male'),
    ('Fatima Rizvi', 'Lower Abdominal Pain', 'Ovarian Cyst', 'Ultrasound & Medication', 'Dr. Nida Hassan', '2025-01-25', '2025-01-30', 20, 'Female'),
    ('Bilal Siddiqui', 'Severe Headache', 'Migraine', 'Painkillers and Sleep Management', 'Dr. Shazab Ali', '2025-01-05', '2025-01-07', 22, 'Male'),
    ('Sana Zahid', 'Insomnia and Anxiety', 'Stress Disorder', 'Counseling & Medication', 'Dr. Ali Raza', '2025-01-15', '2025-01-19', 21, 'Female');
        
select * from patient;

select * from doctor;

insert into doctor (Full_Name, Specialization, Qualification, Contact_Number, Years_of_Experience, Consultation_Fee, Gender)
VALUES
    ("Dr. Afzal Khan", "Surgeon", "MBBS", "03233441078", 8, 3000.00, "Male"),
    ("Dr. Farhan Ali", "Cardiologist", "MBBS", "03233542088", 5, 2500.00, "Male"),
    ("Dr. Sana Iqbal", "General Physician", "MBBS", "03231234567", 6, 1500.00, "Female"),
    ("Dr. Hina Qureshi", "Dermatologist", "MBBS", "03237654321", 7, 2000.00, "Female"),
    ("Dr. Kamran Ali", "ENT Specialist", "MBBS", "03234567890", 9, 1800.00, "Male"),
    ("Dr. Muskan Ansai", "Pediatrician", "MBBS", "03236547891", 4, 2200.00, "Female"),
    ("Dr. Shakir Khoso", "Orthopedic", "MBBS", "03233449876", 10, 2800.00, "Male"),
    ("Dr. Nida Hassan", "Gynecologist", "MBBS", "03237651234", 6, 2500.00, "Female"),
    ("Dr. Shazab Ali", "Neurologist", "MBBS", "03239876543", 11, 3500.00, "Male"),
    ("Dr. Ali Raza", "Psychiatrist", "MBBS", "03230112233", 5, 2400.00, "Male");


select * from doctor;



select * from doctor where Full_Name = 'Dr. Kamran Ali';

