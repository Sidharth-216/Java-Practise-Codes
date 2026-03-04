from reportlab.platypus import SimpleDocTemplate, Paragraph, Spacer, ListFlowable, ListItem, Table, TableStyle
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import getSampleStyleSheet, ParagraphStyle
from reportlab.lib.enums import TA_CENTER
from reportlab.lib import colors

# File path for poster-style version
file_path_poster = "/home/sidhu/Desktop/java_codes/InnoTech_Dynamics_Job_Opening_Poster.pdf"

# Create PDF document
doc = SimpleDocTemplate(file_path_poster, pagesize=A4, title="Attractive Job Opening Notice - InnoTech Dynamics")

# Styles
styles = getSampleStyleSheet()
title_style = ParagraphStyle('title_style', parent=styles['Heading1'], alignment=TA_CENTER, fontSize=22, textColor=colors.HexColor("#2E86C1"), spaceAfter=20)
subtitle_style = ParagraphStyle('subtitle_style', parent=styles['Heading2'], fontSize=14, textColor=colors.HexColor("#117A65"), spaceAfter=10)
body_style = styles['BodyText']
body_style.fontSize = 11
body_style.leading = 15

highlight_style = ParagraphStyle('highlight_style', parent=styles['BodyText'], alignment=TA_CENTER, fontSize=13, textColor=colors.HexColor("#C0392B"), spaceAfter=15)

# Content
content = []

# Title block with background color
title_table = Table([[Paragraph("📢 Job Opening – InnoTech Dynamics", title_style)]], colWidths=[480])
title_table.setStyle(TableStyle([
    ('BACKGROUND', (0, 0), (-1, -1), colors.HexColor("#D6EAF8")),
    ('BOX', (0, 0), (-1, -1), 1, colors.HexColor("#2E86C1")),
    ('ALIGN', (0, 0), (-1, -1), 'CENTER')
]))
content.append(title_table)
content.append(Spacer(1, 20))

# Company and Position (highlighted)
content.append(Paragraph("<b>Company Name:</b> InnoTech Dynamics", body_style))
content.append(Paragraph("<b>Position Title:</b> <font color='#C0392B'>C Developer (Entry Level / Intern)</font>", body_style))
content.append(Spacer(1, 12))

# About the Role
content.append(Paragraph("🔹 About the Role", subtitle_style))
content.append(Paragraph(
    "We are seeking enthusiastic candidates for the role of C Developer. "
    "This entry-level position is designed for students with basic programming knowledge in C "
    "and strong communication skills. The focus of this activity is to test both technical understanding "
    "and the ability to communicate ideas effectively.", body_style))
content.append(Spacer(1, 12))

# Responsibilities
content.append(Paragraph("🔹 Responsibilities", subtitle_style))
responsibilities = [
    "Write and maintain simple C programs.",
    "Communicate effectively within a team to clarify requirements.",
    "Present your problem-solving approach clearly.",
    "Document your work in a structured manner.",
    "Actively participate in discussions and activities."
]
content.append(ListFlowable([ListItem(Paragraph(item, body_style)) for item in responsibilities], bulletType='bullet'))
content.append(Spacer(1, 12))

# Requirements
content.append(Paragraph("🔹 Requirements", subtitle_style))
requirements = [
    "Basic knowledge of C (loops, arrays, functions).",
    "Good verbal and written communication skills.",
    "Confidence in explaining concepts clearly.",
    "Ability to work well in a team."
]
content.append(ListFlowable([ListItem(Paragraph(item, body_style)) for item in requirements], bulletType='bullet'))
content.append(Spacer(1, 12))

# Nice to Have
content.append(Paragraph("🔹 Nice to Have (Optional)", subtitle_style))
optional = [
    "Prior teamwork or project experience.",
    "Comfort in asking and answering questions confidently."
]
content.append(ListFlowable([ListItem(Paragraph(item, body_style)) for item in optional], bulletType='bullet'))
content.append(Spacer(1, 12))

# Location and Type (highlighted box)
location_table = Table([[
    Paragraph("<b>📍 Location:</b> Mock Interview Activity (Classroom)", body_style),
    Paragraph("<b>📝 Type:</b> Internship/Training (for assessment purpose only)", body_style)
]], colWidths=[240, 240])
location_table.setStyle(TableStyle([
    ('BACKGROUND', (0, 0), (-1, -1), colors.HexColor("#E8F8F5")),
    ('BOX', (0, 0), (-1, -1), 1, colors.HexColor("#117A65")),
    ('ALIGN', (0, 0), (-1, -1), 'CENTER')
]))
content.append(location_table)
content.append(Spacer(1, 25))

# Closing line
content.append(Paragraph("✨ <b>InnoTech Dynamics – Building Skills, Enhancing Communication</b> ✨", highlight_style))

# Build PDF
doc.build(content)

file_path_poster
