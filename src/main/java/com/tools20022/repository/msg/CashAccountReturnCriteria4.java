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
 * Defines the criteria used to report on an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmNameIndicator
 * CashAccountReturnCriteria4.mmNameIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmCurrencyIndicator
 * CashAccountReturnCriteria4.mmCurrencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmTypeIndicator
 * CashAccountReturnCriteria4.mmTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmMultilateralLimitIndicator
 * CashAccountReturnCriteria4.mmMultilateralLimitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmMultilateralBalanceReturnCriteria
 * CashAccountReturnCriteria4.mmMultilateralBalanceReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmBilateralLimitIndicator
 * CashAccountReturnCriteria4.mmBilateralLimitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmBilateralBalanceReturnCriteria
 * CashAccountReturnCriteria4.mmBilateralBalanceReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmStandingOrderIndicator
 * CashAccountReturnCriteria4.mmStandingOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmAccountOwnerIndicator
 * CashAccountReturnCriteria4.mmAccountOwnerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmAccountServicerIndicator
 * CashAccountReturnCriteria4.mmAccountServicerIndicator}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountReturnCriteria4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on an account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
 * CashAccountReturnCriteria3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccountReturnCriteria4", propOrder = {"nameIndicator", "currencyIndicator", "typeIndicator", "multilateralLimitIndicator", "multilateralBalanceReturnCriteria", "bilateralLimitIndicator",
		"bilateralBalanceReturnCriteria", "standingOrderIndicator", "accountOwnerIndicator", "accountServicerIndicator"})
