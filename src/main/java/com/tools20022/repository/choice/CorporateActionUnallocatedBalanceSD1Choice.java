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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.msg.SignedQuantityFormat4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice amongst various balance types related to unallocated payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmTotalEligibleBalance
 * CorporateActionUnallocatedBalanceSD1Choice.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmBorrowedBalance
 * CorporateActionUnallocatedBalanceSD1Choice.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmCollateralInBalance
 * CorporateActionUnallocatedBalanceSD1Choice.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmCollateralOutBalance
 * CorporateActionUnallocatedBalanceSD1Choice.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmOnLoanBalance
 * CorporateActionUnallocatedBalanceSD1Choice.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmPendingDeliveryBalance
 * CorporateActionUnallocatedBalanceSD1Choice.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmPendingReceiptBalance
 * CorporateActionUnallocatedBalanceSD1Choice.mmPendingReceiptBalance}</li>
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
 * "CorporateActionUnallocatedBalanceSD1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice amongst various balance types related to unallocated payment."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
 * CorporateActionUnallocatedBalanceSD2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CorporateActionUnallocatedBalanceSD1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SignedQuantityFormat4 totalEligibleBalance;
	/**
	 * Total quantity of financial instruments of the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice
	 * CorporateActionUnallocatedBalanceSD1Choice}</li>
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
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmTotalEligibleBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmTotalEligibleBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalEligibleBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmTotalEligibleBalance);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	protected SignedQuantityFormat4 borrowedBalance;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice
	 * CorporateActionUnallocatedBalanceSD1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmBorrowedBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmBorrowedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBorrowedBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmBorrowedBalance);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	protected SignedQuantityFormat4 collateralInBalance;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice
	 * CorporateActionUnallocatedBalanceSD1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollInBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralInBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmCollateralInBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmCollateralInBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralInBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmCollateralInBalance);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	protected SignedQuantityFormat4 collateralOutBalance;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice
	 * CorporateActionUnallocatedBalanceSD1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOutBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOutBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmCollateralOutBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmCollateralOutBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralOutBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmCollateralOutBalance);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	protected SignedQuantityFormat4 onLoanBalance;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice
	 * CorporateActionUnallocatedBalanceSD1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLnBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoanBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmOnLoanBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmOnLoanBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLoanBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmOnLoanBalance);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	protected SignedQuantityFormat4 pendingDeliveryBalance;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice
	 * CorporateActionUnallocatedBalanceSD1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgDlvryBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmPendingDeliveryBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmPendingDeliveryBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingDeliveryBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmPendingDeliveryBalance);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	protected SignedQuantityFormat4 pendingReceiptBalance;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice
	 * CorporateActionUnallocatedBalanceSD1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRctBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmPendingReceiptBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmPendingReceiptBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingReceiptBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmPendingReceiptBalance);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice.mmTotalEligibleBalance,
						com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice.mmBorrowedBalance, com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice.mmCollateralInBalance,
						com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice.mmCollateralOutBalance, com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice.mmOnLoanBalance,
						com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice.mmPendingDeliveryBalance, com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice.mmPendingReceiptBalance);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionUnallocatedBalanceSD1Choice";
				definition = "Choice amongst various balance types related to unallocated payment.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedBalanceSD2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SignedQuantityFormat4 getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public void setTotalEligibleBalance(SignedQuantityFormat4 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
	}

	public SignedQuantityFormat4 getBorrowedBalance() {
		return borrowedBalance;
	}

	public void setBorrowedBalance(SignedQuantityFormat4 borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
	}

	public SignedQuantityFormat4 getCollateralInBalance() {
		return collateralInBalance;
	}

	public void setCollateralInBalance(SignedQuantityFormat4 collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
	}

	public SignedQuantityFormat4 getCollateralOutBalance() {
		return collateralOutBalance;
	}

	public void setCollateralOutBalance(SignedQuantityFormat4 collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
	}

	public SignedQuantityFormat4 getOnLoanBalance() {
		return onLoanBalance;
	}

	public void setOnLoanBalance(SignedQuantityFormat4 onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
	}

	public SignedQuantityFormat4 getPendingDeliveryBalance() {
		return pendingDeliveryBalance;
	}

	public void setPendingDeliveryBalance(SignedQuantityFormat4 pendingDeliveryBalance) {
		this.pendingDeliveryBalance = pendingDeliveryBalance;
	}

	public SignedQuantityFormat4 getPendingReceiptBalance() {
		return pendingReceiptBalance;
	}

	public void setPendingReceiptBalance(SignedQuantityFormat4 pendingReceiptBalance) {
		this.pendingReceiptBalance = pendingReceiptBalance;
	}
}