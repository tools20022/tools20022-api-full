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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionUnallocatedBalanceSD2Choice", propOrder = {"totalEligibleBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance", "onLoanBalance", "pendingDeliveryBalance", "pendingReceiptBalance"})
public class CorporateActionUnallocatedBalanceSD2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlElgblBal", required = true)
	protected SignedQuantityFormat4 totalEligibleBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::ELIG, DTCCSynonym: Total
	 * Eligible Balance</li>
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
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"), new DTCCSynonym(this, "Total Eligible Balance"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmTotalEligibleBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "BrrwdBal", required = true)
	protected SignedQuantityFormat4 borrowedBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BORR, DTCCSynonym: Stock Loan
	 * Balance (Short)</li>
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
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BORR"), new DTCCSynonym(this, "Stock Loan Balance (Short)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmBorrowedBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "CollInBal", required = true)
	protected SignedQuantityFormat4 collateralInBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLI, DTCCSynonym: REPO (Long)</li>
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
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLI"), new DTCCSynonym(this, "REPO (Long)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmCollateralInBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "CollOutBal", required = true)
	protected SignedQuantityFormat4 collateralOutBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLO, DTCCSynonym: REPO (Short)</li>
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
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLO"), new DTCCSynonym(this, "REPO (Short)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmCollateralOutBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "OnLnBal", required = true)
	protected SignedQuantityFormat4 onLoanBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::LOAN, DTCCSynonym: Stock Loan
	 * Balance (Long)</li>
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
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::LOAN"), new DTCCSynonym(this, "Stock Loan Balance (Long)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmOnLoanBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "PdgDlvryBal", required = true)
	protected SignedQuantityFormat4 pendingDeliveryBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PEND, DTCCSynonym: Fail (Long)</li>
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
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PEND"), new DTCCSynonym(this, "Fail (Long)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmPendingDeliveryBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "PdgRctBal", required = true)
	protected SignedQuantityFormat4 pendingReceiptBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PENR, DTCCSynonym: Fail (Short)</li>
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
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PENR"), new DTCCSynonym(this, "Fail (Short)"));
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmTotalEligibleBalance,
						com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmBorrowedBalance, com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmCollateralInBalance,
						com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmCollateralOutBalance, com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmOnLoanBalance,
						com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmPendingDeliveryBalance, com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice.mmPendingReceiptBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionUnallocatedBalanceSD2Choice";
				definition = "Choice amongst various balance types related to unallocated payment.";
				previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SignedQuantityFormat4 getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public CorporateActionUnallocatedBalanceSD2Choice setTotalEligibleBalance(SignedQuantityFormat4 totalEligibleBalance) {
		this.totalEligibleBalance = Objects.requireNonNull(totalEligibleBalance);
		return this;
	}

	public SignedQuantityFormat4 getBorrowedBalance() {
		return borrowedBalance;
	}

	public CorporateActionUnallocatedBalanceSD2Choice setBorrowedBalance(SignedQuantityFormat4 borrowedBalance) {
		this.borrowedBalance = Objects.requireNonNull(borrowedBalance);
		return this;
	}

	public SignedQuantityFormat4 getCollateralInBalance() {
		return collateralInBalance;
	}

	public CorporateActionUnallocatedBalanceSD2Choice setCollateralInBalance(SignedQuantityFormat4 collateralInBalance) {
		this.collateralInBalance = Objects.requireNonNull(collateralInBalance);
		return this;
	}

	public SignedQuantityFormat4 getCollateralOutBalance() {
		return collateralOutBalance;
	}

	public CorporateActionUnallocatedBalanceSD2Choice setCollateralOutBalance(SignedQuantityFormat4 collateralOutBalance) {
		this.collateralOutBalance = Objects.requireNonNull(collateralOutBalance);
		return this;
	}

	public SignedQuantityFormat4 getOnLoanBalance() {
		return onLoanBalance;
	}

	public CorporateActionUnallocatedBalanceSD2Choice setOnLoanBalance(SignedQuantityFormat4 onLoanBalance) {
		this.onLoanBalance = Objects.requireNonNull(onLoanBalance);
		return this;
	}

	public SignedQuantityFormat4 getPendingDeliveryBalance() {
		return pendingDeliveryBalance;
	}

	public CorporateActionUnallocatedBalanceSD2Choice setPendingDeliveryBalance(SignedQuantityFormat4 pendingDeliveryBalance) {
		this.pendingDeliveryBalance = Objects.requireNonNull(pendingDeliveryBalance);
		return this;
	}

	public SignedQuantityFormat4 getPendingReceiptBalance() {
		return pendingReceiptBalance;
	}

	public CorporateActionUnallocatedBalanceSD2Choice setPendingReceiptBalance(SignedQuantityFormat4 pendingReceiptBalance) {
		this.pendingReceiptBalance = Objects.requireNonNull(pendingReceiptBalance);
		return this;
	}
}