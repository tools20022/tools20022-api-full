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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmTotalEligibleBalance
 * CorporateActionUnallocatedBalanceSD2Choice.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmBorrowedBalance
 * CorporateActionUnallocatedBalanceSD2Choice.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmCollateralInBalance
 * CorporateActionUnallocatedBalanceSD2Choice.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmCollateralOutBalance
 * CorporateActionUnallocatedBalanceSD2Choice.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmOnLoanBalance
 * CorporateActionUnallocatedBalanceSD2Choice.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmPendingDeliveryBalance
 * CorporateActionUnallocatedBalanceSD2Choice.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmPendingReceiptBalance
 * CorporateActionUnallocatedBalanceSD2Choice.mmPendingReceiptBalance}</li>
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
 * "CorporateActionUnallocatedBalanceSD2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice amongst various balance types related to unallocated payment."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice
 * CorporateActionUnallocatedBalanceSD1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionUnallocatedBalanceSD2Choice", propOrder = {"totalEligibleBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance", "onLoanBalance", "pendingDeliveryBalance", "pendingReceiptBalance"})
public class CorporateActionUnallocatedBalanceSD2Choice {

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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
	 * CorporateActionUnallocatedBalanceSD2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmTotalEligibleBalance
	 * CorporateActionUnallocatedBalanceSD1Choice.mmTotalEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalEligibleBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmTotalEligibleBalance;
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
	 * CorporateActionUnallocatedBalanceSD2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmBorrowedBalance
	 * CorporateActionUnallocatedBalanceSD1Choice.mmBorrowedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBorrowedBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmBorrowedBalance;
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
	 * CorporateActionUnallocatedBalanceSD2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmCollateralInBalance
	 * CorporateActionUnallocatedBalanceSD1Choice.mmCollateralInBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralInBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmCollateralInBalance;
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
	 * CorporateActionUnallocatedBalanceSD2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmCollateralOutBalance
	 * CorporateActionUnallocatedBalanceSD1Choice.mmCollateralOutBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralOutBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmCollateralOutBalance;
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
	 * CorporateActionUnallocatedBalanceSD2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmOnLoanBalance
	 * CorporateActionUnallocatedBalanceSD1Choice.mmOnLoanBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLoanBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmOnLoanBalance;
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
	 * CorporateActionUnallocatedBalanceSD2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmPendingDeliveryBalance
	 * CorporateActionUnallocatedBalanceSD1Choice.mmPendingDeliveryBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingDeliveryBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmPendingDeliveryBalance;
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
	 * CorporateActionUnallocatedBalanceSD2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice#mmPendingReceiptBalance
	 * CorporateActionUnallocatedBalanceSD1Choice.mmPendingReceiptBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingReceiptBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmPendingReceiptBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionUnallocatedBalanceSD2Choice.mmTotalEligibleBalance, CorporateActionUnallocatedBalanceSD2Choice.mmBorrowedBalance,
						CorporateActionUnallocatedBalanceSD2Choice.mmCollateralInBalance, CorporateActionUnallocatedBalanceSD2Choice.mmCollateralOutBalance, CorporateActionUnallocatedBalanceSD2Choice.mmOnLoanBalance,
						CorporateActionUnallocatedBalanceSD2Choice.mmPendingDeliveryBalance, CorporateActionUnallocatedBalanceSD2Choice.mmPendingReceiptBalance);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionUnallocatedBalanceSD2Choice";
				definition = "Choice amongst various balance types related to unallocated payment.";
				previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlElgblBal", required = true)
	public SignedQuantityFormat4 getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public void setTotalEligibleBalance(SignedQuantityFormat4 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
	}

	@XmlElement(name = "BrrwdBal", required = true)
	public SignedQuantityFormat4 getBorrowedBalance() {
		return borrowedBalance;
	}

	public void setBorrowedBalance(SignedQuantityFormat4 borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
	}

	@XmlElement(name = "CollInBal", required = true)
	public SignedQuantityFormat4 getCollateralInBalance() {
		return collateralInBalance;
	}

	public void setCollateralInBalance(SignedQuantityFormat4 collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
	}

	@XmlElement(name = "CollOutBal", required = true)
	public SignedQuantityFormat4 getCollateralOutBalance() {
		return collateralOutBalance;
	}

	public void setCollateralOutBalance(SignedQuantityFormat4 collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
	}

	@XmlElement(name = "OnLnBal", required = true)
	public SignedQuantityFormat4 getOnLoanBalance() {
		return onLoanBalance;
	}

	public void setOnLoanBalance(SignedQuantityFormat4 onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
	}

	@XmlElement(name = "PdgDlvryBal", required = true)
	public SignedQuantityFormat4 getPendingDeliveryBalance() {
		return pendingDeliveryBalance;
	}

	public void setPendingDeliveryBalance(SignedQuantityFormat4 pendingDeliveryBalance) {
		this.pendingDeliveryBalance = pendingDeliveryBalance;
	}

	@XmlElement(name = "PdgRctBal", required = true)
	public SignedQuantityFormat4 getPendingReceiptBalance() {
		return pendingReceiptBalance;
	}

	public void setPendingReceiptBalance(SignedQuantityFormat4 pendingReceiptBalance) {
		this.pendingReceiptBalance = pendingReceiptBalance;
	}
}