import PyPDF2
pdfFile = open('PersonalData.pdf', 'rb')
pdfReader = PyPDF2.PdfFileReader(pdfFile)
pdfWriter = PyPDF2.PdfFileWriter()
for pageNum in range(pdfReader.numPages):
    pdfWriter.addPage(pdfReader.getPage(pageNum))
pdfWriter.encrypt('Ben6297@#;')
resultPdf = open('Encrypted_PersonalData.pdf', 'wb')
pdfWriter.write(resultPdf)
resultPdf.close()
