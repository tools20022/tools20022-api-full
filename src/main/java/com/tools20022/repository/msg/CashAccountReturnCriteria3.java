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
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmNameIndicator
 * CashAccountReturnCriteria3.mmNameIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmCurrencyIndicator
 * CashAccountReturnCriteria3.mmCurrencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmTypeIndicator
 * CashAccountReturnCriteria3.mmTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmMultilateralLimitIndicator
 * CashAccountReturnCriteria3.mmMultilateralLimitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmMultilateralBalanceReturnCriteria
 * CashAccountReturnCriteria3.mmMultilateralBalanceReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmBilateralLimitIndicator
 * CashAccountReturnCriteria3.mmBilateralLimitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmBilateralBalanceReturnCriteria
 * CashAccountReturnCriteria3.mmBilateralBalanceReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmStandingOrderIndicator
 * CashAccountReturnCriteria3.mmStandingOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmAccountOwnerIndicator
 * CashAccountReturnCriteria3.mmAccountOwnerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmAccountServicerIndicator
 * CashAccountReturnCriteria3.mmAccountServicerIndicator}</li>
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
 * "CashAccountReturnCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on an account."</li>
 * </ul>
 */
public class CashAccountReturnCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator nameIndicator;
	/**
	 * Indicates whether the account name is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "NmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameIndicator";
			definition = "Indicates whether the account name is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator currencyIndicator;
	/**
	 * Indicates whether the account currency is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "CcyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyIndicator";
			definition = "Indicates whether the account currency is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator typeIndicator;
	/**
	 * Indicates whether the account type is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "TpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeIndicator";
			definition = "Indicates whether the account type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator multilateralLimitIndicator;
	/**
	 * Indicates whether the multilateral limit is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMultilateralLimitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "MulLmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralLimitIndicator";
			definition = "Indicates whether the multilateral limit is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected CashBalanceReturnCriteria multilateralBalanceReturnCriteria;
	/**
	 * Defines the criteria used to report on a multilateral balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria
	 * CashBalanceReturnCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMultilateralBalanceReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "MulBalRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralBalanceReturnCriteria";
			definition = "Defines the criteria used to report on a multilateral balance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalanceReturnCriteria.mmObject();
		}
	};
	protected RequestedIndicator bilateralLimitIndicator;
	/**
	 * Indicates whether the bilateral limit is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmBilateralLimitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "BilLmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitIndicator";
			definition = "Indicates whether the bilateral limit is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected CashBalanceReturnCriteria bilateralBalanceReturnCriteria;
	/**
	 * Defines the criteria used to report on a bilateral balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria
	 * CashBalanceReturnCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBilateralBalanceReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "BilBalRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralBalanceReturnCriteria";
			definition = "Defines the criteria used to report on a bilateral balance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalanceReturnCriteria.mmObject();
		}
	};
	protected RequestedIndicator standingOrderIndicator;
	/**
	 * Indicates whether the account standing order is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandingOrderIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "StgOrdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderIndicator";
			definition = "Indicates whether the account standing order is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator accountOwnerIndicator;
	/**
	 * Indicates whether the account owner information is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwnerIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIndicator";
			definition = "Indicates whether the account owner information is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator accountServicerIndicator;
	/**
	 * Indicates whether the account servicer information is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicerIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIndicator";
			definition = "Indicates whether the account servicer information is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashAccountReturnCriteria3.mmNameIndicator, CashAccountReturnCriteria3.mmCurrencyIndicator, CashAccountReturnCriteria3.mmTypeIndicator,
						CashAccountReturnCriteria3.mmMultilateralLimitIndicator, CashAccountReturnCriteria3.mmMultilateralBalanceReturnCriteria, CashAccountReturnCriteria3.mmBilateralLimitIndicator,
						CashAccountReturnCriteria3.mmBilateralBalanceReturnCriteria, CashAccountReturnCriteria3.mmStandingOrderIndicator, CashAccountReturnCriteria3.mmAccountOwnerIndicator,
						CashAccountReturnCriteria3.mmAccountServicerIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashAccountReturnCriteria3";
				definition = "Defines the criteria used to report on an account.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getNameIndicator() {
		return nameIndicator;
	}

	public void setNameIndicator(RequestedIndicator nameIndicator) {
		this.nameIndicator = nameIndicator;
	}

	public RequestedIndicator getCurrencyIndicator() {
		return currencyIndicator;
	}

	public void setCurrencyIndicator(RequestedIndicator currencyIndicator) {
		this.currencyIndicator = currencyIndicator;
	}

	public RequestedIndicator getTypeIndicator() {
		return typeIndicator;
	}

	public void setTypeIndicator(RequestedIndicator typeIndicator) {
		this.typeIndicator = typeIndicator;
	}

	public RequestedIndicator getMultilateralLimitIndicator() {
		return multilateralLimitIndicator;
	}

	public void setMultilateralLimitIndicator(RequestedIndicator multilateralLimitIndicator) {
		this.multilateralLimitIndicator = multilateralLimitIndicator;
	}

	public CashBalanceReturnCriteria getMultilateralBalanceReturnCriteria() {
		return multilateralBalanceReturnCriteria;
	}

	public void setMultilateralBalanceReturnCriteria(com.tools20022.repository.msg.CashBalanceReturnCriteria multilateralBalanceReturnCriteria) {
		this.multilateralBalanceReturnCriteria = multilateralBalanceReturnCriteria;
	}

	public RequestedIndicator getBilateralLimitIndicator() {
		return bilateralLimitIndicator;
	}

	public void setBilateralLimitIndicator(RequestedIndicator bilateralLimitIndicator) {
		this.bilateralLimitIndicator = bilateralLimitIndicator;
	}

	public CashBalanceReturnCriteria getBilateralBalanceReturnCriteria() {
		return bilateralBalanceReturnCriteria;
	}

	public void setBilateralBalanceReturnCriteria(com.tools20022.repository.msg.CashBalanceReturnCriteria bilateralBalanceReturnCriteria) {
		this.bilateralBalanceReturnCriteria = bilateralBalanceReturnCriteria;
	}

	public RequestedIndicator getStandingOrderIndicator() {
		return standingOrderIndicator;
	}

	public void setStandingOrderIndicator(RequestedIndicator standingOrderIndicator) {
		this.standingOrderIndicator = standingOrderIndicator;
	}

	public RequestedIndicator getAccountOwnerIndicator() {
		return accountOwnerIndicator;
	}

	public void setAccountOwnerIndicator(RequestedIndicator accountOwnerIndicator) {
		this.accountOwnerIndicator = accountOwnerIndicator;
	}

	public RequestedIndicator getAccountServicerIndicator() {
		return accountServicerIndicator;
	}

	public void setAccountServicerIndicator(RequestedIndicator accountServicerIndicator) {
		this.accountServicerIndicator = accountServicerIndicator;
	}
}