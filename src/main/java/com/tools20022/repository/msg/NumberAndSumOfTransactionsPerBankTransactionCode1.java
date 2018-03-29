/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BankTransactionCodeStructure1;
import com.tools20022.repository.msg.CashBalanceAvailability1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements providing the total sum of entries per bank transaction code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1#mmNumberOfEntries
 * NumberAndSumOfTransactionsPerBankTransactionCode1.mmNumberOfEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1#mmSum
 * NumberAndSumOfTransactionsPerBankTransactionCode1.mmSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1#mmTotalNetEntryAmount
 * NumberAndSumOfTransactionsPerBankTransactionCode1.mmTotalNetEntryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1#mmCreditDebitIndicator
 * NumberAndSumOfTransactionsPerBankTransactionCode1.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1#mmBankTransactionCode
 * NumberAndSumOfTransactionsPerBankTransactionCode1.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1#mmAvailability
 * NumberAndSumOfTransactionsPerBankTransactionCode1.mmAvailability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDebitCreditIndicatorGuideline#forNumberAndSumOfTransactionsPerBankTransactionCode1
 * ConstraintDebitCreditIndicatorGuideline.
 * forNumberAndSumOfTransactionsPerBankTransactionCode1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NumberAndSumOfTransactionsPerBankTransactionCode1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements providing the total sum of entries per bank transaction code."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NumberAndSumOfTransactionsPerBankTransactionCode1", propOrder = {"numberOfEntries", "sum", "totalNetEntryAmount", "creditDebitIndicator", "bankTransactionCode", "availability"})
