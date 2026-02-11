import mysql.connector
import pandas as pd
import matplotlib.pyplot as plt

# Connect to MariaDB (XAMPP)
db = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="tally_db"
)

print("Connected to database")

# Load Ledger table
query = "SELECT name, type, balance FROM ledger"
df = pd.read_sql(query, db)

print("\nLedger Data:")
print(df)

# Plot graph
plt.figure(figsize=(8,5))
plt.bar(df["name"], df["balance"])
plt.xlabel("Ledger")
plt.ylabel("Balance")
plt.title("Tally Ledger Balances")
plt.show()


# ---------------- AI BUSINESS INSIGHTS ----------------

total_assets = df[df["type"] == "ASSET"]["balance"].sum()
total_liabilities = df[df["type"] == "LIABILITY"]["balance"].sum()
total_income = df[df["type"] == "INCOME"]["balance"].sum()
total_expense = df[df["type"] == "EXPENSE"]["balance"].sum()

profit = total_income - total_expense

print("\n=========== AI BUSINESS INSIGHTS ===========")

print(f"Total Assets     : ₹{total_assets}")
print(f"Total Liabilities: ₹{total_liabilities}")
print(f"Total Income     : ₹{total_income}")
print(f"Total Expenses   : ₹{total_expense}")
print(f"Net Profit       : ₹{profit}")

# Business Health
if profit > 0:
    print("✔ Business is PROFITABLE")
else:
    print("❌ Business is in LOSS")

# Liquidity Check
if total_assets > total_liabilities:
    print("✔ Business is FINANCIALLY STABLE")
else:
    print("❌ Business is FINANCIALLY RISKY")

# Top Ledger
top_ledger = df.loc[df["balance"].idxmax()]
print("\nTop Performing Ledger:")
print(f"{top_ledger['name']} → ₹{top_ledger['balance']}")
