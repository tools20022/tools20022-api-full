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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemSecuritiesAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account to or from which a securities entry is made.\r\nIt holds information such as opening and closing date and whether it can hold negative positions.\r\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\r\nSet of MarketSpecificAttributes define specific properties for the account."
 * </li>
 * </ul>
 */
public class SystemSecuritiesAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemPartyIdentification3 accountOwner;
	/**
	 * Account to or from which a securities entry is made.<br>
	 * It holds information such as opening and closing date and whether it can
	 * hold negative positions.<br>
	 * Definition of the entity includes the default setting for holding of
	 * settlement instructions involving positions related to the account.<br>
	 * Set of MarketSpecificAttributes define specific properties for the
	 * account.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account to or from which a securities entry is made.\r\nIt holds information such as opening and closing date and whether it can hold negative positions.\r\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\r\nSet of MarketSpecificAttributes define specific properties for the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Account to or from which a securities entry is made.\r\nIt holds information such as opening and closing date and whether it can hold negative positions.\r\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\r\nSet of MarketSpecificAttributes define specific properties for the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification3.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SystemSecuritiesAccountType1Code type;
	/**
	 * Specifies the type of the securities account.
	 * <p>
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
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of the securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}
	};
	protected ISODate openingDate;
	/**
	 * Legal opening date for the securities account.
	 * <p>
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
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Legal opening date for the securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate closingDate;
	/**
	 * Legal closing date for the securities account.
	 * <p>
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
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
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
	protected TrueFalseIndicator holdIndicator;
	/**
	 * Meaning when true : Account is in Hold status.<br>
	 * Meaning when false : Account is in Release status.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meaning when true : Account is in Hold status.\r\nMeaning when false : Account is in Release status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Meaning when true : Account is in Hold status.\r\nMeaning when false : Account is in Release status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected YesNoIndicator negativePosition;
	/**
	 * Specifies whether the securities account can hold a negative position in
	 * a security.
	 * <p>
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
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "NegPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegativePosition";
			definition = "Specifies whether the securities account can hold a negative position in a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.MarketSpecificAttribute1> marketSpecificAttribute;
	/**
	 * Additional attributes defined by a central security depositary for a
	 * party.
	 * <p>
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
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
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
	protected List<com.tools20022.repository.msg.SystemRestriction1> restriction;
	/**
	 * Defines the specific processing characteristics for a securities account
	 * to ensure configurability of specific requirements, as prescribed by
	 * national legal and regulatory requirements and practices.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the specific processing characteristics for a securities account  to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRestriction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Defines the specific processing characteristics for a securities account  to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemRestriction1.mmObject();
		}
	};
	protected Exact4AlphaNumericText endInvestorFlag;
	/**
	 * Specifies information to identify securities accounts where allocation
	 * instructions are posted.
	 * <p>
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
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "EndInvstrFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndInvestorFlag";
			definition = "Specifies information to identify securities accounts where allocation instructions are posted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};
	protected Exact4AlphaNumericText pricingScheme;
	/**
	 * Defines how the price is applied to the securities account.
	 * <p>
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
			componentContext_lazy = () -> SystemSecuritiesAccount1.mmObject();
			isDerived = false;
			xmlTag = "PricgSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingScheme";
			definition = "Defines how the price is applied to the securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SystemSecuritiesAccount1.mmAccountOwner, SystemSecuritiesAccount1.mmIdentification, SystemSecuritiesAccount1.mmType, SystemSecuritiesAccount1.mmOpeningDate,
						SystemSecuritiesAccount1.mmClosingDate, SystemSecuritiesAccount1.mmHoldIndicator, SystemSecuritiesAccount1.mmNegativePosition, SystemSecuritiesAccount1.mmMarketSpecificAttribute,
						SystemSecuritiesAccount1.mmRestriction, SystemSecuritiesAccount1.mmEndInvestorFlag, SystemSecuritiesAccount1.mmPricingScheme);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setAccountOwner(com.tools20022.repository.msg.SystemPartyIdentification3 accountOwner) {
		this.accountOwner = accountOwner;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public SystemSecuritiesAccountType1Code getType() {
		return type;
	}

	public void setType(SystemSecuritiesAccountType1Code type) {
		this.type = type;
	}

	public ISODate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(ISODate openingDate) {
		this.openingDate = openingDate;
	}

	public ISODate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(ISODate closingDate) {
		this.closingDate = closingDate;
	}

	public TrueFalseIndicator getHoldIndicator() {
		return holdIndicator;
	}

	public void setHoldIndicator(TrueFalseIndicator holdIndicator) {
		this.holdIndicator = holdIndicator;
	}

	public YesNoIndicator getNegativePosition() {
		return negativePosition;
	}

	public void setNegativePosition(YesNoIndicator negativePosition) {
		this.negativePosition = negativePosition;
	}

	public List<MarketSpecificAttribute1> getMarketSpecificAttribute() {
		return marketSpecificAttribute;
	}

	public void setMarketSpecificAttribute(List<com.tools20022.repository.msg.MarketSpecificAttribute1> marketSpecificAttribute) {
		this.marketSpecificAttribute = marketSpecificAttribute;
	}

	public List<SystemRestriction1> getRestriction() {
		return restriction;
	}

	public void setRestriction(List<com.tools20022.repository.msg.SystemRestriction1> restriction) {
		this.restriction = restriction;
	}

	public Exact4AlphaNumericText getEndInvestorFlag() {
		return endInvestorFlag;
	}

	public void setEndInvestorFlag(Exact4AlphaNumericText endInvestorFlag) {
		this.endInvestorFlag = endInvestorFlag;
	}

	public Exact4AlphaNumericText getPricingScheme() {
		return pricingScheme;
	}

	public void setPricingScheme(Exact4AlphaNumericText pricingScheme) {
		this.pricingScheme = pricingScheme;
	}
}