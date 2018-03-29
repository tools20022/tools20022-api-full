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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat49Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies security date details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate18#mmPaymentDate
 * SecurityDate18.mmPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate18#mmAvailableDate
 * SecurityDate18.mmAvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityDate18#mmDividendRankingDate
 * SecurityDate18.mmDividendRankingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityDate18#mmEarliestPaymentDate
 * SecurityDate18.mmEarliestPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate18#mmPariPassuDate
 * SecurityDate18.mmPariPassuDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityDate18#mmLastTradingDate
 * SecurityDate18.mmLastTradingDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
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
 * "SecurityDate18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies security date details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityDate18", propOrder = {"paymentDate", "availableDate", "dividendRankingDate", "earliestPaymentDate", "pariPassuDate", "lastTradingDate"})
public class SecurityDate18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtDt", required = true)
	protected DateFormat49Choice paymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate18 SecurityDate18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PAYD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityDate18, DateFormat49Choice> mmPaymentDate = new MMMessageAssociationEnd<SecurityDate18, DateFormat49Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate18.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PAYD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public DateFormat49Choice getValue(SecurityDate18 obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(SecurityDate18 obj, DateFormat49Choice value) {
			obj.setPaymentDate(value);
		}
	};
	@XmlElement(name = "AvlblDt")
	protected DateFormat49Choice availableDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
	 * Security.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate18 SecurityDate18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::AVAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which securities become available for trading, for example first dealing date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityDate18, Optional<DateFormat49Choice>> mmAvailableDate = new MMMessageAssociationEnd<SecurityDate18, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmAvailableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate18.mmObject();
			isDerived = false;
			xmlTag = "AvlblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::AVAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDate";
			definition = "Date/time at which securities become available for trading, for example first dealing date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(SecurityDate18 obj) {
			return obj.getAvailableDate();
		}

		@Override
		public void setValue(SecurityDate18 obj, Optional<DateFormat49Choice> value) {
			obj.setAvailableDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddRnkgDt")
	protected DateFormat49Choice dividendRankingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendRankingDate
	 * Dividend.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate18 SecurityDate18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddRnkgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::DIVR</li>
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
	public static final MMMessageAssociationEnd<SecurityDate18, Optional<DateFormat49Choice>> mmDividendRankingDate = new MMMessageAssociationEnd<SecurityDate18, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmDividendRankingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate18.mmObject();
			isDerived = false;
			xmlTag = "DvddRnkgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::DIVR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendRankingDate";
			definition = "Date/time at which a security will be entitled to a dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(SecurityDate18 obj) {
			return obj.getDividendRankingDate();
		}

		@Override
		public void setValue(SecurityDate18 obj, Optional<DateFormat49Choice> value) {
			obj.setDividendRankingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlstPmtDt")
	protected DateFormat49Choice earliestPaymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmEarliestPaymentDate
	 * ProceedsDefinition.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate18 SecurityDate18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EARL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityDate18, Optional<DateFormat49Choice>> mmEarliestPaymentDate = new MMMessageAssociationEnd<SecurityDate18, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmEarliestPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate18.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EARL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/time at which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(SecurityDate18 obj) {
			return obj.getEarliestPaymentDate();
		}

		@Override
		public void setValue(SecurityDate18 obj, Optional<DateFormat49Choice> value) {
			obj.setEarliestPaymentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PrpssDt")
	protected DateFormat49Choice pariPassuDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmPariPassuDate
	 * CorporateActionEvent.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate18 SecurityDate18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrpssDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PPDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which security will assimilate, become fungible, or have the same rights to dividends as the parent issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityDate18, Optional<DateFormat49Choice>> mmPariPassuDate = new MMMessageAssociationEnd<SecurityDate18, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmPariPassuDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate18.mmObject();
			isDerived = false;
			xmlTag = "PrpssDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PPDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassuDate";
			definition = "Date/time at which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(SecurityDate18 obj) {
			return obj.getPariPassuDate();
		}

		@Override
		public void setValue(SecurityDate18 obj, Optional<DateFormat49Choice> value) {
			obj.setPariPassuDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LastTradgDt")
	protected DateFormat49Choice lastTradingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate18 SecurityDate18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastTradgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the securities to be reorganised will cease to be tradeable."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityDate18, Optional<DateFormat49Choice>> mmLastTradingDate = new MMMessageAttribute<SecurityDate18, Optional<DateFormat49Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate18.mmObject();
			isDerived = false;
			xmlTag = "LastTradgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastTradingDate";
			definition = "Date/time at which the securities to be reorganised will cease to be tradeable.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(SecurityDate18 obj) {
			return obj.getLastTradingDate();
		}

		@Override
		public void setValue(SecurityDate18 obj, Optional<DateFormat49Choice> value) {
			obj.setLastTradingDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate18.mmPaymentDate, com.tools20022.repository.msg.SecurityDate18.mmAvailableDate,
						com.tools20022.repository.msg.SecurityDate18.mmDividendRankingDate, com.tools20022.repository.msg.SecurityDate18.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate18.mmPariPassuDate,
						com.tools20022.repository.msg.SecurityDate18.mmLastTradingDate);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityDate18";
				definition = "Specifies security date details.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateFormat49Choice getPaymentDate() {
		return paymentDate;
	}

	public SecurityDate18 setPaymentDate(DateFormat49Choice paymentDate) {
		this.paymentDate = Objects.requireNonNull(paymentDate);
		return this;
	}

	public Optional<DateFormat49Choice> getAvailableDate() {
		return availableDate == null ? Optional.empty() : Optional.of(availableDate);
	}

	public SecurityDate18 setAvailableDate(DateFormat49Choice availableDate) {
		this.availableDate = availableDate;
		return this;
	}

	public Optional<DateFormat49Choice> getDividendRankingDate() {
		return dividendRankingDate == null ? Optional.empty() : Optional.of(dividendRankingDate);
	}

	public SecurityDate18 setDividendRankingDate(DateFormat49Choice dividendRankingDate) {
		this.dividendRankingDate = dividendRankingDate;
		return this;
	}

	public Optional<DateFormat49Choice> getEarliestPaymentDate() {
		return earliestPaymentDate == null ? Optional.empty() : Optional.of(earliestPaymentDate);
	}

	public SecurityDate18 setEarliestPaymentDate(DateFormat49Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
		return this;
	}

	public Optional<DateFormat49Choice> getPariPassuDate() {
		return pariPassuDate == null ? Optional.empty() : Optional.of(pariPassuDate);
	}

	public SecurityDate18 setPariPassuDate(DateFormat49Choice pariPassuDate) {
		this.pariPassuDate = pariPassuDate;
		return this;
	}

	public Optional<DateFormat49Choice> getLastTradingDate() {
		return lastTradingDate == null ? Optional.empty() : Optional.of(lastTradingDate);
	}

	public SecurityDate18 setLastTradingDate(DateFormat49Choice lastTradingDate) {
		this.lastTradingDate = lastTradingDate;
		return this;
	}
}