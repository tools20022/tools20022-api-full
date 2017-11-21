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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements providing the total sum of entries.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions3#mmNumberOfEntries
 * NumberAndSumOfTransactions3.mmNumberOfEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions3#mmSum
 * NumberAndSumOfTransactions3.mmSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions3#mmTotalNetEntryAmount
 * NumberAndSumOfTransactions3.mmTotalNetEntryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions3#mmCreditDebitIndicator
 * NumberAndSumOfTransactions3.mmCreditDebitIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NumberAndSumOfTransactions3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of elements providing the total sum of entries."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions4
 * NumberAndSumOfTransactions4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NumberAndSumOfTransactions3", propOrder = {"numberOfEntries", "sum", "totalNetEntryAmount", "creditDebitIndicator"})
public class NumberAndSumOfTransactions3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max15NumericText numberOfEntries;
	/**
	 * Number of individual entries included in the report.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions3
	 * NumberAndSumOfTransactions3}</li>
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
	 * definition} = "Number of individual entries included in the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfEntries = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberAndSumOfTransactions3.mmObject();
			isDerived = false;
			xmlTag = "NbOfNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfEntries";
			definition = "Number of individual entries included in the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected DecimalNumber sum;
	/**
	 * Total of all individual entries included in the report.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions3
	 * NumberAndSumOfTransactions3}</li>
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
	public static final MMMessageAttribute mmSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberAndSumOfTransactions3.mmObject();
			isDerived = false;
			xmlTag = "Sum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sum";
			definition = "Total of all individual entries included in the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber totalNetEntryAmount;
	/**
	 * Resulting amount of the netted amounts for all debit and credit entries.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions3
	 * NumberAndSumOfTransactions3}</li>
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
	 * "Resulting amount of the netted amounts for all debit and credit entries."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNetEntryAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberAndSumOfTransactions3.mmObject();
			isDerived = false;
			xmlTag = "TtlNetNtryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNetEntryAmount";
			definition = "Resulting amount of the netted amounts for all debit and credit entries.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * Indicates whether the total net entry amount is a credit or a debit
	 * amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions3
	 * NumberAndSumOfTransactions3}</li>
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
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberAndSumOfTransactions3.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the total net entry amount is a credit or a debit amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NumberAndSumOfTransactions3.mmNumberOfEntries, NumberAndSumOfTransactions3.mmSum, NumberAndSumOfTransactions3.mmTotalNetEntryAmount,
						NumberAndSumOfTransactions3.mmCreditDebitIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NumberAndSumOfTransactions3";
				definition = "Set of elements providing the total sum of entries.";
				nextVersions_lazy = () -> Arrays.asList(NumberAndSumOfTransactions4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NbOfNtries")
	public Max15NumericText getNumberOfEntries() {
		return numberOfEntries;
	}

	public void setNumberOfEntries(Max15NumericText numberOfEntries) {
		this.numberOfEntries = numberOfEntries;
	}

	@XmlElement(name = "Sum")
	public DecimalNumber getSum() {
		return sum;
	}

	public void setSum(DecimalNumber sum) {
		this.sum = sum;
	}

	@XmlElement(name = "TtlNetNtryAmt")
	public DecimalNumber getTotalNetEntryAmount() {
		return totalNetEntryAmount;
	}

	public void setTotalNetEntryAmount(DecimalNumber totalNetEntryAmount) {
		this.totalNetEntryAmount = totalNetEntryAmount;
	}

	@XmlElement(name = "CdtDbtInd")
	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}
}