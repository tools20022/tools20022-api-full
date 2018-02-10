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
import com.tools20022.repository.codeset.Frequency3Code;
import com.tools20022.repository.codeset.InstalmentPlan1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Instalment;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmInstalmentPlan
 * RecurringTransaction2.mmInstalmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmPlanIdentification
 * RecurringTransaction2.mmPlanIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmSequenceNumber
 * RecurringTransaction2.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmPeriodUnit
 * RecurringTransaction2.mmPeriodUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmInstalmentPeriod
 * RecurringTransaction2.mmInstalmentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmTotalNumberOfPayments
 * RecurringTransaction2.mmTotalNumberOfPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmFirstPaymentDate
 * RecurringTransaction2.mmFirstPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmTotalAmount
 * RecurringTransaction2.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmFirstAmount
 * RecurringTransaction2.mmFirstAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmCharges
 * RecurringTransaction2.mmCharges}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RecurringTransaction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Financial loan (instalment) or a recurring transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1
 * RecurringTransaction1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RecurringTransaction2", propOrder = {"instalmentPlan", "planIdentification", "sequenceNumber", "periodUnit", "instalmentPeriod", "totalNumberOfPayments", "firstPaymentDate", "totalAmount", "firstAmount", "charges"})
public class RecurringTransaction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstlmtPlan")
	protected List<InstalmentPlan1Code> instalmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstalmentPlan1Code
	 * InstalmentPlan1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmInstalmentPlanType
	 * Instalment.mmInstalmentPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstlmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instalment plan."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstalmentPlan = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmInstalmentPlanType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "InstlmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentPlan";
			definition = "Type of instalment plan.";
			minOccurs = 0;
			simpleType_lazy = () -> InstalmentPlan1Code.mmObject();
		}
	};
	@XmlElement(name = "PlanId")
	protected Max35Text planIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlanId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlanIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the instalment plan."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlanIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "PlanId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlanIdentification";
			definition = "Identification of the instalment plan.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SeqNb")
	protected Number sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmSequenceNumber
	 * RecurringTransaction1.mmSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Indicates the recurring/instalment occurrence of the transaction (1 = 1st instalment, 2 = 2nd instalment, etc.).";
			previousVersion_lazy = () -> RecurringTransaction1.mmSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "PrdUnit")
	protected Frequency3Code periodUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency3Code
	 * Frequency3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmPeriodUnit
	 * Instalment.mmPeriodUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmPeriodUnit
	 * RecurringTransaction1.mmPeriodUnit}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPeriodUnit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmPeriodUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "PrdUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodUnit";
			definition = "Period unit between consecutive payments (for example day, month, year).";
			previousVersion_lazy = () -> RecurringTransaction1.mmPeriodUnit;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency3Code.mmObject();
		}
	};
	@XmlElement(name = "InstlmtPrd")
	protected Number instalmentPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmInstalmentPeriod
	 * RecurringTransaction1.mmInstalmentPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstalmentPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmNumberOfUnits;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "InstlmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentPeriod";
			definition = "Number of period units between consecutive payments.";
			previousVersion_lazy = () -> RecurringTransaction1.mmInstalmentPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "TtlNbOfPmts")
	protected Number totalNumberOfPayments;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmTotalNumberOfPayments
	 * RecurringTransaction1.mmTotalNumberOfPayments}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfPayments = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmTotalNumberOfInstalment;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfPmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfPayments";
			definition = "Total number of instalment payments.";
			previousVersion_lazy = () -> RecurringTransaction1.mmTotalNumberOfPayments;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "FrstPmtDt")
	protected ISODate firstPaymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmFirstPaymentDate
	 * Instalment.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the first payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmFirstPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "FrstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date of the first payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "TtlAmt")
	protected CurrencyAndAmount totalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cumulative amount of all the instalments."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Cumulative amount of all the instalments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "FrstAmt")
	protected ImpliedCurrencyAndAmount firstAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmFirstPaymentAmount
	 * Instalment.mmFirstPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the first payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmFirstPaymentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "FrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAmount";
			definition = "Amount of the first payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "Chrgs")
	protected ImpliedCurrencyAndAmount charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCharges = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Charges related to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecurringTransaction2.mmInstalmentPlan, com.tools20022.repository.msg.RecurringTransaction2.mmPlanIdentification,
						com.tools20022.repository.msg.RecurringTransaction2.mmSequenceNumber, com.tools20022.repository.msg.RecurringTransaction2.mmPeriodUnit, com.tools20022.repository.msg.RecurringTransaction2.mmInstalmentPeriod,
						com.tools20022.repository.msg.RecurringTransaction2.mmTotalNumberOfPayments, com.tools20022.repository.msg.RecurringTransaction2.mmFirstPaymentDate, com.tools20022.repository.msg.RecurringTransaction2.mmTotalAmount,
						com.tools20022.repository.msg.RecurringTransaction2.mmFirstAmount, com.tools20022.repository.msg.RecurringTransaction2.mmCharges);
				trace_lazy = () -> Instalment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RecurringTransaction2";
				definition = "Financial loan (instalment) or a recurring transaction.";
				previousVersion_lazy = () -> RecurringTransaction1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<InstalmentPlan1Code> getInstalmentPlan() {
		return instalmentPlan == null ? instalmentPlan = new ArrayList<>() : instalmentPlan;
	}

	public RecurringTransaction2 setInstalmentPlan(List<InstalmentPlan1Code> instalmentPlan) {
		this.instalmentPlan = Objects.requireNonNull(instalmentPlan);
		return this;
	}

	public Optional<Max35Text> getPlanIdentification() {
		return planIdentification == null ? Optional.empty() : Optional.of(planIdentification);
	}

	public RecurringTransaction2 setPlanIdentification(Max35Text planIdentification) {
		this.planIdentification = planIdentification;
		return this;
	}

	public Optional<Number> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public RecurringTransaction2 setSequenceNumber(Number sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public Optional<Frequency3Code> getPeriodUnit() {
		return periodUnit == null ? Optional.empty() : Optional.of(periodUnit);
	}

	public RecurringTransaction2 setPeriodUnit(Frequency3Code periodUnit) {
		this.periodUnit = periodUnit;
		return this;
	}

	public Optional<Number> getInstalmentPeriod() {
		return instalmentPeriod == null ? Optional.empty() : Optional.of(instalmentPeriod);
	}

	public RecurringTransaction2 setInstalmentPeriod(Number instalmentPeriod) {
		this.instalmentPeriod = instalmentPeriod;
		return this;
	}

	public Optional<Number> getTotalNumberOfPayments() {
		return totalNumberOfPayments == null ? Optional.empty() : Optional.of(totalNumberOfPayments);
	}

	public RecurringTransaction2 setTotalNumberOfPayments(Number totalNumberOfPayments) {
		this.totalNumberOfPayments = totalNumberOfPayments;
		return this;
	}

	public Optional<ISODate> getFirstPaymentDate() {
		return firstPaymentDate == null ? Optional.empty() : Optional.of(firstPaymentDate);
	}

	public RecurringTransaction2 setFirstPaymentDate(ISODate firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
		return this;
	}

	public Optional<CurrencyAndAmount> getTotalAmount() {
		return totalAmount == null ? Optional.empty() : Optional.of(totalAmount);
	}

	public RecurringTransaction2 setTotalAmount(CurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getFirstAmount() {
		return firstAmount == null ? Optional.empty() : Optional.of(firstAmount);
	}

	public RecurringTransaction2 setFirstAmount(ImpliedCurrencyAndAmount firstAmount) {
		this.firstAmount = firstAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getCharges() {
		return charges == null ? Optional.empty() : Optional.of(charges);
	}

	public RecurringTransaction2 setCharges(ImpliedCurrencyAndAmount charges) {
		this.charges = charges;
		return this;
	}
}