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
import com.tools20022.repository.codeset.SystemPartyType1Code;
import com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code;
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
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
 * Set of market specific attributes define specific properties for the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmOpeningDate
 * SystemSecuritiesAccount3.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmClosingDate
 * SystemSecuritiesAccount3.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmHoldIndicator
 * SystemSecuritiesAccount3.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmNegativePosition
 * SystemSecuritiesAccount3.mmNegativePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmType
 * SystemSecuritiesAccount3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmAccountOwner
 * SystemSecuritiesAccount3.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmPartyType
 * SystemSecuritiesAccount3.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmMarketSpecificAttribute
 * SystemSecuritiesAccount3.mmMarketSpecificAttribute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmRestriction
 * SystemSecuritiesAccount3.mmRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmEndInvestorFlag
 * SystemSecuritiesAccount3.mmEndInvestorFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3#mmPricingScheme
 * SystemSecuritiesAccount3.mmPricingScheme}</li>
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
 * "SystemSecuritiesAccount3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account to or from which a securities entry is made.\r\nIt holds information such as opening and closing date and whether it can hold negative positions.\r\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\r\nSet of market specific attributes define specific properties for the account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemSecuritiesAccount3", propOrder = {"openingDate", "closingDate", "holdIndicator", "negativePosition", "type", "accountOwner", "partyType", "marketSpecificAttribute", "restriction", "endInvestorFlag", "pricingScheme"})
public class SystemSecuritiesAccount3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OpngDt")
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
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
	 * definition} = "Legal opening date for the securities account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Legal opening date for the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
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
	 * definition} = "Legal closing date for the securities account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Legal closing date for the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "HldInd")
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meaning when true: Account is in Hold status.\r\nMeaning when false: Account is in Release status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Meaning when true: Account is in Hold status.\r\nMeaning when false: Account is in Release status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "NegPos")
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NegPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegativePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the securities account can hold a negative position in a security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNegativePosition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "NegPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegativePosition";
			definition = "Specifies whether the securities account can hold a negative position in a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "Tp")
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
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
	 * definition} = "Specifies the type of the securities account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
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
	 * definition} = "Specifies the type of the party owning the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "PtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of the party owning the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SystemPartyType1Code.mmObject();
		}
	};
	@XmlElement(name = "MktSpcfcAttr")
	protected List<com.tools20022.repository.msg.MarketSpecificAttribute1> marketSpecificAttribute;
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktSpcfcAttr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketSpecificAttribute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional attributes defined by a central security depositary for a party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarketSpecificAttribute = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "MktSpcfcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketSpecificAttribute";
			definition = "Additional attributes defined by a central security depositary for a party.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketSpecificAttribute1.mmObject();
		}
	};
	@XmlElement(name = "Rstrctn")
	protected List<com.tools20022.repository.msg.SystemRestriction1> restriction;
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the specific processing characteristics for a securities account to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRestriction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Defines the specific processing characteristics for a securities account to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemRestriction1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "EndInvstrFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndInvestorFlag";
			definition = "Specifies information to identify securities accounts where allocation instructions are posted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount3
	 * SystemSecuritiesAccount3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemSecuritiesAccount3.mmObject();
			isDerived = false;
			xmlTag = "PricgSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingScheme";
			definition = "Defines how the price is applied to the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemSecuritiesAccount3.mmOpeningDate, com.tools20022.repository.msg.SystemSecuritiesAccount3.mmClosingDate,
						com.tools20022.repository.msg.SystemSecuritiesAccount3.mmHoldIndicator, com.tools20022.repository.msg.SystemSecuritiesAccount3.mmNegativePosition, com.tools20022.repository.msg.SystemSecuritiesAccount3.mmType,
						com.tools20022.repository.msg.SystemSecuritiesAccount3.mmAccountOwner, com.tools20022.repository.msg.SystemSecuritiesAccount3.mmPartyType,
						com.tools20022.repository.msg.SystemSecuritiesAccount3.mmMarketSpecificAttribute, com.tools20022.repository.msg.SystemSecuritiesAccount3.mmRestriction,
						com.tools20022.repository.msg.SystemSecuritiesAccount3.mmEndInvestorFlag, com.tools20022.repository.msg.SystemSecuritiesAccount3.mmPricingScheme);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemSecuritiesAccount3";
				definition = "Account to or from which a securities entry is made.\r\nIt holds information such as opening and closing date and whether it can hold negative positions.\r\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\r\nSet of market specific attributes define specific properties for the account.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public SystemSecuritiesAccount3 setOpeningDate(ISODate openingDate) {
		this.openingDate = openingDate;
		return this;
	}

	public Optional<ISODate> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public SystemSecuritiesAccount3 setClosingDate(ISODate closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<TrueFalseIndicator> getHoldIndicator() {
		return holdIndicator == null ? Optional.empty() : Optional.of(holdIndicator);
	}

	public SystemSecuritiesAccount3 setHoldIndicator(TrueFalseIndicator holdIndicator) {
		this.holdIndicator = holdIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getNegativePosition() {
		return negativePosition == null ? Optional.empty() : Optional.of(negativePosition);
	}

	public SystemSecuritiesAccount3 setNegativePosition(YesNoIndicator negativePosition) {
		this.negativePosition = negativePosition;
		return this;
	}

	public Optional<SystemSecuritiesAccountType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public SystemSecuritiesAccount3 setType(SystemSecuritiesAccountType1Code type) {
		this.type = type;
		return this;
	}

	public SystemPartyIdentification3 getAccountOwner() {
		return accountOwner;
	}

	public SystemSecuritiesAccount3 setAccountOwner(com.tools20022.repository.msg.SystemPartyIdentification3 accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public Optional<SystemPartyType1Code> getPartyType() {
		return partyType == null ? Optional.empty() : Optional.of(partyType);
	}

	public SystemSecuritiesAccount3 setPartyType(SystemPartyType1Code partyType) {
		this.partyType = partyType;
		return this;
	}

	public List<MarketSpecificAttribute1> getMarketSpecificAttribute() {
		return marketSpecificAttribute == null ? marketSpecificAttribute = new ArrayList<>() : marketSpecificAttribute;
	}

	public SystemSecuritiesAccount3 setMarketSpecificAttribute(List<com.tools20022.repository.msg.MarketSpecificAttribute1> marketSpecificAttribute) {
		this.marketSpecificAttribute = Objects.requireNonNull(marketSpecificAttribute);
		return this;
	}

	public List<SystemRestriction1> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public SystemSecuritiesAccount3 setRestriction(List<com.tools20022.repository.msg.SystemRestriction1> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public Optional<Exact4AlphaNumericText> getEndInvestorFlag() {
		return endInvestorFlag == null ? Optional.empty() : Optional.of(endInvestorFlag);
	}

	public SystemSecuritiesAccount3 setEndInvestorFlag(Exact4AlphaNumericText endInvestorFlag) {
		this.endInvestorFlag = endInvestorFlag;
		return this;
	}

	public Optional<Exact4AlphaNumericText> getPricingScheme() {
		return pricingScheme == null ? Optional.empty() : Optional.of(pricingScheme);
	}

	public SystemSecuritiesAccount3 setPricingScheme(Exact4AlphaNumericText pricingScheme) {
		this.pricingScheme = pricingScheme;
		return this;
	}
}