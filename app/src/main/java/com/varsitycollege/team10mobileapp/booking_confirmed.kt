package com.varsitycollege.team10mobileapp

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.graphics.pdf.PdfDocument
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.fragment.app.Fragment
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.random.Random

class booking_confirmed : Fragment() {

    val REQUEST_CODE_DOWNLOAD_PDF = 1

    val COURSE_ID_FIRST_AID = 1
    val COURSE_ID_SEWING = 2
    val COURSE_ID_LANDSCAPING = 3
    val COURSE_ID_LIFE_SKILLS = 4
    val COURSE_ID_CHILD_MINDING = 5
    val COURSE_ID_COOKING = 6
    val COURSE_ID_GARDEN_MAINTENANCE = 7

    val invoiceNumber = GenerateInvoiceNumber()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_booking_confirmed, container, false)

        val tvReferenceNo = view.findViewById<TextView>(R.id.tvReferenceNo)
        val localRefNo = "${BookingDetails.firstName[0]}${BookingDetails.lastName[0]}$invoiceNumber"

        val courses = ArrayList<Int>()

        var subtotal: Double = 0.0
        var discountPrice: Double = 0.0
        var vatPrice: Double = 0.0
        var totalAmount: Double = 0.0

        val courseList = view.findViewById<ConstraintLayout>(R.id.courseListConsult)
        val courseList2 = view.findViewById<ConstraintLayout>(R.id.courseListConsult2)
        var itemPosition: Float = 0.0f
        var courseCount = 0

        val btnBack14 = view.findViewById<ImageButton>(R.id.btnBack15)
        btnBack14.setOnClickListener {
            ScreenList.navigate(ScreenList.bookCourses_screen)
        }

        if(BookingDetails.FirstAid)
        {
            val lblCourseName = TextView(view.context)
            lblCourseName.text = "First Aid"
            lblCourseName.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCourseName.textSize = 20.0f
            lblCourseName.setTextColor(Color.rgb(49, 49, 49))
            lblCourseName.x = 0.0f
            lblCourseName.y = itemPosition

            val lblCoursePrice = TextView(view.context)
            lblCoursePrice.text = "R1500.00"
            lblCoursePrice.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCoursePrice.textSize = 20.0f
            lblCoursePrice.setTextColor(Color.rgb(49, 49, 49))
            lblCoursePrice.textAlignment = View.TEXT_ALIGNMENT_VIEW_END
            lblCoursePrice.y = itemPosition

            courseList.addView(lblCourseName)
            courseList2.addView(lblCoursePrice)

            itemPosition += 80
            subtotal += 1500.0f
            courseCount++

            courses.add(COURSE_ID_FIRST_AID)
        }

        if(BookingDetails.Sewing)
        {
            val lblCourseName = TextView(view.context)
            lblCourseName.text = "Sewing"
            lblCourseName.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCourseName.textSize = 20.0f
            lblCourseName.setTextColor(Color.rgb(49, 49, 49))
            lblCourseName.x = 0.0f
            lblCourseName.y = itemPosition

            val lblCoursePrice = TextView(view.context)
            lblCoursePrice.text = "R1500.00"
            lblCoursePrice.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCoursePrice.textSize = 20.0f
            lblCoursePrice.setTextColor(Color.rgb(49, 49, 49))
            lblCoursePrice.x = 0.0f
            lblCoursePrice.y = itemPosition

            courseList.addView(lblCourseName)
            courseList2.addView(lblCoursePrice)

            itemPosition += 80
            subtotal += 1500.0f
            courseCount++

            courses.add(COURSE_ID_SEWING)
        }

        if(BookingDetails.Landscaping)
        {
            val lblCourseName = TextView(view.context)
            lblCourseName.text = "Landscaping"
            lblCourseName.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCourseName.textSize = 20.0f
            lblCourseName.setTextColor(Color.rgb(49, 49, 49))
            lblCourseName.x = 0.0f
            lblCourseName.y = itemPosition

            val lblCoursePrice = TextView(view.context)
            lblCoursePrice.text = "R1500.00"
            lblCoursePrice.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCoursePrice.textSize = 20.0f
            lblCoursePrice.setTextColor(Color.rgb(49, 49, 49))
            lblCoursePrice.x = 0.0f
            lblCoursePrice.y = itemPosition

            courseList.addView(lblCourseName)
            courseList2.addView(lblCoursePrice)

            itemPosition += 80
            subtotal += 1500.0f
            courseCount++

            courses.add(COURSE_ID_LANDSCAPING)
        }

        if(BookingDetails.LifeSkills)
        {
            val lblCourseName = TextView(view.context)
            lblCourseName.text = "Life Skills"
            lblCourseName.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCourseName.textSize = 20.0f
            lblCourseName.setTextColor(Color.rgb(49, 49, 49))
            lblCourseName.x = 0.0f
            lblCourseName.y = itemPosition

            val lblCoursePrice = TextView(view.context)
            lblCoursePrice.text = "R1500.00"
            lblCoursePrice.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCoursePrice.textSize = 20.0f
            lblCoursePrice.setTextColor(Color.rgb(49, 49, 49))
            lblCoursePrice.x = 0.0f
            lblCoursePrice.y = itemPosition

            courseList.addView(lblCourseName)
            courseList2.addView(lblCoursePrice)

            itemPosition += 80
            subtotal += 1500.0f
            courseCount++

            courses.add(COURSE_ID_LIFE_SKILLS)
        }

        if(BookingDetails.ChildMinding)
        {
            val lblCourseName = TextView(view.context)
            lblCourseName.text = "Child Minding"
            lblCourseName.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCourseName.textSize = 20.0f
            lblCourseName.setTextColor(Color.rgb(49, 49, 49))
            lblCourseName.x = 0.0f
            lblCourseName.y = itemPosition

            val lblCoursePrice = TextView(view.context)
            lblCoursePrice.text = "R750.00"
            lblCoursePrice.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCoursePrice.textSize = 20.0f
            lblCoursePrice.setTextColor(Color.rgb(49, 49, 49))
            lblCoursePrice.x = 0.0f
            lblCoursePrice.y = itemPosition

            courseList.addView(lblCourseName)
            courseList2.addView(lblCoursePrice)

            itemPosition += 80
            subtotal += 750.0f
            courseCount++

            courses.add(COURSE_ID_CHILD_MINDING)
        }

        if(BookingDetails.Cooking)
        {
            val lblCourseName = TextView(view.context)
            lblCourseName.text = "Cooking"
            lblCourseName.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCourseName.textSize = 20.0f
            lblCourseName.setTextColor(Color.rgb(49, 49, 49))
            lblCourseName.x = 0.0f
            lblCourseName.y = itemPosition

            val lblCoursePrice = TextView(view.context)
            lblCoursePrice.text = "R750.00"
            lblCoursePrice.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCoursePrice.textSize = 20.0f
            lblCoursePrice.setTextColor(Color.rgb(49, 49, 49))
            lblCoursePrice.x = 0.0f
            lblCoursePrice.y = itemPosition

            courseList.addView(lblCourseName)
            courseList2.addView(lblCoursePrice)

            itemPosition += 80
            subtotal += 750.0f
            courseCount++

            courses.add(COURSE_ID_COOKING)
        }

        if(BookingDetails.GardenMaintenance)
        {
            val lblCourseName = TextView(view.context)
            lblCourseName.text = "Garden Maintenance"
            lblCourseName.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCourseName.textSize = 20.0f
            lblCourseName.setTextColor(Color.rgb(49, 49, 49))
            lblCourseName.x = 0.0f
            lblCourseName.y = itemPosition

            val lblCoursePrice = TextView(view.context)
            lblCoursePrice.text = "R750.00"
            lblCoursePrice.typeface = ResourcesCompat.getFont(view.context, R.font.inter_medium)
            lblCoursePrice.textSize = 20.0f
            lblCoursePrice.setTextColor(Color.rgb(49, 49, 49))
            lblCoursePrice.x = 0.0f
            lblCoursePrice.y = itemPosition

            courseList.addView(lblCourseName)
            courseList2.addView(lblCoursePrice)

            itemPosition += 80
            subtotal += 750.0f
            courseCount++

            courses.add(COURSE_ID_GARDEN_MAINTENANCE)
        }

        courseList.layoutParams.height = courseCount * 85
        courseList2.layoutParams.height = courseCount * 85

        if(courseCount == 2)
        {
            discountPrice = subtotal * 0.05
        }

        if(courseCount == 3)
        {
            discountPrice = subtotal * 0.1
        }

        if(courseCount > 3)
        {
            discountPrice = subtotal * 0.15
        }

        subtotal -= discountPrice

        vatPrice = subtotal * 0.15
        totalAmount = subtotal + vatPrice

        val lblPrice7 = view.findViewById<TextView>(R.id.lblConsultDiscount)
        val lblPrice8 = view.findViewById<TextView>(R.id.lblPriceConsultSub)
        val lblPrice9 = view.findViewById<TextView>(R.id.lblConsultVAT)
        val lblPrice10 = view.findViewById<TextView>(R.id.lblConsultTotal)

        val df = DecimalFormat("#.##")
        df.minimumFractionDigits = 2

        lblPrice7.text = "- R${df.format(discountPrice)}"
        lblPrice8.text = "R${df.format(subtotal)}"
        lblPrice9.text = "R${df.format(vatPrice)}"
        lblPrice10.text = "R${df.format(totalAmount)}"

        tvReferenceNo.text = localRefNo

        val btnDownload = view.findViewById<Button>(R.id.btnDownload)
        btnDownload.setOnClickListener { downloadPDF() }

        val btnHome2 = view.findViewById<Button>(R.id.btnBackToHomeConsult)
        btnHome2.setOnClickListener {
            // update navigation bar
            changeToHome(requireContext())
        }

        BookingDetails.courses = courses
        BookingDetails.subtotal = subtotal
        BookingDetails.discountPrice = discountPrice
        BookingDetails.vatPrice = vatPrice
        BookingDetails.totalAmount = totalAmount

        return view
    }

    private fun downloadPDF()
    {
        val intent = Intent(Intent.ACTION_CREATE_DOCUMENT)
        intent.type = "application/pdf"
        startActivityForResult(intent, REQUEST_CODE_DOWNLOAD_PDF)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQUEST_CODE_DOWNLOAD_PDF && resultCode == Activity.RESULT_OK)
        {
            generatePDF(data?.data!!, BookingDetails.courses, BookingDetails.subtotal, BookingDetails.discountPrice, BookingDetails.vatPrice, BookingDetails.totalAmount)
        }
    }

    private fun generatePDF(uri: Uri, courses: ArrayList<Int>, subtotal: Double, discountPrice: Double, vatPrice: Double, totalAmount: Double)
    {
        val pdf = PdfDocument()

        // A4 page size
        val PAGE_WIDTH = 595
        val PAGE_HEIGHT = 842
        val pdfPageInfo = PdfDocument.PageInfo.Builder(PAGE_WIDTH, PAGE_HEIGHT, 1).create()

        // initialize resources
        val font1 = Paint()
        font1.typeface = ResourcesCompat.getFont(ScreenList.main_screen, R.font.inter_bold)
        font1.textSize = 50.0f

        val font2 = Paint()
        font2.typeface = ResourcesCompat.getFont(ScreenList.main_screen, R.font.inter_bold)
        font2.textSize = 16.0f

        val font3 = Paint()
        font3.typeface = ResourcesCompat.getFont(ScreenList.main_screen, R.font.inter_medium)
        font3.textSize = 16.0f

        val font4 = Paint()
        font4.typeface = ResourcesCompat.getFont(ScreenList.main_screen, R.font.inter_bold)
        font4.textSize = 14.0f

        val font5 = Paint()
        font5.typeface = ResourcesCompat.getFont(ScreenList.main_screen, R.font.inter_medium)
        font5.textSize = 14.0f

        val font6 = Paint()
        font4.typeface = ResourcesCompat.getFont(ScreenList.main_screen, R.font.inter_bold)
        font4.textSize = 12.0f

        val font7 = Paint()
        font5.typeface = ResourcesCompat.getFont(ScreenList.main_screen, R.font.inter_medium)
        font5.textSize = 12.0f

        val font8 = Paint()
        font8.typeface = ResourcesCompat.getFont(ScreenList.main_screen, R.font.inter_bold)
        font8.textSize = 15.0f

        val line1 = Paint()
        line1.color = Color.BLACK
        line1.strokeWidth = 3.0f

        val line2 = Paint()
        line2.color = Color.BLACK
        line2.strokeWidth = 1.0f

        val page1 = pdf.startPage(pdfPageInfo)
        // begin
        val canvas = page1.canvas

        canvas.drawText("INVOICE", 32.0f, 64.0f, font1)
        canvas.drawText("INVOICE NUMBER", 32.0f, 96.0f, font2)


        canvas.drawText(invoiceNumber, 32.0f, 118.0f, font3)

        canvas.drawText("DATE OF ISSUE", 32.0f, 136.0f, font2)
        val date = Calendar.getInstance().time
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        canvas.drawText(dateFormat.format(date), 32.0f, 154.0f, font3)

        val logo = resources.getDrawable(R.drawable.logo).toBitmap(120, 120)
        canvas.drawBitmap(logo, (PAGE_WIDTH - 152).toFloat(), 40.0f, Paint())

        // new section

        canvas.drawText("BILLED TO", 32.0f, 218.0f, font8)
        canvas.drawText("${BookingDetails.firstName} ${BookingDetails.lastName}", 32.0f, 236.0f, font7)
        canvas.drawText("${BookingDetails.streetAddress}", 32.0f, 252.0f, font7)
        canvas.drawText("${BookingDetails.suburb}, ${BookingDetails.city}", 32.0f, 268.0f, font7)
        canvas.drawText("${BookingDetails.zipCode}", 32.0f, 284.0f, font7)

        canvas.drawText("Empowering the Nation", (PAGE_WIDTH - 290).toFloat(), 196.0f, font8)
        canvas.drawText("63 Roberts Avenue", (PAGE_WIDTH - 290).toFloat(), 214.0f, font7)
        canvas.drawText("Kensington, JHB 2101", (PAGE_WIDTH - 290).toFloat(), 228.0f, font7)
        canvas.drawText("021 713 4983", (PAGE_WIDTH - 290).toFloat(), 242.0f, font7)
        canvas.drawText("contact@etn.co.za", (PAGE_WIDTH - 290).toFloat(), 256.0f, font7)
        canvas.drawText("etn.co.za", (PAGE_WIDTH - 290).toFloat(), 270.0f, font7)

        // new section

        canvas.drawText("DESCRIPTION", 44.0f, 330.0f, font3)
        canvas.drawText("QUANTITY", 316.0f, 330.0f, font3)
        canvas.drawText("AMOUNT", 432.0f, 330.0f, font3)
        canvas.drawLine(32.0f, 338.0f, (PAGE_WIDTH - 64).toFloat(), 338.0f, line1)

        for(k in 0..(courses.count() - 1))
        {
            when(courses[k])
            {
                COURSE_ID_FIRST_AID -> {
                    canvas.drawText("First Aid - 6-Month Course", 44.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("1", 316.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("R1500.00", 432.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawLine(32.0f, (360.0f + (28 * k).toFloat()) + 8.0f, (PAGE_WIDTH - 64).toFloat(), (360.0f + (28 * k).toFloat()) + 8.0f, line2)
                }

                COURSE_ID_SEWING -> {
                    canvas.drawText("Sewing - 6-Month Course", 44.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("1", 316.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("R1500.00", 432.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawLine(32.0f, (360.0f + (28 * k).toFloat()) + 8.0f, (PAGE_WIDTH - 64).toFloat(), (360.0f + (28 * k).toFloat()) + 8.0f, line2)
                }

                COURSE_ID_LANDSCAPING -> {
                    canvas.drawText("Landscaping - 6-Month Course", 44.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("1", 316.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("R1500.00", 432.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawLine(32.0f, (360.0f + (28 * k).toFloat()) + 8.0f, (PAGE_WIDTH - 64).toFloat(), (360.0f + (28 * k).toFloat()) + 8.0f, line2)
                }

                COURSE_ID_LIFE_SKILLS -> {
                    canvas.drawText("Life Skills - 6-Month Course", 44.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("1", 316.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("R1500.00", 432.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawLine(32.0f, (360.0f + (28 * k).toFloat()) + 8.0f, (PAGE_WIDTH - 64).toFloat(), (360.0f + (28 * k).toFloat()) + 8.0f, line2)
                }

                COURSE_ID_CHILD_MINDING -> {
                    canvas.drawText("Child Minding - 6-Week Course", 44.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("1", 316.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("R750.00", 432.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawLine(32.0f, (360.0f + (28 * k).toFloat()) + 8.0f, (PAGE_WIDTH - 64).toFloat(), (360.0f + (28 * k).toFloat()) + 8.0f, line2)
                }

                COURSE_ID_COOKING -> {
                    canvas.drawText("Cooking - 6-Week Course", 44.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("1", 316.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("R750.00", 432.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawLine(32.0f, (360.0f + (28 * k).toFloat()) + 8.0f, (PAGE_WIDTH - 64).toFloat(), (360.0f + (28 * k).toFloat()) + 8.0f, line2)
                }

                COURSE_ID_GARDEN_MAINTENANCE -> {
                    canvas.drawText("Garden Maintenance - 6-Week Course", 44.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("1", 316.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawText("R750.00", 432.0f, 360.0f + (28 * k).toFloat(), font5)
                    canvas.drawLine(32.0f, (360.0f + (28 * k).toFloat()) + 8.0f, (PAGE_WIDTH - 64).toFloat(), (360.0f + (28 * k).toFloat()) + 8.0f, line2)
                }
            }
        }

        // new section

        val position = 338.0f + (courses.count() * 30) + 36.0f
        canvas.drawText("PAYMENT DETAILS:", 32.0f, position, font4)
        canvas.drawText("Send proof of payment to payment@etn.co.za", 32.0f, position + 16.0f, font5)
        canvas.drawText("Payment required before booking is finalised.", 32.0f, position + 32, font5)

        canvas.drawText("BANK DETAILS:", 32.0f, position + 96.0f, font4)
        canvas.drawText("Empowering the Nation", 32.0f, position + 112.0f, font5)
        canvas.drawText("Bank name: Capitec", 32.0f, position + 128.0f, font5)
        canvas.drawText("Branch code: 470010", 32.0f, position + 144.0f, font5)
        canvas.drawText("Acc. number: 1234567890", 32.0f, position + 160.0f, font5)
        canvas.drawText("Acc. type: Cheque", 32.0f, position + 176.0f, font5)
        canvas.drawText("Ref. number: ${BookingDetails.firstName[0]}${BookingDetails.lastName[0]}$invoiceNumber", 32.0f, position + 192.0f, font5)

        canvas.drawText("SUBTOTAL", (PAGE_WIDTH - 260).toFloat(), position + 122.0f, font4)
        canvas.drawText("LESS DISCOUNT", (PAGE_WIDTH - 260).toFloat(), position + 138.0f, font4)
        canvas.drawText("VAT RATE", (PAGE_WIDTH - 260).toFloat(), position + 154.0f, font4)
        canvas.drawText("VAT", (PAGE_WIDTH - 260).toFloat(), position + 170.0f, font4)
        canvas.drawText("TOTAL", (PAGE_WIDTH - 260).toFloat(), position + 186.0f, font4)

        val df = DecimalFormat("#.##")
        df.minimumFractionDigits = 2

        canvas.drawText("R${df.format(subtotal)}", (PAGE_WIDTH - 140).toFloat(), position + 122.0f, font5)
        canvas.drawText("(R${df.format(discountPrice)})", (PAGE_WIDTH - 140).toFloat(), position + 138.0f, font5)
        canvas.drawText("15%", (PAGE_WIDTH - 140).toFloat(), position + 154.0f, font5)
        canvas.drawText("R${df.format(vatPrice)}", (PAGE_WIDTH - 140).toFloat(), position + 170.0f, font5)
        canvas.drawText("R${df.format(totalAmount)}", (PAGE_WIDTH - 140).toFloat(), position + 186.0f, font5)

        // end
        pdf.finishPage(page1)

        pdf.writeTo(ScreenList.main_screen.contentResolver.openOutputStream(uri))
        pdf.close()
    }

    private fun GenerateInvoiceNumber(): String
    {
        var invoiceNumber: String = ""

        for(k in 1..5)
        {
            invoiceNumber += Random.nextInt(0, 9).toString()
        }

        return invoiceNumber
    }
}