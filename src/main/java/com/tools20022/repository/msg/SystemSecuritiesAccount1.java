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
import com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarketSpecificAttribute1;
import com.tools20022.repository.msg.SystemPartyIdentification3;
import com.tools20022.repository.msg.SystemRestriction1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account to or from which a securities entry is made.<br>
 * It holds information such as opening and closing date and whether it can hold
 * negative positions.<br>
 * Definition of the entity includes the default setting for holding of
 * settlement instructions involving positions related to the account.<br>
 * Set of MarketSpecificAttributes define specific properties for the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmAccountOwner
 * SystemSecuritiesAccount1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmIdentification
 * SystemSecuritiesAccount1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmType
 * SystemSecuritiesAccount1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmOpeningDate
 * SystemSecuritiesAccount1.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmClosingDate
 * SystemSecuritiesAccount1.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmHoldIndicator
 * SystemSecuritiesAccount1.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmNegativePosition
 * SystemSecuritiesAccount1.mmNegativePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmMarketSpecificAttribute
 * SystemSecuritiesAccount1.mmMarketSpecificAttribute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmRestriction
 * SystemSecuritiesAccount1.mmRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmEndInvestorFlag
 * SystemSecuritiesAccount1.mmEndInvestorFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1#mmPricingScheme
 * SystemSecuritiesAccount1.mmPricingScheme}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemSecuritiesAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account to or from which a securities entry is made.\r\nIt holds information such as opening and closing date and whether it can hold negative positions.\r\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\r\nSet of MarketSpecificAttributes define specific properties for the account."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemSecuritiesAccount1", propOrder = {"accountOwner", "identification", "type", "openingDate", "closingDate", "holdIndicator", "negativePosition", "marketSpecificAttribute", "restriction", "endInvestorFlag",
		"pricingScheme"})
