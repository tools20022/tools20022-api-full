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
import com.tools20022.repository.choice.PartyIdentification24Choice;
import com.tools20022.repository.choice.SingleOrMassQuote2Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.QuoteOriginator;
import com.tools20022.repository.entity.QuoteRequestor;
import com.tools20022.repository.entity.SecuritiesQuoteVariable;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Quote4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Proposition of price for a financial instrument."</li>
 * </ul>
 */
public class Quote4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected QuoteResponseType1Code quoteResponseType;
	/**
	 * Identifies the type of Quote Response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteResponseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of Quote Response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuoteResponseType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Quote4.mmObject();
			isDerived = false;
			xmlTag = "QtRspnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteResponseType";
			definition = "Identifies the type of Quote Response.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QuoteResponseType1Code.mmObject();
		}
	};
	protected ResponseLevel1Code responseLevel;
	/**
	 * Indicates the level of response requested from the Receiver of the
	 * message.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the level of response requested from the Receiver of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponseLevel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Quote4.mmObject();
			isDerived = false;
			xmlTag = "RspnLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseLevel";
			definition = "Indicates the level of response requested from the Receiver of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResponseLevel1Code.mmObject();
		}
	};
	protected QuoteType1Code type;
	/**
	 * Indicates the scenario in which the quote is (requested to be) used (ie,
	 * indicative, firm, restricted tradeable or counter).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmType;
			componentContext_lazy = () -> Quote4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QuoteType1Code.mmObject();
		}
	};
	protected PartyIdentification24Choice quoteOriginator;
	/**
	 * Originator of the quote.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Originator of the quote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuoteOriginator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Quote4.mmObject();
			isDerived = false;
			xmlTag = "QtOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteOriginator";
			definition = "Originator of the quote.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification24Choice.mmObject();
		}
	};
	protected OriginatorRole1Code quoteOriginatorRole;
	/**
	 * Identifies in what capacity(role) the originator of the quote is acting.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteOriginatorRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in what capacity(role) the originator of the quote is acting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuoteOriginatorRole = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> QuoteOriginator.mmQuoteOriginatorType;
			componentContext_lazy = () -> Quote4.mmObject();
			isDerived = false;
			xmlTag = "QtOrgtrRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteOriginatorRole";
			definition = "Identifies in what capacity(role) the originator of the quote is acting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OriginatorRole1Code.mmObject();
		}
	};
	protected Eligibility1Code requestorEligibility;
	/**
	 * Identifies if the requestor of the quote is an elligible counterparty.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the requestor of the quote is an elligible counterparty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestorEligibility = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> QuoteRequestor.mmRequestorEligibility;
			componentContext_lazy = () -> Quote4.mmObject();
			isDerived = false;
			xmlTag = "RqstrElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestorEligibility";
			definition = "Identifies if the requestor of the quote is an elligible counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligibility1Code.mmObject();
		}
	};
	protected SingleOrMassQuote2Choice quoteChoice;
	/**
	 * Identifies which type of quote (single or mass) the message is to be used
	 * for.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies which type of quote (single or mass) the message is to be used for."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuoteChoice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Quote4.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Quote4.mmQuoteResponseType, Quote4.mmResponseLevel, Quote4.mmType, Quote4.mmQuoteOriginator, Quote4.mmQuoteOriginatorRole, Quote4.mmRequestorEligibility, Quote4.mmQuoteChoice);
				trace_lazy = () -> SecuritiesQuoteVariable.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Quote4";
				definition = "Proposition of price for a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public QuoteResponseType1Code getQuoteResponseType() {
		return quoteResponseType;
	}

	public void setQuoteResponseType(QuoteResponseType1Code quoteResponseType) {
		this.quoteResponseType = quoteResponseType;
	}

	public ResponseLevel1Code getResponseLevel() {
		return responseLevel;
	}

	public void setResponseLevel(ResponseLevel1Code responseLevel) {
		this.responseLevel = responseLevel;
	}

	public QuoteType1Code getType() {
		return type;
	}

	public void setType(QuoteType1Code type) {
		this.type = type;
	}

	public PartyIdentification24Choice getQuoteOriginator() {
		return quoteOriginator;
	}

	public void setQuoteOriginator(PartyIdentification24Choice quoteOriginator) {
		this.quoteOriginator = quoteOriginator;
	}

	public OriginatorRole1Code getQuoteOriginatorRole() {
		return quoteOriginatorRole;
	}

	public void setQuoteOriginatorRole(OriginatorRole1Code quoteOriginatorRole) {
		this.quoteOriginatorRole = quoteOriginatorRole;
	}

	public Eligibility1Code getRequestorEligibility() {
		return requestorEligibility;
	}

	public void setRequestorEligibility(Eligibility1Code requestorEligibility) {
		this.requestorEligibility = requestorEligibility;
	}

	public SingleOrMassQuote2Choice getQuoteChoice() {
		return quoteChoice;
	}

	public void setQuoteChoice(SingleOrMassQuote2Choice quoteChoice) {
		this.quoteChoice = quoteChoice;
	}
}