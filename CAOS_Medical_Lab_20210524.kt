/* 
*  DB Script Tool
*  Kotlin - 2021-05-24 10:11:16
*  
*  MODEL CLASSES FOR CAOS_Medical_Lab DATABASE
*/ 



/* CAOS.kt -------------------------------------*/
package com.package.CAOS_Medical_Lab.model 

//import java.util.*
//import java.sql.*
//import java.text.*

/* 
*  Kotlin - Model Class - CAOS_Medical_Lab.CAOS
*  2021-03-02 16:03:55
*/ 
data class CAOS (
    var _id: Long,
    var chemspider: Boolean?,
    var volume: Double?,
    var water: Double?,
    var urineph: Double?,
    var animalmodels: Long?,
    var chimpanzeeanimalmodels: Long?,
    var batanimalmodels: Long?,
    var temperaturedegreescelsius: Double?,
    var sodium: Double?,
    var glucose: Double?,
    var molecularweight: Double?
)


/* IMHOTEP_Bizarros.kt -------------------------------------*/
package com.package.CAOS_Medical_Lab.model 

//import java.util.*
//import java.sql.*
//import java.text.*

/* 
*  Kotlin - Model Class - CAOS_Medical_Lab.IMHOTEP_Bizarros
*  2021-03-02 16:20:32
*/ 
data class IMHOTEP_Bizarros (
    var _id: Int,
    var hospital: Long?,
    var clinic: Long?,
    var patient: Long?,
    var diagnosis: Long?,
    var diabetes: Long?,
    var prediabetes: Long?,
    var acutenephritis: Long?,
    var type1diabetes: Long?,
    var type2diabetes: Long?,
    var hypertension: Double?,
    var patientheight: Double?,
    var patientweight: Double?
)


/* GENE_CRISpy.kt -------------------------------------*/
package com.package.CAOS_Medical_Lab.model 

//import java.util.*
//import java.sql.*
//import java.text.*

/* 
*  Kotlin - Model Class - CAOS_Medical_Lab.GENE_CRISpy
*  
*/ 
data class GENE_CRISpy (
    var _id: Int,
    var gene: Double?,
    var virus: Long?,
    var cancer: Long?,
    var protein: Double?,
    var humancellmodel: Double?,
    var coronavirus: Double?,
    var sarscov2: Double?,
    var kidneystones: Double?,
    var pneumonia: Long?,
    var humanenzymes: Double?,
    var ghrelin: Double?,
    var obestatin: Double?,
    var breastcancergene: Double?,
    var disease: Long?,
    var cardiovasculardisease: Long?,
    var grampositivestain: Long?,
    var gramnegativestain: Long?,
    var denaturation: Double?,
    var dna: Double?,
    var rna: Double?,
    var lcarnitine: Double?,
    var aminoacid: Double?,
    var kyotoencyclopediagenesgenomes: Byte?
)


/* ED_T_DOIDE.kt -------------------------------------*/
package com.package.CAOS_Medical_Lab.model 

//import java.util.*
//import java.sql.*
//import java.text.*

/* 
*  Kotlin - Model Class - CAOS_Medical_Lab.ED_T_DOIDE
*  
*/ 
data class ED_T_DOIDE (
    var _id: Int,
    var nutritionix: Double?,
    var mcdata: Double?,
    var kentuckyfriedchicken: Double?,
    var dominospizza: Double?,
    var edamam: Double?,
    var houndify: Int?
)


/* Hysteria_P_TRANCE.kt -------------------------------------*/
package com.package.CAOS_Medical_Lab.model 

//import java.util.*
//import java.sql.*
//import java.text.*

/* 
*  Kotlin - Model Class - CAOS_Medical_Lab.Hysteria_P_TRANCE
*  
*/ 
data class Hysteria_P_TRANCE (
    var _id: Int,
    var fitbit: Boolean?,
    var sleep: Double?,
    var weight: Double?,
    var heartrate: Int?,
    var dailyactivity: Double?,
    var waterintake: Double?,
    var tictok: Int?,
    var unity3d: Int?,
    var cosinemudbox: Int?
)


/* Dexcom.kt -------------------------------------*/
package com.package.CAOS_Medical_Lab.model 

//import java.util.*
//import java.sql.*
//import java.text.*

/* 
*  Kotlin - Model Class - CAOS_Medical_Lab.Dexcom
*  
*/ 
data class Dexcom (
    var _id: Int,
    var devices: java.sql.Timestamp?,
    var event: String?,
    var calibrations: Double?
)


/* Sifidious.kt -------------------------------------*/
package com.package.CAOS_Medical_Lab.model 

//import java.util.*
//import java.sql.*
//import java.text.*

/* 
*  Kotlin - Model Class - CAOS_Medical_Lab.Sifidious
*  
*/ 
data class Sifidious (
    var _id: Int,
    var picturehumanmodelsubjects: Boolean?,
    var pictureAnimalModels: Boolean?,
    var witai: Boolean?
)