public class SystemSecuritiesAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnr", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account to or from which a securities entry is made.\r\nIt holds information such as opening and closing date and whether it can hold negative positions.\r\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\r\nSet of MarketSpecificAttributes define specific properties for the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SystemSecuritiesAccount1, SystemPartyIdentification3> mmAccountOwner = new MMMessageAssociationEnd<SystemSecuritiesAccount1, SystemPartyIdentification3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Account to or from which a securities entry is made.\r\nIt holds information such as opening and closing date and whether it can hold negative positions.\r\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\r\nSet of MarketSpecificAttributes define specific properties for the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification3.mmObject();
		}

		@Override
		public SystemPartyIdentification3 getValue(SystemSecuritiesAccount1 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, SystemPartyIdentification3 value) {
			obj.setAccountOwner(value);
		}
	};
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemSecuritiesAccount1, Max35Text> mmIdentification = new MMMessageAttribute<SystemSecuritiesAccount1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SystemSecuritiesAccount1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected SystemSecuritiesAccountType1Code type;
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemSecuritiesAccount1, SystemSecuritiesAccountType1Code> mmType = new MMMessageAttribute<SystemSecuritiesAccount1, SystemSecuritiesAccountType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of the securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}

		@Override
		public SystemSecuritiesAccountType1Code getValue(SystemSecuritiesAccount1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, SystemSecuritiesAccountType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "OpngDt", required = true)
	protected ISODate openingDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemSecuritiesAccount1, ISODate> mmOpeningDate = new MMMessageAttribute<SystemSecuritiesAccount1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Legal opening date for the securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(SystemSecuritiesAccount1 obj) {
			return obj.getOpeningDate();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, ISODate value) {
			obj.setOpeningDate(value);
		}
	};
	@XmlElement(name = "ClsgDt")
	protected ISODate closingDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemSecuritiesAccount1, Optional<ISODate>> mmClosingDate = new MMMessageAttribute<SystemSecuritiesAccount1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Legal closing date for the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SystemSecuritiesAccount1 obj) {
			return obj.getClosingDate();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, Optional<ISODate> value) {
			obj.setClosingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "HldInd", required = true)
	protected TrueFalseIndicator holdIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meaning when true: Account is in Hold status.\r\nMeaning when false: Account is in Release status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemSecuritiesAccount1, TrueFalseIndicator> mmHoldIndicator = new MMMessageAttribute<SystemSecuritiesAccount1, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Meaning when true: Account is in Hold status.\r\nMeaning when false: Account is in Release status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(SystemSecuritiesAccount1 obj) {
			return obj.getHoldIndicator();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, TrueFalseIndicator value) {
			obj.setHoldIndicator(value);
		}
	};
	@XmlElement(name = "NegPos", required = true)
	protected YesNoIndicator negativePosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NegPos"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegativePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the securities account can hold a negative position in a security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemSecuritiesAccount1, YesNoIndicator> mmNegativePosition = new MMMessageAttribute<SystemSecuritiesAccount1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "NegPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegativePosition";
			definition = "Specifies whether the securities account can hold a negative position in a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SystemSecuritiesAccount1 obj) {
			return obj.getNegativePosition();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, YesNoIndicator value) {
			obj.setNegativePosition(value);
		}
	};
	@XmlElement(name = "MktSpcfcAttr")
	protected List<MarketSpecificAttribute1> marketSpecificAttribute;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MarketSpecificAttribute1
	 * MarketSpecificAttribute1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktSpcfcAttr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketSpecificAttribute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional attributes defined by a central security depositary for a party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SystemSecuritiesAccount1, List<MarketSpecificAttribute1>> mmMarketSpecificAttribute = new MMMessageAssociationEnd<SystemSecuritiesAccount1, List<MarketSpecificAttribute1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "MktSpcfcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketSpecificAttribute";
			definition = "Additional attributes defined by a central security depositary for a party.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketSpecificAttribute1.mmObject();
		}

		@Override
		public List<MarketSpecificAttribute1> getValue(SystemSecuritiesAccount1 obj) {
			return obj.getMarketSpecificAttribute();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, List<MarketSpecificAttribute1> value) {
			obj.setMarketSpecificAttribute(value);
		}
	};
	@XmlElement(name = "Rstrctn")
	protected List<SystemRestriction1> restriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemRestriction1
	 * SystemRestriction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the specific processing characteristics for a securities account to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SystemSecuritiesAccount1, List<SystemRestriction1>> mmRestriction = new MMMessageAssociationEnd<SystemSecuritiesAccount1, List<SystemRestriction1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Defines the specific processing characteristics for a securities account to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemRestriction1.mmObject();
		}

		@Override
		public List<SystemRestriction1> getValue(SystemSecuritiesAccount1 obj) {
			return obj.getRestriction();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, List<SystemRestriction1> value) {
			obj.setRestriction(value);
		}
	};
	@XmlElement(name = "EndInvstrFlg", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemSecuritiesAccount1, Exact4AlphaNumericText> mmEndInvestorFlag = new MMMessageAttribute<SystemSecuritiesAccount1, Exact4AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "EndInvstrFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndInvestorFlag";
			definition = "Specifies information to identify securities accounts where allocation instructions are posted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}

		@Override
		public Exact4AlphaNumericText getValue(SystemSecuritiesAccount1 obj) {
			return obj.getEndInvestorFlag();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, Exact4AlphaNumericText value) {
			obj.setEndInvestorFlag(value);
		}
	};
	@XmlElement(name = "PricgSchme", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount1
	 * SystemSecuritiesAccount1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemSecuritiesAccount1, Exact4AlphaNumericText> mmPricingScheme = new MMMessageAttribute<SystemSecuritiesAccount1, Exact4AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "PricgSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingScheme";
			definition = "Defines how the price is applied to the securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}

		@Override
		public Exact4AlphaNumericText getValue(SystemSecuritiesAccount1 obj) {
			return obj.getPricingScheme();
		}

		@Override
		public void setValue(SystemSecuritiesAccount1 obj, Exact4AlphaNumericText value) {
			obj.setPricingScheme(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemSecuritiesAccount1.mmAccountOwner, com.tools20022.repository.msg.SystemSecuritiesAccount1.mmIdentification,
						com.tools20022.repository.msg.SystemSecuritiesAccount1.mmType, com.tools20022.repository.msg.SystemSecuritiesAccount1.mmOpeningDate, com.tools20022.repository.msg.SystemSecuritiesAccount1.mmClosingDate,
						com.tools20022.repository.msg.SystemSecuritiesAccount1.mmHoldIndicator, com.tools20022.repository.msg.SystemSecuritiesAccount1.mmNegativePosition,
						com.tools20022.repository.msg.SystemSecuritiesAccount1.mmMarketSpecificAttribute, com.tools20022.repository.msg.SystemSecuritiesAccount1.mmRestriction,
						com.tools20022.repository.msg.SystemSecuritiesAccount1.mmEndInvestorFlag, com.tools20022.repository.msg.SystemSecuritiesAccount1.mmPricingScheme);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemSecuritiesAccount1";
				definition = "Account to or from which a securities entry is made.\r\nIt holds information such as opening and closing date and whether it can hold negative positions.\r\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\r\nSet of MarketSpecificAttributes define specific properties for the account.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemPartyIdentification3 getAccountOwner() {
		return accountOwner;
	}

	public SystemSecuritiesAccount1 setAccountOwner(SystemPartyIdentification3 accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public SystemSecuritiesAccount1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public SystemSecuritiesAccountType1Code getType() {
		return type;
	}

	public SystemSecuritiesAccount1 setType(SystemSecuritiesAccountType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ISODate getOpeningDate() {
		return openingDate;
	}

	public SystemSecuritiesAccount1 setOpeningDate(ISODate openingDate) {
		this.openingDate = Objects.requireNonNull(openingDate);
		return this;
	}

	public Optional<ISODate> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public SystemSecuritiesAccount1 setClosingDate(ISODate closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public TrueFalseIndicator getHoldIndicator() {
		return holdIndicator;
	}

	public SystemSecuritiesAccount1 setHoldIndicator(TrueFalseIndicator holdIndicator) {
		this.holdIndicator = Objects.requireNonNull(holdIndicator);
		return this;
	}

	public YesNoIndicator getNegativePosition() {
		return negativePosition;
	}

	public SystemSecuritiesAccount1 setNegativePosition(YesNoIndicator negativePosition) {
		this.negativePosition = Objects.requireNonNull(negativePosition);
		return this;
	}

	public List<MarketSpecificAttribute1> getMarketSpecificAttribute() {
		return marketSpecificAttribute == null ? marketSpecificAttribute = new ArrayList<>() : marketSpecificAttribute;
	}

	public SystemSecuritiesAccount1 setMarketSpecificAttribute(List<MarketSpecificAttribute1> marketSpecificAttribute) {
		this.marketSpecificAttribute = Objects.requireNonNull(marketSpecificAttribute);
		return this;
	}

	public List<SystemRestriction1> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public SystemSecuritiesAccount1 setRestriction(List<SystemRestriction1> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public Exact4AlphaNumericText getEndInvestorFlag() {
		return endInvestorFlag;
	}

	public SystemSecuritiesAccount1 setEndInvestorFlag(Exact4AlphaNumericText endInvestorFlag) {
		this.endInvestorFlag = Objects.requireNonNull(endInvestorFlag);
		return this;
	}

	public Exact4AlphaNumericText getPricingScheme() {
		return pricingScheme;
	}

	public SystemSecuritiesAccount1 setPricingScheme(Exact4AlphaNumericText pricingScheme) {
		this.pricingScheme = Objects.requireNonNull(pricingScheme);
		return this;
	}
}