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
import com.tools20022.repository.choice.DateFormat4Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies coprorate action dates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmPaymentDate
 * CorporateActionDate3.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmAvailableDate
 * CorporateActionDate3.mmAvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmDividendRankingDate
 * CorporateActionDate3.mmDividendRankingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmPariPassuDate
 * CorporateActionDate3.mmPariPassuDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmFirstDealingDate
 * CorporateActionDate3.mmFirstDealingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmEarliestPaymentDate
 * CorporateActionDate3.mmEarliestPaymentDate}</li>
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
 * "CorporateActionDate3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies coprorate action dates."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionDate3", propOrder = {"paymentDate", "availableDate", "dividendRankingDate", "pariPassuDate", "firstDealingDate", "earliestPaymentDate"})
public class CorporateActionDate3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat4Choice paymentDate;
	/**
	 * Date/time at which the distribution is due to take place (cash and/or
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3
	 * CorporateActionDate3}</li>
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
	 * "Date/time at which the distribution is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> CorporateActionDate3.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the distribution is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice availableDate;
	/**
	 * Date/time at which securities become available for sale.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
	 * Security.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3
	 * CorporateActionDate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which securities become available for sale."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAvailableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmAvailableDate;
			componentContext_lazy = () -> CorporateActionDate3.mmObject();
			isDerived = false;
			xmlTag = "AvlblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDate";
			definition = "Date/time at which securities become available for sale.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice dividendRankingDate;
	/**
	 * Date/time at which a security will be entitled to a dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendRankingDate
	 * Dividend.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3
	 * CorporateActionDate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddRnkgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendRankingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a security will be entitled to a dividend."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDividendRankingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmDividendRankingDate;
			componentContext_lazy = () -> CorporateActionDate3.mmObject();
			isDerived = false;
			xmlTag = "DvddRnkgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendRankingDate";
			definition = "Date/time at which a security will be entitled to a dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice pariPassuDate;
	/**
	 * Date on which security will assimilate, become fungible, or have the same
	 * rights to dividends as the parent issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmPariPassuDate
	 * CorporateActionEvent.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3
	 * CorporateActionDate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrpssDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPariPassuDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmPariPassuDate;
			componentContext_lazy = () -> CorporateActionDate3.mmObject();
			isDerived = false;
			xmlTag = "PrpssDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassuDate";
			definition = "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice firstDealingDate;
	/**
	 * Date/time at which new securities begin trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFirstDealingDate
	 * Security.mmFirstDealingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3
	 * CorporateActionDate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstDealgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstDealingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which new securities begin trading."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstDealingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmFirstDealingDate;
			componentContext_lazy = () -> CorporateActionDate3.mmObject();
			isDerived = false;
			xmlTag = "FrstDealgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstDealingDate";
			definition = "Date/time at which new securities begin trading.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice earliestPaymentDate;
	/**
	 * Date/time at which a payment can be made, eg, if payment date is a
	 * non-business day or to indicate the first payment date of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmEarliestPaymentDate
	 * ProceedsDefinition.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3
	 * CorporateActionDate3}</li>
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
	 * "Date/time at which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarliestPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmEarliestPaymentDate;
			componentContext_lazy = () -> CorporateActionDate3.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/time at which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDate3.mmPaymentDate, CorporateActionDate3.mmAvailableDate, CorporateActionDate3.mmDividendRankingDate, CorporateActionDate3.mmPariPassuDate,
						CorporateActionDate3.mmFirstDealingDate, CorporateActionDate3.mmEarliestPaymentDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate3";
				definition = "Specifies coprorate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtDt")
	public DateFormat4Choice getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(DateFormat4Choice paymentDate) {
		this.paymentDate = paymentDate;
	}

	@XmlElement(name = "AvlblDt")
	public DateFormat4Choice getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(DateFormat4Choice availableDate) {
		this.availableDate = availableDate;
	}

	@XmlElement(name = "DvddRnkgDt")
	public DateFormat4Choice getDividendRankingDate() {
		return dividendRankingDate;
	}

	public void setDividendRankingDate(DateFormat4Choice dividendRankingDate) {
		this.dividendRankingDate = dividendRankingDate;
	}

	@XmlElement(name = "PrpssDt")
	public DateFormat4Choice getPariPassuDate() {
		return pariPassuDate;
	}

	public void setPariPassuDate(DateFormat4Choice pariPassuDate) {
		this.pariPassuDate = pariPassuDate;
	}

	@XmlElement(name = "FrstDealgDt")
	public DateFormat4Choice getFirstDealingDate() {
		return firstDealingDate;
	}

	public void setFirstDealingDate(DateFormat4Choice firstDealingDate) {
		this.firstDealingDate = firstDealingDate;
	}

	@XmlElement(name = "EarlstPmtDt")
	public DateFormat4Choice getEarliestPaymentDate() {
		return earliestPaymentDate;
	}

	public void setEarliestPaymentDate(DateFormat4Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
	}
}