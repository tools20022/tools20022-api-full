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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarketSpecificAttribute1;
import com.tools20022.repository.msg.SystemRestriction1;
import com.tools20022.repository.msg.SystemSecuritiesAccount2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies which information are involved by a modification request for
 * securities account reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountModification1Choice#mmSystemSecuritiesAccount
 * SecuritiesAccountModification1Choice.mmSystemSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountModification1Choice#mmSystemRestriction
 * SecuritiesAccountModification1Choice.mmSystemRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountModification1Choice#mmMarketSpecificAttribute
 * SecuritiesAccountModification1Choice.mmMarketSpecificAttribute}</li>
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
 * "SecuritiesAccountModification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies which information are involved by a modification request for securities account reference data."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountModification1Choice", propOrder = {"systemSecuritiesAccount", "systemRestriction", "marketSpecificAttribute"})
public class SecuritiesAccountModification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysSctiesAcct", required = true)
	protected SystemSecuritiesAccount2 systemSecuritiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2
	 * SystemSecuritiesAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountModification1Choice
	 * SecuritiesAccountModification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysSctiesAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemSecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemSecuritiesAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAccountModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "SysSctiesAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemSecuritiesAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemSecuritiesAccount2.mmObject();
		}
	};
	@XmlElement(name = "SysRstrctn", required = true)
	protected SystemRestriction1 systemRestriction;
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountModification1Choice
	 * SecuritiesAccountModification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysRstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the specific processing characteristics for a party to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSystemRestriction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAccountModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "SysRstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemRestriction";
			definition = "Defines the specific processing characteristics for a party to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SystemRestriction1.mmObject();
		}
	};
	@XmlElement(name = "MktSpcfcAttr", required = true)
	protected MarketSpecificAttribute1 marketSpecificAttribute;
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountModification1Choice
	 * SecuritiesAccountModification1Choice}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAccountModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "MktSpcfcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketSpecificAttribute";
			definition = "Additional attributes defined by a central security depositary for a party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarketSpecificAttribute1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesAccountModification1Choice.mmSystemSecuritiesAccount,
						com.tools20022.repository.choice.SecuritiesAccountModification1Choice.mmSystemRestriction, com.tools20022.repository.choice.SecuritiesAccountModification1Choice.mmMarketSpecificAttribute);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountModification1Choice";
				definition = "Identifies which information are involved by a modification request for securities account reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemSecuritiesAccount2 getSystemSecuritiesAccount() {
		return systemSecuritiesAccount;
	}

	public SecuritiesAccountModification1Choice setSystemSecuritiesAccount(SystemSecuritiesAccount2 systemSecuritiesAccount) {
		this.systemSecuritiesAccount = Objects.requireNonNull(systemSecuritiesAccount);
		return this;
	}

	public SystemRestriction1 getSystemRestriction() {
		return systemRestriction;
	}

	public SecuritiesAccountModification1Choice setSystemRestriction(SystemRestriction1 systemRestriction) {
		this.systemRestriction = Objects.requireNonNull(systemRestriction);
		return this;
	}

	public MarketSpecificAttribute1 getMarketSpecificAttribute() {
		return marketSpecificAttribute;
	}

	public SecuritiesAccountModification1Choice setMarketSpecificAttribute(MarketSpecificAttribute1 marketSpecificAttribute) {
		this.marketSpecificAttribute = Objects.requireNonNull(marketSpecificAttribute);
		return this;
	}
}