public class NumberAndSumOfTransactionsPerBankTransactionCode1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NbOfNtries")
	protected Max15NumericText numberOfEntries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1
	 * NumberAndSumOfTransactionsPerBankTransactionCode1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of individual entries contained in the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberAndSumOfTransactionsPerBankTransactionCode1, Optional<Max15NumericText>> mmNumberOfEntries = new MMMessageAttribute<NumberAndSumOfTransactionsPerBankTransactionCode1, Optional<Max15NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmObject();
			isDerived = false;
			xmlTag = "NbOfNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfEntries";
			definition = "Number of individual entries contained in the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj) {
			return obj.getNumberOfEntries();
		}

		@Override
		public void setValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj, Optional<Max15NumericText> value) {
			obj.setNumberOfEntries(value.orElse(null));
		}
	};
	@XmlElement(name = "Sum")
	protected DecimalNumber sum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1
	 * NumberAndSumOfTransactionsPerBankTransactionCode1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total of all individual entries included in the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberAndSumOfTransactionsPerBankTransactionCode1, Optional<DecimalNumber>> mmSum = new MMMessageAttribute<NumberAndSumOfTransactionsPerBankTransactionCode1, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmObject();
			isDerived = false;
			xmlTag = "Sum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sum";
			definition = "Total of all individual entries included in the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj) {
			return obj.getSum();
		}

		@Override
		public void setValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj, Optional<DecimalNumber> value) {
			obj.setSum(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNetNtryAmt")
	protected DecimalNumber totalNetEntryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1
	 * NumberAndSumOfTransactionsPerBankTransactionCode1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNetNtryAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNetEntryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Resulting amount of the netted amounts for all debit and credit entries per bank transaction code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberAndSumOfTransactionsPerBankTransactionCode1, Optional<DecimalNumber>> mmTotalNetEntryAmount = new MMMessageAttribute<NumberAndSumOfTransactionsPerBankTransactionCode1, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmObject();
			isDerived = false;
			xmlTag = "TtlNetNtryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNetEntryAmount";
			definition = "Resulting amount of the netted amounts for all debit and credit entries per bank transaction code.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj) {
			return obj.getTotalNetEntryAmount();
		}

		@Override
		public void setValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj, Optional<DecimalNumber> value) {
			obj.setTotalNetEntryAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1
	 * NumberAndSumOfTransactionsPerBankTransactionCode1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the total net entry amount is a credit or a debit amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberAndSumOfTransactionsPerBankTransactionCode1, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<NumberAndSumOfTransactionsPerBankTransactionCode1, Optional<CreditDebitCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the total net entry amount is a credit or a debit amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "BkTxCd", required = true)
	protected BankTransactionCodeStructure1 bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure1
	 * BankTransactionCodeStructure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1
	 * NumberAndSumOfTransactionsPerBankTransactionCode1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements to fully identify the type of underlying transaction resulting in an entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NumberAndSumOfTransactionsPerBankTransactionCode1, BankTransactionCodeStructure1> mmBankTransactionCode = new MMMessageAssociationEnd<NumberAndSumOfTransactionsPerBankTransactionCode1, BankTransactionCodeStructure1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmObject();
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements to fully identify the type of underlying transaction resulting in an entry.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure1.mmObject();
		}

		@Override
		public BankTransactionCodeStructure1 getValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj, BankTransactionCodeStructure1 value) {
			obj.setBankTransactionCode(value);
		}
	};
	@XmlElement(name = "Avlbty")
	protected List<CashBalanceAvailability1> availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability1
	 * CashBalanceAvailability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1
	 * NumberAndSumOfTransactionsPerBankTransactionCode1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to indicate when the booked amount of money will become available, ie can be accessed and start generating interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NumberAndSumOfTransactionsPerBankTransactionCode1, List<CashBalanceAvailability1>> mmAvailability = new MMMessageAssociationEnd<NumberAndSumOfTransactionsPerBankTransactionCode1, List<CashBalanceAvailability1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmObject();
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Set of elements used to indicate when the booked amount of money will become available, ie can be accessed and start generating interest.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalanceAvailability1.mmObject();
		}

		@Override
		public List<CashBalanceAvailability1> getValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(NumberAndSumOfTransactionsPerBankTransactionCode1 obj, List<CashBalanceAvailability1> value) {
			obj.setAvailability(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmNumberOfEntries,
						com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmSum, com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmTotalNetEntryAmount,
						com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmCreditDebitIndicator, com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmBankTransactionCode,
						com.tools20022.repository.msg.NumberAndSumOfTransactionsPerBankTransactionCode1.mmAvailability);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDebitCreditIndicatorGuideline.forNumberAndSumOfTransactionsPerBankTransactionCode1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NumberAndSumOfTransactionsPerBankTransactionCode1";
				definition = "Set of elements providing the total sum of entries per bank transaction code.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max15NumericText> getNumberOfEntries() {
		return numberOfEntries == null ? Optional.empty() : Optional.of(numberOfEntries);
	}

	public NumberAndSumOfTransactionsPerBankTransactionCode1 setNumberOfEntries(Max15NumericText numberOfEntries) {
		this.numberOfEntries = numberOfEntries;
		return this;
	}

	public Optional<DecimalNumber> getSum() {
		return sum == null ? Optional.empty() : Optional.of(sum);
	}

	public NumberAndSumOfTransactionsPerBankTransactionCode1 setSum(DecimalNumber sum) {
		this.sum = sum;
		return this;
	}

	public Optional<DecimalNumber> getTotalNetEntryAmount() {
		return totalNetEntryAmount == null ? Optional.empty() : Optional.of(totalNetEntryAmount);
	}

	public NumberAndSumOfTransactionsPerBankTransactionCode1 setTotalNetEntryAmount(DecimalNumber totalNetEntryAmount) {
		this.totalNetEntryAmount = totalNetEntryAmount;
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public NumberAndSumOfTransactionsPerBankTransactionCode1 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public BankTransactionCodeStructure1 getBankTransactionCode() {
		return bankTransactionCode;
	}

	public NumberAndSumOfTransactionsPerBankTransactionCode1 setBankTransactionCode(BankTransactionCodeStructure1 bankTransactionCode) {
		this.bankTransactionCode = Objects.requireNonNull(bankTransactionCode);
		return this;
	}

	public List<CashBalanceAvailability1> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public NumberAndSumOfTransactionsPerBankTransactionCode1 setAvailability(List<CashBalanceAvailability1> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}
}