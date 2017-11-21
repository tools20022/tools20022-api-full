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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat13Choice;
import com.tools20022.repository.choice.DateFormat9Choice;
import com.tools20022.repository.entity.CorporateActionDistribution;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.FixingCondition;
import com.tools20022.repository.entity.ProceedsDefinition;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies corporate action dates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#mmPaymentDate
 * CorporateActionDate12.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#mmValueDate
 * CorporateActionDate12.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#mmForeignExchangeRateFixingDate
 * CorporateActionDate12.mmForeignExchangeRateFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#mmEarliestPaymentDate
 * CorporateActionDate12.mmEarliestPaymentDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionDate12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionDate12", propOrder = {"paymentDate", "valueDate", "foreignExchangeRateFixingDate", "earliestPaymentDate"})
public class CorporateActionDate12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat9Choice paymentDate;
	/**
	 * Date on which the movement is due to take place (cash and/or securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12
	 * CorporateActionDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> CorporateActionDate12.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date on which the movement is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};
	protected DateFormat13Choice valueDate;
	/**
	 * Date at which assets become available to the account owner (in a credit
	 * entry), or cease to be available to the account owner (in a debit entry).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat13Choice
	 * DateFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmValueDate
	 * ProceedsDefinition.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12
	 * CorporateActionDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValueDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmValueDate;
			componentContext_lazy = () -> CorporateActionDate12.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date at which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat13Choice.mmObject();
		}
	};
	protected DateFormat9Choice foreignExchangeRateFixingDate;
	/**
	 * Date/time at which a foreign exchange rate will be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingDateTime
	 * FixingCondition.mmFixingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12
	 * CorporateActionDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXRateFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeRateFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a foreign exchange rate will be determined."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeRateFixingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> FixingCondition.mmFixingDateTime;
			componentContext_lazy = () -> CorporateActionDate12.mmObject();
			isDerived = false;
			xmlTag = "FXRateFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeRateFixingDate";
			definition = "Date/time at which a foreign exchange rate will be determined.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};
	protected DateFormat9Choice earliestPaymentDate;
	/**
	 * Date on which a payment can be made, for example, if payment date is a
	 * non-business day or to indicate the first payment date of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat9Choice
	 * DateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmEarliestPaymentDate
	 * ProceedsDefinition.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12
	 * CorporateActionDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarliestPaymentDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmEarliestPaymentDate;
			componentContext_lazy = () -> CorporateActionDate12.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date on which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat9Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDate12.mmPaymentDate, CorporateActionDate12.mmValueDate, CorporateActionDate12.mmForeignExchangeRateFixingDate, CorporateActionDate12.mmEarliestPaymentDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate12";
				definition = "Specifies corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtDt", required = true)
	public DateFormat9Choice getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(DateFormat9Choice paymentDate) {
		this.paymentDate = paymentDate;
	}

	@XmlElement(name = "ValDt")
	public DateFormat13Choice getValueDate() {
		return valueDate;
	}

	public void setValueDate(DateFormat13Choice valueDate) {
		this.valueDate = valueDate;
	}

	@XmlElement(name = "FXRateFxgDt")
	public DateFormat9Choice getForeignExchangeRateFixingDate() {
		return foreignExchangeRateFixingDate;
	}

	public void setForeignExchangeRateFixingDate(DateFormat9Choice foreignExchangeRateFixingDate) {
		this.foreignExchangeRateFixingDate = foreignExchangeRateFixingDate;
	}

	@XmlElement(name = "EarlstPmtDt")
	public DateFormat9Choice getEarliestPaymentDate() {
		return earliestPaymentDate;
	}

	public void setEarliestPaymentDate(DateFormat9Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
	}
}