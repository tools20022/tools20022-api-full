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
 * "Return criteria for information to be returned in the report deriving from a query about securities account reference data."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1
 * SecuritiesAccountReturnCriteria1}</li>
 * </ul>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1#mmAccountIdentification
	 * SecuritiesAccountReturnCriteria1.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>> mmAccountIdentification = new MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Indicates whether the identification of the account is requested.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(SecuritiesAccountReturnCriteria obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(SecuritiesAccountReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setAccountIdentification(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1#mmPartyIdentification
	 * SecuritiesAccountReturnCriteria1.mmPartyIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>> mmPartyIdentification = new MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Indicates whether the identification of the party owning the account is requested.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmPartyIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(SecuritiesAccountReturnCriteria obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(SecuritiesAccountReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setPartyIdentification(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1#mmPartyType
	 * SecuritiesAccountReturnCriteria1.mmPartyType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>> mmPartyType = new MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "PtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyType";
			definition = "Indicates whether the type of the party owning the account is requested.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmPartyType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(SecuritiesAccountReturnCriteria obj) {
			return obj.getPartyType();
		}

		@Override
		public void setValue(SecuritiesAccountReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setPartyType(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1#mmAccountServicer
	 * SecuritiesAccountReturnCriteria1.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>> mmAccountServicer = new MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Indicates whether the account servicer is requested.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(SecuritiesAccountReturnCriteria obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(SecuritiesAccountReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setAccountServicer(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1#mmAccountType
	 * SecuritiesAccountReturnCriteria1.mmAccountType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>> mmAccountType = new MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Indicates whether the account type is requested.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmAccountType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(SecuritiesAccountReturnCriteria obj) {
			return obj.getAccountType();
		}

		@Override
		public void setValue(SecuritiesAccountReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setAccountType(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1#mmOpeningDate
	 * SecuritiesAccountReturnCriteria1.mmOpeningDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>> mmOpeningDate = new MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Indicates whether the opening date for the account is requested.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmOpeningDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(SecuritiesAccountReturnCriteria obj) {
			return obj.getOpeningDate();
		}

		@Override
		public void setValue(SecuritiesAccountReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setOpeningDate(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1#mmClosingDate
	 * SecuritiesAccountReturnCriteria1.mmClosingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>> mmClosingDate = new MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Indicates whether the closing date for the account is requested.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmClosingDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(SecuritiesAccountReturnCriteria obj) {
			return obj.getClosingDate();
		}

		@Override
		public void setValue(SecuritiesAccountReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setClosingDate(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1#mmEndInvestorFlag
	 * SecuritiesAccountReturnCriteria1.mmEndInvestorFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>> mmEndInvestorFlag = new MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "EndInvstrFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndInvestorFlag";
			definition = "Specifies information to identify securities accounts where allocation instructions are posted.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmEndInvestorFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(SecuritiesAccountReturnCriteria obj) {
			return obj.getEndInvestorFlag();
		}

		@Override
		public void setValue(SecuritiesAccountReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setEndInvestorFlag(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReturnCriteria1#mmPricingScheme
	 * SecuritiesAccountReturnCriteria1.mmPricingScheme}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>> mmPricingScheme = new MMMessageAttribute<SecuritiesAccountReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "PricgSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingScheme";
			definition = "Defines how the price is applied to the securities account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmPricingScheme);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(SecuritiesAccountReturnCriteria obj) {
			return obj.getPricingScheme();
		}

		@Override
		public void setValue(SecuritiesAccountReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setPricingScheme(value.orElse(null));
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
				definition = "Return criteria for information to be returned in the report deriving from a query about securities account reference data.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReturnCriteria1.mmObject());
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