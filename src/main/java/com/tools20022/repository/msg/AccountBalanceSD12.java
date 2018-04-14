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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding account balance. Contains
 * transaction details of the stock loans, repurchase agreements (REPOs) and
 * undelivered trades (FAILs).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12#mmPlaceAndName
 * AccountBalanceSD12.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12#mmUncoveredProtectBalance
 * AccountBalanceSD12.mmUncoveredProtectBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12#mmInvestmentUnpledgedBalance
 * AccountBalanceSD12.mmInvestmentUnpledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12#mmInvestmentPledgedBalance
 * AccountBalanceSD12.mmInvestmentPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12#mmMemoSegregationBalance
 * AccountBalanceSD12.mmMemoSegregationBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountBalanceSD12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD8
 * AccountBalanceSD8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountBalanceSD12", propOrder = {"placeAndName", "uncoveredProtectBalance", "investmentUnpledgedBalance", "investmentPledgedBalance", "memoSegregationBalance"})
public class AccountBalanceSD12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12
	 * AccountBalanceSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD8#mmPlaceAndName
	 * AccountBalanceSD8.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceSD12, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<AccountBalanceSD12, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD12.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> AccountBalanceSD8.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(AccountBalanceSD12 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(AccountBalanceSD12 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "UcvrdPrtctBal")
	protected SignedQuantityFormat9 uncoveredProtectBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12
	 * AccountBalanceSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UcvrdPrtctBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UncoveredProtectBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of all uncovered protect instructions across all options."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD8#mmUncoveredProtectBalance
	 * AccountBalanceSD8.mmUncoveredProtectBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountBalanceSD12, Optional<SignedQuantityFormat9>> mmUncoveredProtectBalance = new MMMessageAssociationEnd<AccountBalanceSD12, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD12.mmObject();
			isDerived = false;
			xmlTag = "UcvrdPrtctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UncoveredProtectBalance";
			definition = "Balance of all uncovered protect instructions across all options.";
			previousVersion_lazy = () -> AccountBalanceSD8.mmUncoveredProtectBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(AccountBalanceSD12 obj) {
			return obj.getUncoveredProtectBalance();
		}

		@Override
		public void setValue(AccountBalanceSD12 obj, Optional<SignedQuantityFormat9> value) {
			obj.setUncoveredProtectBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtUpldgdBal")
	protected SignedQuantityFormat9 investmentUnpledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12
	 * AccountBalanceSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtUpldgdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentUnpledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC segregated account also called account 18. This position is not eligible for instruction processing but will be eligible for payment on mandatory events."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD8#mmInvestmentUnpledgedBalance
	 * AccountBalanceSD8.mmInvestmentUnpledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountBalanceSD12, Optional<SignedQuantityFormat9>> mmInvestmentUnpledgedBalance = new MMMessageAssociationEnd<AccountBalanceSD12, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD12.mmObject();
			isDerived = false;
			xmlTag = "InvstmtUpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentUnpledgedBalance";
			definition = "Position held in DTC segregated account also called account 18. This position is not eligible for instruction processing but will be eligible for payment on mandatory events.";
			previousVersion_lazy = () -> AccountBalanceSD8.mmInvestmentUnpledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(AccountBalanceSD12 obj) {
			return obj.getInvestmentUnpledgedBalance();
		}

		@Override
		public void setValue(AccountBalanceSD12 obj, Optional<SignedQuantityFormat9> value) {
			obj.setInvestmentUnpledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtPldgdBal")
	protected SignedQuantityFormat9 investmentPledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12
	 * AccountBalanceSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtPldgdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC segregated account also called account 22. This position is not eligible for instruction processing but will be eligible for payment on mandatory events."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD8#mmInvestmentPledgedBalance
	 * AccountBalanceSD8.mmInvestmentPledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountBalanceSD12, Optional<SignedQuantityFormat9>> mmInvestmentPledgedBalance = new MMMessageAssociationEnd<AccountBalanceSD12, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD12.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPledgedBalance";
			definition = "Position held in DTC segregated account also called account 22. This position is not eligible for instruction processing but will be eligible for payment on mandatory events.";
			previousVersion_lazy = () -> AccountBalanceSD8.mmInvestmentPledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(AccountBalanceSD12 obj) {
			return obj.getInvestmentPledgedBalance();
		}

		@Override
		public void setValue(AccountBalanceSD12 obj, Optional<SignedQuantityFormat9> value) {
			obj.setInvestmentPledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "MemoSgrtnBal")
	protected SignedQuantityFormat9 memoSegregationBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD12
	 * AccountBalanceSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MemoSgrtnBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoSegregationBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC memo segregated account. This position is eligible for payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD8#mmMemoSegregationBalance
	 * AccountBalanceSD8.mmMemoSegregationBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountBalanceSD12, Optional<SignedQuantityFormat9>> mmMemoSegregationBalance = new MMMessageAssociationEnd<AccountBalanceSD12, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD12.mmObject();
			isDerived = false;
			xmlTag = "MemoSgrtnBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoSegregationBalance";
			definition = "Position held in DTC memo segregated account. This position is eligible for payment.";
			previousVersion_lazy = () -> AccountBalanceSD8.mmMemoSegregationBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(AccountBalanceSD12 obj) {
			return obj.getMemoSegregationBalance();
		}

		@Override
		public void setValue(AccountBalanceSD12 obj, Optional<SignedQuantityFormat9> value) {
			obj.setMemoSegregationBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountBalanceSD12.mmPlaceAndName, com.tools20022.repository.msg.AccountBalanceSD12.mmUncoveredProtectBalance,
						com.tools20022.repository.msg.AccountBalanceSD12.mmInvestmentUnpledgedBalance, com.tools20022.repository.msg.AccountBalanceSD12.mmInvestmentPledgedBalance,
						com.tools20022.repository.msg.AccountBalanceSD12.mmMemoSegregationBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountBalanceSD12";
				definition = "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).";
				previousVersion_lazy = () -> AccountBalanceSD8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public AccountBalanceSD12 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<SignedQuantityFormat9> getUncoveredProtectBalance() {
		return uncoveredProtectBalance == null ? Optional.empty() : Optional.of(uncoveredProtectBalance);
	}

	public AccountBalanceSD12 setUncoveredProtectBalance(SignedQuantityFormat9 uncoveredProtectBalance) {
		this.uncoveredProtectBalance = uncoveredProtectBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getInvestmentUnpledgedBalance() {
		return investmentUnpledgedBalance == null ? Optional.empty() : Optional.of(investmentUnpledgedBalance);
	}

	public AccountBalanceSD12 setInvestmentUnpledgedBalance(SignedQuantityFormat9 investmentUnpledgedBalance) {
		this.investmentUnpledgedBalance = investmentUnpledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getInvestmentPledgedBalance() {
		return investmentPledgedBalance == null ? Optional.empty() : Optional.of(investmentPledgedBalance);
	}

	public AccountBalanceSD12 setInvestmentPledgedBalance(SignedQuantityFormat9 investmentPledgedBalance) {
		this.investmentPledgedBalance = investmentPledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getMemoSegregationBalance() {
		return memoSegregationBalance == null ? Optional.empty() : Optional.of(memoSegregationBalance);
	}

	public AccountBalanceSD12 setMemoSegregationBalance(SignedQuantityFormat9 memoSegregationBalance) {
		this.memoSegregationBalance = memoSegregationBalance;
		return this;
	}
}