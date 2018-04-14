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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification24Choice;
import com.tools20022.repository.choice.SingleOrMassQuote2Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.QuoteOriginator;
import com.tools20022.repository.entity.QuoteRequestor;
import com.tools20022.repository.entity.SecuritiesQuoteVariable;
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
 * Proposition of price for a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Quote4#mmQuoteResponseType
 * Quote4.mmQuoteResponseType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote4#mmResponseLevel
 * Quote4.mmResponseLevel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote4#mmType Quote4.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote4#mmQuoteOriginator
 * Quote4.mmQuoteOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote4#mmQuoteOriginatorRole
 * Quote4.mmQuoteOriginatorRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote4#mmRequestorEligibility
 * Quote4.mmRequestorEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote4#mmQuoteChoice
 * Quote4.mmQuoteChoice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
 * SecuritiesQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Quote4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Proposition of price for a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintQuoteResponseTypeRule#forQuote4
 * ConstraintQuoteResponseTypeRule.forQuote4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Quote4", propOrder = {"quoteResponseType", "responseLevel", "type", "quoteOriginator", "quoteOriginatorRole", "requestorEligibility", "quoteChoice"})
public class Quote4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QtRspnTp")
	protected QuoteResponseType1Code quoteResponseType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code
	 * QuoteResponseType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote4
	 * Quote4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtRspnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteResponseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of Quote Response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 694</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote4, Optional<QuoteResponseType1Code>> mmQuoteResponseType = new MMMessageAttribute<Quote4, Optional<QuoteResponseType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote4.mmObject();
			isDerived = false;
			xmlTag = "QtRspnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "694"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteResponseType";
			definition = "Identifies the type of Quote Response.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QuoteResponseType1Code.mmObject();
		}

		@Override
		public Optional<QuoteResponseType1Code> getValue(Quote4 obj) {
			return obj.getQuoteResponseType();
		}

		@Override
		public void setValue(Quote4 obj, Optional<QuoteResponseType1Code> value) {
			obj.setQuoteResponseType(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnLvl")
	protected ResponseLevel1Code responseLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseLevel1Code
	 * ResponseLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote4
	 * Quote4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnLvl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the level of response requested from the Receiver of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 301</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote4, Optional<ResponseLevel1Code>> mmResponseLevel = new MMMessageAttribute<Quote4, Optional<ResponseLevel1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote4.mmObject();
			isDerived = false;
			xmlTag = "RspnLvl";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "301"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseLevel";
			definition = "Indicates the level of response requested from the Receiver of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResponseLevel1Code.mmObject();
		}

		@Override
		public Optional<ResponseLevel1Code> getValue(Quote4 obj) {
			return obj.getResponseLevel();
		}

		@Override
		public void setValue(Quote4 obj, Optional<ResponseLevel1Code> value) {
			obj.setResponseLevel(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected QuoteType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteType1Code
	 * QuoteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmType
	 * SecuritiesQuoteVariable.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote4
	 * Quote4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote4, Optional<QuoteType1Code>> mmType = new MMMessageAttribute<Quote4, Optional<QuoteType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QuoteType1Code.mmObject();
		}

		@Override
		public Optional<QuoteType1Code> getValue(Quote4 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Quote4 obj, Optional<QuoteType1Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "QtOrgtr")
	protected PartyIdentification24Choice quoteOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification24Choice
	 * PartyIdentification24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote4
	 * Quote4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Originator of the quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote4, Optional<PartyIdentification24Choice>> mmQuoteOriginator = new MMMessageAttribute<Quote4, Optional<PartyIdentification24Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote4.mmObject();
			isDerived = false;
			xmlTag = "QtOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteOriginator";
			definition = "Originator of the quote.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification24Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification24Choice> getValue(Quote4 obj) {
			return obj.getQuoteOriginator();
		}

		@Override
		public void setValue(Quote4 obj, Optional<PartyIdentification24Choice> value) {
			obj.setQuoteOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "QtOrgtrRole")
	protected OriginatorRole1Code quoteOriginatorRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRole1Code
	 * OriginatorRole1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuoteOriginator#mmQuoteOriginatorType
	 * QuoteOriginator.mmQuoteOriginatorType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote4
	 * Quote4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtOrgtrRole"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteOriginatorRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in what capacity(role) the originator of the quote is acting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote4, Optional<OriginatorRole1Code>> mmQuoteOriginatorRole = new MMMessageAttribute<Quote4, Optional<OriginatorRole1Code>>() {
		{
			businessElementTrace_lazy = () -> QuoteOriginator.mmQuoteOriginatorType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote4.mmObject();
			isDerived = false;
			xmlTag = "QtOrgtrRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteOriginatorRole";
			definition = "Identifies in what capacity(role) the originator of the quote is acting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OriginatorRole1Code.mmObject();
		}

		@Override
		public Optional<OriginatorRole1Code> getValue(Quote4 obj) {
			return obj.getQuoteOriginatorRole();
		}

		@Override
		public void setValue(Quote4 obj, Optional<OriginatorRole1Code> value) {
			obj.setQuoteOriginatorRole(value.orElse(null));
		}
	};
	@XmlElement(name = "RqstrElgblty")
	protected Eligibility1Code requestorEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code
	 * Eligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuoteRequestor#mmRequestorEligibility
	 * QuoteRequestor.mmRequestorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote4
	 * Quote4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqstrElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the requestor of the quote is an elligible counterparty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote4, Optional<Eligibility1Code>> mmRequestorEligibility = new MMMessageAttribute<Quote4, Optional<Eligibility1Code>>() {
		{
			businessElementTrace_lazy = () -> QuoteRequestor.mmRequestorEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote4.mmObject();
			isDerived = false;
			xmlTag = "RqstrElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestorEligibility";
			definition = "Identifies if the requestor of the quote is an elligible counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligibility1Code.mmObject();
		}

		@Override
		public Optional<Eligibility1Code> getValue(Quote4 obj) {
			return obj.getRequestorEligibility();
		}

		@Override
		public void setValue(Quote4 obj, Optional<Eligibility1Code> value) {
			obj.setRequestorEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "QtChc", required = true)
	protected SingleOrMassQuote2Choice quoteChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SingleOrMassQuote2Choice
	 * SingleOrMassQuote2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote4
	 * Quote4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtChc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies which type of quote (single or mass) the message is to be used for."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Quote4, SingleOrMassQuote2Choice> mmQuoteChoice = new MMMessageAssociationEnd<Quote4, SingleOrMassQuote2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote4.mmObject();
			isDerived = false;
			xmlTag = "QtChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteChoice";
			definition = "Identifies which type of quote (single or mass) the message is to be used for.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SingleOrMassQuote2Choice.mmObject();
		}

		@Override
		public SingleOrMassQuote2Choice getValue(Quote4 obj) {
			return obj.getQuoteChoice();
		}

		@Override
		public void setValue(Quote4 obj, SingleOrMassQuote2Choice value) {
			obj.setQuoteChoice(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quote4.mmQuoteResponseType, com.tools20022.repository.msg.Quote4.mmResponseLevel, com.tools20022.repository.msg.Quote4.mmType,
						com.tools20022.repository.msg.Quote4.mmQuoteOriginator, com.tools20022.repository.msg.Quote4.mmQuoteOriginatorRole, com.tools20022.repository.msg.Quote4.mmRequestorEligibility,
						com.tools20022.repository.msg.Quote4.mmQuoteChoice);
				trace_lazy = () -> SecuritiesQuoteVariable.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintQuoteResponseTypeRule.forQuote4);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Quote4";
				definition = "Proposition of price for a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<QuoteResponseType1Code> getQuoteResponseType() {
		return quoteResponseType == null ? Optional.empty() : Optional.of(quoteResponseType);
	}

	public Quote4 setQuoteResponseType(QuoteResponseType1Code quoteResponseType) {
		this.quoteResponseType = quoteResponseType;
		return this;
	}

	public Optional<ResponseLevel1Code> getResponseLevel() {
		return responseLevel == null ? Optional.empty() : Optional.of(responseLevel);
	}

	public Quote4 setResponseLevel(ResponseLevel1Code responseLevel) {
		this.responseLevel = responseLevel;
		return this;
	}

	public Optional<QuoteType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public Quote4 setType(QuoteType1Code type) {
		this.type = type;
		return this;
	}

	public Optional<PartyIdentification24Choice> getQuoteOriginator() {
		return quoteOriginator == null ? Optional.empty() : Optional.of(quoteOriginator);
	}

	public Quote4 setQuoteOriginator(PartyIdentification24Choice quoteOriginator) {
		this.quoteOriginator = quoteOriginator;
		return this;
	}

	public Optional<OriginatorRole1Code> getQuoteOriginatorRole() {
		return quoteOriginatorRole == null ? Optional.empty() : Optional.of(quoteOriginatorRole);
	}

	public Quote4 setQuoteOriginatorRole(OriginatorRole1Code quoteOriginatorRole) {
		this.quoteOriginatorRole = quoteOriginatorRole;
		return this;
	}

	public Optional<Eligibility1Code> getRequestorEligibility() {
		return requestorEligibility == null ? Optional.empty() : Optional.of(requestorEligibility);
	}

	public Quote4 setRequestorEligibility(Eligibility1Code requestorEligibility) {
		this.requestorEligibility = requestorEligibility;
		return this;
	}

	public SingleOrMassQuote2Choice getQuoteChoice() {
		return quoteChoice;
	}

	public Quote4 setQuoteChoice(SingleOrMassQuote2Choice quoteChoice) {
		this.quoteChoice = Objects.requireNonNull(quoteChoice);
		return this;
	}
}