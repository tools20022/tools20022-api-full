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
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Return criteria for information to be returned in the report deriving from a
 * query about securities account reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria#mmAccountIdentification
 * SecuritiesAccountReturnCriteria.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria#mmPartyIdentification
 * SecuritiesAccountReturnCriteria.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria#mmPartyType
 * SecuritiesAccountReturnCriteria.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria#mmAccountServicer
 * SecuritiesAccountReturnCriteria.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria#mmAccountType
 * SecuritiesAccountReturnCriteria.mmAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria#mmOpeningDate
 * SecuritiesAccountReturnCriteria.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria#mmClosingDate
 * SecuritiesAccountReturnCriteria.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria#mmEndInvestorFlag
 * SecuritiesAccountReturnCriteria.mmEndInvestorFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria#mmPricingScheme
 * SecuritiesAccountReturnCriteria.mmPricingScheme}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccountReturnCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Return criteria for information to be returned in the report deriving from a query about securities account reference data. "
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountReturnCriteria", propOrder = {"accountIdentification", "partyIdentification", "partyType", "accountServicer", "accountType", "openingDate", "closingDate", "endInvestorFlag", "pricingScheme"})
public class SecuritiesAccountReturnCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected RequestedIndicator accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria
	 * SecuritiesAccountReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the identification of the account is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Indicates whether the identification of the account is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "PtyId")
	protected RequestedIndicator partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria
	 * SecuritiesAccountReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the identification of the party owning the account is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Indicates whether the identification of the party owning the account is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "PtyTp")
	protected RequestedIndicator partyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria
	 * SecuritiesAccountReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the type of the party owning the account is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "PtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyType";
			definition = "Indicates whether the type of the party owning the account is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected RequestedIndicator accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria
	 * SecuritiesAccountReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account servicer is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Indicates whether the account servicer is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "AcctTp")
	protected RequestedIndicator accountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria
	 * SecuritiesAccountReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Indicates whether the account type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "OpngDt")
	protected RequestedIndicator openingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria
	 * SecuritiesAccountReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the opening date for the account is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Indicates whether the opening date for the account is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "ClsgDt")
	protected RequestedIndicator closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria
	 * SecuritiesAccountReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the closing date for the account is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Indicates whether the closing date for the account is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "EndInvstrFlg")
	protected RequestedIndicator endInvestorFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria
	 * SecuritiesAccountReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndInvstrFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndInvestorFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information to identify securities accounts where allocation instructions are posted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndInvestorFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "EndInvstrFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndInvestorFlag";
			definition = "Specifies information to identify securities accounts where allocation instructions are posted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "PricgSchme")
	protected RequestedIndicator pricingScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria
	 * SecuritiesAccountReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricgSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines how the price is applied to the securities account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPricingScheme = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "PricgSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingScheme";
			definition = "Defines how the price is applied to the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmAccountIdentification, com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmPartyIdentification,
						com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmPartyType, com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmAccountServicer,
						com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmAccountType, com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmOpeningDate,
						com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmClosingDate, com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmEndInvestorFlag,
						com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmPricingScheme);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountReturnCriteria";
				definition = "Return criteria for information to be returned in the report deriving from a query about securities account reference data. ";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public SecuritiesAccountReturnCriteria setAccountIdentification(RequestedIndicator accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<RequestedIndicator> getPartyIdentification() {
		return partyIdentification == null ? Optional.empty() : Optional.of(partyIdentification);
	}

	public SecuritiesAccountReturnCriteria setPartyIdentification(RequestedIndicator partyIdentification) {
		this.partyIdentification = partyIdentification;
		return this;
	}

	public Optional<RequestedIndicator> getPartyType() {
		return partyType == null ? Optional.empty() : Optional.of(partyType);
	}

	public SecuritiesAccountReturnCriteria setPartyType(RequestedIndicator partyType) {
		this.partyType = partyType;
		return this;
	}

	public Optional<RequestedIndicator> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public SecuritiesAccountReturnCriteria setAccountServicer(RequestedIndicator accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<RequestedIndicator> getAccountType() {
		return accountType == null ? Optional.empty() : Optional.of(accountType);
	}

	public SecuritiesAccountReturnCriteria setAccountType(RequestedIndicator accountType) {
		this.accountType = accountType;
		return this;
	}

	public Optional<RequestedIndicator> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public SecuritiesAccountReturnCriteria setOpeningDate(RequestedIndicator openingDate) {
		this.openingDate = openingDate;
		return this;
	}

	public Optional<RequestedIndicator> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public SecuritiesAccountReturnCriteria setClosingDate(RequestedIndicator closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<RequestedIndicator> getEndInvestorFlag() {
		return endInvestorFlag == null ? Optional.empty() : Optional.of(endInvestorFlag);
	}

	public SecuritiesAccountReturnCriteria setEndInvestorFlag(RequestedIndicator endInvestorFlag) {
		this.endInvestorFlag = endInvestorFlag;
		return this;
	}

	public Optional<RequestedIndicator> getPricingScheme() {
		return pricingScheme == null ? Optional.empty() : Optional.of(pricingScheme);
	}

	public SecuritiesAccountReturnCriteria setPricingScheme(RequestedIndicator pricingScheme) {
		this.pricingScheme = pricingScheme;
		return this;
	}
}