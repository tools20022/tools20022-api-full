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
import com.tools20022.repository.codeset.Frequency4Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max2NumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Instalment;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Financial loan (instalment) or a recurring transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmSequenceNumber
 * RecurringTransaction1.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmPeriodUnit
 * RecurringTransaction1.mmPeriodUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmInstalmentPeriod
 * RecurringTransaction1.mmInstalmentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmTotalNumberOfPayments
 * RecurringTransaction1.mmTotalNumberOfPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmInterestCharges
 * RecurringTransaction1.mmInterestCharges}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
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
 * "RecurringTransaction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Financial loan (instalment) or a recurring transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RecurringTransaction2
 * RecurringTransaction2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RecurringTransaction1", propOrder = {"sequenceNumber", "periodUnit", "instalmentPeriod", "totalNumberOfPayments", "interestCharges"})
public class RecurringTransaction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max2NumericText sequenceNumber;
	/**
	 * Indicates the recurring/instalment occurrence of the transaction (1 = 1st
	 * instalment, 2 = 2nd instalment, etc.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max2NumericText
	 * Max2NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1
	 * RecurringTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the recurring/instalment occurrence of the transaction (1 = 1st instalment, 2 = 2nd instalment, etc.)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmSequenceNumber
	 * RecurringTransaction2.mmSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RecurringTransaction1.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Indicates the recurring/instalment occurrence of the transaction (1 = 1st instalment, 2 = 2nd instalment, etc.).";
			nextVersions_lazy = () -> Arrays.asList(RecurringTransaction2.mmSequenceNumber);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2NumericText.mmObject();
		}
	};
	protected Frequency4Code periodUnit;
	/**
	 * Period unit between consecutive payments (for example day, month, year).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency4Code
	 * Frequency4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmPeriodUnit
	 * Instalment.mmPeriodUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1
	 * RecurringTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period unit between consecutive payments (for example day, month, year)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmPeriodUnit
	 * RecurringTransaction2.mmPeriodUnit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPeriodUnit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmPeriodUnit;
			componentContext_lazy = () -> RecurringTransaction1.mmObject();
			isDerived = false;
			xmlTag = "PrdUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodUnit";
			definition = "Period unit between consecutive payments (for example day, month, year).";
			nextVersions_lazy = () -> Arrays.asList(RecurringTransaction2.mmPeriodUnit);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency4Code.mmObject();
		}
	};
	protected Number instalmentPeriod;
	/**
	 * Number of period units between consecutive payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmNumberOfUnits
	 * Instalment.mmNumberOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1
	 * RecurringTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstlmtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of period units between consecutive payments."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmInstalmentPeriod
	 * RecurringTransaction2.mmInstalmentPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstalmentPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmNumberOfUnits;
			componentContext_lazy = () -> RecurringTransaction1.mmObject();
			isDerived = false;
			xmlTag = "InstlmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentPeriod";
			definition = "Number of period units between consecutive payments.";
			nextVersions_lazy = () -> Arrays.asList(RecurringTransaction2.mmInstalmentPeriod);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number totalNumberOfPayments;
	/**
	 * Total number of instalment payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmTotalNumberOfInstalment
	 * Instalment.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1
	 * RecurringTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfPmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of instalment payments."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmTotalNumberOfPayments
	 * RecurringTransaction2.mmTotalNumberOfPayments}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfPayments = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmTotalNumberOfInstalment;
			componentContext_lazy = () -> RecurringTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfPmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfPayments";
			definition = "Total number of instalment payments.";
			nextVersions_lazy = () -> Arrays.asList(RecurringTransaction2.mmTotalNumberOfPayments);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount interestCharges;
	/**
	 * Interest charged in percentage for the total amount of payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmInterest
	 * PaymentObligation.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1
	 * RecurringTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstChrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest charged in percentage for the total amount of payments."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestCharges = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmInterest;
			componentContext_lazy = () -> RecurringTransaction1.mmObject();
			isDerived = false;
			xmlTag = "IntrstChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestCharges";
			definition = "Interest charged in percentage for the total amount of payments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RecurringTransaction1.mmSequenceNumber, RecurringTransaction1.mmPeriodUnit, RecurringTransaction1.mmInstalmentPeriod, RecurringTransaction1.mmTotalNumberOfPayments,
						RecurringTransaction1.mmInterestCharges);
				trace_lazy = () -> Instalment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RecurringTransaction1";
				definition = "Financial loan (instalment) or a recurring transaction.";
				nextVersions_lazy = () -> Arrays.asList(RecurringTransaction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SeqNb", required = true)
	public Max2NumericText getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Max2NumericText sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@XmlElement(name = "PrdUnit", required = true)
	public Frequency4Code getPeriodUnit() {
		return periodUnit;
	}

	public void setPeriodUnit(Frequency4Code periodUnit) {
		this.periodUnit = periodUnit;
	}

	@XmlElement(name = "InstlmtPrd", required = true)
	public Number getInstalmentPeriod() {
		return instalmentPeriod;
	}

	public void setInstalmentPeriod(Number instalmentPeriod) {
		this.instalmentPeriod = instalmentPeriod;
	}

	@XmlElement(name = "TtlNbOfPmts", required = true)
	public Number getTotalNumberOfPayments() {
		return totalNumberOfPayments;
	}

	public void setTotalNumberOfPayments(Number totalNumberOfPayments) {
		this.totalNumberOfPayments = totalNumberOfPayments;
	}

	@XmlElement(name = "IntrstChrgs")
	public ImpliedCurrencyAndAmount getInterestCharges() {
		return interestCharges;
	}

	public void setInterestCharges(ImpliedCurrencyAndAmount interestCharges) {
		this.interestCharges = interestCharges;
	}
}