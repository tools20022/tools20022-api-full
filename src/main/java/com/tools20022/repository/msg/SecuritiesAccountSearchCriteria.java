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
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.codeset.SystemPartyType1Code;
import com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SystemPartyIdentification3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of search criteria for querying securties account reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria#mmAccountIdentification
 * SecuritiesAccountSearchCriteria.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria#mmAccountServicer
 * SecuritiesAccountSearchCriteria.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria#mmAccountOwner
 * SecuritiesAccountSearchCriteria.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria#mmPartyType
 * SecuritiesAccountSearchCriteria.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria#mmOpeningDate
 * SecuritiesAccountSearchCriteria.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria#mmClosingDate
 * SecuritiesAccountSearchCriteria.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria#mmAccountType
 * SecuritiesAccountSearchCriteria.mmAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria#mmEndInvestorFlag
 * SecuritiesAccountSearchCriteria.mmEndInvestorFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria#mmPricingScheme
 * SecuritiesAccountSearchCriteria.mmPricingScheme}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccountSearchCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of search criteria for querying securties account reference data."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1
 * SecuritiesAccountSearchCriteria1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountSearchCriteria", propOrder = {"accountIdentification", "accountServicer", "accountOwner", "partyType", "openingDate", "closingDate", "accountType", "endInvestorFlag", "pricingScheme"})
public class SecuritiesAccountSearchCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected Max35Text accountIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria
	 * SecuritiesAccountSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1#mmAccountIdentification
	 * SecuritiesAccountSearchCriteria1.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<Max35Text>> mmAccountIdentification = new MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesAccountSearchCriteria obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(SecuritiesAccountSearchCriteria obj, Optional<Max35Text> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BICFIIdentifier accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria
	 * SecuritiesAccountSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that services the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1#mmAccountServicer
	 * SecuritiesAccountSearchCriteria1.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<BICFIIdentifier>> mmAccountServicer = new MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<BICFIIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that services the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}

		@Override
		public Optional<BICFIIdentifier> getValue(SecuritiesAccountSearchCriteria obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(SecuritiesAccountSearchCriteria obj, Optional<BICFIIdentifier> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected SystemPartyIdentification3 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3
	 * SystemPartyIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria
	 * SecuritiesAccountSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1#mmAccountOwner
	 * SecuritiesAccountSearchCriteria1.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountSearchCriteria, Optional<SystemPartyIdentification3>> mmAccountOwner = new MMMessageAssociationEnd<SecuritiesAccountSearchCriteria, Optional<SystemPartyIdentification3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification3.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification3> getValue(SecuritiesAccountSearchCriteria obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SecuritiesAccountSearchCriteria obj, Optional<SystemPartyIdentification3> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "PtyTp")
	protected SystemPartyType1Code partyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code
	 * SystemPartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria
	 * SecuritiesAccountSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the party for which securities account data have been queried."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1#mmPartyType
	 * SecuritiesAccountSearchCriteria1.mmPartyType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<SystemPartyType1Code>> mmPartyType = new MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<SystemPartyType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "PtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of the party for which securities account data have been queried.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmPartyType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SystemPartyType1Code.mmObject();
		}

		@Override
		public Optional<SystemPartyType1Code> getValue(SecuritiesAccountSearchCriteria obj) {
			return obj.getPartyType();
		}

		@Override
		public void setValue(SecuritiesAccountSearchCriteria obj, Optional<SystemPartyType1Code> value) {
			obj.setPartyType(value.orElse(null));
		}
	};
	@XmlElement(name = "OpngDt")
	protected DateSearchChoice openingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria
	 * SecuritiesAccountSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal opening date for the securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1#mmOpeningDate
	 * SecuritiesAccountSearchCriteria1.mmOpeningDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<DateSearchChoice>> mmOpeningDate = new MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Legal opening date for the securities account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmOpeningDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(SecuritiesAccountSearchCriteria obj) {
			return obj.getOpeningDate();
		}

		@Override
		public void setValue(SecuritiesAccountSearchCriteria obj, Optional<DateSearchChoice> value) {
			obj.setOpeningDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgDt")
	protected DateSearchChoice closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria
	 * SecuritiesAccountSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal closing date for the securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1#mmClosingDate
	 * SecuritiesAccountSearchCriteria1.mmClosingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<DateSearchChoice>> mmClosingDate = new MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Legal closing date for the securities account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmClosingDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(SecuritiesAccountSearchCriteria obj) {
			return obj.getClosingDate();
		}

		@Override
		public void setValue(SecuritiesAccountSearchCriteria obj, Optional<DateSearchChoice> value) {
			obj.setClosingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctTp")
	protected SystemSecuritiesAccountType1Code accountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code
	 * SystemSecuritiesAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria
	 * SecuritiesAccountSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1#mmAccountType
	 * SecuritiesAccountSearchCriteria1.mmAccountType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<SystemSecuritiesAccountType1Code>> mmAccountType = new MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<SystemSecuritiesAccountType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Specifies the type of securities account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmAccountType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}

		@Override
		public Optional<SystemSecuritiesAccountType1Code> getValue(SecuritiesAccountSearchCriteria obj) {
			return obj.getAccountType();
		}

		@Override
		public void setValue(SecuritiesAccountSearchCriteria obj, Optional<SystemSecuritiesAccountType1Code> value) {
			obj.setAccountType(value.orElse(null));
		}
	};
	@XmlElement(name = "EndInvstrFlg")
	protected Exact4AlphaNumericText endInvestorFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria
	 * SecuritiesAccountSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndInvstrFlg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndInvestorFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information to identify securities accounts where allocation instructions are posted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1#mmEndInvestorFlag
	 * SecuritiesAccountSearchCriteria1.mmEndInvestorFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<Exact4AlphaNumericText>> mmEndInvestorFlag = new MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<Exact4AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "EndInvstrFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndInvestorFlag";
			definition = "Specifies information to identify securities accounts where allocation instructions are posted.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmEndInvestorFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact4AlphaNumericText> getValue(SecuritiesAccountSearchCriteria obj) {
			return obj.getEndInvestorFlag();
		}

		@Override
		public void setValue(SecuritiesAccountSearchCriteria obj, Optional<Exact4AlphaNumericText> value) {
			obj.setEndInvestorFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "PricgSchme")
	protected Exact4AlphaNumericText pricingScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria
	 * SecuritiesAccountSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricgSchme"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines how the price is applied to the securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountSearchCriteria1#mmPricingScheme
	 * SecuritiesAccountSearchCriteria1.mmPricingScheme}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<Exact4AlphaNumericText>> mmPricingScheme = new MMMessageAttribute<SecuritiesAccountSearchCriteria, Optional<Exact4AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "PricgSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingScheme";
			definition = "Defines how the price is applied to the securities account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmPricingScheme);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact4AlphaNumericText> getValue(SecuritiesAccountSearchCriteria obj) {
			return obj.getPricingScheme();
		}

		@Override
		public void setValue(SecuritiesAccountSearchCriteria obj, Optional<Exact4AlphaNumericText> value) {
			obj.setPricingScheme(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmAccountIdentification, com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmAccountServicer,
						com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmAccountOwner, com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmPartyType,
						com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmOpeningDate, com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmClosingDate,
						com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmAccountType, com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmEndInvestorFlag,
						com.tools20022.repository.msg.SecuritiesAccountSearchCriteria.mmPricingScheme);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountSearchCriteria";
				definition = "Set of search criteria for querying securties account reference data.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountSearchCriteria1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public SecuritiesAccountSearchCriteria setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<BICFIIdentifier> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public SecuritiesAccountSearchCriteria setAccountServicer(BICFIIdentifier accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<SystemPartyIdentification3> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesAccountSearchCriteria setAccountOwner(SystemPartyIdentification3 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<SystemPartyType1Code> getPartyType() {
		return partyType == null ? Optional.empty() : Optional.of(partyType);
	}

	public SecuritiesAccountSearchCriteria setPartyType(SystemPartyType1Code partyType) {
		this.partyType = partyType;
		return this;
	}

	public Optional<DateSearchChoice> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public SecuritiesAccountSearchCriteria setOpeningDate(DateSearchChoice openingDate) {
		this.openingDate = openingDate;
		return this;
	}

	public Optional<DateSearchChoice> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public SecuritiesAccountSearchCriteria setClosingDate(DateSearchChoice closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<SystemSecuritiesAccountType1Code> getAccountType() {
		return accountType == null ? Optional.empty() : Optional.of(accountType);
	}

	public SecuritiesAccountSearchCriteria setAccountType(SystemSecuritiesAccountType1Code accountType) {
		this.accountType = accountType;
		return this;
	}

	public Optional<Exact4AlphaNumericText> getEndInvestorFlag() {
		return endInvestorFlag == null ? Optional.empty() : Optional.of(endInvestorFlag);
	}

	public SecuritiesAccountSearchCriteria setEndInvestorFlag(Exact4AlphaNumericText endInvestorFlag) {
		this.endInvestorFlag = endInvestorFlag;
		return this;
	}

	public Optional<Exact4AlphaNumericText> getPricingScheme() {
		return pricingScheme == null ? Optional.empty() : Optional.of(pricingScheme);
	}

	public SecuritiesAccountSearchCriteria setPricingScheme(Exact4AlphaNumericText pricingScheme) {
		this.pricingScheme = pricingScheme;
		return this;
	}
}