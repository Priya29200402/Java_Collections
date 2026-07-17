package org.intejjiJ.terminal.runner;

import org.intejjiJ.terminal.dto.DiseaseDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DiseaseRunner {
    public static void main(String[] args) {
        List<DiseaseDTO> diseases = new ArrayList<>();
        diseases.add(new DiseaseDTO(1, "Covid-19", "Corona Virus", "Fever, Cough, Cold", "Virus", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(2, "Malaria", "Plasmodium", "Fever, Chills, Sweating", "Parasite", "Antimalarial drugs", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(3, "Dengue", "Dengue Virus", "Fever, Headache, Joint Pain", "Virus", "Supportive care", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(4, "Tuberculosis", "Mycobacterium tuberculosis", "Cough, Fever, Weight Loss", "Bacteria", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(5, "HIV/AIDS", "Human Immunodeficiency Virus", "Fever, Fatigue, Weight Loss", "Virus", "Antiretroviral therapy", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(6, "Influenza", "Influenza Virus", "Fever, Cough, Sore Throat", "Virus", "Antiviral drugs", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(7, "Hepatitis B", "Hepatitis B Virus", "Fever, Fatigue, Jaundice", "Virus", "Antiviral drugs", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(8, "Cholera", "Vibrio cholerae", "Diarrhea, Vomiting, Dehydration", "Bacteria", "Rehydration therapy", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(9, "Measles", "Rubeola virus", "Fever, Rash, Cough", "Virus", "Supportive care", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(10, "Polio", "Poliovirus", "Fever, Fatigue, Paralysis", "Virus", "Supportive care", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(11, "Yellow Fever", "Yellow Fever Virus", "Fever, Jaundice, Bleeding", "Virus", "Supportive care", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(12, "Ebola", "Ebola Virus", "Fever, Hemorrhage, Organ Failure", "Virus", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(13, "Rabies", "Rabies Virus", "Fever, Confusion, Hydrophobia", "Virus", "Post-exposure prophylaxis", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(14, "Tetanus", "Clostridium tetani", "Muscle Spasms, Lockjaw", "Bacteria", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(15, "Typhoid", "Salmonella Typhi", "Fever, Abdominal Pain, Headache", "Bacteria", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(16, "Pneumonia", "Streptococcus pneumoniae", "Cough, Fever, Chest Pain", "Bacteria", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(17, "Meningitis", "Neisseria meningitidis", "Fever, Headache, Stiff Neck", "Bacteria", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(18, "Gonorrhea", "Neisseria gonorrhoeae", "Painful Urination, Discharge", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(19, "Syphilis", "Treponema pallidum", "Sores, Rash, Organ Damage", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(20, "Leprosy", "Mycobacterium leprae", "Skin Lesions, Nerve Damage", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(21, "Anthrax", "Bacillus anthracis", "Skin Lesions, Fever, Shock", "Bacteria", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(22, "Plague", "Yersinia pestis", "Fever, Swollen Lymph Nodes", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(23, "Botulism", "Clostridium botulinum", "Muscle Weakness, Paralysis", "Bacteria", "Antitoxin", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(24, "Salmonella", "Salmonella bacteria", "Diarrhea, Fever, Cramps", "Bacteria", "Fluid replacement", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(25, "E. coli", "Escherichia coli", "Diarrhea, Abdominal Pain", "Bacteria", "Fluid replacement", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(26, "Staph Infection", "Staphylococcus aureus", "Skin Infections, Fever", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(27, "Strept Throat", "Streptococcus pyogenes", "Sore Throat, Fever", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(28, "Lyme Disease", "Borrelia burgdorferi", "Rash, Fever, Joint Pain", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(29, "Rocky Mountain Spotted Fever", "Rickettsia rickettsii", "Fever, Rash, Headache", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(30, "Legionnaires", "Legionella pneumophila", "Fever, Cough, Pneumonia", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(31, "Whooping Cough", "Bordetella pertussis", "Severe Coughing Fits", "Bacteria", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(32, "Diphtheria", "Corynebacterium diphtheriae", "Sore Throat, Membrane", "Bacteria", "Antitoxin", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(33, "Scarlet Fever", "Streptococcus pyogenes", "Rash, Sore Throat, Fever", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(34, "MRSA", "Methicillin-resistant Staphylococcus", "Skin Infections, Abscesses", "Bacteria", "Special Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(35, "C. diff", "Clostridium difficile", "Diarrhea, Colitis", "Bacteria", "Special Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(36, "H. pylori", "Helicobacter pylori", "Stomach Pain, Ulcers", "Bacteria", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(37, "Gastritis", "Various causes", "Stomach Pain, Nausea", "Multiple", "Antacids", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(39, "Peptic Ulcer", "H. pylori/NSAIDs", "Stomach Pain, Bleeding", "Multiple", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(40, "Appendicitis", "Blockage of appendix", "Abdominal Pain, Fever", "Unknown", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(41, "Pancreatitis", "Gallstones/Alcohol", "Abdominal Pain, Nausea", "Multiple", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(42, "Gallstones", "Cholesterol imbalance", "Abdominal Pain, Jaundice", "Metabolic", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(43, "Kidney Stones", "Crystal deposits", "Severe Pain, Blood in urine", "Metabolic", "Pain relief", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(44, "Gout", "Uric acid crystals", "Joint Pain, Swelling", "Metabolic", "Anti-inflammatory", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(45, "Diabetes Type 1", "Autoimmune", "Thirst, Frequent Urination", "Autoimmune", "Insulin", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(46, "Diabetes Type 2", "Insulin resistance", "Thirst, Fatigue", "Metabolic", "Medication", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(47, "Hypothyroidism", "Underactive thyroid", "Fatigue, Weight Gain", "Hormonal", "Thyroid hormone", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(48, "Hyperthyroidism", "Overactive thyroid", "Weight Loss, Rapid Heartbeat", "Hormonal", "Anti-thyroid drugs", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(49, "Addison's Disease", "Adrenal insufficiency", "Fatigue, Low Blood Pressure", "Hormonal", "Corticosteroids", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(50, "Cushing's Syndrome", "Excess cortisol", "Weight Gain, Moon Face", "Hormonal", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(51, "Acromegaly", "Growth hormone excess", "Enlarged features", "Hormonal", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(52, "Pituitary Tumor", "Pituitary gland tumor", "Headaches, Vision changes", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(53, "Thyroid Cancer", "Thyroid gland cancer", "Neck lump, Hoarseness", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(54, "Lung Cancer", "Smoking/Genetics", "Cough, Weight Loss", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(55, "Breast Cancer", "BRCA mutations", "Lump, Skin changes", "Neoplasm", "Surgery", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(56, "Prostate Cancer", "Age/Genetics", "Urinary problems", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(57, "Colon Cancer", "Polyps/Genetics", "Blood in stool, Pain", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(58, "Skin Cancer", "UV exposure", "Skin changes, Moles", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(59, "Leukemia", "Blood cell cancer", "Fatigue, Infections", "Neoplasm", "Chemotherapy", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(60, "Lymphoma", "Lymphatic cancer", "Swollen lymph nodes", "Neoplasm", "Chemotherapy", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(61, "Multiple Myeloma", "Plasma cell cancer", "Bone pain, Anemia", "Neoplasm", "Chemotherapy", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(62, "Brain Tumor", "Brain cells", "Headaches, Seizures", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(63, "Liver Cancer", "Hepatitis/Alcohol", "Jaundice, Weight Loss", "Neoplasm", "Surgery", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(64, "Pancreatic Cancer", "Pancreas cells", "Jaundice, Pain", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(65, "Stomach Cancer", "H. pylori/Genetics", "Indigestion, Pain", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(66, "Esophageal Cancer", "GERD/Smoking", "Difficulty swallowing", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(67, "Bladder Cancer", "Smoking/Chemicals", "Blood in urine", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(68, "Kidney Cancer", "Smoking/Genetics", "Blood in urine, Pain", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(69, "Ovarian Cancer", "Genetic mutations", "Abdominal bloating", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(70, "Cervical Cancer", "HPV virus", "Abnormal bleeding", "Neoplasm", "Surgery", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(71, "Uterine Cancer", "Hormone imbalance", "Vaginal bleeding", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(72, "Testicular Cancer", "Undescended testicle", "Lump, Pain", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(73, "Melanoma", "UV exposure", "Dark skin lesion", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(74, "Sarcoma", "Connective tissue", "Lump, Pain", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(75, "Glioblastoma", "Brain glial cells", "Headaches, Seizures", "Neoplasm", "Surgery", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(76, "Alzheimer's", "Brain degeneration", "Memory loss, Confusion", "Neurodegenerative", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(77, "Parkinson's", "Dopamine deficiency", "Tremor, Stiffness", "Neurodegenerative", "Medication", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(78, "ALS", "Motor neuron death", "Muscle weakness", "Neurodegenerative", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(79, "Huntington's", "Genetic mutation", "Movement disorder", "Neurodegenerative", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(80, "Multiple Sclerosis", "Autoimmune", "Fatigue, Numbness", "Autoimmune", "Immunotherapy", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(81, "Epilepsy", "Brain electrical activity", "Seizures", "Neurological", "Anticonvulsants", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(82, "Migraine", "Brain blood vessels", "Headache, Nausea", "Neurological", "Pain relief", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(83, "Stroke", "Blood clot/bleed", "Paralysis, Speech loss", "Vascular", "Emergency care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(84, "Heart Attack", "Coronary blockage", "Chest pain, Shortness of breath", "Vascular", "Emergency care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(85, "Heart Failure", "Weakened heart", "Shortness of breath, Fatigue", "Cardiovascular", "Medication", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(86, "Arrhythmia", "Electrical problem", "Irregular heartbeat", "Cardiovascular", "Medication", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(87, "Hypertension", "High blood pressure", "Headache, Dizziness", "Cardiovascular", "Medication", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(88, "Atherosclerosis", "Plaque buildup", "Chest pain, Numbness", "Cardiovascular", "Medication", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(89, "Asthma", "Airway inflammation", "Wheezing, Shortness of breath", "Respiratory", "Inhalers", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(90, "COPD", "Smoking damage", "Chronic cough, Breathlessness", "Respiratory", "Inhalers", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(91, "Cystic Fibrosis", "Genetic mutation", "Thick mucus, Infections", "Genetic", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(92, "Pulmonary Fibrosis", "Lung scarring", "Shortness of breath", "Respiratory", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(93, "Sleep Apnea", "Airway obstruction", "Snoring, Daytime sleepiness", "Respiratory", "CPAP", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(94, "Bronchitis", "Virus/Bacteria", "Cough, Mucus", "Respiratory", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(95, "Emphysema", "Smoking damage", "Shortness of breath", "Respiratory", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(96, "Pulmonary Embolism", "Blood clot in lungs", "Chest pain, Shortness of breath", "Vascular", "Anticoagulants", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(97, "Deep Vein Thrombosis", "Blood clot in veins", "Leg swelling, Pain", "Vascular", "Anticoagulants", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(98, "Varicose Veins", "Valve damage", "Swollen veins", "Vascular", "Compression", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(99, "Arthritis", "Joint inflammation", "Joint pain, Stiffness", "Autoimmune", "Anti-inflammatory", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(100, "Osteoporosis", "Bone density loss", "Fractures, Pain", "Metabolic", "Calcium", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(101, "Rheumatoid Arthritis", "Autoimmune", "Joint pain, Deformity", "Autoimmune", "Immunosuppressants", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(102, "Lupus", "Autoimmune", "Fatigue, Joint pain, Rash", "Autoimmune", "Immunosuppressants", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(103, "Fibromyalgia", "Central sensitization", "Widespread pain, Fatigue", "Neurological", "Pain management", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(104, "Chronic Fatigue Syndrome", "Unknown cause", "Extreme fatigue", "Unknown", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(105, "Irritable Bowel Syndrome", "Gut-brain axis", "Abdominal pain, Diarrhea", "Functional", "Diet", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(106, "Crohn's Disease", "Autoimmune", "Abdominal pain, Diarrhea", "Autoimmune", "Immunosuppressants", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(107, "Ulcerative Colitis", "Autoimmune", "Bloody diarrhea", "Autoimmune", "Immunosuppressants", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(108, "Celiac Disease", "Gluten sensitivity", "Diarrhea, Weight loss", "Autoimmune", "Gluten-free diet", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(109, "Diverticulitis", "Colon pouches", "Abdominal pain, Fever", "Digestive", "Antibiotics", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(110, "Hemorrhoids", "Swollen veins", "Rectal bleeding, Pain", "Vascular", "Creams", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(111, "Hepatitis C", "Hepatitis C Virus", "Fever, Fatigue, Jaundice", "Virus", "Antiviral drugs", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(112, "Hepatitis A", "Hepatitis A Virus", "Fever, Jaundice, Nausea", "Virus", "Supportive care", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(113, "Zika Virus", "Zika Virus", "Fever, Rash, Joint Pain", "Virus", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(114, "West Nile Virus", "West Nile Virus", "Fever, Headache, Body aches", "Virus", "Supportive care", "No Vaccine", "Prevention", "Etiology"));
        

        System.out.println("Filter names longer than 5 characters");
        diseases.stream()
                .filter(disease -> disease.getName().length() > 5)
                .forEach(disease -> System.out.println(disease));

        System.out.println("Filter diseases starting with 'T' ");
        diseases.stream()
                .filter(disease -> disease.getName().startsWith("T"))
                .forEach(disease -> System.out.println(disease));

        System.out.println("Convert all disease names to uppercase");
        diseases.stream()
                .map(disease -> disease.getName().toUpperCase())
                .forEach(disease -> System.out.println(disease));

        System.out.println("Convert all names to lowercase");
        diseases.stream()
                .map(disease -> disease.getName().toLowerCase())
                .forEach(disease -> System.out.println(disease));

        System.out.println("Get length of each string 'H'");
        diseases.stream()
                .filter(disease -> disease.getName().startsWith("H"))
                .forEach(disease -> System.out.println(disease));

        System.out.println("Filter numbers id > 10, then double them ");
        diseases.stream()
                .filter(disease -> disease.getId() > 10)
                .map(disease -> disease.getId() * 2)
                .forEach(disease -> System.out.println(disease));

        System.out.println(" Remove null values from a list");
        diseases.stream()
                .filter(disease -> disease.getName() != null)
                .forEach(disease -> System.out.println(disease));

        System.out.println("Filter by ");

    }
}