public class CashAccountReturnCriteria4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NmInd")
	protected RequestedIndicator nameIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account name is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmNameIndicator
	 * CashAccountReturnCriteria3.mmNameIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "NmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameIndicator";
			definition = "Indicates whether the account name is requested.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmNameIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "CcyInd")
	protected RequestedIndicator currencyIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account currency is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmCurrencyIndicator
	 * CashAccountReturnCriteria3.mmCurrencyIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "CcyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyIndicator";
			definition = "Indicates whether the account currency is requested.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmCurrencyIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "TpInd")
	protected RequestedIndicator typeIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account type is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmTypeIndicator
	 * CashAccountReturnCriteria3.mmTypeIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "TpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeIndicator";
			definition = "Indicates whether the account type is requested.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmTypeIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "MulLmtInd")
	protected RequestedIndicator multilateralLimitIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MulLmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralLimitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the multilateral limit is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmMultilateralLimitIndicator
	 * CashAccountReturnCriteria3.mmMultilateralLimitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMultilateralLimitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "MulLmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralLimitIndicator";
			definition = "Indicates whether the multilateral limit is requested.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmMultilateralLimitIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "MulBalRtrCrit")
	protected CashBalanceReturnCriteria1 multilateralBalanceReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1
	 * CashBalanceReturnCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MulBalRtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralBalanceReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria used to report on a multilateral balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmMultilateralBalanceReturnCriteria
	 * CashAccountReturnCriteria3.mmMultilateralBalanceReturnCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMultilateralBalanceReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "MulBalRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralBalanceReturnCriteria";
			definition = "Defines the criteria used to report on a multilateral balance.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmMultilateralBalanceReturnCriteria;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmObject();
		}
	};
	@XmlElement(name = "BilLmtInd")
	protected RequestedIndicator bilateralLimitIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BilLmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the bilateral limit is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmBilateralLimitIndicator
	 * CashAccountReturnCriteria3.mmBilateralLimitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBilateralLimitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "BilLmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitIndicator";
			definition = "Indicates whether the bilateral limit is requested.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmBilateralLimitIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "BilBalRtrCrit")
	protected CashBalanceReturnCriteria1 bilateralBalanceReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1
	 * CashBalanceReturnCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BilBalRtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralBalanceReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria used to report on a bilateral balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmBilateralBalanceReturnCriteria
	 * CashAccountReturnCriteria3.mmBilateralBalanceReturnCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBilateralBalanceReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "BilBalRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralBalanceReturnCriteria";
			definition = "Defines the criteria used to report on a bilateral balance.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmBilateralBalanceReturnCriteria;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmObject();
		}
	};
	@XmlElement(name = "StgOrdrInd")
	protected RequestedIndicator standingOrderIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account standing order is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmStandingOrderIndicator
	 * CashAccountReturnCriteria3.mmStandingOrderIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandingOrderIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "StgOrdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderIndicator";
			definition = "Indicates whether the account standing order is requested.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmStandingOrderIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnrInd")
	protected RequestedIndicator accountOwnerIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account owner information is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmAccountOwnerIndicator
	 * CashAccountReturnCriteria3.mmAccountOwnerIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwnerIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIndicator";
			definition = "Indicates whether the account owner information is requested.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmAccountOwnerIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "AcctSvcrInd")
	protected RequestedIndicator accountServicerIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
	 * CashAccountReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account servicer information is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmAccountServicerIndicator
	 * CashAccountReturnCriteria3.mmAccountServicerIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicerIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIndicator";
			definition = "Indicates whether the account servicer information is requested.";
			previousVersion_lazy = () -> CashAccountReturnCriteria3.mmAccountServicerIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountReturnCriteria4.mmNameIndicator, com.tools20022.repository.msg.CashAccountReturnCriteria4.mmCurrencyIndicator,
						com.tools20022.repository.msg.CashAccountReturnCriteria4.mmTypeIndicator, com.tools20022.repository.msg.CashAccountReturnCriteria4.mmMultilateralLimitIndicator,
						com.tools20022.repository.msg.CashAccountReturnCriteria4.mmMultilateralBalanceReturnCriteria, com.tools20022.repository.msg.CashAccountReturnCriteria4.mmBilateralLimitIndicator,
						com.tools20022.repository.msg.CashAccountReturnCriteria4.mmBilateralBalanceReturnCriteria, com.tools20022.repository.msg.CashAccountReturnCriteria4.mmStandingOrderIndicator,
						com.tools20022.repository.msg.CashAccountReturnCriteria4.mmAccountOwnerIndicator, com.tools20022.repository.msg.CashAccountReturnCriteria4.mmAccountServicerIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountReturnCriteria4";
				definition = "Defines the criteria used to report on an account.";
				previousVersion_lazy = () -> CashAccountReturnCriteria3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getNameIndicator() {
		return nameIndicator == null ? Optional.empty() : Optional.of(nameIndicator);
	}

	public CashAccountReturnCriteria4 setNameIndicator(RequestedIndicator nameIndicator) {
		this.nameIndicator = nameIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCurrencyIndicator() {
		return currencyIndicator == null ? Optional.empty() : Optional.of(currencyIndicator);
	}

	public CashAccountReturnCriteria4 setCurrencyIndicator(RequestedIndicator currencyIndicator) {
		this.currencyIndicator = currencyIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getTypeIndicator() {
		return typeIndicator == null ? Optional.empty() : Optional.of(typeIndicator);
	}

	public CashAccountReturnCriteria4 setTypeIndicator(RequestedIndicator typeIndicator) {
		this.typeIndicator = typeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getMultilateralLimitIndicator() {
		return multilateralLimitIndicator == null ? Optional.empty() : Optional.of(multilateralLimitIndicator);
	}

	public CashAccountReturnCriteria4 setMultilateralLimitIndicator(RequestedIndicator multilateralLimitIndicator) {
		this.multilateralLimitIndicator = multilateralLimitIndicator;
		return this;
	}

	public Optional<CashBalanceReturnCriteria1> getMultilateralBalanceReturnCriteria() {
		return multilateralBalanceReturnCriteria == null ? Optional.empty() : Optional.of(multilateralBalanceReturnCriteria);
	}

	public CashAccountReturnCriteria4 setMultilateralBalanceReturnCriteria(com.tools20022.repository.msg.CashBalanceReturnCriteria1 multilateralBalanceReturnCriteria) {
		this.multilateralBalanceReturnCriteria = multilateralBalanceReturnCriteria;
		return this;
	}

	public Optional<RequestedIndicator> getBilateralLimitIndicator() {
		return bilateralLimitIndicator == null ? Optional.empty() : Optional.of(bilateralLimitIndicator);
	}

	public CashAccountReturnCriteria4 setBilateralLimitIndicator(RequestedIndicator bilateralLimitIndicator) {
		this.bilateralLimitIndicator = bilateralLimitIndicator;
		return this;
	}

	public Optional<CashBalanceReturnCriteria1> getBilateralBalanceReturnCriteria() {
		return bilateralBalanceReturnCriteria == null ? Optional.empty() : Optional.of(bilateralBalanceReturnCriteria);
	}

	public CashAccountReturnCriteria4 setBilateralBalanceReturnCriteria(com.tools20022.repository.msg.CashBalanceReturnCriteria1 bilateralBalanceReturnCriteria) {
		this.bilateralBalanceReturnCriteria = bilateralBalanceReturnCriteria;
		return this;
	}

	public Optional<RequestedIndicator> getStandingOrderIndicator() {
		return standingOrderIndicator == null ? Optional.empty() : Optional.of(standingOrderIndicator);
	}

	public CashAccountReturnCriteria4 setStandingOrderIndicator(RequestedIndicator standingOrderIndicator) {
		this.standingOrderIndicator = standingOrderIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAccountOwnerIndicator() {
		return accountOwnerIndicator == null ? Optional.empty() : Optional.of(accountOwnerIndicator);
	}

	public CashAccountReturnCriteria4 setAccountOwnerIndicator(RequestedIndicator accountOwnerIndicator) {
		this.accountOwnerIndicator = accountOwnerIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAccountServicerIndicator() {
		return accountServicerIndicator == null ? Optional.empty() : Optional.of(accountServicerIndicator);
	}

	public CashAccountReturnCriteria4 setAccountServicerIndicator(RequestedIndicator accountServicerIndicator) {
		this.accountServicerIndicator = accountServicerIndicator;
		return this;
	}
}