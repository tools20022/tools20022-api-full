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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmPostingDate
 * CorporateActionDate24.mmPostingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmValueDate
 * CorporateActionDate24.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmForeignExchangeRateFixingDate
 * CorporateActionDate24.mmForeignExchangeRateFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmEarliestPaymentDate
 * CorporateActionDate24.mmEarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmPaymentDate
 * CorporateActionDate24.mmPaymentDate}</li>
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
 * "CorporateActionDate24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7
 * CorporateActionDate7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionDate24", propOrder = {"postingDate", "valueDate", "foreignExchangeRateFixingDate", "earliestPaymentDate", "paymentDate"})
public class CorporateActionDate24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateAndDateTimeChoice postingDate;
	/**
	 * Date/Time of the posting (credit or debit) to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingDateTime
	 * CorporateActionDistribution.mmPostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24
	 * CorporateActionDate24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time of the posting (credit or debit) to the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingDateTime;
			componentContext_lazy = () -> CorporateActionDate24.mmObject();
			isDerived = false;
			xmlTag = "PstngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingDate";
			definition = "Date/Time of the posting (credit or debit) to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice valueDate;
	/**
	 * Date/time when calculating economic benefit for a cash amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmValueDate
	 * ProceedsDefinition.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24
	 * CorporateActionDate24}</li>
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
	 * "Date/time when calculating economic benefit for a cash amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmValueDate;
			componentContext_lazy = () -> CorporateActionDate24.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date/time when calculating economic benefit for a cash amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice foreignExchangeRateFixingDate;
	/**
	 * Date/time at which a foreign exchange rate will be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingDateTime
	 * FixingCondition.mmFixingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24
	 * CorporateActionDate24}</li>
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
	public static final MMMessageAttribute mmForeignExchangeRateFixingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FixingCondition.mmFixingDateTime;
			componentContext_lazy = () -> CorporateActionDate24.mmObject();
			isDerived = false;
			xmlTag = "FXRateFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeRateFixingDate";
			definition = "Date/time at which a foreign exchange rate will be determined.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice earliestPaymentDate;
	/**
	 * Date on which a payment can be made, for example, if payment date is a
	 * non-business day or to indicate the first payment date of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmEarliestPaymentDate
	 * ProceedsDefinition.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24
	 * CorporateActionDate24}</li>
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
	public static final MMMessageAttribute mmEarliestPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmEarliestPaymentDate;
			componentContext_lazy = () -> CorporateActionDate24.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date on which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice paymentDate;
	/**
	 * Date on which the distribution is due to take place (cash and/or
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24
	 * CorporateActionDate24}</li>
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
	 * "Date on which the distribution is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> CorporateActionDate24.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date on which the distribution is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDate24.mmPostingDate, CorporateActionDate24.mmValueDate, CorporateActionDate24.mmForeignExchangeRateFixingDate, CorporateActionDate24.mmEarliestPaymentDate,
						CorporateActionDate24.mmPaymentDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate24";
				definition = "Specifies corporate action dates.";
				previousVersion_lazy = () -> CorporateActionDate7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PstngDt", required = true)
	public DateAndDateTimeChoice getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(DateAndDateTimeChoice postingDate) {
		this.postingDate = postingDate;
	}

	@XmlElement(name = "ValDt")
	public DateAndDateTimeChoice getValueDate() {
		return valueDate;
	}

	public void setValueDate(DateAndDateTimeChoice valueDate) {
		this.valueDate = valueDate;
	}

	@XmlElement(name = "FXRateFxgDt")
	public DateAndDateTimeChoice getForeignExchangeRateFixingDate() {
		return foreignExchangeRateFixingDate;
	}

	public void setForeignExchangeRateFixingDate(DateAndDateTimeChoice foreignExchangeRateFixingDate) {
		this.foreignExchangeRateFixingDate = foreignExchangeRateFixingDate;
	}

	@XmlElement(name = "EarlstPmtDt")
	public DateAndDateTimeChoice getEarliestPaymentDate() {
		return earliestPaymentDate;
	}

	public void setEarliestPaymentDate(DateAndDateTimeChoice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
	}

	@XmlElement(name = "PmtDt")
	public DateAndDateTimeChoice getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(DateAndDateTimeChoice paymentDate) {
		this.paymentDate = paymentDate;
	}
}