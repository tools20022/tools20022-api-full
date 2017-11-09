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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Balance types related to an unallocated redemption payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmPlaceAndName
 * CorporateActionUnallocatedBalanceSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmTotalEligibleBalance
 * CorporateActionUnallocatedBalanceSD2.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmPledgedBalance
 * CorporateActionUnallocatedBalanceSD2.mmPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmInvestmentPledgedBalance
 * CorporateActionUnallocatedBalanceSD2.mmInvestmentPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmInvestmentUnpledgedBalance
 * CorporateActionUnallocatedBalanceSD2.mmInvestmentUnpledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmMemoSegregationBalance
 * CorporateActionUnallocatedBalanceSD2.mmMemoSegregationBalance}</li>
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
 * "CorporateActionUnallocatedBalanceSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance types related to an unallocated redemption payment."</li>
 * </ul>
 */
public class CorporateActionUnallocatedBalanceSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2
	 * CorporateActionUnallocatedBalanceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected SignedQuantityFormat9 totalEligibleBalance;
	/**
	 * Total balance of securities eligible for this corporate action event. The
	 * entitlement calculation is based on this balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2
	 * CorporateActionUnallocatedBalanceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalEligibleBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 pledgedBalance;
	/**
	 * Position held in DTC Segregated account. This position is ineligible for
	 * payment until released from pledgee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2
	 * CorporateActionUnallocatedBalanceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC Segregated account.  This position is ineligible for payment until released from pledgee.  "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmObject();
			isDerived = false;
			xmlTag = "PldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedBalance";
			definition = "Position held in DTC Segregated account.  This position is ineligible for payment until released from pledgee.  ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 investmentPledgedBalance;
	/**
	 * Position held in DTC Segregated account also called account 18. This
	 * position is not eligible for instruction processing but will be eligible
	 * for payment on mandatory events.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2
	 * CorporateActionUnallocatedBalanceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtPldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC Segregated account also called account 18.   This position is not eligible for instruction processing but will be eligible for payment on mandatory events."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentPledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPledgedBalance";
			definition = "Position held in DTC Segregated account also called account 18.   This position is not eligible for instruction processing but will be eligible for payment on mandatory events.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 investmentUnpledgedBalance;
	/**
	 * Position held in DTC Segregated account also called account 22. This
	 * position is not eligible for instruction processing but will be eligible
	 * for payment on mandatory events. <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2
	 * CorporateActionUnallocatedBalanceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtUpldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentUnpledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC Segregated account also called account 22.   This position is not eligible for instruction processing but will be eligible for payment on mandatory events.  \r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentUnpledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmObject();
			isDerived = false;
			xmlTag = "InvstmtUpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentUnpledgedBalance";
			definition = "Position held in DTC Segregated account also called account 22.   This position is not eligible for instruction processing but will be eligible for payment on mandatory events.  \r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 memoSegregationBalance;
	/**
	 * Position held in DTC Segregated account. This position is eligible for
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2
	 * CorporateActionUnallocatedBalanceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MemoSgrtnBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoSegregationBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC Segregated account. This position is eligible for payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMemoSegregationBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmObject();
			isDerived = false;
			xmlTag = "MemoSgrtnBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoSegregationBalance";
			definition = "Position held in DTC Segregated account. This position is eligible for payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionUnallocatedBalanceSD2.mmPlaceAndName, CorporateActionUnallocatedBalanceSD2.mmTotalEligibleBalance, CorporateActionUnallocatedBalanceSD2.mmPledgedBalance,
						CorporateActionUnallocatedBalanceSD2.mmInvestmentPledgedBalance, CorporateActionUnallocatedBalanceSD2.mmInvestmentUnpledgedBalance, CorporateActionUnallocatedBalanceSD2.mmMemoSegregationBalance);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionUnallocatedBalanceSD2";
				definition = "Balance types related to an unallocated redemption payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public SignedQuantityFormat9 getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public void setTotalEligibleBalance(com.tools20022.repository.msg.SignedQuantityFormat9 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
	}

	public SignedQuantityFormat9 getPledgedBalance() {
		return pledgedBalance;
	}

	public void setPledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 pledgedBalance) {
		this.pledgedBalance = pledgedBalance;
	}

	public SignedQuantityFormat9 getInvestmentPledgedBalance() {
		return investmentPledgedBalance;
	}

	public void setInvestmentPledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 investmentPledgedBalance) {
		this.investmentPledgedBalance = investmentPledgedBalance;
	}

	public SignedQuantityFormat9 getInvestmentUnpledgedBalance() {
		return investmentUnpledgedBalance;
	}

	public void setInvestmentUnpledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 investmentUnpledgedBalance) {
		this.investmentUnpledgedBalance = investmentUnpledgedBalance;
	}

	public SignedQuantityFormat9 getMemoSegregationBalance() {
		return memoSegregationBalance;
	}

	public void setMemoSegregationBalance(com.tools20022.repository.msg.SignedQuantityFormat9 memoSegregationBalance) {
		this.memoSegregationBalance = memoSegregationBalance;
	}
}