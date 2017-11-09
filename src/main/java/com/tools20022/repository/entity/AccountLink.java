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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountLink1;
import com.tools20022.repository.msg.AccountLink2;
import com.tools20022.repository.msg.AccountLinkUpdate1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Defines the link between the accounts held with a market infrastructure.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountLink" src="doc-files/AccountLink.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLink1 AccountLink1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLink2 AccountLink2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLinkUpdate1
 * AccountLinkUpdate1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmAccountLink
 * CashAccount.mmAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAccountLink
 * DateTimePeriod.mmRelatedAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmAccountLink
 * SecuritiesAccount.mmAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure#mmAccountLink
 * MarketInfrastructure.mmAccountLink}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountLink#mmCashAccount
 * AccountLink.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmValidityPeriod
 * AccountLink.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmSecuritiesAccount
 * AccountLink.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmMarketInfrastructure
 * AccountLink.mmMarketInfrastructure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmCashSettlementIndicator
 * AccountLink.mmCashSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmCollateralisationIndicator
 * AccountLink.mmCollateralisationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmDefaultIndicator
 * AccountLink.mmDefaultIndicator}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountLink"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the link between the accounts held with a market infrastructure."</li>
 * </ul>
 */
public class AccountLink {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashAccount cashAccount;
	/**
	 * Cash account linked to a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmAccountLink
	 * CashAccount.mmAccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountLink1#mmCashAccount
	 * AccountLink1.mmCashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountLink2#mmCashAccount
	 * AccountLink2.mmCashAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account linked to a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountLink1.mmCashAccount, AccountLink2.mmCashAccount);
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account linked to a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmAccountLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod;
	/**
	 * Defines the period when the securities account is linked to the cash
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAccountLink
	 * DateTimePeriod.mmRelatedAccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the period when the securities account is linked to the cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Defines the period when the securities account is linked to the cash account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedAccountLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount;
	/**
	 * Securities account linked to a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmAccountLink
	 * SecuritiesAccount.mmAccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmSecuritiesAccount
	 * AccountLink1.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountLink2#mmSecuritiesAccount
	 * AccountLink2.mmSecuritiesAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities account linked to a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountLink1.mmSecuritiesAccount, AccountLink2.mmSecuritiesAccount);
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Securities account linked to a cash account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmAccountLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MarketInfrastructure> marketInfrastructure;
	/**
	 * Specifies the market infrastructure where the accounts are held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure#mmAccountLink
	 * MarketInfrastructure.mmAccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure
	 * MarketInfrastructure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the market infrastructure where the accounts are held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMarketInfrastructure = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructure";
			definition = "Specifies the market infrastructure where the accounts are held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarketInfrastructure.mmAccountLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarketInfrastructure.mmObject();
		}
	};
	protected YesNoIndicator cashSettlementIndicator;
	/**
	 * Specifies whether market infrastructure can use the link between the
	 * securities account and the market infrastructure dedicated cash account
	 * for the settlement of the cash leg of a settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmCashSettlementIndicator
	 * AccountLink1.mmCashSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether market infrastructure can use the link between the securities account and the market infrastructure dedicated cash account for the settlement of the cash leg of a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashSettlementIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountLink1.mmCashSettlementIndicator);
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashSettlementIndicator";
			definition = "Specifies whether market infrastructure can use the link between the securities account and the market infrastructure dedicated cash account for the settlement of the cash leg of a settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator collateralisationIndicator;
	/**
	 * Specifies whether market infrastructure can use the securities, earmarked
	 * as collateral and held on the securities account, for
	 * auto-collateralisation operations on the linked market infrastructure
	 * dedicated cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmCollateralisationIndicator
	 * AccountLink1.mmCollateralisationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether market infrastructure can use the securities, earmarked as collateral and held on the securities account, for auto-collateralisation operations on the linked market infrastructure dedicated cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralisationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountLink1.mmCollateralisationIndicator);
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether market infrastructure can use the securities, earmarked as collateral and held on the securities account, for auto-collateralisation operations on the linked market infrastructure dedicated cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator defaultIndicator;
	/**
	 * Specifies whether created account link is set as default for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmDefaultIndicator
	 * AccountLink1.mmDefaultIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether created account link is set as default for settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDefaultIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountLink1.mmDefaultIndicator);
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultIndicator";
			definition = "Specifies whether created account link is set as default for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountLink";
				definition = "Defines the link between the accounts held with a market infrastructure.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmAccountLink, com.tools20022.repository.entity.DateTimePeriod.mmRelatedAccountLink,
						com.tools20022.repository.entity.SecuritiesAccount.mmAccountLink, com.tools20022.repository.entity.MarketInfrastructure.mmAccountLink);
				element_lazy = () -> Arrays.asList(AccountLink.mmCashAccount, AccountLink.mmValidityPeriod, AccountLink.mmSecuritiesAccount, AccountLink.mmMarketInfrastructure, AccountLink.mmCashSettlementIndicator,
						AccountLink.mmCollateralisationIndicator, AccountLink.mmDefaultIndicator);
				derivationComponent_lazy = () -> Arrays.asList(AccountLink1.mmObject(), AccountLink2.mmObject(), AccountLinkUpdate1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccount getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(com.tools20022.repository.entity.CashAccount cashAccount) {
		this.cashAccount = cashAccount;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public List<SecuritiesAccount> getSecuritiesAccount() {
		return securitiesAccount;
	}

	public void setSecuritiesAccount(List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
	}

	public List<MarketInfrastructure> getMarketInfrastructure() {
		return marketInfrastructure;
	}

	public void setMarketInfrastructure(List<com.tools20022.repository.entity.MarketInfrastructure> marketInfrastructure) {
		this.marketInfrastructure = marketInfrastructure;
	}

	public YesNoIndicator getCashSettlementIndicator() {
		return cashSettlementIndicator;
	}

	public void setCashSettlementIndicator(YesNoIndicator cashSettlementIndicator) {
		this.cashSettlementIndicator = cashSettlementIndicator;
	}

	public YesNoIndicator getCollateralisationIndicator() {
		return collateralisationIndicator;
	}

	public void setCollateralisationIndicator(YesNoIndicator collateralisationIndicator) {
		this.collateralisationIndicator = collateralisationIndicator;
	}

	public YesNoIndicator getDefaultIndicator() {
		return defaultIndicator;
	}

	public void setDefaultIndicator(YesNoIndicator defaultIndicator) {
		this.defaultIndicator = defaultIndicator;
	}
}